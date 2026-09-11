package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t0 f18278i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t0 f18279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ t0[] f18280s;

    static {
        t0 t0Var = new t0("Vertical", 0);
        f18278i = t0Var;
        t0 t0Var2 = new t0("Horizontal", 1);
        f18279r = t0Var2;
        f18280s = new t0[]{t0Var, t0Var2};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f18280s.clone();
    }
}
