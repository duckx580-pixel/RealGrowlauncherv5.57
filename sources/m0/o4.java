package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o4 f11082i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o4 f11083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o4 f11084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o4 f11085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final o4 f11086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ o4[] f11087v;

    static {
        o4 o4Var = new o4("TopBar", 0);
        f11082i = o4Var;
        o4 o4Var2 = new o4("MainContent", 1);
        f11083r = o4Var2;
        o4 o4Var3 = new o4("Snackbar", 2);
        f11084s = o4Var3;
        o4 o4Var4 = new o4("Fab", 3);
        f11085t = o4Var4;
        o4 o4Var5 = new o4("BottomBar", 4);
        f11086u = o4Var5;
        f11087v = new o4[]{o4Var, o4Var2, o4Var3, o4Var4, o4Var5};
    }

    public static o4 valueOf(String str) {
        return (o4) Enum.valueOf(o4.class, str);
    }

    public static o4[] values() {
        return (o4[]) f11087v.clone();
    }
}
