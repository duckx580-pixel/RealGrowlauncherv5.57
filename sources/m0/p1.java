package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.n f11102i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f11103r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f11104s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(a1.n nVar, float f9, long j, int i10) {
        super(2);
        this.f11102i = nVar;
        this.f11103r = f9;
        this.f11104s = j;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iS = o0.p.S(1);
        n1.d(this.f11102i, this.f11103r, this.f11104s, (o0.o) obj, iS);
        return qg.o.f13926a;
    }
}
