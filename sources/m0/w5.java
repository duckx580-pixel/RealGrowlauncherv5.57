package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o5 f11395i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1.n f11396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g1.k0 f11397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f11398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f11399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f11400v;
    public final /* synthetic */ long w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f11401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f11402y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(o5 o5Var, a1.n nVar, g1.k0 k0Var, long j, long j10, long j11, long j12, long j13, int i10) {
        super(2);
        this.f11395i = o5Var;
        this.f11396r = nVar;
        this.f11397s = k0Var;
        this.f11398t = j;
        this.f11399u = j10;
        this.f11400v = j11;
        this.w = j12;
        this.f11401x = j13;
        this.f11402y = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iS = o0.p.S(this.f11402y | 1);
        y5.b(this.f11395i, this.f11396r, this.f11397s, this.f11398t, this.f11399u, this.f11400v, this.w, this.f11401x, (o0.o) obj, iS);
        return qg.o.f13926a;
    }
}
