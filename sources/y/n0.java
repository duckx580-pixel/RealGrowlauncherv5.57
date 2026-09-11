package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19972d;

    public n0(float f9, float f10, float f11, float f12) {
        this.f19969a = f9;
        this.f19970b = f10;
        this.f19971c = f11;
        this.f19972d = f12;
    }

    @Override // y.m0
    public final float a() {
        return this.f19972d;
    }

    @Override // y.m0
    public final float b(q2.l lVar) {
        return lVar == q2.l.f13752i ? this.f19969a : this.f19971c;
    }

    @Override // y.m0
    public final float c() {
        return this.f19970b;
    }

    @Override // y.m0
    public final float d(q2.l lVar) {
        return lVar == q2.l.f13752i ? this.f19971c : this.f19969a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return q2.e.a(this.f19969a, n0Var.f19969a) && q2.e.a(this.f19970b, n0Var.f19970b) && q2.e.a(this.f19971c, n0Var.f19971c) && q2.e.a(this.f19972d, n0Var.f19972d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19972d) + s.h0.a(s.h0.a(Float.hashCode(this.f19969a) * 31, this.f19970b, 31), this.f19971c, 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) q2.e.b(this.f19969a)) + ", top=" + ((Object) q2.e.b(this.f19970b)) + ", end=" + ((Object) q2.e.b(this.f19971c)) + ", bottom=" + ((Object) q2.e.b(this.f19972d)) + ')';
    }
}
