package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11429i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11430r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(int i10, int i11) {
        super(2);
        this.f11429i = i11;
        this.f11430r = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11429i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    a1.n nVarA = androidx.compose.foundation.layout.c.a(a1.k.f196a, n0.j.f11989d, n0.j.f11987b);
                    a1.d dVar = a1.a.f179t;
                    w0.a aVar = fi.s.f6549i;
                    oVar.U(733328855);
                    t1.h0 h0VarC = y.n.c(dVar, false, oVar);
                    oVar.U(-1323940314);
                    q2.b bVar = (q2.b) oVar.k(w1.b1.f18759e);
                    q2.l lVar = (q2.l) oVar.k(w1.b1.f18764k);
                    w1.d2 d2Var = (w1.d2) oVar.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarI = t1.w0.i(nVarA);
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
                    aVar.invoke(oVar, Integer.valueOf((this.f11430r >> 21) & 14));
                    oVar.r(false);
                    oVar.r(true);
                    oVar.r(false);
                    oVar.r(false);
                }
                break;
            default:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    l7.a(o7.a((n7) oVar2.k(o7.f11096a), n0.h.f11969a), w0.f.b(oVar2, 167946739, new x1(this.f11430r, 0)), oVar2, 48);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
