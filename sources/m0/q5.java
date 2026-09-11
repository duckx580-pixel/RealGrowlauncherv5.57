package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r5 f11171i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p5 f11172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wh.a f11173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f11174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r5 f11175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11176v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(r5 r5Var, wg.c cVar) {
        super(cVar);
        this.f11175u = r5Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f11174t = obj;
        this.f11176v |= Integer.MIN_VALUE;
        return this.f11175u.a(null, this);
    }
}
