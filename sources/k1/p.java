package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9107f;

    public p(float f9, float f10, float f11, float f12) {
        super(2);
        this.f9104c = f9;
        this.f9105d = f10;
        this.f9106e = f11;
        this.f9107f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f9104c, pVar.f9104c) == 0 && Float.compare(this.f9105d, pVar.f9105d) == 0 && Float.compare(this.f9106e, pVar.f9106e) == 0 && Float.compare(this.f9107f, pVar.f9107f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9107f) + s.h0.a(s.h0.a(Float.hashCode(this.f9104c) * 31, this.f9105d, 31), this.f9106e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f9104c);
        sb2.append(", y1=");
        sb2.append(this.f9105d);
        sb2.append(", x2=");
        sb2.append(this.f9106e);
        sb2.append(", y2=");
        return k0.g.h(sb2, this.f9107f, ')');
    }
}
