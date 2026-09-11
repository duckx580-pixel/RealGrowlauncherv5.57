package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements t0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12881i;

    public j0(boolean z3) {
        this.f12881i = z3;
    }

    @Override // oh.t0
    public final boolean a() {
        return this.f12881i;
    }

    @Override // oh.t0
    public final i1 d() {
        return null;
    }

    public final String toString() {
        return k0.g.k(new StringBuilder("Empty{"), this.f12881i ? "Active" : "New", '}');
    }
}
