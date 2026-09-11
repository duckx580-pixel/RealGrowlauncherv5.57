package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends m0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s1 f12885s;

    public l0(long j, s1 s1Var) {
        super(j);
        this.f12885s = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12885s.run();
    }

    @Override // oh.m0
    public final String toString() {
        return super.toString() + this.f12885s;
    }
}
