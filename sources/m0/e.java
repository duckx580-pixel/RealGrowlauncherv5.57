package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements eh.e {
    public final /* synthetic */ long A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w0.a f10552i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1.n f10553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f10554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.e f10555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g1.k0 f10556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f10557v;
    public final /* synthetic */ float w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f10558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f10559y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f10560z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w0.a aVar, a1.n nVar, eh.e eVar, eh.e eVar2, g1.k0 k0Var, long j, float f9, long j10, long j11, long j12, long j13, int i10, int i11) {
        super(2);
        this.f10552i = aVar;
        this.f10553r = nVar;
        this.f10554s = eVar;
        this.f10555t = eVar2;
        this.f10556u = k0Var;
        this.f10557v = j;
        this.w = f9;
        this.f10558x = j10;
        this.f10559y = j11;
        this.f10560z = j12;
        this.A = j13;
        this.B = i10;
        this.C = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iS = o0.p.S(this.B | 1);
        int iS2 = o0.p.S(this.C);
        g.a(this.f10552i, this.f10553r, this.f10554s, this.f10555t, this.f10556u, this.f10557v, this.w, this.f10558x, this.f10559y, this.f10560z, this.A, (o0.o) obj, iS, iS2);
        return qg.o.f13926a;
    }
}
