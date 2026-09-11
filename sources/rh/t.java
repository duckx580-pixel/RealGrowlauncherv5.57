package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f14812i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f14814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14815t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f fVar, ug.c cVar) {
        super(cVar);
        this.f14814s = fVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14813r = obj;
        this.f14815t |= Integer.MIN_VALUE;
        return this.f14814s.emit(null, this);
    }
}
