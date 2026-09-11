package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x0 f18305i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0 f18307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18308t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, wg.c cVar) {
        super(cVar);
        this.f18307s = x0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f18306r = obj;
        this.f18308t |= Integer.MIN_VALUE;
        return this.f18307s.d(this);
    }
}
