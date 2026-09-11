package com.usercentrics.sdk;

import com.rtsoft.growtopia.R;
import qg.i;
import vg.a;
import wg.c;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.sdk.UsercentricsSDKImpl", f = "UsercentricsSDKImpl.kt", l = {R.styleable.AppCompatTheme_colorPrimaryDark, R.styleable.AppCompatTheme_dropdownListPreferredItemHeight}, m = "initialize-gIAlu-s$usercentrics_release")
public final class UsercentricsSDKImpl$initialize$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final UsercentricsSDKImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsercentricsSDKImpl$initialize$1(UsercentricsSDKImpl usercentricsSDKImpl, ug.c<? super UsercentricsSDKImpl$initialize$1> cVar) {
        super(cVar);
        this.this$0 = usercentricsSDKImpl;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo32initializegIAlus$usercentrics_release = this.this$0.mo32initializegIAlus$usercentrics_release(false, this);
        return objMo32initializegIAlus$usercentrics_release == a.f18663i ? objMo32initializegIAlus$usercentrics_release : new i(objMo32initializegIAlus$usercentrics_release);
    }
}
