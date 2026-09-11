package s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements t1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14949a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f14949a == ((j) obj).f14949a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14949a);
    }

    public final String toString() {
        return "ChildData(isTarget=" + this.f14949a + ')';
    }

    @Override // t1.n0
    public final Object k(q2.b bVar) {
        return this;
    }
}
