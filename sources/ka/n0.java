package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9464e;

    public n0(long j, String str, String str2, long j10, int i10) {
        this.f9460a = j;
        this.f9461b = str;
        this.f9462c = str2;
        this.f9463d = j10;
        this.f9464e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            n0 n0Var = (n0) ((g1) obj);
            String str2 = n0Var.f9462c;
            if (this.f9460a == n0Var.f9460a && this.f9461b.equals(n0Var.f9461b) && ((str = this.f9462c) != null ? str.equals(str2) : str2 == null) && this.f9463d == n0Var.f9463d && this.f9464e == n0Var.f9464e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9460a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f9461b.hashCode()) * 1000003;
        String str = this.f9462c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f9463d;
        return ((iHashCode2 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f9464e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f9460a);
        sb2.append(", symbol=");
        sb2.append(this.f9461b);
        sb2.append(", file=");
        sb2.append(this.f9462c);
        sb2.append(", offset=");
        sb2.append(this.f9463d);
        sb2.append(", importance=");
        return k0.g.i(sb2, this.f9464e, "}");
    }
}
