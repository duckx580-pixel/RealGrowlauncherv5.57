package com.usercentrics.sdk.mediation;

import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.mediation.data.MediationGranularConsent;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediationSDK {
    private final UsercentricsLogger logger;
    private final String name;
    private final Integer vendorId;

    public MediationSDK(String str, UsercentricsLogger usercentricsLogger, Integer num) {
        l.f("name", str);
        l.f("logger", usercentricsLogger);
        this.name = str;
        this.logger = usercentricsLogger;
        this.vendorId = num;
    }

    public abstract boolean apply(boolean z3, UsercentricsVariant usercentricsVariant);

    public boolean applyGranular(MediationGranularConsent mediationGranularConsent) {
        l.f("granularConsent", mediationGranularConsent);
        return false;
    }

    public UsercentricsLogger getLogger() {
        return this.logger;
    }

    public String getName() {
        return this.name;
    }

    public Integer getVendorId() {
        return this.vendorId;
    }

    public final void logException(Exception exc) {
        l.f("ex", exc);
        getLogger().debug("Failed to apply consent to " + getName(), exc);
    }

    public /* synthetic */ MediationSDK(String str, UsercentricsLogger usercentricsLogger, Integer num, int i10, g gVar) {
        this(str, usercentricsLogger, (i10 & 4) != 0 ? null : num);
    }
}
