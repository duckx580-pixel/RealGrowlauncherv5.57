package com.usercentrics.sdk.ui.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.usercentrics.sdk.ui.components.drawable.ThemedDrawable;
import eh.a;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCControllerId$defaultIconDrawable$2 extends m implements a {
    final UCControllerId this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCControllerId$defaultIconDrawable$2(UCControllerId uCControllerId) {
        super(0);
        this.this$0 = uCControllerId;
    }

    @Override // eh.a
    public final Drawable invoke() {
        ThemedDrawable themedDrawable = ThemedDrawable.INSTANCE;
        Context context = this.this$0.getContext();
        l.e("getContext(...)", context);
        return themedDrawable.getCopyControllerIdIcon(context);
    }
}
