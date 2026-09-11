package wi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public eh.a f19297i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f19298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f19299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19300t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, wg.c cVar) {
        super(cVar);
        this.f19299s = fVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f19298r = obj;
        this.f19300t |= Integer.MIN_VALUE;
        return this.f19299s.e(null, null, null, null, this);
    }
}
