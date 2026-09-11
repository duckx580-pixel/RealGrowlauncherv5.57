package q1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13683a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        return "PointerId(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f13683a == ((p) obj).f13683a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13683a);
    }

    public final String toString() {
        return b(this.f13683a);
    }
}
