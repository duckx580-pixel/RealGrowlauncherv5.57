package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f1 f12848y;

    public b1(ug.c cVar, f1 f1Var) {
        super(1, cVar);
        this.f12848y = f1Var;
    }

    @Override // oh.f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // oh.f
    public final Throwable p(f1 f1Var) {
        Throwable thC;
        Object objM = this.f12848y.M();
        return (!(objM instanceof d1) || (thC = ((d1) objM).c()) == null) ? objM instanceof n ? ((n) objM).f12894a : f1Var.H() : thC;
    }
}
