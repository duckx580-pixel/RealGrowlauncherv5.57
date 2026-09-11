package com.usercentrics.sdk.services.settings;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.models.settings.LegacyExtendedSettings;
import java.util.List;
import qg.i;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ISettingsLegacy {
    void clearConsents();

    Boolean getCCPAIABAgreementExists();

    LegacyExtendedSettings getSettings();

    /* JADX INFO: renamed from: initSettings-gIAlu-s, reason: not valid java name */
    Object mo64initSettingsgIAlus(SettingsInitializationParameters settingsInitializationParameters, c<? super i> cVar);

    boolean isAdditionalConsentModeEnabled();

    boolean isCCPAEnabled();

    boolean isTCFEnabled();

    List<Integer> selectedAdTechProviders();

    void setControllerId(String str);

    void setSettings(LegacyExtendedSettings legacyExtendedSettings);
}
