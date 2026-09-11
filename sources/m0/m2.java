package m0;

import androidx.compose.foundation.layout.VerticalAlignElement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends kotlin.jvm.internal.m implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ eh.f f10942i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y.n0 f10943r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1.c f10944s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y.g f10945t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.f f10946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ eh.e f10947v;
    public final /* synthetic */ w0.a w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ eh.e f10948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(w0.a aVar, y.n0 n0Var, a1.c cVar, y.g gVar, w0.a aVar2, w0.a aVar3, w0.a aVar4, w0.a aVar5) {
        super(3);
        this.f10942i = aVar;
        this.f10943r = n0Var;
        this.f10944s = cVar;
        this.f10945t = gVar;
        this.f10946u = aVar2;
        this.f10947v = aVar3;
        this.w = aVar4;
        this.f10948x = aVar5;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y.s0 s0Var = (y.s0) obj;
        o0.o oVar = (o0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.l.f("$this$ListItem", s0Var);
        if ((iIntValue & 14) == 0) {
            iIntValue |= oVar.f(s0Var) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && oVar.D()) {
            oVar.P();
        } else {
            oVar.U(1316674963);
            eh.f fVar = this.f10942i;
            if (fVar != null) {
                fVar.invoke(s0Var, oVar, Integer.valueOf(iIntValue & 14));
            }
            oVar.r(false);
            a1.n nVarJ = androidx.compose.foundation.layout.a.h(y.s0.a(s0Var, a1.k.f196a, 1.0f), this.f10943r).j(new VerticalAlignElement(this.f10944s));
            oVar.U(-483455358);
            t1.h0 h0VarA = y.r.a(this.f10945t, a1.a.A, oVar);
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
            o0.p.Q(v1.i.f18417f, h0VarA, oVar);
            o0.p.Q(v1.i.f18415d, bVar, oVar);
            o0.p.Q(v1.i.f18418g, lVar, oVar);
            aVarI.invoke(gb.e.f(oVar, d2Var, v1.i.f18419h, oVar), oVar, 0);
            oVar.U(2058660585);
            oVar.U(984343928);
            eh.e eVar = this.f10947v;
            if (eVar != null) {
                eVar.invoke(oVar, 0);
            }
            oVar.r(false);
            this.w.invoke(oVar, 6);
            oVar.U(1316675435);
            eh.e eVar2 = this.f10948x;
            if (eVar2 != null) {
                eVar2.invoke(oVar, 0);
            }
            k0.g.A(oVar, false, false, true, false);
            oVar.r(false);
            eh.f fVar2 = this.f10946u;
            if (fVar2 != null) {
                fVar2.invoke(s0Var, oVar, Integer.valueOf(iIntValue & 14));
            }
        }
        return qg.o.f13926a;
    }
}
