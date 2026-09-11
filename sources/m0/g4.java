package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.n f10695i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f10696r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10697s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(a1.n nVar, long j, long j10, int i10) {
        super(2);
        this.f10695i = nVar;
        this.f10696r = j;
        this.f10697s = j10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iS = o0.p.S(7);
        h4.b(this.f10695i, this.f10696r, this.f10697s, (o0.o) obj, iS);
        return qg.o.f13926a;
    }
}
