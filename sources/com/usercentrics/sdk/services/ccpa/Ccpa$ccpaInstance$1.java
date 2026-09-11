package com.usercentrics.sdk.services.ccpa;

import com.usercentrics.sdk.log.UsercentricsLogger;
import eh.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class Ccpa$ccpaInstance$1 extends m implements c {
    final Ccpa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ccpa$ccpaInstance$1(Ccpa ccpa) {
        super(1);
        this.this$0 = ccpa;
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return o.f13926a;
    }

    public final void invoke(String str) {
        l.f("debugMsg", str);
        UsercentricsLogger.DefaultImpls.debug$default(this.this$0.logger, str, null, 2, null);
    }
}
