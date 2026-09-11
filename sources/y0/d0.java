package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f20052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eh.c f20054g;

    public d0(g gVar, eh.c cVar, boolean z3) {
        eh.c cVarF;
        super(0, k.f20069u);
        this.f20052e = gVar;
        this.f20053f = z3;
        this.f20054g = m.k(cVar, (gVar == null || (cVarF = gVar.f()) == null) ? ((b) m.f20085i.get()).f20039e : cVarF, false);
    }

    @Override // y0.g
    public final void c() {
        g gVar;
        this.f20061c = true;
        if (!this.f20053f || (gVar = this.f20052e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // y0.g
    public final int d() {
        return u().d();
    }

    @Override // y0.g
    public final k e() {
        return u().e();
    }

    @Override // y0.g
    public final eh.c f() {
        return this.f20054g;
    }

    @Override // y0.g
    public final boolean g() {
        return u().g();
    }

    @Override // y0.g
    public final eh.c i() {
        return null;
    }

    @Override // y0.g
    public final void k() {
        r.e();
        throw null;
    }

    @Override // y0.g
    public final void l() {
        r.e();
        throw null;
    }

    @Override // y0.g
    public final void m() {
        u().m();
    }

    @Override // y0.g
    public final void n(y yVar) {
        u().n(yVar);
    }

    @Override // y0.g
    public final g t(eh.c cVar) {
        return m.h(u().t(null), m.k(cVar, this.f20054g, true), true);
    }

    public final g u() {
        g gVar = this.f20052e;
        return gVar == null ? (g) m.f20085i.get() : gVar;
    }
}
