package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u5 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ eh.e f11334i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.a f11335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f11336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f11337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f11338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11339v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(eh.e eVar, w0.a aVar, eh.e eVar2, long j, long j10, int i10) {
        super(2);
        this.f11334i = eVar;
        this.f11335r = aVar;
        this.f11336s = eVar2;
        this.f11337t = j;
        this.f11338u = j10;
        this.f11339v = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
            oVar.P();
        } else {
            o0.e2 e2Var = o7.f11096a;
            d2.x xVarA = o7.a((n7) oVar.k(e2Var), n0.a0.f11846e);
            d2.x xVarA2 = o7.a((n7) oVar.k(e2Var), n0.g0.f11965t);
            o0.p.b(new o0.g1[]{l7.f10934a.a(xVarA)}, w0.f.b(oVar, 835891690, new t5(this.f11334i, this.f11335r, this.f11336s, xVarA2, this.f11337t, this.f11338u, this.f11339v)), oVar, 56);
        }
        return qg.o.f13926a;
    }
}
