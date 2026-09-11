package q2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13730i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f13731r;

    public c(float f9, float f10) {
        this.f13730i = f9;
        this.f13731r = f10;
    }

    @Override // q2.b
    public final float S() {
        return this.f13731r;
    }

    @Override // q2.b
    public final float a() {
        return this.f13730i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f13730i, cVar.f13730i) == 0 && Float.compare(this.f13731r, cVar.f13731r) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13731r) + (Float.hashCode(this.f13730i) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f13730i);
        sb2.append(", fontScale=");
        return k0.g.h(sb2, this.f13731r, ')');
    }
}
