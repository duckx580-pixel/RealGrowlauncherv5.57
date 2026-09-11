package f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f5686i = new e(3);

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a1.n nVar = (a1.n) obj;
        o0.o oVar = (o0.o) obj2;
        ((Number) obj3).intValue();
        oVar.U(-2126899193);
        long j = ((h0.n0) oVar.k(h0.o0.f7376a)).f7369a;
        oVar.U(2068318685);
        boolean zE = oVar.e(j);
        Object objL = oVar.L();
        if (zE || objL == o0.k.f12458a) {
            objL = new d(j, 0);
            oVar.g0(objL);
        }
        oVar.r(false);
        a1.n nVarJ = nVar.j(androidx.compose.ui.draw.a.b(a1.k.f196a, (eh.c) objL));
        oVar.r(false);
        return nVarJ;
    }
}
