package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11189i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1.n f11191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f11192t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x.l f11193u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ qg.a f11194v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(boolean z3, qg.a aVar, a1.n nVar, boolean z10, Object obj, x.l lVar, int i10, int i11) {
        super(2);
        this.f11189i = i11;
        this.f11190r = z3;
        this.f11194v = aVar;
        this.f11191s = nVar;
        this.f11192t = z10;
        this.w = obj;
        this.f11193u = lVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11189i) {
            case 0:
                ((Number) obj2).intValue();
                eh.c cVar = (eh.c) this.f11194v;
                q0 q0Var = (q0) this.w;
                v0.a(this.f11190r, cVar, this.f11191s, this.f11192t, q0Var, this.f11193u, (o0.o) obj, o0.p.S(49));
                break;
            default:
                ((Number) obj2).intValue();
                eh.a aVar = (eh.a) this.f11194v;
                i4 i4Var = (i4) this.w;
                j4.a(this.f11190r, aVar, this.f11191s, this.f11192t, i4Var, this.f11193u, (o0.o) obj, o0.p.S(49));
                break;
        }
        return qg.o.f13926a;
    }
}
