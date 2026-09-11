package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public rh.d0 f16444i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public rg.v f16445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ rh.d0 f16447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16448u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rh.d0 d0Var, ug.c cVar) {
        super(cVar);
        this.f16447t = d0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16446s = obj;
        this.f16448u |= Integer.MIN_VALUE;
        return this.f16447t.b(null, this);
    }
}
