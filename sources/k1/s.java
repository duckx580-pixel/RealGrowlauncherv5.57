package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f9121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f9122h;

    public s(float f9, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f9117c = f9;
        this.f9118d = f10;
        this.f9119e = f11;
        this.f9120f = f12;
        this.f9121g = f13;
        this.f9122h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f9117c, sVar.f9117c) == 0 && Float.compare(this.f9118d, sVar.f9118d) == 0 && Float.compare(this.f9119e, sVar.f9119e) == 0 && Float.compare(this.f9120f, sVar.f9120f) == 0 && Float.compare(this.f9121g, sVar.f9121g) == 0 && Float.compare(this.f9122h, sVar.f9122h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9122h) + s.h0.a(s.h0.a(s.h0.a(s.h0.a(Float.hashCode(this.f9117c) * 31, this.f9118d, 31), this.f9119e, 31), this.f9120f, 31), this.f9121g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f9117c);
        sb2.append(", dy1=");
        sb2.append(this.f9118d);
        sb2.append(", dx2=");
        sb2.append(this.f9119e);
        sb2.append(", dy2=");
        sb2.append(this.f9120f);
        sb2.append(", dx3=");
        sb2.append(this.f9121g);
        sb2.append(", dy3=");
        return k0.g.h(sb2, this.f9122h, ')');
    }
}
