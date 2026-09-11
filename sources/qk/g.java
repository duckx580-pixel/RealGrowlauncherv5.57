package qk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f14428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h[] f14429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rk.c f14430c;

    static {
        Object[] objArrL = i.L(3, "CaseUnfold_13");
        int[][] iArr = (int[][]) objArrL[0];
        f14428a = iArr;
        f14429b = (h[]) objArrL[1];
        rk.c cVar = new rk.c(iArr.length, 2);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            cVar.v(iArr[i10], f14429b[i10]);
        }
        f14430c = cVar;
    }
}
