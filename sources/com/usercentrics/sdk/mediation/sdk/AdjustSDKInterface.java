package com.usercentrics.sdk.mediation.sdk;

import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.mediation.data.MediationGranularConsent;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AdjustSDKInterface {
    private final UsercentricsLogger logger;

    public AdjustSDKInterface(UsercentricsLogger usercentricsLogger) {
        l.f("logger", usercentricsLogger);
        this.logger = usercentricsLogger;
    }

    public abstract boolean addAdjustGeneralConsent(boolean z3);

    public abstract boolean addPartnerSharingSetting(String str, boolean z3);

    public final String booleanToString(boolean z3) {
        return z3 ? "1" : "0";
    }

    public UsercentricsLogger getLogger() {
        return this.logger;
    }

    public final void logException(Exception exc) {
        l.f("ex", exc);
        getLogger().debug("Failed to apply consent to Adjust", exc);
    }

    public abstract boolean signalGooglePartnerFlags(MediationGranularConsent mediationGranularConsent);
}
