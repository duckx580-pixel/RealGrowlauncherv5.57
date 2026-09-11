package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f20055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eh.c f20056f;

    public e(int i10, k kVar, eh.c cVar, g gVar) {
        super(i10, kVar);
        this.f20055e = gVar;
        gVar.k();
        if (cVar != null) {
            eh.c cVarF = gVar.f();
            if (cVarF != null) {
                cVar = new a(cVar, cVarF, 1);
            }
        } else {
            cVar = gVar.f();
        }
        this.f20056f = cVar;
    }

    @Override // y0.g
    public final void c() {
        g gVar = this.f20055e;
        if (this.f20061c) {
            return;
        }
        if (this.f20060b != gVar.d()) {
            a();
        }
        gVar.l();
        this.f20061c = true;
        synchronized (m.f20078b) {
            int i10 = this.f20062d;
            if (i10 >= 0) {
                m.t(i10);
                this.f20062d = -1;
            }
        }
    }

    @Override // y0.g
    public final eh.c f() {
        return this.f20056f;
    }

    @Override // y0.g
    public final boolean g() {
        return true;
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
    public final void n(y yVar) {
        n7.e eVar = m.f20077a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // y0.g
    public final g t(eh.c cVar) {
        return new e(this.f20060b, this.f20059a, cVar, this.f20055e);
    }

    @Override // y0.g
    public final void m() {
    }
}
