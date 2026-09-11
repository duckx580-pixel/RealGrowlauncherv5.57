package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public af.a f16491i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public wh.d f16492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ af.a f16494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16495u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(af.a aVar, wg.c cVar) {
        super(cVar);
        this.f16494t = aVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16493s = obj;
        this.f16495u |= Integer.MIN_VALUE;
        return this.f16494t.l(this);
    }
}
