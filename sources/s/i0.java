package s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14948c;

    public i0(float f9, float f10, long j) {
        this.f14946a = f9;
        this.f14947b = f10;
        this.f14948c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Float.compare(this.f14946a, i0Var.f14946a) == 0 && Float.compare(this.f14947b, i0Var.f14947b) == 0 && this.f14948c == i0Var.f14948c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14948c) + h0.a(Float.hashCode(this.f14946a) * 31, this.f14947b, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f14946a + ", distance=" + this.f14947b + ", duration=" + this.f14948c + ')';
    }
}
