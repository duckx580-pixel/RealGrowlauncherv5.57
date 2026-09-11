package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9135f;

    public x(float f9, float f10, float f11, float f12) {
        super(2);
        this.f9132c = f9;
        this.f9133d = f10;
        this.f9134e = f11;
        this.f9135f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f9132c, xVar.f9132c) == 0 && Float.compare(this.f9133d, xVar.f9133d) == 0 && Float.compare(this.f9134e, xVar.f9134e) == 0 && Float.compare(this.f9135f, xVar.f9135f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9135f) + s.h0.a(s.h0.a(Float.hashCode(this.f9132c) * 31, this.f9133d, 31), this.f9134e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f9132c);
        sb2.append(", dy1=");
        sb2.append(this.f9133d);
        sb2.append(", dx2=");
        sb2.append(this.f9134e);
        sb2.append(", dy2=");
        return k0.g.h(sb2, this.f9135f, ')');
    }
}
