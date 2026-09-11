package p1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f13243i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f13245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f13246t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f13247u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13248v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, wg.c cVar) {
        super(cVar);
        this.f13247u = hVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f13246t = obj;
        this.f13248v |= Integer.MIN_VALUE;
        return this.f13247u.J(0L, 0L, this);
    }
}
