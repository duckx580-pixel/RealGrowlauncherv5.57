package com.usercentrics.sdk.ui.secondLayer;

import com.usercentrics.sdk.UsercentricsImage;
import com.usercentrics.sdk.models.settings.PredefinedUILabels;
import com.usercentrics.sdk.models.settings.PredefinedUILink;
import com.usercentrics.sdk.ui.theme.UCThemeData;
import eh.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface UCSecondLayerViewModel extends UCBaseLayerViewModel {
    void bind(f fVar);

    UsercentricsImage getCustomLogo();

    PredefinedUILabels getLabels();

    boolean getOptOutToggleValue();

    boolean getShowCloseButton();

    UCThemeData getTheme();

    void onClosePressed();

    void onLinkClick(PredefinedUILink predefinedUILink);

    void onOptOutSwitchChanged(boolean z3);

    void onSelectLanguage(String str);
}
