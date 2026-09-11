package i2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8053a;

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f8053a == ((u) obj).f8053a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8053a);
    }

    public final String toString() {
        int i10 = this.f8053a;
        return i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid";
    }
}
