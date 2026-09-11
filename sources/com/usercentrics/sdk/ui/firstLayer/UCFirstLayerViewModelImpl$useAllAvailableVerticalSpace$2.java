package com.usercentrics.sdk.ui.firstLayer;

import com.usercentrics.sdk.UsercentricsLayout;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCFirstLayerViewModelImpl$useAllAvailableVerticalSpace$2 extends m implements a {
    final UCFirstLayerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCFirstLayerViewModelImpl$useAllAvailableVerticalSpace$2(UCFirstLayerViewModelImpl uCFirstLayerViewModelImpl) {
        super(0);
        this.this$0 = uCFirstLayerViewModelImpl;
    }

    @Override // eh.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.layout instanceof UsercentricsLayout.Full);
    }
}
