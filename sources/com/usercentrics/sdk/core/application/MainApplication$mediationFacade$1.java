package com.usercentrics.sdk.core.application;

import android.content.Context;
import com.usercentrics.sdk.mediation.facade.MediationFacade;
import com.usercentrics.sdk.mediation.service.MediationServiceFactory;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication$mediationFacade$1 extends m implements a {
    final Context $appContext;
    final MainApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainApplication$mediationFacade$1(MainApplication mainApplication, Context context) {
        super(0);
        this.this$0 = mainApplication;
        this.$appContext = context;
    }

    @Override // eh.a
    public final MediationFacade invoke() {
        return new MediationFacade(new MediationServiceFactory(this.this$0.getLogger(), this.$appContext).build(), this.this$0.getLogger());
    }
}
