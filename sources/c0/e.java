package c0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f1.d f3262i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f3263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3266u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f3267v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, wg.c cVar) {
        super(cVar);
        this.f3267v = fVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f3266u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.f3267v.a(null, this);
    }
}
