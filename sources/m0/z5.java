package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z5 f11540i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z5 f11541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ z5[] f11542s;

    static {
        z5 z5Var = new z5("Dismissed", 0);
        f11540i = z5Var;
        z5 z5Var2 = new z5("ActionPerformed", 1);
        f11541r = z5Var2;
        f11542s = new z5[]{z5Var, z5Var2};
    }

    public static z5 valueOf(String str) {
        return (z5) Enum.valueOf(z5.class, str);
    }

    public static z5[] values() {
        return (z5[]) f11542s.clone();
    }
}
