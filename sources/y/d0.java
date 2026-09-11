package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends f0 {
    public int D;
    public boolean E;

    @Override // y.f0
    public final long G0(t1.g0 g0Var, long j) {
        int iO = this.D == 1 ? g0Var.O(q2.a.h(j)) : g0Var.b(q2.a.h(j));
        if (iO < 0) {
            iO = 0;
        }
        if (iO >= 0) {
            return zd.h.f(0, Integer.MAX_VALUE, iO, iO);
        }
        throw new IllegalArgumentException(k0.g.e(iO, "height(", ") must be >= 0").toString());
    }

    @Override // y.f0
    public final boolean H0() {
        return this.E;
    }

    @Override // y.f0, v1.w
    public final int b(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return this.D == 1 ? g0Var.O(i10) : g0Var.b(i10);
    }

    @Override // y.f0, v1.w
    public final int c(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return this.D == 1 ? g0Var.O(i10) : g0Var.b(i10);
    }
}
