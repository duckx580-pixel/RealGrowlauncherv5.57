package v1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t0 f18475i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1.m f18476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f18477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f18479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f18480v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, a1.m mVar, d dVar, long j, r rVar, boolean z3, boolean z10) {
        super(0);
        this.f18475i = t0Var;
        this.f18476r = mVar;
        this.f18477s = dVar;
        this.f18478t = j;
        this.f18479u = rVar;
        this.f18480v = z3;
        this.w = z10;
    }

    @Override // eh.a
    public final Object invoke() {
        a1.m mVarE = f.e(this.f18476r, this.f18477s.a());
        t0 t0Var = this.f18475i;
        d dVar = this.f18477s;
        long j = this.f18478t;
        r rVar = this.f18479u;
        boolean z3 = this.f18480v;
        boolean z10 = this.w;
        if (mVarE == null) {
            t0Var.N0(dVar, j, rVar, z3, z10);
        } else {
            rVar.j(mVarE, -1.0f, z10, new r0(t0Var, mVarE, dVar, j, rVar, z3, z10));
        }
        return qg.o.f13926a;
    }
}
