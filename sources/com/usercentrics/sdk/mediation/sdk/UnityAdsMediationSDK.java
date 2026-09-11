package com.usercentrics.sdk.mediation.sdk;

import android.content.Context;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.mediation.MediationSDK;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import kotlin.jvm.internal.l;
import od.a;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UnityAdsMediationSDK extends MediationSDK {
    private final Context context;
    private final UsercentricsLogger logger;
    private final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsMediationSDK(String str, UsercentricsLogger usercentricsLogger, Context context) {
        super(str, usercentricsLogger, null, 4, null);
        l.f("name", str);
        l.f("logger", usercentricsLogger);
        this.name = str;
        this.logger = usercentricsLogger;
        this.context = context;
    }

    @Override // com.usercentrics.sdk.mediation.MediationSDK
    public boolean apply(boolean z3, UsercentricsVariant usercentricsVariant) {
        l.f("variant", usercentricsVariant);
        try {
            Context context = this.context;
            a aVar = new a();
            aVar.f12830b = context.getApplicationContext();
            aVar.e(usercentricsVariant == UsercentricsVariant.CCPA ? "privacy.consent" : "gdpr.consent", Boolean.valueOf(z3));
            aVar.g();
            return true;
        } catch (Exception e8) {
            logException(e8);
            return false;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.usercentrics.sdk.mediation.MediationSDK
    public UsercentricsLogger getLogger() {
        return this.logger;
    }

    @Override // com.usercentrics.sdk.mediation.MediationSDK
    public String getName() {
        return this.name;
    }
}
