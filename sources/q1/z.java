package q1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13723i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f13724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13725s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, wg.a aVar) {
        super(aVar);
        this.f13724r = a0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f13723i = obj;
        this.f13725s |= Integer.MIN_VALUE;
        return this.f13724r.h(0L, null, this);
    }
}
