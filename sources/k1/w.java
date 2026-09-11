package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9131f;

    public w(float f9, float f10, float f11, float f12) {
        super(1);
        this.f9128c = f9;
        this.f9129d = f10;
        this.f9130e = f11;
        this.f9131f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f9128c, wVar.f9128c) == 0 && Float.compare(this.f9129d, wVar.f9129d) == 0 && Float.compare(this.f9130e, wVar.f9130e) == 0 && Float.compare(this.f9131f, wVar.f9131f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9131f) + s.h0.a(s.h0.a(Float.hashCode(this.f9128c) * 31, this.f9129d, 31), this.f9130e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f9128c);
        sb2.append(", dy1=");
        sb2.append(this.f9129d);
        sb2.append(", dx2=");
        sb2.append(this.f9130e);
        sb2.append(", dy2=");
        return k0.g.h(sb2, this.f9131f, ')');
    }
}
