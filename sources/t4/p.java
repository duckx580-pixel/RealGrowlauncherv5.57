package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Exception f16598b;

    public p(Exception exc) {
        super(false);
        this.f16598b = exc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f16619a == pVar.f16619a && this.f16598b.equals(pVar.f16598b);
    }

    public final int hashCode() {
        return this.f16598b.hashCode() + Boolean.hashCode(this.f16619a);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f16619a + ", error=" + this.f16598b + ')';
    }
}
