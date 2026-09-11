package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h1 f14728i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f14729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i1 f14730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public oh.w0 f14731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f14732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14733v;
    public final /* synthetic */ h1 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14734x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, ug.c cVar) {
        super(cVar);
        this.w = h1Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f14733v = obj;
        this.f14734x |= Integer.MIN_VALUE;
        this.w.collect(null, this);
        return vg.a.f18663i;
    }
}
