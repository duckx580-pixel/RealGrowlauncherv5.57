package q2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13740c = sb.c.c(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f13741d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13742a;

    static {
        float f9 = 0;
        f13739b = sb.c.c(f9, f9);
    }

    public static final float a(long j) {
        if (j != f13740c) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    public static final float b(long j) {
        if (j != f13740c) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f13742a == ((g) obj).f13742a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13742a);
    }

    public final String toString() {
        long j = f13740c;
        long j10 = this.f13742a;
        if (j10 == j) {
            return "DpSize.Unspecified";
        }
        return ((Object) e.b(b(j10))) + " x " + ((Object) e.b(a(j10)));
    }
}
