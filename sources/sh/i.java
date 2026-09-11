package sh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f15810i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f15811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f15813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15814u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ug.c cVar) {
        super(cVar);
        this.f15813t = jVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f15812s = obj;
        this.f15814u |= Integer.MIN_VALUE;
        return this.f15813t.emit(null, this);
    }
}
