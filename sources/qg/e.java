package qg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f13908i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f13909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ e[] f13910s;

    static {
        e eVar = new e("SYNCHRONIZED", 0);
        e eVar2 = new e("PUBLICATION", 1);
        f13908i = eVar2;
        e eVar3 = new e("NONE", 2);
        f13909r = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        f13910s = eVarArr;
        o1.c.p(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f13910s.clone();
    }
}
