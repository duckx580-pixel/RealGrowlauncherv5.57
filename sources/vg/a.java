package vg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f18663i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f18664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f18665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f18666t;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f18663i = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f18664r = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f18665s = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f18666t = aVarArr;
        o1.c.p(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f18666t.clone();
    }
}
