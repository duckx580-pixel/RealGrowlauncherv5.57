package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i1 f18190i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f18191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i1 f18193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18194u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, wg.c cVar) {
        super(cVar);
        this.f18193t = i1Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f18192s = obj;
        this.f18194u |= Integer.MIN_VALUE;
        return this.f18193t.J(0L, 0L, this);
    }
}
