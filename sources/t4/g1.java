package t4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g1 f16499i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ g1[] f16500r;

    static {
        g1 g1Var = new g1("LAUNCH_INITIAL_REFRESH", 0);
        f16499i = g1Var;
        f16500r = new g1[]{g1Var, new g1("SKIP_INITIAL_REFRESH", 1)};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) f16500r.clone();
    }
}
