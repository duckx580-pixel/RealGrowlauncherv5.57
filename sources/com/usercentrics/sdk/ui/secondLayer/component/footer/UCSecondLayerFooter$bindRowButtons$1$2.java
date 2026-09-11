package com.usercentrics.sdk.ui.secondLayer.component.footer;

import com.usercentrics.sdk.ui.components.UCButtonSettings;
import eh.a;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCSecondLayerFooter$bindRowButtons$1$2 extends m implements a {
    final UCButtonSettings $settings;
    final UCSecondLayerFooter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCSecondLayerFooter$bindRowButtons$1$2(UCSecondLayerFooter uCSecondLayerFooter, UCButtonSettings uCButtonSettings) {
        super(0);
        this.this$0 = uCSecondLayerFooter;
        this.$settings = uCButtonSettings;
    }

    @Override // eh.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m95invoke();
        return o.f13926a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m95invoke() {
        UCSecondLayerFooterViewModel uCSecondLayerFooterViewModel = this.this$0.viewModel;
        if (uCSecondLayerFooterViewModel != null) {
            uCSecondLayerFooterViewModel.onButtonClick(this.$settings.getType());
        } else {
            l.l("viewModel");
            throw null;
        }
    }
}
