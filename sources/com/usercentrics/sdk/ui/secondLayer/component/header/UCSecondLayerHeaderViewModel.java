package com.usercentrics.sdk.ui.secondLayer.component.header;

import com.usercentrics.sdk.UsercentricsImage;
import com.usercentrics.sdk.models.settings.PredefinedUIAriaLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIHtmlLinkType;
import com.usercentrics.sdk.models.settings.PredefinedUILanguageSettings;
import com.usercentrics.sdk.models.settings.PredefinedUILink;
import com.usercentrics.sdk.v2.settings.data.FirstLayerLogoPosition;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface UCSecondLayerHeaderViewModel {
    PredefinedUIAriaLabels getAriaLabels();

    String getContentDescription();

    PredefinedUILanguageSettings getLanguage();

    List<PredefinedUILink> getLegalLinks();

    UsercentricsImage getLogoImage();

    FirstLayerLogoPosition getLogoPosition();

    boolean getShowCloseButton();

    String getTitle();

    void onCloseButton();

    void onLinkClick(PredefinedUILink predefinedUILink);

    void onPredefinedUIHtmlLinkClick(PredefinedUIHtmlLinkType predefinedUIHtmlLinkType);

    void onSelectLanguage(String str);
}
