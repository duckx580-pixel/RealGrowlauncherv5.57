package li;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10061i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f10062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10063s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, wg.c cVar) {
        super(cVar);
        this.f10062r = wVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f10061i = obj;
        this.f10063s |= Integer.MIN_VALUE;
        return this.f10062r.g(this);
    }
}
