package com.usercentrics.sdk.services.initialValues.variants;

import com.usercentrics.sdk.core.time.DateTime;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.models.common.InitialView;
import com.usercentrics.sdk.services.ccpa.ICcpa;
import com.usercentrics.sdk.services.deviceStorage.DeviceStorage;
import com.usercentrics.sdk.v2.settings.data.CCPASettings;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CCPAStrategyImpl implements CCPAStrategy {
    private final ICcpa ccpa;
    private final DeviceStorage deviceStorage;
    private final UsercentricsLogger logger;

    public CCPAStrategyImpl(UsercentricsLogger usercentricsLogger, DeviceStorage deviceStorage, ICcpa iCcpa) {
        l.f("logger", usercentricsLogger);
        l.f("deviceStorage", deviceStorage);
        l.f("ccpa", iCcpa);
        this.logger = usercentricsLogger;
        this.deviceStorage = deviceStorage;
        this.ccpa = iCcpa;
    }

    private final boolean timeToReshowHasPassed(CCPASettings cCPASettings, Long l10) {
        Integer numValueOf = cCPASettings != null ? Integer.valueOf(cCPASettings.getReshowAfterDays()) : null;
        if (numValueOf == null || l10 == null) {
            return false;
        }
        return new DateTime().getDay() - new DateTime(l10.longValue()).getDay() > numValueOf.intValue();
    }

    @Override // com.usercentrics.sdk.services.initialValues.variants.CCPAStrategy
    public InitialView getInitialView(CCPAInitialViewOptions cCPAInitialViewOptions) {
        l.f("ccpaInitialViewOptions", cCPAInitialViewOptions);
        Boolean optedOut = this.ccpa.getCCPAData().getOptedOut();
        Long ccpaTimestampInMillis = this.deviceStorage.getCcpaTimestampInMillis();
        boolean z3 = ccpaTimestampInMillis == null;
        CCPASettings ccpaOptions = cCPAInitialViewOptions.getCcpaOptions();
        boolean showOnPageLoad = ccpaOptions != null ? ccpaOptions.getShowOnPageLoad() : false;
        SharedInitialViewOptions sharedInitialViewOptions = cCPAInitialViewOptions.getSharedInitialViewOptions();
        if (sharedInitialViewOptions.getManualResurface()) {
            UsercentricsLogger.DefaultImpls.debug$default(this.logger, ShowCMPReasons.manualResurface, null, 2, null);
            return InitialView.FIRST_LAYER;
        }
        if (sharedInitialViewOptions.getVersionChangeRequiresReshow()) {
            UsercentricsLogger.DefaultImpls.debug$default(this.logger, ShowCMPReasons.versionChangeRequiresReshow, null, 2, null);
            return InitialView.FIRST_LAYER;
        }
        if (l.a(optedOut, Boolean.FALSE)) {
            return InitialView.NONE;
        }
        if (z3 && showOnPageLoad) {
            UsercentricsLogger.DefaultImpls.debug$default(this.logger, StrategyReasonsKt.formatUSFrameworkMessage(ShowCMPReasons.firstInitUSFramework, cCPAInitialViewOptions.getFramework()), null, 2, null);
            return InitialView.FIRST_LAYER;
        }
        if (!timeToReshowHasPassed(cCPAInitialViewOptions.getCcpaOptions(), ccpaTimestampInMillis)) {
            return InitialView.NONE;
        }
        UsercentricsLogger.DefaultImpls.debug$default(this.logger, StrategyReasonsKt.formatUSFrameworkMessage(ShowCMPReasons.shouldReshowAfterTimeUSFramework, cCPAInitialViewOptions.getFramework()), null, 2, null);
        return InitialView.FIRST_LAYER;
    }

    @Override // com.usercentrics.sdk.services.initialValues.variants.CCPAStrategy
    public void setNotApplicable() {
        this.ccpa.setNotApplicable();
    }

    @Override // com.usercentrics.sdk.services.initialValues.variants.CCPAStrategy
    public boolean shouldAcceptAllImplicitlyOnInit() {
        return true;
    }
}
