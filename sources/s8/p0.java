package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends x {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15531s;

    public p0(y0 y0Var) {
        super(y0Var);
        ((y0) this.f3470r).U++;
    }

    public final void u() {
        if (!this.f15531s) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.f15531s) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (w()) {
            return;
        }
        ((y0) this.f3470r).a();
        this.f15531s = true;
    }

    public abstract boolean w();
}
