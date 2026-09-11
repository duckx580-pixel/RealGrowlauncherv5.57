package com.usercentrics.sdk.ui.toggle;

import com.usercentrics.sdk.models.settings.PredefinedUICardUI;
import com.usercentrics.sdk.models.settings.PredefinedUIDecision;
import com.usercentrics.sdk.models.settings.PredefinedUISwitchSettingsUI;
import com.usercentrics.sdk.models.settings.PredefinedUIToggleSettings;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface PredefinedUIToggleMediator {
    void bootLegacy();

    PredefinedUIToggleGroup getGroup(PredefinedUIToggleSettings predefinedUIToggleSettings);

    PredefinedUIToggleGroup getGroupLegacy(PredefinedUICardUI predefinedUICardUI);

    PredefinedUIToggleGroup getServiceGroupLegacy(String str, PredefinedUISwitchSettingsUI predefinedUISwitchSettingsUI);

    List<PredefinedUIDecision> getUserDecisions();

    void tearDown();
}
