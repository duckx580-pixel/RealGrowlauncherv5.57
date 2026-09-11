package oc;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public enum a {
    REWARDED_VIDEO("rewardedVideo"),
    INTERSTITIAL("interstitial"),
    BANNER("banner"),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_AD("nativeAd");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f12822i;

    a(String str) {
        this.f12822i = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12822i;
    }
}
