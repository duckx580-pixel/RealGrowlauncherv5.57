package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0.f f16072a = new q0.f(new d0[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.z0 f16073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0.z0 f16075d;

    public f0() {
        Boolean bool = Boolean.FALSE;
        o0.n0 n0Var = o0.n0.f12510u;
        this.f16073b = o0.p.I(bool, n0Var);
        this.f16074c = Long.MIN_VALUE;
        this.f16075d = o0.p.I(Boolean.TRUE, n0Var);
    }

    public final void a(int i10, o0.o oVar) {
        oVar.V(-318043801);
        oVar.U(-492369756);
        Object objL = oVar.L();
        ug.c cVar = null;
        if (objL == o0.k.f12458a) {
            objL = o0.p.I(null, o0.n0.f12510u);
            oVar.g0(objL);
        }
        oVar.r(false);
        o0.s0 s0Var = (o0.s0) objL;
        if (((Boolean) this.f16075d.getValue()).booleanValue() || ((Boolean) this.f16073b.getValue()).booleanValue()) {
            o0.p.d(new fe.u0(s0Var, this, cVar, 8), this, oVar);
        }
        o0.h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new a1.i(this, i10, 10);
        }
    }
}
