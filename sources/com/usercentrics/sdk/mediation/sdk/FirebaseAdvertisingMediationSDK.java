package com.usercentrics.sdk.mediation.sdk;

import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.mediation.MediationSDK;
import com.usercentrics.sdk.mediation.data.MediationGranularConsent;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import kotlin.jvm.internal.l;
import qg.g;
import rg.y;
import x9.a;
import x9.b;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAdvertisingMediationSDK extends MediationSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseAdvertisingMediationSDK(String str, UsercentricsLogger usercentricsLogger, int i10) {
        super(str, usercentricsLogger, null, 4, null);
        l.f("name", str);
        l.f("logger", usercentricsLogger);
    }

    private final a consentStatus(boolean z3) {
        return z3 ? a.f19502i : a.f19503r;
    }

    @Override // com.usercentrics.sdk.mediation.MediationSDK
    public boolean apply(boolean z3, UsercentricsVariant usercentricsVariant) {
        l.f("variant", usercentricsVariant);
        try {
            a aVarConsentStatus = consentStatus(z3);
            aa.a.a().a(y.G(new g(b.f19505i, aVarConsentStatus), new g(b.AD_PERSONALIZATION, aVarConsentStatus), new g(b.AD_USER_DATA, aVarConsentStatus)));
            return true;
        } catch (Exception e8) {
            logException(e8);
            return false;
        }
    }

    @Override // com.usercentrics.sdk.mediation.MediationSDK
    public boolean applyGranular(MediationGranularConsent mediationGranularConsent) {
        l.f("granularConsent", mediationGranularConsent);
        return true;
    }
}
