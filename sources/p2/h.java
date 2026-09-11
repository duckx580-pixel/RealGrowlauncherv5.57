package p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f13270i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f13271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ h[] f13272s;

    static {
        h hVar = new h("Ltr", 0);
        f13270i = hVar;
        h hVar2 = new h("Rtl", 1);
        f13271r = hVar2;
        f13272s = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f13272s.clone();
    }
}
