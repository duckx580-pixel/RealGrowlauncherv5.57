package com.usercentrics.sdk.ui.secondLayer;

import eh.c;
import kotlin.jvm.internal.j;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UCSecondLayerView$pagerAdapter$1 extends j implements c {
    public UCSecondLayerView$pagerAdapter$1(Object obj) {
        super(1, 0, UCSecondLayerView.class, obj, "navigateToTab", "navigateToTab(I)V");
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return o.f13926a;
    }

    public final void invoke(int i10) {
        ((UCSecondLayerView) this.receiver).navigateToTab(i10);
    }
}
