package com.usercentrics.sdk.ui.firstLayer.component;

import com.usercentrics.sdk.ui.firstLayer.UCFirstLayerViewModel;
import eh.c;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCFirstLayerCCPAToggleKt$addCCPAToggle$toggleView$1$1 extends m implements c {
    final UCFirstLayerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCFirstLayerCCPAToggleKt$addCCPAToggle$toggleView$1$1(UCFirstLayerViewModel uCFirstLayerViewModel) {
        super(1);
        this.$viewModel = uCFirstLayerViewModel;
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return o.f13926a;
    }

    public final void invoke(boolean z3) {
        this.$viewModel.onCCPAToggleChanged(z3);
    }
}
