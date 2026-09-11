package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f16615b = new r(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f16616c = new r(false);

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f16619a == ((r) obj).f16619a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16619a);
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.f16619a + ')';
    }
}
