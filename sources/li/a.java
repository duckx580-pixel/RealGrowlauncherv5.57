package li;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9945i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f9946r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9947s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, wg.c cVar) {
        super(cVar);
        this.f9946r = fVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f9945i = obj;
        this.f9947s |= Integer.MIN_VALUE;
        return this.f9946r.e(this);
    }
}
