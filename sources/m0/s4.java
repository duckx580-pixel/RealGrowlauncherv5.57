package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11252i;
    public final long j;

    public s4(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f11244a = j;
        this.f11245b = j10;
        this.f11246c = j11;
        this.f11247d = j12;
        this.f11248e = j13;
        this.f11249f = j14;
        this.f11250g = j15;
        this.f11251h = j16;
        this.f11252i = j17;
        this.j = j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return g1.t.c(this.f11244a, s4Var.f11244a) && g1.t.c(this.f11245b, s4Var.f11245b) && g1.t.c(this.f11246c, s4Var.f11246c) && g1.t.c(this.f11247d, s4Var.f11247d) && g1.t.c(this.f11248e, s4Var.f11248e) && g1.t.c(this.f11249f, s4Var.f11249f) && g1.t.c(this.f11250g, s4Var.f11250g) && g1.t.c(this.f11251h, s4Var.f11251h) && g1.t.c(this.f11252i, s4Var.f11252i) && g1.t.c(this.j, s4Var.j);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.j) + s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(s.h0.b(Long.hashCode(this.f11244a) * 31, 31, this.f11245b), 31, this.f11246c), 31, this.f11247d), 31, this.f11248e), 31, this.f11249f), 31, this.f11250g), 31, this.f11251h), 31, this.f11252i);
    }
}
