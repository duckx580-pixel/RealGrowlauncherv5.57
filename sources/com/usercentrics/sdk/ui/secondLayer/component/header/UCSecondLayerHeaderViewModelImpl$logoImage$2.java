package com.usercentrics.sdk.ui.secondLayer.component.header;

import com.usercentrics.sdk.UsercentricsImage;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCSecondLayerHeaderViewModelImpl$logoImage$2 extends m implements a {
    final UCSecondLayerHeaderViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCSecondLayerHeaderViewModelImpl$logoImage$2(UCSecondLayerHeaderViewModelImpl uCSecondLayerHeaderViewModelImpl) {
        super(0);
        this.this$0 = uCSecondLayerHeaderViewModelImpl;
    }

    @Override // eh.a
    public final UsercentricsImage invoke() {
        UsercentricsImage customLogo = this.this$0.parentViewModel.getCustomLogo();
        if (customLogo != null) {
            return customLogo;
        }
        UCSecondLayerHeaderViewModelImpl uCSecondLayerHeaderViewModelImpl = this.this$0;
        return uCSecondLayerHeaderViewModelImpl.getLogoFromUrl(uCSecondLayerHeaderViewModelImpl.settings.getLogoURL());
    }
}
