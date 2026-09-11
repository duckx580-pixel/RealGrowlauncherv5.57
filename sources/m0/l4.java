package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l4 extends kotlin.jvm.internal.m implements eh.e {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.n f10914i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.e f10915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f10916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.e f10917t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.e f10918u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10919v;
    public final /* synthetic */ long w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f10920x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y.y0 f10921y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w0.a f10922z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(a1.n nVar, eh.e eVar, eh.e eVar2, eh.e eVar3, eh.e eVar4, int i10, long j, long j10, y.y0 y0Var, w0.a aVar, int i11, int i12) {
        super(2);
        this.f10914i = nVar;
        this.f10915r = eVar;
        this.f10916s = eVar2;
        this.f10917t = eVar3;
        this.f10918u = eVar4;
        this.f10919v = i10;
        this.w = j;
        this.f10920x = j10;
        this.f10921y = y0Var;
        this.f10922z = aVar;
        this.A = i11;
        this.B = i12;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iS = o0.p.S(this.A | 1);
        int i10 = this.B;
        n4.a(this.f10914i, this.f10915r, this.f10916s, this.f10917t, this.f10918u, this.f10919v, this.w, this.f10920x, this.f10921y, this.f10922z, (o0.o) obj, iS, i10);
        return qg.o.f13926a;
    }
}
