package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f19505i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f19506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ b[] f19507s;

    static {
        b bVar = new b("AD_STORAGE", 0);
        f19505i = bVar;
        b bVar2 = new b("ANALYTICS_STORAGE", 1);
        f19506r = bVar2;
        f19507s = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f19507s.clone();
    }
}
