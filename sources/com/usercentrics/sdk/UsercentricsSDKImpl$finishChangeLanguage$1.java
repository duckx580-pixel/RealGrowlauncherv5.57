package com.usercentrics.sdk;

import qg.i;
import vg.a;
import wg.c;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.sdk.UsercentricsSDKImpl", f = "UsercentricsSDKImpl.kt", l = {325}, m = "finishChangeLanguage-gIAlu-s")
public final class UsercentricsSDKImpl$finishChangeLanguage$1 extends c {
    int label;
    Object result;
    final UsercentricsSDKImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsercentricsSDKImpl$finishChangeLanguage$1(UsercentricsSDKImpl usercentricsSDKImpl, ug.c<? super UsercentricsSDKImpl$finishChangeLanguage$1> cVar) {
        super(cVar);
        this.this$0 = usercentricsSDKImpl;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM35finishChangeLanguagegIAlus = this.this$0.m35finishChangeLanguagegIAlus(null, this);
        return objM35finishChangeLanguagegIAlus == a.f18663i ? objM35finishChangeLanguagegIAlus : new i(objM35finishChangeLanguagegIAlus);
    }
}
