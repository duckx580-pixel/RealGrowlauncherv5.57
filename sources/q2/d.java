package q2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13732i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f13733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r2.a f13734s;

    public d(float f9, float f10, r2.a aVar) {
        this.f13732i = f9;
        this.f13733r = f10;
        this.f13734s = aVar;
    }

    @Override // q2.b
    public final float S() {
        return this.f13733r;
    }

    @Override // q2.b
    public final float a() {
        return this.f13732i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f13732i, dVar.f13732i) == 0 && Float.compare(this.f13733r, dVar.f13733r) == 0 && kotlin.jvm.internal.l.a(this.f13734s, dVar.f13734s);
    }

    public final int hashCode() {
        return this.f13734s.hashCode() + h0.a(Float.hashCode(this.f13732i) * 31, this.f13733r, 31);
    }

    @Override // q2.b
    public final long s(float f9) {
        return u5.f.w(4294967296L, this.f13734s.a(f9));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f13732i + ", fontScale=" + this.f13733r + ", converter=" + this.f13734s + ')';
    }

    @Override // q2.b
    public final float z(long j) {
        if (o.a(n.b(j), 4294967296L)) {
            return this.f13734s.b(n.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
