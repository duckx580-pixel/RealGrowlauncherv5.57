package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14782i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f14784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f14785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f14786u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ug.c cVar) {
        super(cVar);
        this.f14784s = oVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14782i = obj;
        this.f14783r |= Integer.MIN_VALUE;
        return this.f14784s.collect(null, this);
    }
}
