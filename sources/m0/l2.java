package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10901i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y.s0 f10902r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10903s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f10904t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.e f10905u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10906v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(y.s0 s0Var, long j, boolean z3, eh.e eVar, int i10, int i11) {
        super(2);
        this.f10901i = i11;
        this.f10902r = s0Var;
        this.f10903s = j;
        this.f10904t = z3;
        this.f10905u = eVar;
        this.f10906v = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10901i) {
            case 0:
                ((Number) obj2).intValue();
                r2.d(this.f10902r, this.f10903s, this.f10904t, this.f10905u, (o0.o) obj, o0.p.S(this.f10906v | 1));
                break;
            default:
                ((Number) obj2).intValue();
                r2.e(this.f10902r, this.f10903s, this.f10904t, this.f10905u, (o0.o) obj, o0.p.S(this.f10906v | 1));
                break;
        }
        return qg.o.f13926a;
    }
}
