package g1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f6899b = f0.h(0.5f, 0.5f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6900c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6901a;

    public static String a(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f6901a == ((p0) obj).f6901a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6901a);
    }

    public final String toString() {
        return a(this.f6901a);
    }
}
