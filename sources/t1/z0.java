package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f16353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f16354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f16355c = new y0(this, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f16356d = new y0(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f16357e = new y0(this, 1);

    public z0(c1 c1Var) {
        this.f16353a = c1Var;
    }

    public final d0 a() {
        d0 d0Var = this.f16354b;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
