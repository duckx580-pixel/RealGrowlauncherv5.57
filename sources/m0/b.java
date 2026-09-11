package m0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10407i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.e f10408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10409s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(eh.e eVar, int i10, int i11) {
        super(2);
        this.f10407i = i11;
        this.f10408r = eVar;
        this.f10409s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10407i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    a1.n nVarJ = androidx.compose.foundation.layout.a.h(a1.k.f196a, g.f10675d).j(new HorizontalAlignElement(a1.a.A));
                    oVar.U(733328855);
                    t1.h0 h0VarC = y.n.c(a1.a.f176i, false, oVar);
                    oVar.U(-1323940314);
                    q2.b bVar = (q2.b) oVar.k(w1.b1.f18759e);
                    q2.l lVar = (q2.l) oVar.k(w1.b1.f18764k);
                    w1.d2 d2Var = (w1.d2) oVar.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarI = t1.w0.i(nVarJ);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar);
                    } else {
                        oVar.j0();
                    }
                    oVar.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarC, oVar);
                    o0.p.Q(v1.i.f18415d, bVar, oVar);
                    o0.p.Q(v1.i.f18418g, lVar, oVar);
                    k0.g.u(0, aVarI, gb.e.f(oVar, d2Var, v1.i.f18419h, oVar), oVar, 2058660585);
                    k0.g.r((this.f10409s >> 9) & 14, this.f10408r, oVar, false, true);
                    oVar.r(false);
                    oVar.r(false);
                }
                return qg.o.f13926a;
            case 1:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    l7.a(o7.a((n7) oVar2.k(o7.f11096a), n0.e.f11903d), w0.f.b(oVar2, 483464909, new b(this.f10408r, this.f10409s, 0)), oVar2, 48);
                }
                return qg.o.f13926a;
            case 2:
                o0.o oVar3 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar3.D()) {
                    oVar3.P();
                } else {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    a1.n nVarJ2 = androidx.compose.foundation.layout.a.h(new LayoutWeightElement(1.0f, false), g.f10676e).j(new HorizontalAlignElement(a1.a.A));
                    oVar3.U(733328855);
                    t1.h0 h0VarC2 = y.n.c(a1.a.f176i, false, oVar3);
                    oVar3.U(-1323940314);
                    q2.b bVar2 = (q2.b) oVar3.k(w1.b1.f18759e);
                    q2.l lVar2 = (q2.l) oVar3.k(w1.b1.f18764k);
                    w1.d2 d2Var2 = (w1.d2) oVar3.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar2 = v1.i.f18413b;
                    w0.a aVarI2 = t1.w0.i(nVarJ2);
                    oVar3.X();
                    if (oVar3.O) {
                        oVar3.m(nVar2);
                    } else {
                        oVar3.j0();
                    }
                    oVar3.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarC2, oVar3);
                    o0.p.Q(v1.i.f18415d, bVar2, oVar3);
                    o0.p.Q(v1.i.f18418g, lVar2, oVar3);
                    k0.g.u(0, aVarI2, gb.e.f(oVar3, d2Var2, v1.i.f18419h, oVar3), oVar3, 2058660585);
                    k0.g.r((this.f10409s >> 12) & 14, this.f10408r, oVar3, false, true);
                    oVar3.r(false);
                    oVar3.r(false);
                }
                return qg.o.f13926a;
            case 3:
                o0.o oVar4 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar4.D()) {
                    oVar4.P();
                } else {
                    l7.a(o7.a((n7) oVar4.k(o7.f11096a), n0.e.f11905f), w0.f.b(oVar4, -747827634, new b(this.f10408r, this.f10409s, 2)), oVar4, 48);
                }
                return qg.o.f13926a;
            case 4:
                o0.o oVar5 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar5.D()) {
                    oVar5.P();
                } else {
                    a1.n nVarB = androidx.compose.foundation.layout.c.b(n0.r.f12047i, 0.0f, 2);
                    oVar5.U(733328855);
                    t1.h0 h0VarC3 = y.n.c(a1.a.f176i, false, oVar5);
                    oVar5.U(-1323940314);
                    q2.b bVar3 = (q2.b) oVar5.k(w1.b1.f18759e);
                    q2.l lVar3 = (q2.l) oVar5.k(w1.b1.f18764k);
                    w1.d2 d2Var3 = (w1.d2) oVar5.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar3 = v1.i.f18413b;
                    w0.a aVarI3 = t1.w0.i(nVarB);
                    oVar5.X();
                    if (oVar5.O) {
                        oVar5.m(nVar3);
                    } else {
                        oVar5.j0();
                    }
                    oVar5.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarC3, oVar5);
                    o0.p.Q(v1.i.f18415d, bVar3, oVar5);
                    o0.p.Q(v1.i.f18418g, lVar3, oVar5);
                    k0.g.u(0, aVarI3, gb.e.f(oVar5, d2Var3, v1.i.f18419h, oVar5), oVar5, 2058660585);
                    k0.g.r((this.f10409s >> 9) & 14, this.f10408r, oVar5, false, true);
                    oVar5.r(false);
                    oVar5.r(false);
                }
                return qg.o.f13926a;
            default:
                o0.o oVar6 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar6.D()) {
                    oVar6.P();
                } else {
                    a1.n nVarC = androidx.compose.ui.layout.a.c(a1.k.f196a, "Container");
                    oVar6.U(733328855);
                    t1.h0 h0VarC4 = y.n.c(a1.a.f176i, true, oVar6);
                    oVar6.U(-1323940314);
                    q2.b bVar4 = (q2.b) oVar6.k(w1.b1.f18759e);
                    q2.l lVar4 = (q2.l) oVar6.k(w1.b1.f18764k);
                    w1.d2 d2Var4 = (w1.d2) oVar6.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar4 = v1.i.f18413b;
                    w0.a aVarI4 = t1.w0.i(nVarC);
                    oVar6.X();
                    if (oVar6.O) {
                        oVar6.m(nVar4);
                    } else {
                        oVar6.j0();
                    }
                    oVar6.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarC4, oVar6);
                    o0.p.Q(v1.i.f18415d, bVar4, oVar6);
                    o0.p.Q(v1.i.f18418g, lVar4, oVar6);
                    k0.g.u(0, aVarI4, gb.e.f(oVar6, d2Var4, v1.i.f18419h, oVar6), oVar6, 2058660585);
                    k0.g.r((this.f10409s >> 21) & 14, this.f10408r, oVar6, false, true);
                    oVar6.r(false);
                    oVar6.r(false);
                }
                return qg.o.f13926a;
        }
    }
}
