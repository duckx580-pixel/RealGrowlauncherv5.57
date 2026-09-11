package p2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f13282c = new p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13284b;

    public p(float f9, float f10) {
        this.f13283a = f9;
        this.f13284b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f13283a == pVar.f13283a && this.f13284b == pVar.f13284b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13284b) + (Float.hashCode(this.f13283a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f13283a);
        sb2.append(", skewX=");
        return k0.g.h(sb2, this.f13284b, ')');
    }
}
