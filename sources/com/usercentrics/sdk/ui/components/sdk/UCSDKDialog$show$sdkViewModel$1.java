package com.usercentrics.sdk.ui.components.sdk;

import eh.a;
import kotlin.jvm.internal.j;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UCSDKDialog$show$sdkViewModel$1 extends j implements a {
    public UCSDKDialog$show$sdkViewModel$1(Object obj) {
        super(0, 0, UCSDKDialog.class, obj, "dismissDialog", "dismissDialog()V");
    }

    @Override // eh.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m78invoke();
        return o.f13926a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m78invoke() {
        ((UCSDKDialog) this.receiver).dismissDialog();
    }
}
