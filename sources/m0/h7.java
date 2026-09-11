package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h7 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u4 f10747i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g2 f10748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f10750t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y6 f10751u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f10752v;
    public final /* synthetic */ w0.a w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(u4 u4Var, g2 g2Var, long j, long j10, y6 y6Var, boolean z3, w0.a aVar, int i10) {
        super(2);
        this.f10747i = u4Var;
        this.f10748r = g2Var;
        this.f10749s = j;
        this.f10750t = j10;
        this.f10751u = y6Var;
        this.f10752v = z3;
        this.w = aVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iS = o0.p.S(1769473);
        this.f10747i.a(this.f10748r, this.f10749s, this.f10750t, this.f10751u, this.f10752v, this.w, (o0.o) obj, iS);
        return qg.o.f13926a;
    }
}
