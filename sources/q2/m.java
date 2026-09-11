package q2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13755a;

    public m(float f9) {
        this.f13755a = f9;
    }

    @Override // r2.a
    public final float a(float f9) {
        return f9 / this.f13755a;
    }

    @Override // r2.a
    public final float b(float f9) {
        return f9 * this.f13755a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f13755a, ((m) obj).f13755a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13755a);
    }

    public final String toString() {
        return k0.g.h(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f13755a, ')');
    }
}
