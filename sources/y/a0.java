package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements t1.t, u1.e, a1.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f19913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.z0 f19914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0.z0 f19915c;

    public a0(y0 y0Var) {
        this.f19913a = y0Var;
        o0.n0 n0Var = o0.n0.f12510u;
        this.f19914b = o0.p.I(y0Var, n0Var);
        this.f19915c = o0.p.I(y0Var, n0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return kotlin.jvm.internal.l.a(((a0) obj).f19913a, this.f19913a);
        }
        return false;
    }

    @Override // t1.t
    public final t1.i0 f(t1.j0 j0Var, t1.g0 g0Var, long j) {
        o0.z0 z0Var = this.f19914b;
        int iB = ((y0) z0Var.getValue()).b(j0Var, j0Var.getLayoutDirection());
        int iD = ((y0) z0Var.getValue()).d(j0Var);
        int iA = ((y0) z0Var.getValue()).a(j0Var, j0Var.getLayoutDirection()) + iB;
        int iC = ((y0) z0Var.getValue()).c(j0Var) + iD;
        t1.q0 q0VarN = g0Var.n(rk.a.e0(-iA, -iC, j));
        return j0Var.V(rk.a.N(j, q0VarN.f16308i + iA), rk.a.M(j, q0VarN.f16309r + iC), rg.t.f14665i, new i0.n(q0VarN, iB, iD, 2));
    }

    @Override // u1.e
    public final u1.g getKey() {
        return b1.f19920a;
    }

    @Override // u1.e
    public final Object getValue() {
        return (y0) this.f19915c.getValue();
    }

    public final int hashCode() {
        return this.f19913a.hashCode();
    }
}
