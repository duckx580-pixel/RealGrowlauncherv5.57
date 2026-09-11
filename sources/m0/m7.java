package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10979e;

    public m7(long j, long j10, long j11, long j12, long j13) {
        this.f10975a = j;
        this.f10976b = j10;
        this.f10977c = j11;
        this.f10978d = j12;
        this.f10979e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return g1.t.c(this.f10975a, m7Var.f10975a) && g1.t.c(this.f10976b, m7Var.f10976b) && g1.t.c(this.f10977c, m7Var.f10977c) && g1.t.c(this.f10978d, m7Var.f10978d) && g1.t.c(this.f10979e, m7Var.f10979e);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f10979e) + s.h0.b(s.h0.b(s.h0.b(Long.hashCode(this.f10975a) * 31, 31, this.f10976b), 31, this.f10977c), 31, this.f10978d);
    }
}
