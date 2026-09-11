package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f14843i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f14844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f14846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14847u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, ug.c cVar) {
        super(cVar);
        this.f14846t = yVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14845s = obj;
        this.f14847u |= Integer.MIN_VALUE;
        return this.f14846t.emit(null, this);
    }
}
