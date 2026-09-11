package p1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f13249i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f13251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f13252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13253u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, wg.c cVar) {
        super(cVar);
        this.f13252t = hVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f13251s = obj;
        this.f13253u |= Integer.MIN_VALUE;
        return this.f13252t.m0(0L, this);
    }
}
