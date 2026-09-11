package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIServiceContentSection {
    private final PredefinedUIServiceContent content;
    private final String title;

    public PredefinedUIServiceContentSection(String str, PredefinedUIServiceContent predefinedUIServiceContent) {
        l.f("title", str);
        l.f("content", predefinedUIServiceContent);
        this.title = str;
        this.content = predefinedUIServiceContent;
    }

    public static /* synthetic */ PredefinedUIServiceContentSection copy$default(PredefinedUIServiceContentSection predefinedUIServiceContentSection, String str, PredefinedUIServiceContent predefinedUIServiceContent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = predefinedUIServiceContentSection.title;
        }
        if ((i10 & 2) != 0) {
            predefinedUIServiceContent = predefinedUIServiceContentSection.content;
        }
        return predefinedUIServiceContentSection.copy(str, predefinedUIServiceContent);
    }

    public final String component1() {
        return this.title;
    }

    public final PredefinedUIServiceContent component2() {
        return this.content;
    }

    public final PredefinedUIServiceContentSection copy(String str, PredefinedUIServiceContent predefinedUIServiceContent) {
        l.f("title", str);
        l.f("content", predefinedUIServiceContent);
        return new PredefinedUIServiceContentSection(str, predefinedUIServiceContent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredefinedUIServiceContentSection)) {
            return false;
        }
        PredefinedUIServiceContentSection predefinedUIServiceContentSection = (PredefinedUIServiceContentSection) obj;
        return l.a(this.title, predefinedUIServiceContentSection.title) && l.a(this.content, predefinedUIServiceContentSection.content);
    }

    public final PredefinedUIServiceContent getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return "PredefinedUIServiceContentSection(title=" + this.title + ", content=" + this.content + ")";
    }
}
