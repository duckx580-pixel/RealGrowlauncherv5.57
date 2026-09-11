package com.usercentrics.sdk.ui.firstLayer.component;

import com.usercentrics.sdk.ui.components.UCButtonSettings;
import com.usercentrics.sdk.ui.firstLayer.UCFirstLayerViewModel;
import eh.a;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCFirstLayerButtonsKt$createButtonView$buttonView$1$1 extends m implements a {
    final UCButtonSettings $button;
    final UCFirstLayerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCFirstLayerButtonsKt$createButtonView$buttonView$1$1(UCFirstLayerViewModel uCFirstLayerViewModel, UCButtonSettings uCButtonSettings) {
        super(0);
        this.$viewModel = uCFirstLayerViewModel;
        this.$button = uCButtonSettings;
    }

    @Override // eh.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m82invoke();
        return o.f13926a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m82invoke() {
        this.$viewModel.onButtonClick(this.$button.getType());
    }
}
