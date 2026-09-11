package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kb.c f16564i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kb.c f16566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16567t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(kb.c cVar, wg.c cVar2) {
        super(cVar2);
        this.f16566s = cVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f16565r = obj;
        this.f16567t |= Integer.MIN_VALUE;
        return this.f16566s.m(null, this);
    }
}
