package q2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13751a;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f13751a == ((k) obj).f13751a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13751a);
    }

    public final String toString() {
        return b(this.f13751a);
    }
}
