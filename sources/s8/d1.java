package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 extends cd.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15297s;

    public d1(y0 y0Var) {
        super(y0Var);
        ((y0) this.f3470r).U++;
    }

    public abstract boolean u();

    public final void v() {
        if (!this.f15297s) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void w() {
        if (this.f15297s) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (u()) {
            return;
        }
        ((y0) this.f3470r).a();
        this.f15297s = true;
    }
}
