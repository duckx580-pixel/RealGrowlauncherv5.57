package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends a1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f1 f12851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d1 f12852v;
    public final j w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f12853x;

    public c1(f1 f1Var, d1 d1Var, j jVar, Object obj) {
        this.f12851u = f1Var;
        this.f12852v = d1Var;
        this.w = jVar;
        this.f12853x = obj;
    }

    @Override // eh.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return qg.o.f13926a;
    }

    @Override // oh.a1
    public final void m(Throwable th2) {
        j jVarY = f1.Y(this.w);
        f1 f1Var = this.f12851u;
        d1 d1Var = this.f12852v;
        Object obj = this.f12853x;
        if (jVarY != null) {
            while (jVarY.f12880u.R((2 & 1) == 0, (2 & 2) != 0, new c1(f1Var, d1Var, jVarY, obj)) == j1.f12882i) {
                jVarY = f1.Y(jVarY);
                if (jVarY == null) {
                }
            }
            return;
        }
        f1Var.s(f1Var.G(d1Var, obj));
    }
}
