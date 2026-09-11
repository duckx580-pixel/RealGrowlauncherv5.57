package i0;

import g1.f0;
import g1.k0;
import g1.t;
import o0.e2;
import q1.x;
import t1.h0;
import t1.w0;
import w1.b1;
import w1.d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.n f7969i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k0 f7970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f7971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f7972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f7974v;
    public final /* synthetic */ w0.a w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a1.n nVar, k0 k0Var, long j, float f9, int i10, float f10, w0.a aVar) {
        super(2);
        this.f7969i = nVar;
        this.f7970r = k0Var;
        this.f7971s = j;
        this.f7972t = f9;
        this.f7973u = i10;
        this.f7974v = f10;
        this.w = aVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        int iIntValue = ((Number) obj2).intValue() & 11;
        qg.o oVar2 = qg.o.f13926a;
        int i10 = 2;
        if (iIntValue == 2 && oVar.D()) {
            oVar.P();
            return oVar2;
        }
        f fVar = (f) oVar.k(g.f7944a);
        oVar.U(1561611256);
        e2 e2Var = c.f7940a;
        long j = ((t) ((a) oVar.k(e2Var)).f7927f.getValue()).f6918a;
        long j10 = this.f7971s;
        if (t.c(j10, j) && fVar != null) {
            a aVar = (a) oVar.k(e2Var);
            if (Float.compare(this.f7972t, 0) > 0 && !((Boolean) aVar.f7933m.getValue()).booleanValue()) {
                j10 = f0.j(t.b(c.a(j10, oVar), ((((float) Math.log(r3 + 1)) * 4.5f) + 2.0f) / 100.0f), j10);
            }
        }
        oVar.r(false);
        float f9 = this.f7974v;
        a1.n nVar = this.f7969i;
        k0 k0Var = this.f7970r;
        a1.n nVarA = x.a(b2.l.a(o1.c.k(androidx.compose.foundation.a.b(qj.b.r(nVar, f9, k0Var).j(a1.k.f196a), j10, k0Var), k0Var), false, p.f7968i), oVar2, new fe.f(i10, null, 1));
        oVar.U(733328855);
        h0 h0VarC = y.n.c(a1.a.f176i, true, oVar);
        oVar.U(-1323940314);
        q2.b bVar = (q2.b) oVar.k(b1.f18759e);
        q2.l lVar = (q2.l) oVar.k(b1.f18764k);
        d2 d2Var = (d2) oVar.k(b1.f18769p);
        v1.j.f18438q.getClass();
        v1.n nVar2 = v1.i.f18413b;
        w0.a aVarI = w0.i(nVarA);
        oVar.X();
        if (oVar.O) {
            oVar.m(nVar2);
        } else {
            oVar.j0();
        }
        oVar.f12534x = false;
        o0.p.Q(v1.i.f18417f, h0VarC, oVar);
        o0.p.Q(v1.i.f18415d, bVar, oVar);
        o0.p.Q(v1.i.f18418g, lVar, oVar);
        k0.g.u(0, aVarI, gb.e.f(oVar, d2Var, v1.i.f18419h, oVar), oVar, 2058660585);
        this.w.invoke(oVar, Integer.valueOf((this.f7973u >> 18) & 14));
        oVar.r(false);
        oVar.r(true);
        oVar.r(false);
        oVar.r(false);
        return oVar2;
    }
}
