package com.usercentrics.sdk.ui.firstLayer;

import com.usercentrics.sdk.HeaderImageSettings;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCFirstLayerViewModelKt {
    public static final boolean isCloseAfterHeaderImage(UCFirstLayerViewModel uCFirstLayerViewModel) {
        l.f("<this>", uCFirstLayerViewModel);
        return uCFirstLayerViewModel.getHeaderImage() instanceof HeaderImageSettings.ExtendedLogoSettings;
    }
}
