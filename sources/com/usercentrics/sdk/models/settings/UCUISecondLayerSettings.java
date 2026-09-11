package com.usercentrics.sdk.models.settings;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCUISecondLayerSettings {
    private final List<PredefinedUITabSettings> contentSettings;
    private final PredefinedUIFooterSettings footerSettings;
    private final PredefinedUIHeaderSettings headerSettings;

    public UCUISecondLayerSettings(PredefinedUIHeaderSettings predefinedUIHeaderSettings, PredefinedUIFooterSettings predefinedUIFooterSettings, List<PredefinedUITabSettings> list) {
        l.f("headerSettings", predefinedUIHeaderSettings);
        l.f("footerSettings", predefinedUIFooterSettings);
        l.f("contentSettings", list);
        this.headerSettings = predefinedUIHeaderSettings;
        this.footerSettings = predefinedUIFooterSettings;
        this.contentSettings = list;
    }

    public final List<PredefinedUITabSettings> getContentSettings() {
        return this.contentSettings;
    }

    public final PredefinedUIFooterSettings getFooterSettings() {
        return this.footerSettings;
    }

    public final PredefinedUIHeaderSettings getHeaderSettings() {
        return this.headerSettings;
    }
}
