package li;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9948i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f9949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9950s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, wg.c cVar) {
        super(cVar);
        this.f9949r = fVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f9948i = obj;
        this.f9950s |= Integer.MIN_VALUE;
        return this.f9949r.f(this);
    }
}
