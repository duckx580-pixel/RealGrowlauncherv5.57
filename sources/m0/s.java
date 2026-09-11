package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11217i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1.n f11218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f11219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0.a f11220t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11221u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f11222v;
    public final /* synthetic */ qg.a w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11223x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11224y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a1.n nVar, w0.a aVar, d2.x xVar, eh.e eVar, eh.f fVar, y.y0 y0Var, m7 m7Var, int i10) {
        super(2);
        this.f11218r = nVar;
        this.f11220t = aVar;
        this.f11222v = xVar;
        this.f11219s = eVar;
        this.w = fVar;
        this.f11223x = y0Var;
        this.f11224y = m7Var;
        this.f11221u = i10;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11217i) {
            case 0:
                ((Number) obj2).intValue();
                d2.x xVar = (d2.x) this.f11222v;
                eh.f fVar = (eh.f) this.w;
                y.y0 y0Var = (y.y0) this.f11223x;
                m7 m7Var = (m7) this.f11224y;
                y.a(this.f11218r, this.f11220t, xVar, this.f11219s, fVar, y0Var, m7Var, (o0.o) obj, o0.p.S(this.f11221u | 1));
                break;
            default:
                ((Number) obj2).intValue();
                t.f1 f1Var = (t.f1) this.f11222v;
                ?? r22 = (kotlin.jvm.internal.m) this.w;
                s.e0 e0Var = (s.e0) this.f11223x;
                s.f0 f0Var = (s.f0) this.f11224y;
                androidx.compose.animation.a.a(f1Var, r22, this.f11218r, e0Var, f0Var, this.f11219s, this.f11220t, (o0.o) obj, o0.p.S(this.f11221u | 1));
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(t.f1 f1Var, eh.c cVar, a1.n nVar, s.e0 e0Var, s.f0 f0Var, eh.e eVar, w0.a aVar, int i10) {
        super(2);
        this.f11222v = f1Var;
        this.w = (kotlin.jvm.internal.m) cVar;
        this.f11218r = nVar;
        this.f11223x = e0Var;
        this.f11224y = f0Var;
        this.f11219s = eVar;
        this.f11220t = aVar;
        this.f11221u = i10;
    }
}
