package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c6.a f16541i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public oh.w0 f16542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wh.d f16543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f16544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c6.a f16545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16546v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(c6.a aVar, wg.c cVar) {
        super(cVar);
        this.f16545u = aVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16544t = obj;
        this.f16546v |= Integer.MIN_VALUE;
        return this.f16545u.f(null, this);
    }
}
