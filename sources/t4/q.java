package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f16612b = new q(false);

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f16619a == ((q) obj).f16619a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16619a);
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.f16619a + ')';
    }
}
