package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9446c;

    public l0(String str, String str2, long j) {
        this.f9444a = str;
        this.f9445b = str2;
        this.f9446c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            l0 l0Var = (l0) ((f1) obj);
            if (this.f9444a.equals(l0Var.f9444a) && this.f9445b.equals(l0Var.f9445b) && this.f9446c == l0Var.f9446c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f9444a.hashCode() ^ 1000003) * 1000003) ^ this.f9445b.hashCode()) * 1000003;
        long j = this.f9446c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f9444a);
        sb2.append(", code=");
        sb2.append(this.f9445b);
        sb2.append(", address=");
        return android.support.v4.media.session.a.k(this.f9446c, "}", sb2);
    }
}
