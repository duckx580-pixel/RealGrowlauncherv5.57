package p1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13234i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f13235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13236s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, wg.c cVar) {
        super(cVar);
        this.f13235r = dVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f13234i = obj;
        this.f13236s |= Integer.MIN_VALUE;
        return this.f13235r.a(0L, 0L, this);
    }
}
