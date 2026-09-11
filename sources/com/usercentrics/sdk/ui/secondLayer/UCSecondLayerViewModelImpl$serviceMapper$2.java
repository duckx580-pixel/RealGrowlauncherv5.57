package com.usercentrics.sdk.ui.secondLayer;

import com.usercentrics.sdk.models.settings.PredefinedUIStorageInformationButtonInfo;
import eh.c;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UCSecondLayerViewModelImpl$serviceMapper$2 extends j implements c {
    public UCSecondLayerViewModelImpl$serviceMapper$2(Object obj) {
        super(1, 0, UCSecondLayerViewModelImpl.class, obj, "showCookiesDialog", "showCookiesDialog(Lcom/usercentrics/sdk/models/settings/PredefinedUIStorageInformationButtonInfo;)V");
    }

    @Override // eh.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PredefinedUIStorageInformationButtonInfo) obj);
        return o.f13926a;
    }

    public final void invoke(PredefinedUIStorageInformationButtonInfo predefinedUIStorageInformationButtonInfo) {
        l.f("p0", predefinedUIStorageInformationButtonInfo);
        ((UCSecondLayerViewModelImpl) this.receiver).showCookiesDialog(predefinedUIStorageInformationButtonInfo);
    }
}
