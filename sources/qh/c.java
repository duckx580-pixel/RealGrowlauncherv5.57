package qh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13935i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f13936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13937s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, wg.c cVar) {
        super(cVar);
        this.f13936r = dVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f13935i = obj;
        this.f13937s |= Integer.MIN_VALUE;
        Object objD = this.f13936r.D(null, 0, 0L, this);
        return objD == vg.a.f18663i ? objD : new k(objD);
    }
}
