package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14694i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0.a0 f14695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14696s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(h0.a0 a0Var, ug.c cVar) {
        super(cVar);
        this.f14695r = a0Var;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f14694i = obj;
        this.f14696s |= Integer.MIN_VALUE;
        return this.f14695r.b(0, this);
    }
}
