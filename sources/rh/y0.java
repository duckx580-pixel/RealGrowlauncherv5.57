package rh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y0 f14854i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y0 f14855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y0 f14856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ y0[] f14857t;

    static {
        y0 y0Var = new y0("START", 0);
        f14854i = y0Var;
        y0 y0Var2 = new y0("STOP", 1);
        f14855r = y0Var2;
        y0 y0Var3 = new y0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f14856s = y0Var3;
        f14857t = new y0[]{y0Var, y0Var2, y0Var3};
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) f14857t.clone();
    }
}
