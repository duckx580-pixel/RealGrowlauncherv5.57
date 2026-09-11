package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14768i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m0 f14769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14770s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, ug.c cVar) {
        super(cVar);
        this.f14769r = m0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14768i = obj;
        this.f14770s |= Integer.MIN_VALUE;
        return this.f14769r.emit(null, this);
    }
}
