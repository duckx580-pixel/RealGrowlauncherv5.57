package com.usercentrics.sdk.ui.banner;

import com.usercentrics.sdk.UsercentricsLayout;
import com.usercentrics.sdk.ui.firstLayer.UCFirstLayerViewModel;
import com.usercentrics.sdk.ui.secondLayer.UCSecondLayerViewModel;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface UCBannerContainer {
    void cancelLogoDownload();

    void showFirstLayer(UCFirstLayerViewModel uCFirstLayerViewModel, UsercentricsLayout usercentricsLayout, Integer num, Integer num2);

    void showSecondLayer(UCSecondLayerViewModel uCSecondLayerViewModel);
}
