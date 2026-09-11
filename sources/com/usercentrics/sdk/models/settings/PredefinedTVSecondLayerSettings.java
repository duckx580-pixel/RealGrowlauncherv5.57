package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedTVSecondLayerSettings {
    private final PredefinedTVSecondLayerSettingsContent content;
    private final String denyAll;
    private final String save;
    private final String title;
    private final PredefinedUIToggleLocalizations toggleLocalizations;

    public PredefinedTVSecondLayerSettings(String str, String str2, String str3, PredefinedUIToggleLocalizations predefinedUIToggleLocalizations, PredefinedTVSecondLayerSettingsContent predefinedTVSecondLayerSettingsContent) {
        l.f("title", str);
        l.f("save", str2);
        l.f("toggleLocalizations", predefinedUIToggleLocalizations);
        l.f("content", predefinedTVSecondLayerSettingsContent);
        this.title = str;
        this.save = str2;
        this.denyAll = str3;
        this.toggleLocalizations = predefinedUIToggleLocalizations;
        this.content = predefinedTVSecondLayerSettingsContent;
    }

    public final PredefinedTVSecondLayerSettingsContent getContent() {
        return this.content;
    }

    public final String getDenyAll() {
        return this.denyAll;
    }

    public final String getSave() {
        return this.save;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PredefinedUIToggleLocalizations getToggleLocalizations() {
        return this.toggleLocalizations;
    }
}
