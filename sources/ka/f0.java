package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9381i;

    public f0(int i10, String str, int i11, long j, long j10, boolean z3, int i12, String str2, String str3) {
        this.f9373a = i10;
        this.f9374b = str;
        this.f9375c = i11;
        this.f9376d = j;
        this.f9377e = j10;
        this.f9378f = z3;
        this.f9379g = i12;
        this.f9380h = str2;
        this.f9381i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c1) {
            f0 f0Var = (f0) ((c1) obj);
            if (this.f9373a == f0Var.f9373a && this.f9374b.equals(f0Var.f9374b) && this.f9375c == f0Var.f9375c && this.f9376d == f0Var.f9376d && this.f9377e == f0Var.f9377e && this.f9378f == f0Var.f9378f && this.f9379g == f0Var.f9379g && this.f9380h.equals(f0Var.f9380h) && this.f9381i.equals(f0Var.f9381i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f9373a ^ 1000003) * 1000003) ^ this.f9374b.hashCode()) * 1000003) ^ this.f9375c) * 1000003;
        long j = this.f9376d;
        int i10 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f9377e;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f9378f ? 1231 : 1237)) * 1000003) ^ this.f9379g) * 1000003) ^ this.f9380h.hashCode()) * 1000003) ^ this.f9381i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f9373a);
        sb2.append(", model=");
        sb2.append(this.f9374b);
        sb2.append(", cores=");
        sb2.append(this.f9375c);
        sb2.append(", ram=");
        sb2.append(this.f9376d);
        sb2.append(", diskSpace=");
        sb2.append(this.f9377e);
        sb2.append(", simulator=");
        sb2.append(this.f9378f);
        sb2.append(", state=");
        sb2.append(this.f9379g);
        sb2.append(", manufacturer=");
        sb2.append(this.f9380h);
        sb2.append(", modelClass=");
        return k0.g.l(sb2, this.f9381i, "}");
    }
}
