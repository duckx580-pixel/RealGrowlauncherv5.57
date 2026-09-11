package w1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f18776i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q.f f18777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public qh.a f18778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f18779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e0 f18780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18781v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, wg.c cVar) {
        super(cVar);
        this.f18780u = e0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f18779t = obj;
        this.f18781v |= Integer.MIN_VALUE;
        return this.f18780u.q(this);
    }
}
