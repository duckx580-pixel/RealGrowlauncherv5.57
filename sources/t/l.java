package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16136b;

    public l(float f9, float f10) {
        this.f16135a = f9;
        this.f16136b = f10;
    }

    @Override // t.o
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16135a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f16136b;
    }

    @Override // t.o
    public final int b() {
        return 2;
    }

    @Override // t.o
    public final o c() {
        return new l(0.0f, 0.0f);
    }

    @Override // t.o
    public final void d() {
        this.f16135a = 0.0f;
        this.f16136b = 0.0f;
    }

    @Override // t.o
    public final void e(float f9, int i10) {
        if (i10 == 0) {
            this.f16135a = f9;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f16136b = f9;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f16135a == this.f16135a && lVar.f16136b == this.f16136b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16136b) + (Float.hashCode(this.f16135a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f16135a + ", v2 = " + this.f16136b;
    }
}
