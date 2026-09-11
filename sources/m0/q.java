package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements eh.e {
    public final /* synthetic */ Object A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11135i = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1.n f11137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f11138t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f11139u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f11140v;
    public final /* synthetic */ int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11142y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f11143z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a1.n nVar, z.q qVar, y.m0 m0Var, y.g gVar, a1.b bVar, v.m mVar, boolean z3, eh.c cVar, int i10, int i11) {
        super(2);
        this.f11137s = nVar;
        this.f11142y = qVar;
        this.f11139u = m0Var;
        this.f11136r = gVar;
        this.f11143z = bVar;
        this.A = mVar;
        this.f11138t = z3;
        this.f11140v = cVar;
        this.w = i10;
        this.f11141x = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11135i) {
            case 0:
                ((Number) obj2).intValue();
                w0.a aVar = (w0.a) this.f11142y;
                eh.a aVar2 = (eh.a) this.f11136r;
                eh.e eVar = (eh.e) this.f11143z;
                x2 x2Var = (x2) this.A;
                y.m0 m0Var = (y.m0) this.f11139u;
                x.l lVar = (x.l) this.f11140v;
                n1.f(aVar, aVar2, this.f11137s, eVar, this.f11138t, x2Var, m0Var, lVar, (o0.o) obj, o0.p.S(this.w | 1), this.f11141x);
                break;
            case 1:
                ((Number) obj2).intValue();
                eh.a aVar3 = (eh.a) this.f11136r;
                g1.k0 k0Var = (g1.k0) this.f11142y;
                z zVar = (z) this.f11143z;
                y.m0 m0Var2 = (y.m0) this.f11139u;
                x.l lVar2 = (x.l) this.f11140v;
                eh.f fVar = (eh.f) this.A;
                n1.n(aVar3, this.f11137s, this.f11138t, k0Var, zVar, m0Var2, lVar2, fVar, (o0.o) obj, o0.p.S(this.w | 1), this.f11141x);
                break;
            case 2:
                ((Number) obj2).intValue();
                eh.a aVar4 = (eh.a) this.f11136r;
                g1.k0 k0Var2 = (g1.k0) this.f11143z;
                l0 l0Var = (l0) this.A;
                o0 o0Var = (o0) this.f11139u;
                x.l lVar3 = (x.l) this.f11140v;
                w0.a aVar5 = (w0.a) this.f11142y;
                n1.c(aVar4, this.f11137s, this.f11138t, k0Var2, l0Var, o0Var, lVar3, aVar5, (o0.o) obj, o0.p.S(this.w | 1), this.f11141x);
                break;
            default:
                ((Number) obj2).intValue();
                z.q qVar = (z.q) this.f11142y;
                y.m0 m0Var3 = (y.m0) this.f11139u;
                y.g gVar = (y.g) this.f11136r;
                a1.b bVar = (a1.b) this.f11143z;
                v.m mVar = (v.m) this.A;
                eh.c cVar = (eh.c) this.f11140v;
                k8.g.a(this.f11137s, qVar, m0Var3, gVar, bVar, mVar, this.f11138t, cVar, (o0.o) obj, o0.p.S(this.w | 1), this.f11141x);
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(eh.a aVar, a1.n nVar, boolean z3, g1.k0 k0Var, z zVar, y.m0 m0Var, x.l lVar, eh.f fVar, int i10, int i11) {
        super(2);
        this.f11136r = aVar;
        this.f11137s = nVar;
        this.f11138t = z3;
        this.f11142y = k0Var;
        this.f11143z = zVar;
        this.f11139u = m0Var;
        this.f11140v = lVar;
        this.A = fVar;
        this.w = i10;
        this.f11141x = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(eh.a aVar, a1.n nVar, boolean z3, g1.k0 k0Var, l0 l0Var, o0 o0Var, x.l lVar, w0.a aVar2, int i10, int i11) {
        super(2);
        this.f11136r = aVar;
        this.f11137s = nVar;
        this.f11138t = z3;
        this.f11143z = k0Var;
        this.A = l0Var;
        this.f11139u = o0Var;
        this.f11140v = lVar;
        this.f11142y = aVar2;
        this.w = i10;
        this.f11141x = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w0.a aVar, eh.a aVar2, a1.n nVar, eh.e eVar, boolean z3, x2 x2Var, y.m0 m0Var, x.l lVar, int i10, int i11) {
        super(2);
        this.f11142y = aVar;
        this.f11136r = aVar2;
        this.f11137s = nVar;
        this.f11143z = eVar;
        this.f11138t = z3;
        this.A = x2Var;
        this.f11139u = m0Var;
        this.f11140v = lVar;
        this.w = i10;
        this.f11141x = i11;
    }
}
