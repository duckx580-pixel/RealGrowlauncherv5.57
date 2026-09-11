package com.usercentrics.sdk.services.tcf;

import com.usercentrics.tcf.core.errors.TCModelError;
import qg.i;
import vg.a;
import wg.c;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.sdk.services.tcf.TCF", f = "TCF.kt", l = {316, 324}, m = "initTCModel-0E7RQCE")
public final class TCF$initTCModel$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    Object result;
    final TCF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCF$initTCModel$1(TCF tcf, ug.c<? super TCF$initTCModel$1> cVar) {
        super(cVar);
        this.this$0 = tcf;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) throws TCModelError {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM67initTCModel0E7RQCE = this.this$0.m67initTCModel0E7RQCE(null, null, this);
        return objM67initTCModel0E7RQCE == a.f18663i ? objM67initTCModel0E7RQCE : new i(objM67initTCModel0E7RQCE);
    }
}
