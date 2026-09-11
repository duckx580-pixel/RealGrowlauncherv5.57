package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11152i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11153k;

    public q0(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f11144a = j;
        this.f11145b = j10;
        this.f11146c = j11;
        this.f11147d = j12;
        this.f11148e = j13;
        this.f11149f = j14;
        this.f11150g = j15;
        this.f11151h = j16;
        this.f11152i = j17;
        this.j = j18;
        this.f11153k = j19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return g1.t.c(this.f11144a, q0Var.f11144a) && g1.t.c(this.f11145b, q0Var.f11145b) && g1.t.c(this.f11146c, q0Var.f11146c) && g1.t.c(this.f11147d, q0Var.f11147d) && g1.t.c(this.f11148e, q0Var.f11148e) && g1.t.c(this.f11149f, q0Var.f11149f) && g1.t.c(this.f11150g, q0Var.f11150g) && g1.t.c(this.f11151h, q0Var.f11151h) && g1.t.c(this.f11152i, q0Var.f11152i) && g1.t.c(this.j, q0Var.j) && g1.t.c(this.f11153k, q0Var.f11153k);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f11153k) + s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(Long.hashCode(this.f11144a) * 31, 31, this.f11145b), 31, this.f11146c), 31, this.f11147d), 31, this.f11148e), 31, this.f11149f), 31, this.f11150g), 31, this.f11151h), 31, this.f11152i), 31, this.j);
    }
}
