package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10473g;

    public c3(long j, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f10467a = j;
        this.f10468b = j10;
        this.f10469c = j11;
        this.f10470d = j12;
        this.f10471e = j13;
        this.f10472f = j14;
        this.f10473g = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return g1.t.c(this.f10467a, c3Var.f10467a) && g1.t.c(this.f10470d, c3Var.f10470d) && g1.t.c(this.f10468b, c3Var.f10468b) && g1.t.c(this.f10471e, c3Var.f10471e) && g1.t.c(this.f10469c, c3Var.f10469c) && g1.t.c(this.f10472f, c3Var.f10472f) && g1.t.c(this.f10473g, c3Var.f10473g);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f10473g) + s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(Long.hashCode(this.f10467a) * 31, 31, this.f10470d), 31, this.f10468b), 31, this.f10471e), 31, this.f10469c), 31, this.f10472f);
    }
}
