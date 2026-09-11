package m0;

import androidx.compose.foundation.layout.VerticalAlignElement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10860i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y.s0 f10861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f10862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10863t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(boolean z3, y.s0 s0Var, eh.e eVar, int i10) {
        super(2);
        this.f10860i = z3;
        this.f10861r = s0Var;
        this.f10862s = eVar;
        this.f10863t = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
            oVar.P();
        } else {
            float f9 = r2.f11200c;
            a1.n verticalAlignElement = a1.k.f196a;
            a1.n nVarL = androidx.compose.foundation.layout.a.l(verticalAlignElement, 0.0f, 0.0f, f9, 0.0f, 11);
            if (!this.f10860i) {
                a1.c cVar = a1.a.f183y;
                this.f10861r.getClass();
                verticalAlignElement = new VerticalAlignElement(cVar);
            }
            a1.n nVarJ = nVarL.j(verticalAlignElement);
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
            k0.g.r((this.f10863t >> 9) & 14, this.f10862s, oVar, false, true);
            oVar.r(false);
            oVar.r(false);
        }
        return qg.o.f13926a;
    }
}
