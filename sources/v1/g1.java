package v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g1 f18397i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g1 f18398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g1 f18399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g1[] f18400t;

    static {
        g1 g1Var = new g1("ContinueTraversal", 0);
        f18397i = g1Var;
        g1 g1Var2 = new g1("SkipSubtreeAndContinueTraversal", 1);
        f18398r = g1Var2;
        g1 g1Var3 = new g1("CancelTraversal", 2);
        f18399s = g1Var3;
        f18400t = new g1[]{g1Var, g1Var2, g1Var3};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) f18400t.clone();
    }
}
