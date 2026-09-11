package q2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o[] f13756b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f13757c = u5.f.w(0, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13758a;

    public /* synthetic */ n(long j) {
        this.f13758a = j;
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final long b(long j) {
        return f13756b[(int) ((j & 1095216660480L) >>> 32)].f13759a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (o.a(jB, 0L)) {
            return "Unspecified";
        }
        if (o.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!o.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f13758a == ((n) obj).f13758a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13758a);
    }

    public final String toString() {
        return d(this.f13758a);
    }
}
