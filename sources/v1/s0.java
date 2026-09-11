package v1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18481i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t0 f18482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1.m f18483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f18484t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f18485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f18486v;
    public final /* synthetic */ boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f18487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f18488y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(t0 t0Var, a1.m mVar, d dVar, long j, r rVar, boolean z3, boolean z10, float f9, int i10) {
        super(0);
        this.f18481i = i10;
        this.f18482r = t0Var;
        this.f18483s = mVar;
        this.f18484t = dVar;
        this.f18485u = j;
        this.f18486v = rVar;
        this.w = z3;
        this.f18487x = z10;
        this.f18488y = f9;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f18481i) {
            case 0:
                a1.m mVarE = f.e(this.f18483s, this.f18484t.a());
                t0 t0Var = this.f18482r;
                d dVar = this.f18484t;
                long j = this.f18485u;
                r rVar = this.f18486v;
                boolean z3 = this.w;
                boolean z10 = this.f18487x;
                if (mVarE == null) {
                    t0Var.N0(dVar, j, rVar, z3, z10);
                } else {
                    float f9 = this.f18488y;
                    rVar.j(mVarE, f9, z10, new s0(t0Var, mVarE, dVar, j, rVar, z3, z10, f9, 0));
                }
                break;
            default:
                this.f18482r.X0(f.e(this.f18483s, this.f18484t.a()), this.f18484t, this.f18485u, this.f18486v, this.w, this.f18487x, this.f18488y);
                break;
        }
        return qg.o.f13926a;
    }
}
