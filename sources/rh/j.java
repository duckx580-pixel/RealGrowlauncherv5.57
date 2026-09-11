package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14742i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a6.i f14744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a6.i f14745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f14746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14747v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a6.i iVar, ug.c cVar) {
        super(cVar);
        this.f14744s = iVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14742i = obj;
        this.f14743r |= Integer.MIN_VALUE;
        return this.f14744s.collect(null, this);
    }
}
