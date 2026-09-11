package b6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f2739i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ k[] f2740r;

    static {
        k kVar = new k("IGNORE", 0);
        k kVar2 = new k("RESPECT_PERFORMANCE", 1);
        f2739i = kVar2;
        k[] kVarArr = {kVar, kVar2, new k("RESPECT_ALL", 2)};
        f2740r = kVarArr;
        o1.c.p(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f2740r.clone();
    }
}
