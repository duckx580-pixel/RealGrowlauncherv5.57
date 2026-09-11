package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16122a;

    public k(float f9) {
        this.f16122a = f9;
    }

    @Override // t.o
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f16122a;
        }
        return 0.0f;
    }

    @Override // t.o
    public final int b() {
        return 1;
    }

    @Override // t.o
    public final o c() {
        return new k(0.0f);
    }

    @Override // t.o
    public final void d() {
        this.f16122a = 0.0f;
    }

    @Override // t.o
    public final void e(float f9, int i10) {
        if (i10 == 0) {
            this.f16122a = f9;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && ((k) obj).f16122a == this.f16122a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16122a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f16122a;
    }
}
