package com.usercentrics.sdk.models.tcf;

import com.usercentrics.sdk.models.gdpr.DefaultLabels;
import com.usercentrics.sdk.models.settings.PredefinedUICookieInformationLabels;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCFLabels {
    private final PredefinedUICookieInformationLabels cookieInformation;
    private final DefaultLabels nonTCFLabels;
    private final String vendorsOutsideEU;

    public TCFLabels(String str, DefaultLabels defaultLabels, PredefinedUICookieInformationLabels predefinedUICookieInformationLabels) {
        l.f("vendorsOutsideEU", str);
        l.f("nonTCFLabels", defaultLabels);
        l.f("cookieInformation", predefinedUICookieInformationLabels);
        this.vendorsOutsideEU = str;
        this.nonTCFLabels = defaultLabels;
        this.cookieInformation = predefinedUICookieInformationLabels;
    }

    public final PredefinedUICookieInformationLabels getCookieInformation() {
        return this.cookieInformation;
    }

    public final DefaultLabels getNonTCFLabels() {
        return this.nonTCFLabels;
    }

    public final String getVendorsOutsideEU() {
        return this.vendorsOutsideEU;
    }
}
