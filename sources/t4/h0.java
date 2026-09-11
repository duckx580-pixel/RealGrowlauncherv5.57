package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p0 f16507i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q0 f16508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wh.d f16509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f16510t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0 f16511u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16512v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p0 p0Var, wg.c cVar) {
        super(cVar);
        this.f16511u = p0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16510t = obj;
        this.f16512v |= Integer.MIN_VALUE;
        return this.f16511u.e(this);
    }
}
