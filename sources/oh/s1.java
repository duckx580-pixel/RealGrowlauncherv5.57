package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends th.q implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f12916u;

    public s1(long j, t1 t1Var) {
        super(t1Var, t1Var.getContext());
        this.f12916u = j;
    }

    @Override // oh.f1
    public final String X() {
        return super.X() + "(timeMillis=" + this.f12916u + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.k(this.f12845s);
        z(new r1("Timed out waiting for " + this.f12916u + " ms", this));
    }
}
