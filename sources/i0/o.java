package i0;

import t1.g0;
import t1.i0;
import t1.j0;
import t1.q0;
import t1.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7967a;

    public o(long j) {
        this.f7967a = j;
    }

    public final boolean equals(Object obj) {
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar == null) {
            return false;
        }
        long j = oVar.f7967a;
        int i10 = q2.g.f13741d;
        return this.f7967a == j;
    }

    @Override // t1.t
    public final i0 f(j0 j0Var, g0 g0Var, long j) {
        kotlin.jvm.internal.l.f("measurable", g0Var);
        q0 q0VarN = g0Var.n(j);
        int i10 = q0VarN.f16308i;
        long j10 = this.f7967a;
        int iMax = Math.max(i10, j0Var.e0(q2.g.b(j10)));
        int iMax2 = Math.max(q0VarN.f16309r, j0Var.e0(q2.g.a(j10)));
        return j0Var.V(iMax, iMax2, rg.t.f14665i, new n(iMax, q0VarN, iMax2, 0));
    }

    public final int hashCode() {
        int i10 = q2.g.f13741d;
        return Long.hashCode(this.f7967a);
    }
}
