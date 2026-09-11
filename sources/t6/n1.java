package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n1 f16934i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n1 f16935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n1 f16936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n1[] f16937t;

    static {
        n1 n1Var = new n1("SUCCESS", 0);
        f16935r = n1Var;
        n1 n1Var2 = new n1("FAILURE", 1);
        f16934i = n1Var2;
        n1 n1Var3 = new n1("TIMEOUT", 2);
        f16936s = n1Var3;
        f16937t = new n1[]{n1Var, n1Var2, n1Var3};
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) f16937t.clone();
    }
}
