package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUITabSettings {
    private final PredefinedUITabContent content;
    private final String title;

    public PredefinedUITabSettings(String str, PredefinedUITabContent predefinedUITabContent) {
        l.f("title", str);
        l.f("content", predefinedUITabContent);
        this.title = str;
        this.content = predefinedUITabContent;
    }

    public final PredefinedUITabContent getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }
}
