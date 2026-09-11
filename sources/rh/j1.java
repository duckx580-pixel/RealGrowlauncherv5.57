package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k1 f14750i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public sh.v f14751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f14752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k1 f14753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14754u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, wg.c cVar) {
        super(cVar);
        this.f14753t = k1Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14752s = obj;
        this.f14754u |= Integer.MIN_VALUE;
        return this.f14753t.b(this);
    }
}
