package qk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f14423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h[] f14424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f14425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h[] f14426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rk.c f14427e;

    static {
        Object[] objArrL = i.L(2, "CaseUnfold_12");
        int[][] iArr = (int[][]) objArrL[0];
        f14423a = iArr;
        f14424b = (h[]) objArrL[1];
        Object[] objArrL2 = i.L(2, "CaseUnfold_12_Locale");
        int[][] iArr2 = (int[][]) objArrL2[0];
        f14425c = iArr2;
        f14426d = (h[]) objArrL2[1];
        rk.c cVar = new rk.c(iArr.length + iArr2.length, 2);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            cVar.v(iArr[i10], f14424b[i10]);
        }
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            cVar.v(iArr2[i11], f14426d[i11]);
        }
        f14427e = cVar;
    }
}
