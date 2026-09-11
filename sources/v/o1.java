package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q1 f18238i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18239r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q1 f18240s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18241t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, wg.c cVar) {
        super(cVar);
        this.f18240s = q1Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f18239r = obj;
        this.f18241t |= Integer.MIN_VALUE;
        return this.f18240s.c(0L, this);
    }
}
