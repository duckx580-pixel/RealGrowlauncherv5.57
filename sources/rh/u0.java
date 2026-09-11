package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v0 f14823i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f14824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x0 f14825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public oh.w0 f14826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f14827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v0 f14828v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, ug.c cVar) {
        super(cVar);
        this.f14828v = v0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f14827u = obj;
        this.w |= Integer.MIN_VALUE;
        v0.k(this.f14828v, null, this);
        return vg.a.f18663i;
    }
}
