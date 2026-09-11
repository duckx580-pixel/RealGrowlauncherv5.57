package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements m1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final eh.c f12388i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c0 f12389r;

    public b0(eh.c cVar) {
        this.f12388i = cVar;
    }

    @Override // o0.m1
    public final void d() {
        c0 c0Var = this.f12389r;
        if (c0Var != null) {
            c0Var.dispose();
        }
        this.f12389r = null;
    }

    @Override // o0.m1
    public final void h() {
        this.f12389r = (c0) this.f12388i.invoke(p.f12545h);
    }

    @Override // o0.m1
    public final void a() {
    }
}
