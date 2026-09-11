package com.usercentrics.sdk.services.initialValues.variants;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AcceptAllImplicitlyReasons {
    public static final AcceptAllImplicitlyReasons INSTANCE = new AcceptAllImplicitlyReasons();
    public static final String firstInitializationGDPR = "GDPR | Accept all implicitly cause: It is the first initialization, the 'Display CMP only to EU users' option is enabled and the user is not in EU";
    public static final String firstInitializationTCF = "TCF | Accept all non-IAB services implicitly cause: The 'Apply GDPR only to EU users' option is enabled and it is the first initialization";
    public static final String firstInitializationUSFrameworks = "##us_framework## | Accept all implicitly cause: It is the first initialization";

    private AcceptAllImplicitlyReasons() {
    }
}
