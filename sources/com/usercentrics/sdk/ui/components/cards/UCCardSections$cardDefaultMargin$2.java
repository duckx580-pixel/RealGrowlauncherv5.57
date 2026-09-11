package com.usercentrics.sdk.ui.components.cards;

import com.usercentrics.sdk.ui.R;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCCardSections$cardDefaultMargin$2 extends m implements a {
    final UCCardSections this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCCardSections$cardDefaultMargin$2(UCCardSections uCCardSections) {
        super(0);
        this.this$0 = uCCardSections;
    }

    @Override // eh.a
    public final Integer invoke() {
        return Integer.valueOf((int) this.this$0.getContext().getResources().getDimension(R.dimen.ucCardVerticalMargin));
    }
}
