package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f16552i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ rh.d0 f16553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16554s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(rh.d0 d0Var, ug.c cVar) {
        super(cVar);
        this.f16553r = d0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16552i = obj;
        this.f16554s |= Integer.MIN_VALUE;
        return this.f16553r.c(null, this);
    }
}
