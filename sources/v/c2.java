package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d2 f18138i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public qg.a f18139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public eh.a f18140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f18141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f18142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d2 f18143v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, wg.c cVar) {
        super(cVar);
        this.f18143v = d2Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f18142u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.f18143v.a(null, null, this);
    }
}
