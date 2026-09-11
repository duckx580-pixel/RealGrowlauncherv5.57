package com.usercentrics.sdk.models.gdpr;

import com.usercentrics.sdk.models.settings.PredefinedUIAriaLabels;
import com.usercentrics.sdk.models.settings.PredefinedUICookieInformationLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIGeneralLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIServiceLabels;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLabels {
    private final PredefinedUIAriaLabels ariaLabels;
    private final PredefinedUICookieInformationLabels cookieInformation;
    private final PredefinedUIGeneralLabels general;
    private final PredefinedUIServiceLabels service;

    public DefaultLabels(PredefinedUIGeneralLabels predefinedUIGeneralLabels, PredefinedUIServiceLabels predefinedUIServiceLabels, PredefinedUIAriaLabels predefinedUIAriaLabels, PredefinedUICookieInformationLabels predefinedUICookieInformationLabels) {
        l.f("general", predefinedUIGeneralLabels);
        l.f("service", predefinedUIServiceLabels);
        l.f("ariaLabels", predefinedUIAriaLabels);
        l.f("cookieInformation", predefinedUICookieInformationLabels);
        this.general = predefinedUIGeneralLabels;
        this.service = predefinedUIServiceLabels;
        this.ariaLabels = predefinedUIAriaLabels;
        this.cookieInformation = predefinedUICookieInformationLabels;
    }

    public final PredefinedUIAriaLabels getAriaLabels() {
        return this.ariaLabels;
    }

    public final PredefinedUICookieInformationLabels getCookieInformation() {
        return this.cookieInformation;
    }

    public final PredefinedUIGeneralLabels getGeneral() {
        return this.general;
    }

    public final PredefinedUIServiceLabels getService() {
        return this.service;
    }
}
