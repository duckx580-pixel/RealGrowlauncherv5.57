package q2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13760b = ud.a.i(0.0f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13761c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13762a;

    public /* synthetic */ p(long j) {
        this.f13762a = j;
    }

    public static long a(long j, float f9, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f9 = b(j);
        }
        if ((i10 & 2) != 0) {
            f10 = c(j);
        }
        return ud.a.i(f9, f10);
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long d(long j, long j10) {
        return ud.a.i(b(j) - b(j10), c(j) - c(j10));
    }

    public static final long e(long j, long j10) {
        return ud.a.i(b(j10) + b(j), c(j10) + c(j));
    }

    public static String f(long j) {
        return "(" + b(j) + ", " + c(j) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f13762a == ((p) obj).f13762a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13762a);
    }

    public final String toString() {
        return f(this.f13762a);
    }
}
