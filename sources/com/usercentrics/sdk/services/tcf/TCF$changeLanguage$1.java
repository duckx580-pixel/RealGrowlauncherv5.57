package com.usercentrics.sdk.services.tcf;

import qg.i;
import vg.a;
import wg.c;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.sdk.services.tcf.TCF", f = "TCF.kt", l = {169}, m = "changeLanguage-gIAlu-s")
public final class TCF$changeLanguage$1 extends c {
    Object L$0;
    int label;
    Object result;
    final TCF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCF$changeLanguage$1(TCF tcf, ug.c<? super TCF$changeLanguage$1> cVar) {
        super(cVar);
        this.this$0 = tcf;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo69changeLanguagegIAlus = this.this$0.mo69changeLanguagegIAlus(null, this);
        return objMo69changeLanguagegIAlus == a.f18663i ? objMo69changeLanguagegIAlus : new i(objMo69changeLanguagegIAlus);
    }
}
