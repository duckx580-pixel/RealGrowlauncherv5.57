package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x2 extends w2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15650t;

    public x2(a3 a3Var) {
        super(a3Var);
        this.f15638s.G++;
    }

    public final void u() {
        if (!this.f15650t) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.f15650t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        w();
        this.f15638s.H++;
        this.f15650t = true;
    }

    public abstract void w();
}
