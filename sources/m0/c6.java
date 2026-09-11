package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.n f10483i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g1.k0 f10484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f10486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u.p f10488v;
    public final /* synthetic */ float w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w0.a f10489x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(a1.n nVar, g1.k0 k0Var, long j, float f9, int i10, u.p pVar, float f10, w0.a aVar) {
        super(2);
        this.f10483i = nVar;
        this.f10484r = k0Var;
        this.f10485s = j;
        this.f10486t = f9;
        this.f10487u = i10;
        this.f10488v = pVar;
        this.w = f10;
        this.f10489x = aVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        int iIntValue = ((Number) obj2).intValue() & 11;
        qg.o oVar2 = qg.o.f13926a;
        if (iIntValue == 2 && oVar.D()) {
            oVar.P();
            return oVar2;
        }
        a1.n nVarA = q1.x.a(b2.l.a(e6.c(this.f10483i, this.f10484r, e6.d(this.f10485s, this.f10486t, oVar), this.f10488v, this.w), false, g0.f10684z), oVar2, new fe.f(2, null, 2));
        oVar.U(733328855);
        t1.h0 h0VarC = y.n.c(a1.a.f176i, true, oVar);
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
        this.f10489x.invoke(oVar, Integer.valueOf((this.f10487u >> 21) & 14));
        oVar.r(false);
        oVar.r(true);
        oVar.r(false);
        oVar.r(false);
        return oVar2;
    }
}
