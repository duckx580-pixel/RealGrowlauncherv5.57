package com.usercentrics.sdk.v2.settings.repository;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ISettingsRepository {
    Object fetchSettings(SettingsInitializationParameters settingsInitializationParameters, c<? super UsercentricsSettings> cVar);

    boolean getSettingsEtagChanged();

    void setSettingsEtagChanged(boolean z3);
}
