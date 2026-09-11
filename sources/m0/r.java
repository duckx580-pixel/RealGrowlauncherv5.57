package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11182i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.a f11183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f11185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f11186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f11187v;
    public final /* synthetic */ Object w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11188x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t.f1 f1Var, a1.n nVar, eh.c cVar, a1.d dVar, eh.c cVar2, w0.a aVar, int i10) {
        super(2);
        this.f11185t = f1Var;
        this.f11186u = nVar;
        this.f11187v = cVar;
        this.w = dVar;
        this.f11188x = cVar2;
        this.f11183r = aVar;
        this.f11184s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f11182i;
        Object obj3 = this.f11188x;
        Object obj4 = this.w;
        Object obj5 = this.f11187v;
        Object obj6 = this.f11186u;
        Object obj7 = this.f11185t;
        qg.o oVar = qg.o.f13926a;
        int i11 = this.f11184s;
        switch (i10) {
            case 0:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    float fW = ((q2.b) oVar2.k(w1.b1.f18759e)).W(n0.d0.f11894a) + 0.0f;
                    u1.g gVar = y.b1.f19920a;
                    f0.w1 w1Var = new f0.w1(5, (y.y0) obj7);
                    m7 m7Var = (m7) obj6;
                    int i12 = i11 << 12;
                    y.c(o1.c.l(gh.a.i(a1.k.f196a, w1Var)), fW, m7Var.f10977c, m7Var.f10978d, m7Var.f10979e, this.f11183r, (d2.x) obj4, y.i.f19956e, y.i.f19952a, (eh.e) obj3, (w0.a) obj5, oVar2, (458752 & i12) | 113246208 | (i12 & 3670016), ((i11 >> 6) & 896) | 3126);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                int iS = o0.p.S(i11 | 1);
                u5.f.e((t.f1) obj7, (a1.n) obj6, (eh.c) obj5, (a1.d) obj4, (eh.c) obj3, this.f11183r, (o0.o) obj, iS);
                break;
            default:
                ((Number) obj2).intValue();
                int iS2 = o0.p.S(i11) | 1;
                this.f11183r.a(this.f11185t, this.f11186u, this.f11187v, this.w, this.f11188x, (o0.o) obj, iS2);
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w0.a aVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(2);
        this.f11183r = aVar;
        this.f11185t = obj;
        this.f11186u = obj2;
        this.f11187v = obj3;
        this.w = obj4;
        this.f11188x = obj5;
        this.f11184s = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y.y0 y0Var, m7 m7Var, w0.a aVar, d2.x xVar, eh.e eVar, w0.a aVar2, int i10) {
        super(2);
        this.f11185t = y0Var;
        this.f11186u = m7Var;
        this.f11183r = aVar;
        this.w = xVar;
        this.f11188x = eVar;
        this.f11187v = aVar2;
        this.f11184s = i10;
    }
}
