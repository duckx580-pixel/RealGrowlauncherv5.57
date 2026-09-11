package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j7 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j7 f10841i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j7 f10842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ j7[] f10843s;

    static {
        j7 j7Var = new j7("Filled", 0);
        f10841i = j7Var;
        j7 j7Var2 = new j7("Outlined", 1);
        f10842r = j7Var2;
        f10843s = new j7[]{j7Var, j7Var2};
    }

    public static j7 valueOf(String str) {
        return (j7) Enum.valueOf(j7.class, str);
    }

    public static j7[] values() {
        return (j7[]) f10843s.clone();
    }
}
