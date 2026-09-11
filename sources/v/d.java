package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l0 f18144i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public oh.w f18145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s f18146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x.b f18147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f18148u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l0 f18149v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l0 l0Var, wg.c cVar) {
        super(cVar);
        this.f18149v = l0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f18148u = obj;
        this.w |= Integer.MIN_VALUE;
        return l0.I0(this.f18149v, null, null, this);
    }
}
