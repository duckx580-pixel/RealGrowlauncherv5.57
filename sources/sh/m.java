package sh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15820i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f15821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15822s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ug.c cVar) {
        super(cVar);
        this.f15821r = nVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f15820i = obj;
        this.f15822s |= Integer.MIN_VALUE;
        return this.f15821r.emit(null, this);
    }
}
