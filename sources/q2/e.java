package q2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13735i;

    public static final boolean a(float f9, float f10) {
        return Float.compare(f9, f10) == 0;
    }

    public static String b(float f9) {
        if (Float.isNaN(f9)) {
            return "Dp.Unspecified";
        }
        return f9 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f13735i, ((e) obj).f13735i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Float.compare(this.f13735i, ((e) obj).f13735i) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13735i);
    }

    public final String toString() {
        return b(this.f13735i);
    }
}
