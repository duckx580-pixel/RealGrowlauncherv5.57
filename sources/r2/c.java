package r2;

import hd.c0;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f14450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f14451b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f14450a = fArr;
        this.f14451b = fArr2;
    }

    @Override // r2.a
    public final float a(float f9) {
        return c0.c(f9, this.f14451b, this.f14450a);
    }

    @Override // r2.a
    public final float b(float f9) {
        return c0.c(f9, this.f14450a, this.f14451b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f14450a, cVar.f14450a) && Arrays.equals(this.f14451b, cVar.f14451b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14451b) + (Arrays.hashCode(this.f14450a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f14450a);
        l.e("toString(this)", string);
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f14451b);
        l.e("toString(this)", string2);
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
