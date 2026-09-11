package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eh.c f20057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20058f;

    public f(int i10, k kVar, eh.c cVar) {
        super(i10, kVar);
        this.f20057e = cVar;
        this.f20058f = 1;
    }

    @Override // y0.g
    public final void c() {
        if (this.f20061c) {
            return;
        }
        l();
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
        return this.f20057e;
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
        this.f20058f++;
    }

    @Override // y0.g
    public final void l() {
        int i10 = this.f20058f - 1;
        this.f20058f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // y0.g
    public final void n(y yVar) {
        n7.e eVar = m.f20077a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // y0.g
    public final g t(eh.c cVar) {
        m.d(this);
        return new e(this.f20060b, this.f20059a, cVar, this);
    }

    @Override // y0.g
    public final void m() {
    }
}
