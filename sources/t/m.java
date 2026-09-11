package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16140c;

    public m(float f9, float f10, float f11) {
        this.f16138a = f9;
        this.f16139b = f10;
        this.f16140c = f11;
    }

    @Override // t.o
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16138a;
        }
        if (i10 == 1) {
            return this.f16139b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f16140c;
    }

    @Override // t.o
    public final int b() {
        return 3;
    }

    @Override // t.o
    public final o c() {
        return new m(0.0f, 0.0f, 0.0f);
    }

    @Override // t.o
    public final void d() {
        this.f16138a = 0.0f;
        this.f16139b = 0.0f;
        this.f16140c = 0.0f;
    }

    @Override // t.o
    public final void e(float f9, int i10) {
        if (i10 == 0) {
            this.f16138a = f9;
        } else if (i10 == 1) {
            this.f16139b = f9;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f16140c = f9;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f16138a == this.f16138a && mVar.f16139b == this.f16139b && mVar.f16140c == this.f16140c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16140c) + s.h0.a(Float.hashCode(this.f16138a) * 31, this.f16139b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f16138a + ", v2 = " + this.f16139b + ", v3 = " + this.f16140c;
    }
}
