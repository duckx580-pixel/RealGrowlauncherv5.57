package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11428h;

    public x0(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f11421a = j;
        this.f11422b = j10;
        this.f11423c = j11;
        this.f11424d = j12;
        this.f11425e = j13;
        this.f11426f = j14;
        this.f11427g = j15;
        this.f11428h = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return g1.t.c(this.f11421a, x0Var.f11421a) && g1.t.c(this.f11422b, x0Var.f11422b) && g1.t.c(this.f11423c, x0Var.f11423c) && g1.t.c(this.f11424d, x0Var.f11424d) && g1.t.c(this.f11425e, x0Var.f11425e) && g1.t.c(this.f11426f, x0Var.f11426f) && g1.t.c(this.f11427g, x0Var.f11427g) && g1.t.c(this.f11428h, x0Var.f11428h);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f11428h) + s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(Long.hashCode(this.f11421a) * 31, 31, this.f11422b), 31, this.f11423c), 31, this.f11424d), 31, this.f11425e), 31, this.f11426f), 31, this.f11427g);
    }
}
