package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16147d;

    public n(float f9, float f10, float f11, float f12) {
        this.f16144a = f9;
        this.f16145b = f10;
        this.f16146c = f11;
        this.f16147d = f12;
    }

    @Override // t.o
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16144a;
        }
        if (i10 == 1) {
            return this.f16145b;
        }
        if (i10 == 2) {
            return this.f16146c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f16147d;
    }

    @Override // t.o
    public final int b() {
        return 4;
    }

    @Override // t.o
    public final o c() {
        return new n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // t.o
    public final void d() {
        this.f16144a = 0.0f;
        this.f16145b = 0.0f;
        this.f16146c = 0.0f;
        this.f16147d = 0.0f;
    }

    @Override // t.o
    public final void e(float f9, int i10) {
        if (i10 == 0) {
            this.f16144a = f9;
            return;
        }
        if (i10 == 1) {
            this.f16145b = f9;
        } else if (i10 == 2) {
            this.f16146c = f9;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f16147d = f9;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f16144a == this.f16144a && nVar.f16145b == this.f16145b && nVar.f16146c == this.f16146c && nVar.f16147d == this.f16147d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16147d) + s.h0.a(s.h0.a(Float.hashCode(this.f16144a) * 31, this.f16145b, 31), this.f16146c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f16144a + ", v2 = " + this.f16145b + ", v3 = " + this.f16146c + ", v4 = " + this.f16147d;
    }
}
