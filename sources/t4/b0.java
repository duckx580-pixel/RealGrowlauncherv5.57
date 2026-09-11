package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c0 f16449i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public li.k f16450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f16452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16453u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, wg.c cVar) {
        super(cVar);
        this.f16452t = c0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16451s = obj;
        this.f16453u |= Integer.MIN_VALUE;
        return c0.a(this.f16452t, null, this);
    }
}
