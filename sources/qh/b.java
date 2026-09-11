package qh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13932i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f13933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13934s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, wg.c cVar) {
        super(cVar);
        this.f13933r = dVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f13932i = obj;
        this.f13934s |= Integer.MIN_VALUE;
        Object objC = d.C(this.f13933r, this);
        return objC == vg.a.f18663i ? objC : new k(objC);
    }
}
