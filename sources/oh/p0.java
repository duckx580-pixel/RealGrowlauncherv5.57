package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends s {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f12901v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f12902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public rg.j f12904u;

    @Override // oh.s
    public final s W(int i10) {
        th.a.a(1);
        return this;
    }

    public final void c0(boolean z3) {
        long j = this.f12902s - (z3 ? 4294967296L : 1L);
        this.f12902s = j;
        if (j <= 0 && this.f12903t) {
            shutdown();
        }
    }

    public final void d0(e0 e0Var) {
        rg.j jVar = this.f12904u;
        if (jVar == null) {
            jVar = new rg.j();
            this.f12904u = jVar;
        }
        jVar.addLast(e0Var);
    }

    public abstract Thread e0();

    public final void f0(boolean z3) {
        this.f12902s = (z3 ? 4294967296L : 1L) + this.f12902s;
        if (z3) {
            return;
        }
        this.f12903t = true;
    }

    public abstract long g0();

    public final boolean h0() {
        rg.j jVar = this.f12904u;
        if (jVar == null) {
            return false;
        }
        e0 e0Var = (e0) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (e0Var == null) {
            return false;
        }
        e0Var.run();
        return true;
    }

    public void i0(long j, m0 m0Var) {
        y.f12940z.m0(j, m0Var);
    }

    public abstract void shutdown();
}
