package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g2 f10687i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g2 f10688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g2 f10689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g2[] f10690t;

    static {
        g2 g2Var = new g2("Focused", 0);
        f10687i = g2Var;
        g2 g2Var2 = new g2("UnfocusedEmpty", 1);
        f10688r = g2Var2;
        g2 g2Var3 = new g2("UnfocusedNotEmpty", 2);
        f10689s = g2Var3;
        f10690t = new g2[]{g2Var, g2Var2, g2Var3};
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) f10690t.clone();
    }
}
