package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c6.a f16555i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public oh.w0 f16556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wh.a f16557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f16558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c6.a f16559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16560v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(c6.a aVar, wg.c cVar) {
        super(cVar);
        this.f16559u = aVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16558t = obj;
        this.f16560v |= Integer.MIN_VALUE;
        return this.f16559u.h(null, this);
    }
}
