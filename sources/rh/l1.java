package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14771i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m1 f14772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14773s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, ug.c cVar) {
        super(cVar);
        this.f14772r = m1Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14771i = obj;
        this.f14773s |= Integer.MIN_VALUE;
        this.f14772r.collect(null, this);
        return vg.a.f18663i;
    }
}
