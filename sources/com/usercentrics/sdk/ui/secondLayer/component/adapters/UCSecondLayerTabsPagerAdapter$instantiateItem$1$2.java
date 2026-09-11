package com.usercentrics.sdk.ui.secondLayer.component.adapters;

import androidx.recyclerview.widget.RecyclerView;
import eh.c;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCSecondLayerTabsPagerAdapter$instantiateItem$1$2 extends m implements c {
    final int $cardVerticalMargin;
    final RecyclerView $this_apply;
    final UCSecondLayerTabsPagerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCSecondLayerTabsPagerAdapter$instantiateItem$1$2(UCSecondLayerTabsPagerAdapter uCSecondLayerTabsPagerAdapter, RecyclerView recyclerView, int i10) {
        super(1);
        this.this$0 = uCSecondLayerTabsPagerAdapter;
        this.$this_apply = recyclerView;
        this.$cardVerticalMargin = i10;
    }

    public final void invoke(int i10) {
        this.this$0.collapseHeader.invoke();
        this.this$0.centerCardBy(i10, this.$this_apply, this.$cardVerticalMargin);
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return o.f13926a;
    }
}
