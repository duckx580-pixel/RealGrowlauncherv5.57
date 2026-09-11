package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIViewSettings {
    private final PredefinedUICustomization customization;
    private final UCUIFirstLayerSettings firstLayerV2;
    private final PredefinedUILabels internationalizationLabels;
    private final UCUISecondLayerSettings secondLayerV2;

    public PredefinedUIViewSettings(PredefinedUICustomization predefinedUICustomization, PredefinedUILabels predefinedUILabels, UCUIFirstLayerSettings uCUIFirstLayerSettings, UCUISecondLayerSettings uCUISecondLayerSettings) {
        l.f("customization", predefinedUICustomization);
        l.f("internationalizationLabels", predefinedUILabels);
        l.f("firstLayerV2", uCUIFirstLayerSettings);
        l.f("secondLayerV2", uCUISecondLayerSettings);
        this.customization = predefinedUICustomization;
        this.internationalizationLabels = predefinedUILabels;
        this.firstLayerV2 = uCUIFirstLayerSettings;
        this.secondLayerV2 = uCUISecondLayerSettings;
    }

    public final PredefinedUICustomization getCustomization() {
        return this.customization;
    }

    public final UCUIFirstLayerSettings getFirstLayerV2() {
        return this.firstLayerV2;
    }

    public final PredefinedUILabels getInternationalizationLabels() {
        return this.internationalizationLabels;
    }

    public final UCUISecondLayerSettings getSecondLayerV2() {
        return this.secondLayerV2;
    }
}
