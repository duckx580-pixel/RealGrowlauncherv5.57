package com.usercentrics.sdk.ui.firstLayer.component;

import com.usercentrics.sdk.models.settings.PredefinedUIHtmlLinkType;
import com.usercentrics.sdk.ui.firstLayer.UCFirstLayerViewModel;
import eh.c;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UCFirstLayerMessageAndReadMoreKt$createMessageView$messageView$1$1 extends j implements c {
    public UCFirstLayerMessageAndReadMoreKt$createMessageView$messageView$1$1(Object obj) {
        super(1, 0, UCFirstLayerViewModel.class, obj, "onHtmlLinkClick", "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V");
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PredefinedUIHtmlLinkType) obj);
        return o.f13926a;
    }

    public final void invoke(PredefinedUIHtmlLinkType predefinedUIHtmlLinkType) {
        l.f("p0", predefinedUIHtmlLinkType);
        ((UCFirstLayerViewModel) this.receiver).onHtmlLinkClick(predefinedUIHtmlLinkType);
    }
}
