package s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14899b;

    public a(float f9, float f10) {
        this.f14898a = f9;
        this.f14899b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f14898a, aVar.f14898a) == 0 && Float.compare(this.f14899b, aVar.f14899b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14899b) + (Float.hashCode(this.f14898a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f14898a);
        sb2.append(", velocityCoefficient=");
        return k0.g.h(sb2, this.f14899b, ')');
    }
}
