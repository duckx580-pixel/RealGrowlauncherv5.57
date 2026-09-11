package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10913g;

    public l3(long j, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f10907a = j;
        this.f10908b = j10;
        this.f10909c = j11;
        this.f10910d = j12;
        this.f10911e = j13;
        this.f10912f = j14;
        this.f10913g = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return g1.t.c(this.f10907a, l3Var.f10907a) && g1.t.c(this.f10910d, l3Var.f10910d) && g1.t.c(this.f10908b, l3Var.f10908b) && g1.t.c(this.f10911e, l3Var.f10911e) && g1.t.c(this.f10909c, l3Var.f10909c) && g1.t.c(this.f10912f, l3Var.f10912f) && g1.t.c(this.f10913g, l3Var.f10913g);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f10913g) + s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(Long.hashCode(this.f10907a) * 31, 31, this.f10910d), 31, this.f10908b), 31, this.f10911e), 31, this.f10909c), 31, this.f10912f);
    }
}
