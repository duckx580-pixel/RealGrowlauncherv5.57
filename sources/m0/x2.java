package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11436f;

    public x2(long j, long j10, long j11, long j12, long j13, long j14) {
        this.f11431a = j;
        this.f11432b = j10;
        this.f11433c = j11;
        this.f11434d = j12;
        this.f11435e = j13;
        this.f11436f = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return g1.t.c(this.f11431a, x2Var.f11431a) && g1.t.c(this.f11432b, x2Var.f11432b) && g1.t.c(this.f11433c, x2Var.f11433c) && g1.t.c(this.f11434d, x2Var.f11434d) && g1.t.c(this.f11435e, x2Var.f11435e) && g1.t.c(this.f11436f, x2Var.f11436f);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f11436f) + s.h0.b(s.h0.b(s.h0.b(s.h0.b(Long.hashCode(this.f11431a) * 31, 31, this.f11432b), 31, this.f11433c), 31, this.f11434d), 31, this.f11435e);
    }
}
