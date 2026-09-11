package com.usercentrics.sdk.models.gdpr;

import com.usercentrics.sdk.models.settings.PredefinedUICustomization;
import com.usercentrics.sdk.models.settings.PredefinedUILanguageSettings;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultUISettings {
    private final PredefinedUICustomization customization;
    private final DefaultLabels labels;
    private final PredefinedUILanguageSettings language;

    public DefaultUISettings(PredefinedUICustomization predefinedUICustomization, PredefinedUILanguageSettings predefinedUILanguageSettings, DefaultLabels defaultLabels) {
        l.f("customization", predefinedUICustomization);
        l.f("language", predefinedUILanguageSettings);
        l.f("labels", defaultLabels);
        this.customization = predefinedUICustomization;
        this.language = predefinedUILanguageSettings;
        this.labels = defaultLabels;
    }

    public final PredefinedUICustomization getCustomization() {
        return this.customization;
    }

    public final DefaultLabels getLabels() {
        return this.labels;
    }

    public final PredefinedUILanguageSettings getLanguage() {
        return this.language;
    }
}
