package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s0 f17483i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x.h f17484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f17486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17487u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, wg.c cVar) {
        super(cVar);
        this.f17486t = s0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f17485s = obj;
        this.f17487u |= Integer.MIN_VALUE;
        return this.f17486t.G0(this);
    }
}
