package f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n0 f5804i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n0 f5805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n0 f5806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ n0[] f5807t;

    static {
        n0 n0Var = new n0("None", 0);
        f5804i = n0Var;
        n0 n0Var2 = new n0("Selection", 1);
        f5805r = n0Var2;
        n0 n0Var3 = new n0("Cursor", 2);
        f5806s = n0Var3;
        f5807t = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f5807t.clone();
    }
}
