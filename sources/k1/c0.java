package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public eh.c f8991a;

    public abstract void a(i1.d dVar);

    public eh.c b() {
        return this.f8991a;
    }

    public final void c() {
        eh.c cVarB = b();
        if (cVarB != null) {
            cVarB.invoke(this);
        }
    }

    public void d(a0.k0 k0Var) {
        this.f8991a = k0Var;
    }
}
