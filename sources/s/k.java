package s;

import m0.w3;
import o0.s0;
import t.y0;
import t.z0;
import t1.q0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements t1.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f14952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f14953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f14954c;

    public k(l lVar, z0 z0Var, s0 s0Var) {
        this.f14954c = lVar;
        this.f14952a = z0Var;
        this.f14953b = s0Var;
    }

    @Override // t1.t
    public final int b(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return g0Var.O(i10);
    }

    @Override // t1.t
    public final int c(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return g0Var.b(i10);
    }

    @Override // t1.t
    public final int d(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return g0Var.m(i10);
    }

    @Override // t1.t
    public final t1.i0 f(t1.j0 j0Var, t1.g0 g0Var, long j) {
        q0 q0VarN = g0Var.n(j);
        l lVar = this.f14954c;
        y0 y0VarA = this.f14952a.a(new a0.u(27, lVar, this), new a0.k0(27, lVar));
        long jA = lVar.f14957b.a(te.a.c(q0VarN.f16308i, q0VarN.f16309r), ((q2.k) y0VarA.getValue()).f13751a, q2.l.f13752i);
        return j0Var.V((int) (((q2.k) y0VarA.getValue()).f13751a >> 32), (int) (((q2.k) y0VarA.getValue()).f13751a & 4294967295L), rg.t.f14665i, new w3(q0VarN, jA));
    }

    @Override // t1.t
    public final int g(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return g0Var.k(i10);
    }
}
