package q2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13737c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13738a;

    static {
        float f9 = 0;
        sb.c.b(f9, f9);
        f13736b = sb.c.b(Float.NaN, Float.NaN);
    }

    public static final float a(long j) {
        if (j != f13736b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified");
    }

    public static final float b(long j) {
        if (j != f13736b) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified");
    }

    public static String c(long j) {
        if (j == f13736b) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) e.b(a(j))) + ", " + ((Object) e.b(b(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f13738a == ((f) obj).f13738a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13738a);
    }

    public final String toString() {
        return c(this.f13738a);
    }
}
