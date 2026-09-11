package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10762i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f10763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qg.a f10766u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(long j, Object obj, qg.a aVar, int i10, int i11) {
        super(2);
        this.f10762i = i11;
        this.f10763r = j;
        this.f10765t = obj;
        this.f10766u = aVar;
        this.f10764s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10762i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    o0.p.b(new o0.g1[]{gb.e.e(this.f10763r, m1.f10941a)}, w0.f.b(oVar, 1582292974, new h0((y.m0) this.f10765t, (eh.f) this.f10766u, this.f10764s, 1)), oVar, 56);
                }
                break;
            default:
                ((Number) obj2).intValue();
                n0.g0 g0Var = (n0.g0) this.f10765t;
                eh.e eVar = (eh.e) this.f10766u;
                r2.c(this.f10763r, g0Var, eVar, (o0.o) obj, o0.p.S(this.f10764s | 1));
                break;
        }
        return qg.o.f13926a;
    }
}
