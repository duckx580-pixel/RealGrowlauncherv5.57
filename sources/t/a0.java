package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f16014b;

    public a0(float f9, float f10, float f11) {
        this.f16013a = f11;
        o0 o0Var = new o0();
        o0Var.f16149a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        o0Var.f16150b = dSqrt;
        o0Var.f16155g = 1.0f;
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        o0Var.f16155g = f9;
        o0Var.f16151c = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        o0Var.f16150b = Math.sqrt(f10);
        o0Var.f16151c = false;
        this.f16014b = o0Var;
    }

    @Override // t.z
    public final float b(long j, float f9, float f10, float f11) {
        o0 o0Var = this.f16014b;
        o0Var.f16149a = f10;
        return Float.intBitsToFloat((int) (o0Var.a(f9, f11, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    @Override // t.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(float r37, float r38, float r39) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a0.c(float, float, float):long");
    }

    @Override // t.z
    public final float d(float f9, float f10, float f11) {
        return 0.0f;
    }

    @Override // t.z
    public final float e(long j, float f9, float f10, float f11) {
        o0 o0Var = this.f16014b;
        o0Var.f16149a = f10;
        return Float.intBitsToFloat((int) (o0Var.a(f9, f11, j / 1000000) >> 32));
    }
}
