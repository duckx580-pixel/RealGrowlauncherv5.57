package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16793a;

    public f0(long j) {
        this.f16793a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f0.class == obj.getClass() && this.f16793a == ((f0) obj).f16793a;
    }

    public final int hashCode() {
        long j = this.f16793a;
        return (int) (j ^ (j >>> 32));
    }
}
