package com.usercentrics.sdk.v2.settings.service;

import com.usercentrics.sdk.core.settings.SettingsInitializationParameters;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import qg.o;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ISettingsService {
    NewSettingsData getSettings();

    Object loadSettings(SettingsInitializationParameters settingsInitializationParameters, c<? super o> cVar);
}
