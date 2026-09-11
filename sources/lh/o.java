package lh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ o[] f9944i;

    static {
        o[] oVarArr = {new o("PUBLIC", 0), new o("PROTECTED", 1), new o("INTERNAL", 2), new o("PRIVATE", 3)};
        f9944i = oVarArr;
        o1.c.p(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f9944i.clone();
    }
}
