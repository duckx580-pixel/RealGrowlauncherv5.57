package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l0 f18156i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public oh.w f18157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t f18158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f18159t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l0 f18160u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18161v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l0 l0Var, wg.c cVar) {
        super(cVar);
        this.f18160u = l0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f18159t = obj;
        this.f18161v |= Integer.MIN_VALUE;
        return l0.J0(this.f18160u, null, null, this);
    }
}
