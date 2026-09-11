package u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b1 f17398i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b1 f17399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ b1[] f17400s;

    static {
        b1 b1Var = new b1("Default", 0);
        f17398i = b1Var;
        b1 b1Var2 = new b1("UserInput", 1);
        f17399r = b1Var2;
        f17400s = new b1[]{b1Var, b1Var2, new b1("PreventUserInput", 2)};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f17400s.clone();
    }
}
