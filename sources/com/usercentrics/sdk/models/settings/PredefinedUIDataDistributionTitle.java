package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIDataDistributionTitle {
    private final String processingLocationTitle;
    private final String thirdPartyCountriesDescription;
    private final String thirdPartyCountriesTitle;

    public PredefinedUIDataDistributionTitle(String str, String str2, String str3) {
        l.f("processingLocationTitle", str);
        l.f("thirdPartyCountriesTitle", str2);
        l.f("thirdPartyCountriesDescription", str3);
        this.processingLocationTitle = str;
        this.thirdPartyCountriesTitle = str2;
        this.thirdPartyCountriesDescription = str3;
    }

    public final String getProcessingLocationTitle() {
        return this.processingLocationTitle;
    }

    public final String getThirdPartyCountriesDescription() {
        return this.thirdPartyCountriesDescription;
    }

    public final String getThirdPartyCountriesTitle() {
        return this.thirdPartyCountriesTitle;
    }
}
