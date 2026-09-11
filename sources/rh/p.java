package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14793i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f14795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q f14796t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f14797u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sh.v f14798v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ug.c cVar) {
        super(cVar);
        this.f14795s = qVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14793i = obj;
        this.f14794r |= Integer.MIN_VALUE;
        return this.f14795s.collect(null, this);
    }
}
