package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f9115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f9116i;

    public r(float f9, float f10, float f11, boolean z3, boolean z10, float f12, float f13) {
        super(3);
        this.f9110c = f9;
        this.f9111d = f10;
        this.f9112e = f11;
        this.f9113f = z3;
        this.f9114g = z10;
        this.f9115h = f12;
        this.f9116i = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f9110c, rVar.f9110c) == 0 && Float.compare(this.f9111d, rVar.f9111d) == 0 && Float.compare(this.f9112e, rVar.f9112e) == 0 && this.f9113f == rVar.f9113f && this.f9114g == rVar.f9114g && Float.compare(this.f9115h, rVar.f9115h) == 0 && Float.compare(this.f9116i, rVar.f9116i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9116i) + s.h0.a(s.h0.c(s.h0.c(s.h0.a(s.h0.a(Float.hashCode(this.f9110c) * 31, this.f9111d, 31), this.f9112e, 31), 31, this.f9113f), 31, this.f9114g), this.f9115h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f9110c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f9111d);
        sb2.append(", theta=");
        sb2.append(this.f9112e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f9113f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f9114g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f9115h);
        sb2.append(", arcStartDy=");
        return k0.g.h(sb2, this.f9116i, ')');
    }
}
