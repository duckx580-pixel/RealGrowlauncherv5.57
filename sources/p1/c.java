package p1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13237i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f13238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13239s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, wg.c cVar) {
        super(cVar);
        this.f13238r = dVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f13237i = obj;
        this.f13239s |= Integer.MIN_VALUE;
        return this.f13238r.b(0L, this);
    }
}
