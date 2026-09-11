package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10899d;

    public l0(long j, long j10, long j11, long j12) {
        this.f10896a = j;
        this.f10897b = j10;
        this.f10898c = j11;
        this.f10899d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return g1.t.c(this.f10896a, l0Var.f10896a) && g1.t.c(this.f10897b, l0Var.f10897b) && g1.t.c(this.f10898c, l0Var.f10898c) && g1.t.c(this.f10899d, l0Var.f10899d);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f10899d) + s.h0.b(s.h0.b(Long.hashCode(this.f10896a) * 31, 31, this.f10897b), 31, this.f10898c);
    }
}
