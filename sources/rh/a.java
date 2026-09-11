package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sh.v f14672i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a6.i f14674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14675t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a6.i iVar, ug.c cVar) {
        super(cVar);
        this.f14674s = iVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14673r = obj;
        this.f14675t |= Integer.MIN_VALUE;
        return this.f14674s.collect(null, this);
    }
}
