package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f20047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f20048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f20049q;

    public c0(c cVar, eh.c cVar2, eh.c cVar3, boolean z3, boolean z10) {
        eh.c cVar4;
        eh.c cVar5;
        super(0, k.f20069u, m.k(cVar2, (cVar == null || (cVar5 = cVar.f20039e) == null) ? ((b) m.f20085i.get()).f20039e : cVar5, z3), m.b(cVar3, (cVar == null || (cVar4 = cVar.f20040f) == null) ? ((b) m.f20085i.get()).f20040f : cVar4));
        this.f20047o = cVar;
        this.f20048p = z3;
        this.f20049q = z10;
    }

    @Override // y0.c
    public final c A(eh.c cVar, eh.c cVar2) {
        eh.c cVarK = m.k(cVar, this.f20039e, true);
        eh.c cVarB = m.b(cVar2, this.f20040f);
        return !this.f20048p ? new c0(B().A(null, cVarB), cVarK, cVarB, false, true) : B().A(cVarK, cVarB);
    }

    public final c B() {
        c cVar = this.f20047o;
        return cVar == null ? (c) m.f20085i.get() : cVar;
    }

    @Override // y0.c, y0.g
    public final void c() {
        c cVar;
        this.f20061c = true;
        if (!this.f20049q || (cVar = this.f20047o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // y0.g
    public final int d() {
        return B().d();
    }

    @Override // y0.g
    public final k e() {
        return B().e();
    }

    @Override // y0.c, y0.g
    public final boolean g() {
        return B().g();
    }

    @Override // y0.c, y0.g
    public final int h() {
        return B().h();
    }

    @Override // y0.c, y0.g
    public final void k() {
        r.e();
        throw null;
    }

    @Override // y0.c, y0.g
    public final void l() {
        r.e();
        throw null;
    }

    @Override // y0.c, y0.g
    public final void m() {
        B().m();
    }

    @Override // y0.c, y0.g
    public final void n(y yVar) {
        B().n(yVar);
    }

    @Override // y0.g
    public final void q(int i10) {
        r.e();
        throw null;
    }

    @Override // y0.g
    public final void r(k kVar) {
        r.e();
        throw null;
    }

    @Override // y0.c, y0.g
    public final void s(int i10) {
        B().s(i10);
    }

    @Override // y0.c, y0.g
    public final g t(eh.c cVar) {
        eh.c cVarK = m.k(cVar, this.f20039e, true);
        return !this.f20048p ? m.h(B().t(null), cVarK, true) : B().t(cVarK);
    }

    @Override // y0.c
    public final r v() {
        return B().v();
    }

    @Override // y0.c
    public final q0.b w() {
        return B().w();
    }

    @Override // y0.c
    public final void z(q0.b bVar) {
        r.e();
        throw null;
    }
}
