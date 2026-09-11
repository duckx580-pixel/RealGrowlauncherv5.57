package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9551h;

    public x(int i10, String str, int i11, int i12, long j, long j10, long j11, String str2) {
        this.f9544a = i10;
        this.f9545b = str;
        this.f9546c = i11;
        this.f9547d = i12;
        this.f9548e = j;
        this.f9549f = j10;
        this.f9550g = j11;
        this.f9551h = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            x xVar = (x) ((w0) obj);
            String str2 = xVar.f9551h;
            if (this.f9544a == xVar.f9544a && this.f9545b.equals(xVar.f9545b) && this.f9546c == xVar.f9546c && this.f9547d == xVar.f9547d && this.f9548e == xVar.f9548e && this.f9549f == xVar.f9549f && this.f9550g == xVar.f9550g && ((str = this.f9551h) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f9544a ^ 1000003) * 1000003) ^ this.f9545b.hashCode()) * 1000003) ^ this.f9546c) * 1000003) ^ this.f9547d) * 1000003;
        long j = this.f9548e;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f9549f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f9550g;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f9551h;
        return i12 ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationExitInfo{pid=");
        sb2.append(this.f9544a);
        sb2.append(", processName=");
        sb2.append(this.f9545b);
        sb2.append(", reasonCode=");
        sb2.append(this.f9546c);
        sb2.append(", importance=");
        sb2.append(this.f9547d);
        sb2.append(", pss=");
        sb2.append(this.f9548e);
        sb2.append(", rss=");
        sb2.append(this.f9549f);
        sb2.append(", timestamp=");
        sb2.append(this.f9550g);
        sb2.append(", traceFile=");
        return k0.g.l(sb2, this.f9551h, "}");
    }
}
