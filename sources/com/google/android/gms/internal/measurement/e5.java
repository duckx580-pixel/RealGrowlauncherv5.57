package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 implements i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i5[] f3766a;

    public e5(i5... i5VarArr) {
        this.f3766a = i5VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final q5 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            i5 i5Var = this.f3766a[i10];
            if (i5Var.b(cls)) {
                return i5Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.i5
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f3766a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
