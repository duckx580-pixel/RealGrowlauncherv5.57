package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9123c;

    public t(float f9) {
        super(3);
        this.f9123c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f9123c, ((t) obj).f9123c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9123c);
    }

    public final String toString() {
        return k0.g.h(new StringBuilder("RelativeHorizontalTo(dx="), this.f9123c, ')');
    }
}
