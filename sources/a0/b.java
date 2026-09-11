package a0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f16a == ((b) obj).f16a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f16a + ')';
    }
}
