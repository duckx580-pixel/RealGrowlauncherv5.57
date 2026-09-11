package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f11232i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0.a0 f11234s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(h0.a0 a0Var, ug.c cVar) {
        super(cVar);
        this.f11234s = a0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f11232i = obj;
        this.f11233r |= Integer.MIN_VALUE;
        return this.f11234s.emit(null, this);
    }
}
