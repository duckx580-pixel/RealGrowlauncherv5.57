package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v6 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f11371i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f11372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d2.x f11373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.e f11374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11375u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(float f9, long j, d2.x xVar, eh.e eVar, int i10) {
        super(2);
        this.f11371i = f9;
        this.f11372r = j;
        this.f11373s = xVar;
        this.f11374t = eVar;
        this.f11375u = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
            oVar.P();
        } else {
            a1.n nVarG = ka.a1.g(a1.k.f196a, this.f11371i);
            oVar.U(733328855);
            t1.h0 h0VarC = y.n.c(a1.a.f176i, false, oVar);
            oVar.U(-1323940314);
            q2.b bVar = (q2.b) oVar.k(w1.b1.f18759e);
            q2.l lVar = (q2.l) oVar.k(w1.b1.f18764k);
            w1.d2 d2Var = (w1.d2) oVar.k(w1.b1.f18769p);
            v1.j.f18438q.getClass();
            v1.n nVar = v1.i.f18413b;
            w0.a aVarI = t1.w0.i(nVarG);
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
            a7.b(this.f11372r, this.f11373s, this.f11374t, oVar, (this.f11375u >> 18) & 896, 0);
            k0.g.A(oVar, false, true, false, false);
        }
        return qg.o.f13926a;
    }
}
