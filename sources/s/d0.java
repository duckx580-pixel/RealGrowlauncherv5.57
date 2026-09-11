package s;

import t.f1;
import t.y0;
import t.z0;
import t1.q0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a1.m implements v1.w {
    public f1 D;
    public z0 E;
    public z0 F;
    public z0 G;
    public e0 H;
    public f0 I;
    public w J;
    public long K = s.f14985a;
    public a1.d L;
    public final c0 M;
    public final c0 N;

    public d0(f1 f1Var, z0 z0Var, z0 z0Var2, z0 z0Var3, e0 e0Var, f0 f0Var, w wVar) {
        this.D = f1Var;
        this.E = z0Var;
        this.F = z0Var2;
        this.G = z0Var3;
        this.H = e0Var;
        this.I = f0Var;
        this.J = wVar;
        rk.a.G(0, 0, 15);
        this.M = new c0(this, 0);
        this.N = new c0(this, 1);
    }

    public final a1.d G0() {
        if (this.D.c().b(v.f14993i, v.f14994r)) {
            t tVar = this.H.f14931a.f14981c;
            if (tVar != null) {
                return tVar.f14986a;
            }
            t tVar2 = this.I.f14940a.f14981c;
            if (tVar2 != null) {
                return tVar2.f14986a;
            }
            return null;
        }
        t tVar3 = this.I.f14940a.f14981c;
        if (tVar3 != null) {
            return tVar3.f14986a;
        }
        t tVar4 = this.H.f14931a.f14981c;
        if (tVar4 != null) {
            return tVar4.f14986a;
        }
        return null;
    }

    @Override // v1.w
    public final int b(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return g0Var.O(i10);
    }

    @Override // v1.w
    public final int c(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return g0Var.b(i10);
    }

    @Override // v1.w
    public final int d(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return g0Var.m(i10);
    }

    @Override // v1.w
    public final t1.i0 f(t1.j0 j0Var, t1.g0 g0Var, long j) {
        long j10;
        y0 y0VarA;
        char c10;
        y0 y0VarA2;
        Object obj = null;
        if (this.D.b() == this.D.f16078c.getValue()) {
            this.L = null;
        } else if (this.L == null) {
            a1.d dVarG0 = G0();
            if (dVarG0 == null) {
                dVarG0 = a1.a.f176i;
            }
            this.L = dVarG0;
        }
        boolean zU = j0Var.U();
        rg.t tVar = rg.t.f14665i;
        if (zU) {
            q0 q0VarN = g0Var.n(j);
            long jC = te.a.c(q0VarN.f16308i, q0VarN.f16309r);
            this.K = jC;
            return j0Var.V((int) (jC >> 32), (int) (4294967295L & jC), tVar, new d1.h(q0VarN, 5));
        }
        w wVar = this.J;
        z0 z0Var = wVar.f14997a;
        z0 z0Var2 = wVar.f14998b;
        f1 f1Var = wVar.f14999c;
        e0 e0Var = wVar.f15000d;
        f0 f0Var = wVar.f15001e;
        z0 z0Var3 = wVar.f15002f;
        int i10 = 1;
        int i11 = 0;
        if (z0Var != null) {
            j10 = 4294967295L;
            y0VarA = z0Var.a(new x(e0Var, f0Var, 0), new x(e0Var, f0Var, 1));
        } else {
            j10 = 4294967295L;
            y0VarA = null;
        }
        int i12 = 2;
        if (z0Var2 != null) {
            c10 = ' ';
            y0VarA2 = z0Var2.a(new x(e0Var, f0Var, 2), new x(e0Var, f0Var, 3));
        } else {
            c10 = ' ';
            y0VarA2 = null;
        }
        if (f1Var.b() == v.f14993i) {
            p0 p0Var = f0Var.f14940a;
        } else {
            p0 p0Var2 = f0Var.f14940a;
        }
        b0.m0 m0Var = new b0.m0(y0VarA, y0VarA2, z0Var3 != null ? z0Var3.a(c.f14915y, new b0.m0(obj, e0Var, f0Var, 12)) : null, 11);
        q0 q0VarN2 = g0Var.n(j);
        long jC2 = te.a.c(q0VarN2.f16308i, q0VarN2.f16309r);
        long j11 = !q2.k.a(this.K, s.f14985a) ? this.K : jC2;
        z0 z0Var4 = this.E;
        y0 y0VarA3 = z0Var4 != null ? z0Var4.a(this.M, new b0(this, j11, i11)) : null;
        if (y0VarA3 != null) {
            jC2 = ((q2.k) y0VarA3.getValue()).f13751a;
        }
        long jK = rk.a.K(j, jC2);
        z0 z0Var5 = this.F;
        long j12 = z0Var5 != null ? ((q2.i) z0Var5.a(c.C, new b0(this, j11, i10)).getValue()).f13746a : q2.i.f13744b;
        z0 z0Var6 = this.G;
        long j13 = z0Var6 != null ? ((q2.i) z0Var6.a(this.N, new b0(this, j11, i12)).getValue()).f13746a : q2.i.f13744b;
        a1.d dVar = this.L;
        long jA = dVar != null ? dVar.a(j11, jK, q2.l.f13752i) : q2.i.f13744b;
        int i13 = q2.i.f13745c;
        return j0Var.V((int) (jK >> c10), (int) (jK & j10), tVar, new a0(q0VarN2, t6.k.b(((int) (jA >> c10)) + ((int) (j13 >> c10)), ((int) (jA & j10)) + ((int) (j13 & j10))), j12, m0Var, 0));
    }

    @Override // v1.w
    public final int g(v1.k0 k0Var, t1.g0 g0Var, int i10) {
        return g0Var.k(i10);
    }

    @Override // a1.m
    public final void z0() {
        this.K = s.f14985a;
    }
}
