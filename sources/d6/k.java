package d6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4956i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f4957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4958s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, wg.c cVar) {
        super(cVar);
        this.f4957r = mVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f4956i = obj;
        this.f4958s |= Integer.MIN_VALUE;
        return this.f4957r.b(null, this);
    }
}
