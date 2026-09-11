package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f9084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f9085h;

    public k(float f9, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f9080c = f9;
        this.f9081d = f10;
        this.f9082e = f11;
        this.f9083f = f12;
        this.f9084g = f13;
        this.f9085h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f9080c, kVar.f9080c) == 0 && Float.compare(this.f9081d, kVar.f9081d) == 0 && Float.compare(this.f9082e, kVar.f9082e) == 0 && Float.compare(this.f9083f, kVar.f9083f) == 0 && Float.compare(this.f9084g, kVar.f9084g) == 0 && Float.compare(this.f9085h, kVar.f9085h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9085h) + s.h0.a(s.h0.a(s.h0.a(s.h0.a(Float.hashCode(this.f9080c) * 31, this.f9081d, 31), this.f9082e, 31), this.f9083f, 31), this.f9084g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f9080c);
        sb2.append(", y1=");
        sb2.append(this.f9081d);
        sb2.append(", x2=");
        sb2.append(this.f9082e);
        sb2.append(", y2=");
        sb2.append(this.f9083f);
        sb2.append(", x3=");
        sb2.append(this.f9084g);
        sb2.append(", y3=");
        return k0.g.h(sb2, this.f9085h, ')');
    }
}
