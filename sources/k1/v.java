package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9127d;

    public v(float f9, float f10) {
        super(3);
        this.f9126c = f9;
        this.f9127d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f9126c, vVar.f9126c) == 0 && Float.compare(this.f9127d, vVar.f9127d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9127d) + (Float.hashCode(this.f9126c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f9126c);
        sb2.append(", dy=");
        return k0.g.h(sb2, this.f9127d, ')');
    }
}
