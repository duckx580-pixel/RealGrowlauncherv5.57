package com.usercentrics.sdk.v2.tcf.facade;

import qg.i;
import vg.a;
import wg.c;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.sdk.v2.tcf.facade.TCFFacadeImpl", f = "TCFFacadeImpl.kt", l = {15}, m = "getVendorList-IoAF18A")
public final class TCFFacadeImpl$getVendorList$1 extends c {
    Object L$0;
    int label;
    Object result;
    final TCFFacadeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCFFacadeImpl$getVendorList$1(TCFFacadeImpl tCFFacadeImpl, ug.c<? super TCFFacadeImpl$getVendorList$1> cVar) {
        super(cVar);
        this.this$0 = tCFFacadeImpl;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo108getVendorListIoAF18A = this.this$0.mo108getVendorListIoAF18A(this);
        return objMo108getVendorListIoAF18A == a.f18663i ? objMo108getVendorListIoAF18A : new i(objMo108getVendorListIoAF18A);
    }
}
