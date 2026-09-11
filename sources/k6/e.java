package k6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f9262i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f9263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ e[] f9264s;

    static {
        e eVar = new e("FILL", 0);
        f9262i = eVar;
        e eVar2 = new e("FIT", 1);
        f9263r = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f9264s = eVarArr;
        o1.c.p(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f9264s.clone();
    }
}
