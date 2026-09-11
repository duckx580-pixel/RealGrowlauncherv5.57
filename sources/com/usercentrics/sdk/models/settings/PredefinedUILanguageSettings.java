package com.usercentrics.sdk.models.settings;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUILanguageSettings {
    private final List<PredefinedUILanguage> available;
    private final PredefinedUILanguage selected;

    public PredefinedUILanguageSettings(List<PredefinedUILanguage> list, PredefinedUILanguage predefinedUILanguage) {
        l.f("available", list);
        l.f("selected", predefinedUILanguage);
        this.available = list;
        this.selected = predefinedUILanguage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PredefinedUILanguageSettings copy$default(PredefinedUILanguageSettings predefinedUILanguageSettings, List list, PredefinedUILanguage predefinedUILanguage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = predefinedUILanguageSettings.available;
        }
        if ((i10 & 2) != 0) {
            predefinedUILanguage = predefinedUILanguageSettings.selected;
        }
        return predefinedUILanguageSettings.copy(list, predefinedUILanguage);
    }

    public final List<PredefinedUILanguage> component1() {
        return this.available;
    }

    public final PredefinedUILanguage component2() {
        return this.selected;
    }

    public final PredefinedUILanguageSettings copy(List<PredefinedUILanguage> list, PredefinedUILanguage predefinedUILanguage) {
        l.f("available", list);
        l.f("selected", predefinedUILanguage);
        return new PredefinedUILanguageSettings(list, predefinedUILanguage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredefinedUILanguageSettings)) {
            return false;
        }
        PredefinedUILanguageSettings predefinedUILanguageSettings = (PredefinedUILanguageSettings) obj;
        return l.a(this.available, predefinedUILanguageSettings.available) && l.a(this.selected, predefinedUILanguageSettings.selected);
    }

    public final List<PredefinedUILanguage> getAvailable() {
        return this.available;
    }

    public final PredefinedUILanguage getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return this.selected.hashCode() + (this.available.hashCode() * 31);
    }

    public String toString() {
        return "PredefinedUILanguageSettings(available=" + this.available + ", selected=" + this.selected + ")";
    }
}
