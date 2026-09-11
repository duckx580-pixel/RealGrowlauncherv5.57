package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9109d;

    public q(float f9, float f10) {
        super(1);
        this.f9108c = f9;
        this.f9109d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f9108c, qVar.f9108c) == 0 && Float.compare(this.f9109d, qVar.f9109d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9109d) + (Float.hashCode(this.f9108c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f9108c);
        sb2.append(", y=");
        return k0.g.h(sb2, this.f9109d, ')');
    }
}
