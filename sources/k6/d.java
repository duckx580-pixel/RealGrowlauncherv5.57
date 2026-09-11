package k6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f9258i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f9259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f9260s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ d[] f9261t;

    static {
        d dVar = new d("EXACT", 0);
        f9258i = dVar;
        d dVar2 = new d("INEXACT", 1);
        f9259r = dVar2;
        d dVar3 = new d("AUTOMATIC", 2);
        f9260s = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        f9261t = dVarArr;
        o1.c.p(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f9261t.clone();
    }
}
