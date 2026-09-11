package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIDescriptionTitle {
    private final String title;
    private final String titleDescription;

    public PredefinedUIDescriptionTitle(String str, String str2) {
        l.f("titleDescription", str);
        l.f("title", str2);
        this.titleDescription = str;
        this.title = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleDescription() {
        return this.titleDescription;
    }
}
