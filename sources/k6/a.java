package k6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ud.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9255i;

    public a(int i10) {
        this.f9255i = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f9255i == ((a) obj).f9255i;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9255i;
    }

    public final String toString() {
        return String.valueOf(this.f9255i);
    }
}
