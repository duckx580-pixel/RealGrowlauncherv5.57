package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends f0 {
    public int D;
    public boolean E;

    @Override // y.f0
    public final long G0(t1.g0 g0Var, long j) {
        int iK = this.D == 1 ? g0Var.k(q2.a.g(j)) : g0Var.m(q2.a.g(j));
        if (iK < 0) {
            iK = 0;
        }
        return zd.h.i(iK);
    }

    @Override // y.f0
    public final boolean H0() {
        return this.E;
    }

    @Override // y.f0, v1.w
    public final int d(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return this.D == 1 ? g0Var.k(i10) : g0Var.m(i10);
    }

    @Override // y.f0, v1.w
    public final int g(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return this.D == 1 ? g0Var.k(i10) : g0Var.m(i10);
    }
}
