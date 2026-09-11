package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h0.a0 f14676i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h0.a0 f14679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f14680u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h0.a0 a0Var, ug.c cVar) {
        super(cVar);
        this.f14679t = a0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14677r = obj;
        this.f14678s |= Integer.MIN_VALUE;
        return this.f14679t.emit(null, this);
    }
}
