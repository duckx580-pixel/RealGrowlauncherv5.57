package com.usercentrics.sdk.ui.firstLayer;

import com.usercentrics.sdk.HeaderImageSettings;
import com.usercentrics.sdk.models.settings.PredefinedUIAriaLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIHtmlLinkType;
import com.usercentrics.sdk.models.settings.PredefinedUILink;
import com.usercentrics.sdk.ui.components.UCButtonSettings;
import com.usercentrics.sdk.ui.secondLayer.UCBaseLayerViewModel;
import com.usercentrics.sdk.ui.secondLayer.UCCardsContentPM;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface UCFirstLayerViewModel extends UCBaseLayerViewModel {
    PredefinedUIAriaLabels getAriaLabels();

    List<List<UCButtonSettings>> getButtons();

    UCFirstLayerCCPAToggle getCcpaToggle();

    boolean getCloseIcon();

    String getCloseLink();

    List<UCCardsContentPM> getContent();

    HeaderImageSettings getHeaderImage();

    List<PredefinedUILink> getLegalLinks();

    UCFirstLayerMessage getMessage();

    String getPoweredByLabel();

    String getReadMore();

    String getShortDescription();

    UCFirstLayerTitle getTitle();

    boolean getUseAllAvailableVerticalSpace();

    void onCCPAToggleChanged(boolean z3);

    void onHtmlLinkClick(PredefinedUIHtmlLinkType predefinedUIHtmlLinkType);

    void onLegalLinkClick(PredefinedUILink predefinedUILink);

    void onReadMoreClick();
}
