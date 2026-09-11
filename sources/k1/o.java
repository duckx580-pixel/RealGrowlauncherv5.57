package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9103f;

    public o(float f9, float f10, float f11, float f12) {
        super(1);
        this.f9100c = f9;
        this.f9101d = f10;
        this.f9102e = f11;
        this.f9103f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f9100c, oVar.f9100c) == 0 && Float.compare(this.f9101d, oVar.f9101d) == 0 && Float.compare(this.f9102e, oVar.f9102e) == 0 && Float.compare(this.f9103f, oVar.f9103f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9103f) + s.h0.a(s.h0.a(Float.hashCode(this.f9100c) * 31, this.f9101d, 31), this.f9102e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f9100c);
        sb2.append(", y1=");
        sb2.append(this.f9101d);
        sb2.append(", x2=");
        sb2.append(this.f9102e);
        sb2.append(", y2=");
        return k0.g.h(sb2, this.f9103f, ')');
    }
}
