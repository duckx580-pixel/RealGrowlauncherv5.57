package com.usercentrics.sdk.services.tcf;

import qg.i;
import vg.a;
import wg.c;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.sdk.services.tcf.TCF", f = "TCF.kt", l = {1165}, m = "resetGVLWithLanguage-gIAlu-s")
public final class TCF$resetGVLWithLanguage$1 extends c {
    int label;
    Object result;
    final TCF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCF$resetGVLWithLanguage$1(TCF tcf, ug.c<? super TCF$resetGVLWithLanguage$1> cVar) {
        super(cVar);
        this.this$0 = tcf;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM68resetGVLWithLanguagegIAlus = this.this$0.m68resetGVLWithLanguagegIAlus(null, this);
        return objM68resetGVLWithLanguagegIAlus == a.f18663i ? objM68resetGVLWithLanguagegIAlus : new i(objM68resetGVLWithLanguagegIAlus);
    }
}
