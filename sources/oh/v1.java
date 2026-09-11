package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends th.q {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ThreadLocal f12928u;

    /* JADX WARN: Illegal instructions before constructor call */
    public v1(ug.c cVar, ug.h hVar) {
        w1 w1Var = w1.f12929i;
        super(cVar, hVar.i(w1Var) == null ? hVar.e(w1Var) : hVar);
        this.f12928u = new ThreadLocal();
        if (cVar.getContext().i(ug.d.f17988i) instanceof s) {
            return;
        }
        Object objM = th.a.m(hVar, null);
        th.a.g(hVar, objM);
        k0(hVar, objM);
    }

    public final boolean j0() {
        boolean z3 = this.threadLocalIsSet && this.f12928u.get() == null;
        this.f12928u.remove();
        return !z3;
    }

    public final void k0(ug.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f12928u.set(new qg.g(hVar, obj));
    }

    @Override // th.q, oh.f1
    public final void x(Object obj) {
        if (this.threadLocalIsSet) {
            qg.g gVar = (qg.g) this.f12928u.get();
            if (gVar != null) {
                th.a.g((ug.h) gVar.f13911i, gVar.f13912r);
            }
            this.f12928u.remove();
        }
        Object objU = x.u(obj);
        ug.c cVar = this.f17226t;
        ug.h context = cVar.getContext();
        Object objM = th.a.m(context, null);
        v1 v1VarA = objM != th.a.f17196f ? x.A(cVar, context, objM) : null;
        try {
            this.f17226t.resumeWith(objU);
            if (v1VarA == null || v1VarA.j0()) {
                th.a.g(context, objM);
            }
        } catch (Throwable th2) {
            if (v1VarA == null || v1VarA.j0()) {
                th.a.g(context, objM);
            }
            throw th2;
        }
    }
}
