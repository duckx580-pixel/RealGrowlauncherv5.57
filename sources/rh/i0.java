package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14738i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a4.u f14740s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(a4.u uVar, ug.c cVar) {
        super(cVar);
        this.f14740s = uVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14738i = obj;
        this.f14739r |= Integer.MIN_VALUE;
        return this.f14740s.emit(null, this);
    }
}
