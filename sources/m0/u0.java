package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11311i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1.n f11313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f11315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f11316v;
    public final /* synthetic */ Object w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11317x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(c2.a aVar, eh.a aVar2, a1.n nVar, boolean z3, q0 q0Var, x.l lVar, int i10) {
        super(2);
        this.f11315u = aVar;
        this.f11316v = aVar2;
        this.f11313s = nVar;
        this.f11312r = z3;
        this.w = q0Var;
        this.f11317x = lVar;
        this.f11314t = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11311i) {
            case 0:
                ((Number) obj2).intValue();
                c2.a aVar = (c2.a) this.f11315u;
                eh.a aVar2 = (eh.a) this.f11316v;
                q0 q0Var = (q0) this.w;
                x.l lVar = (x.l) this.f11317x;
                v0.c(aVar, aVar2, this.f11313s, this.f11312r, q0Var, lVar, (o0.o) obj, o0.p.S(this.f11314t | 1));
                break;
            default:
                ((Number) obj2).intValue();
                s.e0 e0Var = (s.e0) this.f11315u;
                s.f0 f0Var = (s.f0) this.f11316v;
                String str = (String) this.w;
                w0.a aVar3 = (w0.a) this.f11317x;
                androidx.compose.animation.a.d(this.f11312r, this.f11313s, e0Var, f0Var, str, aVar3, (o0.o) obj, o0.p.S(this.f11314t | 1));
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z3, a1.n nVar, s.e0 e0Var, s.f0 f0Var, String str, w0.a aVar, int i10) {
        super(2);
        this.f11312r = z3;
        this.f11313s = nVar;
        this.f11315u = e0Var;
        this.f11316v = f0Var;
        this.w = str;
        this.f11317x = aVar;
        this.f11314t = i10;
    }
}
