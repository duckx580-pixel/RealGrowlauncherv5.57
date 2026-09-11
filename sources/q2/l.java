package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f13752i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f13753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ l[] f13754s;

    static {
        l lVar = new l("Ltr", 0);
        f13752i = lVar;
        l lVar2 = new l("Rtl", 1);
        f13753r = lVar2;
        f13754s = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f13754s.clone();
    }
}
