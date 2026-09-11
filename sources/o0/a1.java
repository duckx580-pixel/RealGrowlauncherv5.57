package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b1 f12379i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public eh.c f12380r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f12381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b1 f12382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12383u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, ug.c cVar) {
        super(cVar);
        this.f12382t = b1Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f12381s = obj;
        this.f12383u |= Integer.MIN_VALUE;
        return this.f12382t.f(null, this);
    }
}
