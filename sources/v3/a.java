package v3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18528i;

    public final float a(long j) {
        if (j < this.f18524e) {
            return 0.0f;
        }
        long j10 = this.f18526g;
        if (j10 < 0 || j < j10) {
            return g.b((j - r0) / this.f18520a, 0.0f, 1.0f) * 0.5f;
        }
        float f9 = this.f18527h;
        return (g.b((j - j10) / this.f18528i, 0.0f, 1.0f) * f9) + (1.0f - f9);
    }
}
