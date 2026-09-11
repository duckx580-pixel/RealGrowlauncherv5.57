package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements eh.e {
    public final /* synthetic */ w0.a A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.n f11412i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f11413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f11414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f11415t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f11416u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w0.a f11417v;
    public final /* synthetic */ d2.x w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y.g f11418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y.e f11419y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ eh.e f11420z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a1.n nVar, float f9, long j, long j10, long j11, w0.a aVar, d2.x xVar, y.g gVar, y.e eVar, eh.e eVar2, w0.a aVar2, int i10, int i11) {
        super(2);
        this.f11412i = nVar;
        this.f11413r = f9;
        this.f11414s = j;
        this.f11415t = j10;
        this.f11416u = j11;
        this.f11417v = aVar;
        this.w = xVar;
        this.f11418x = gVar;
        this.f11419y = eVar;
        this.f11420z = eVar2;
        this.A = aVar2;
        this.B = i10;
        this.C = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iS = o0.p.S(this.B | 1);
        int iS2 = o0.p.S(this.C);
        y.c(this.f11412i, this.f11413r, this.f11414s, this.f11415t, this.f11416u, this.f11417v, this.w, this.f11418x, this.f11419y, this.f11420z, this.A, (o0.o) obj, iS, iS2);
        return qg.o.f13926a;
    }
}
