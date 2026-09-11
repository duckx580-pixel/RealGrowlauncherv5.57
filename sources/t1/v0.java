package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.n f16329i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.e f16330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f16332t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a1.n nVar, eh.e eVar, int i10, int i11) {
        super(2);
        this.f16329i = nVar;
        this.f16330r = eVar;
        this.f16331s = i10;
        this.f16332t = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iS = o0.p.S(this.f16331s | 1);
        int i10 = this.f16332t;
        w0.c(this.f16329i, this.f16330r, (o0.o) obj, iS, i10);
        return qg.o.f13926a;
    }
}
