package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.n f10474i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f10475r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f10476s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f10477t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10478u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10479v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(a1.n nVar, long j, float f9, long j10, int i10, int i11, int i12) {
        super(2);
        this.f10474i = nVar;
        this.f10475r = j;
        this.f10476s = f9;
        this.f10477t = j10;
        this.f10478u = i10;
        this.f10479v = i11;
        this.w = i12;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h4.a(this.f10474i, this.f10475r, this.f10476s, this.f10477t, this.f10478u, (o0.o) obj, o0.p.S(this.f10479v | 1), this.w);
        return qg.o.f13926a;
    }
}
