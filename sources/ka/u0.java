package ka;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9525f;

    public u0(int i10, int i11, long j, long j10, boolean z3, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f9520a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f9521b = i11;
        this.f9522c = j;
        this.f9523d = j10;
        this.f9524e = z3;
        this.f9525f = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f9520a != u0Var.f9520a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f9521b != u0Var.f9521b || this.f9522c != u0Var.f9522c || this.f9523d != u0Var.f9523d || this.f9524e != u0Var.f9524e || this.f9525f != u0Var.f9525f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f9520a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f9521b) * 1000003;
        long j = this.f9522c;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f9523d;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f9524e ? 1231 : 1237)) * 1000003) ^ this.f9525f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f9520a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f9521b);
        sb2.append(", totalRam=");
        sb2.append(this.f9522c);
        sb2.append(", diskSpace=");
        sb2.append(this.f9523d);
        sb2.append(", isEmulator=");
        sb2.append(this.f9524e);
        sb2.append(", state=");
        sb2.append(this.f9525f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return k0.g.l(sb2, Build.PRODUCT, "}");
    }
}
