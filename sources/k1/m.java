package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9097d;

    public m(float f9, float f10) {
        super(3);
        this.f9096c = f9;
        this.f9097d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f9096c, mVar.f9096c) == 0 && Float.compare(this.f9097d, mVar.f9097d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9097d) + (Float.hashCode(this.f9096c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f9096c);
        sb2.append(", y=");
        return k0.g.h(sb2, this.f9097d, ')');
    }
}
