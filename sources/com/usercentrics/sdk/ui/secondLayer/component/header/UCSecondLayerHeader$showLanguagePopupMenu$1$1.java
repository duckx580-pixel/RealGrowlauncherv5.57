package com.usercentrics.sdk.ui.secondLayer.component.header;

import eh.c;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UCSecondLayerHeader$showLanguagePopupMenu$1$1 extends j implements c {
    public UCSecondLayerHeader$showLanguagePopupMenu$1$1(Object obj) {
        super(1, 0, UCSecondLayerHeader.class, obj, "onLanguageSelected", "onLanguageSelected(Ljava/lang/String;)V");
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return o.f13926a;
    }

    public final void invoke(String str) {
        l.f("p0", str);
        ((UCSecondLayerHeader) this.receiver).onLanguageSelected(str);
    }
}
