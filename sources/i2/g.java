package i2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j2.b f8012i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f8014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8015t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, wg.c cVar) {
        super(cVar);
        this.f8014s = hVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f8013r = obj;
        this.f8015t |= Integer.MIN_VALUE;
        return this.f8014s.d(null, this);
    }
}
