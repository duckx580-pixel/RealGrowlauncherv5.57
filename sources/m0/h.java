package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10705i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.e f10706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0.a f10708t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(eh.e eVar, int i10, w0.a aVar, int i11) {
        super(2);
        this.f10705i = i11;
        this.f10706r = eVar;
        this.f10707s = i10;
        this.f10708t = aVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10705i;
        qg.o oVar = qg.o.f13926a;
        int i11 = this.f10707s;
        w0.a aVar = this.f10708t;
        eh.e eVar = this.f10706r;
        int i12 = 0;
        switch (i10) {
            case 0:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    oVar2.U(-1969500715);
                    if (eVar != null) {
                        eVar.invoke(oVar2, Integer.valueOf((i11 >> 9) & 14));
                    }
                    oVar2.r(false);
                    aVar.invoke(oVar2, Integer.valueOf((i11 >> 3) & 14));
                }
                break;
            case 1:
                o0.o oVar3 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar3.D()) {
                    oVar3.P();
                } else {
                    float f9 = m.f10935a;
                    g.b(w0.f.b(oVar3, 628285581, new h(eVar, i11, aVar, i12)), oVar3, 438);
                }
                break;
            default:
                o0.o oVar4 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar4.D()) {
                    oVar4.P();
                } else {
                    a1.n nVarL = androidx.compose.foundation.layout.a.l(y.s0.a(y.s0.f19994a, a1.k.f196a, 1.0f), eVar != null ? z2.f11523b : 0, 0.0f, 0, 0.0f, 10);
                    oVar4.U(733328855);
                    t1.h0 h0VarC = y.n.c(a1.a.f176i, false, oVar4);
                    oVar4.U(-1323940314);
                    q2.b bVar = (q2.b) oVar4.k(w1.b1.f18759e);
                    q2.l lVar = (q2.l) oVar4.k(w1.b1.f18764k);
                    w1.d2 d2Var = (w1.d2) oVar4.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarI = t1.w0.i(nVarL);
                    oVar4.X();
                    if (oVar4.O) {
                        oVar4.m(nVar);
                    } else {
                        oVar4.j0();
                    }
                    oVar4.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarC, oVar4);
                    o0.p.Q(v1.i.f18415d, bVar, oVar4);
                    o0.p.Q(v1.i.f18418g, lVar, oVar4);
                    k0.g.u(0, aVarI, gb.e.f(oVar4, d2Var, v1.i.f18419h, oVar4), oVar4, 2058660585);
                    aVar.invoke(oVar4, Integer.valueOf(i11 & 14));
                    oVar4.r(false);
                    oVar4.r(true);
                    oVar4.r(false);
                    oVar4.r(false);
                }
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(eh.e eVar, w0.a aVar, int i10) {
        super(2);
        this.f10705i = 2;
        this.f10706r = eVar;
        this.f10708t = aVar;
        this.f10707s = i10;
    }
}
