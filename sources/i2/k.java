package i2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mf.e f8032i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f8033r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f8034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ mf.e f8035t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8036u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mf.e eVar, wg.c cVar) {
        super(cVar);
        this.f8035t = eVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f8034s = obj;
        this.f8036u |= Integer.MIN_VALUE;
        return this.f8035t.R(null, null, null, this);
    }
}
