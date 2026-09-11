package z;

import u.b1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f20545i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b1 f20546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wg.i f20547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f20548t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f20549u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20550v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, wg.c cVar) {
        super(cVar);
        this.f20549u = qVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f20548t = obj;
        this.f20550v |= Integer.MIN_VALUE;
        return this.f20549u.d(null, null, this);
    }
}
