package i2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8054a;

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f8054a == ((v) obj).f8054a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8054a);
    }

    public final String toString() {
        int i10 = this.f8054a;
        return i10 == 0 ? "None" : i10 == 1 ? "All" : i10 == 2 ? "Weight" : i10 == 3 ? "Style" : "Invalid";
    }
}
