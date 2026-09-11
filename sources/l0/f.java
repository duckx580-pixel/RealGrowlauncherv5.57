package l0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f9742i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f9744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9745t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, wg.c cVar) {
        super(cVar);
        this.f9744s = iVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f9743r = obj;
        this.f9745t |= Integer.MIN_VALUE;
        return this.f9744s.a(this);
    }
}
