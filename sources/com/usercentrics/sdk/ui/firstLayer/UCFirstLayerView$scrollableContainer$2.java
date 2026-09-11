package com.usercentrics.sdk.ui.firstLayer;

import android.content.Context;
import androidx.appcompat.widget.g2;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCFirstLayerView$scrollableContainer$2 extends m implements a {
    final Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCFirstLayerView$scrollableContainer$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // eh.a
    public final g2 invoke() {
        g2 g2Var = new g2(this.$context);
        g2Var.setOrientation(1);
        return g2Var;
    }
}
