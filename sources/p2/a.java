package p2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13258a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f13258a, ((a) obj).f13258a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13258a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f13258a + ')';
    }
}
