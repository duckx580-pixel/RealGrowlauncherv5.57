package t6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i3[] f16854i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i3 f16855r;

    static {
        i3 i3Var = new i3("onReceive", 0);
        f16855r = i3Var;
        f16854i = new i3[]{i3Var, new i3("logSession", 1), new i3("logEvent", 2), new i3("setCustomerIdAndLogSession", 3)};
    }

    public static i3 valueOf(String str) {
        return (i3) Enum.valueOf(i3.class, str);
    }

    public static i3[] values() {
        return (i3[]) f16854i.clone();
    }
}
