package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k1.f f10591i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1.n f10593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f10594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10596v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(k1.f fVar, String str, a1.n nVar, long j, int i10, int i11) {
        super(2);
        this.f10591i = fVar;
        this.f10592r = str;
        this.f10593s = nVar;
        this.f10594t = j;
        this.f10595u = i10;
        this.f10596v = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        f2.b(this.f10591i, this.f10592r, this.f10593s, this.f10594t, (o0.o) obj, o0.p.S(this.f10595u | 1), this.f10596v);
        return qg.o.f13926a;
    }
}
