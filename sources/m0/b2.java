package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10420d;

    public b2(long j, long j10, long j11, long j12) {
        this.f10417a = j;
        this.f10418b = j10;
        this.f10419c = j11;
        this.f10420d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return g1.t.c(this.f10417a, b2Var.f10417a) && g1.t.c(this.f10418b, b2Var.f10418b) && g1.t.c(this.f10419c, b2Var.f10419c) && g1.t.c(this.f10420d, b2Var.f10420d);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f10420d) + s.h0.b(s.h0.b(Long.hashCode(this.f10417a) * 31, 31, this.f10418b), 31, this.f10419c);
    }
}
