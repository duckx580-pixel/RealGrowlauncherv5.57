package com.usercentrics.sdk.models.location;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationConstants {
    public static final String CALIFORNIA_REGION_CODE = "CA";
    public static final String US_COUNTRY_CODE = "US";
    public static final LocationConstants INSTANCE = new LocationConstants();
    private static final String[] EU_COUNTRIES = {"AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"};

    private LocationConstants() {
    }

    public final String[] getEU_COUNTRIES() {
        return EU_COUNTRIES;
    }
}
