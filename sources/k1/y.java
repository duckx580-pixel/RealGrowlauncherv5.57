package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9137d;

    public y(float f9, float f10) {
        super(1);
        this.f9136c = f9;
        this.f9137d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f9136c, yVar.f9136c) == 0 && Float.compare(this.f9137d, yVar.f9137d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9137d) + (Float.hashCode(this.f9136c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f9136c);
        sb2.append(", dy=");
        return k0.g.h(sb2, this.f9137d, ')');
    }
}
