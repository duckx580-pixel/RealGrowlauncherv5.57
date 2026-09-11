package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f16187i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f16189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f16190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f16191u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f16192v;
    public final /* synthetic */ eh.c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kotlin.jvm.internal.x xVar, Object obj, f fVar, o oVar, j jVar, float f9, eh.c cVar) {
        super(1);
        this.f16187i = xVar;
        this.f16188r = obj;
        this.f16189s = fVar;
        this.f16190t = oVar;
        this.f16191u = jVar;
        this.f16192v = f9;
        this.w = cVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        f fVar = this.f16189s;
        h hVar = new h(this.f16188r, fVar.c(), this.f16190t, jLongValue, fVar.g(), jLongValue, new s0(this.f16191u, 0));
        d.i(hVar, jLongValue, this.f16192v, this.f16189s, this.f16191u, this.w);
        this.f16187i.f9667i = hVar;
        return qg.o.f13926a;
    }
}
