package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z6 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f11543i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d2.x f11544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f11545s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11547u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(long j, d2.x xVar, eh.e eVar, int i10, int i11) {
        super(2);
        this.f11543i = j;
        this.f11544r = xVar;
        this.f11545s = eVar;
        this.f11546t = i10;
        this.f11547u = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a7.b(this.f11543i, this.f11544r, this.f11545s, (o0.o) obj, o0.p.S(this.f11546t | 1), this.f11547u);
        return qg.o.f13926a;
    }
}
