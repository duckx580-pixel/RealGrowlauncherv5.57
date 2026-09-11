package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9427d;

    public j0(long j, long j10, String str, String str2) {
        this.f9424a = j;
        this.f9425b = j10;
        this.f9426c = str;
        this.f9427d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d1) {
            j0 j0Var = (j0) ((d1) obj);
            String str2 = j0Var.f9427d;
            if (this.f9424a == j0Var.f9424a && this.f9425b == j0Var.f9425b && this.f9426c.equals(j0Var.f9426c) && ((str = this.f9427d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9424a;
        long j10 = this.f9425b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f9426c.hashCode()) * 1000003;
        String str = this.f9427d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f9424a);
        sb2.append(", size=");
        sb2.append(this.f9425b);
        sb2.append(", name=");
        sb2.append(this.f9426c);
        sb2.append(", uuid=");
        return k0.g.l(sb2, this.f9427d, "}");
    }
}
