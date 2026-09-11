package com.usercentrics.sdk;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class EmptyUsercentricsDomains {
    public static final EmptyUsercentricsDomains INSTANCE = new EmptyUsercentricsDomains();

    private EmptyUsercentricsDomains() {
    }

    public final UsercentricsDomains invoke() {
        return new UsercentricsDomains(PredefinedUICustomizationFont.defaultFamily, PredefinedUICustomizationFont.defaultFamily, PredefinedUICustomizationFont.defaultFamily, PredefinedUICustomizationFont.defaultFamily, PredefinedUICustomizationFont.defaultFamily);
    }
}
