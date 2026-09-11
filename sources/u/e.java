package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f17418i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f17421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17422u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, wg.c cVar) {
        super(cVar);
        this.f17421t = fVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f17420s = obj;
        this.f17422u |= Integer.MIN_VALUE;
        return this.f17421t.c(0L, null, this);
    }
}
