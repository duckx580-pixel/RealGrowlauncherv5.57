package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10789d;

    public i4(long j, long j10, long j11, long j12) {
        this.f10786a = j;
        this.f10787b = j10;
        this.f10788c = j11;
        this.f10789d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return g1.t.c(this.f10786a, i4Var.f10786a) && g1.t.c(this.f10787b, i4Var.f10787b) && g1.t.c(this.f10788c, i4Var.f10788c) && g1.t.c(this.f10789d, i4Var.f10789d);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f10789d) + s.h0.b(s.h0.b(Long.hashCode(this.f10786a) * 31, 31, this.f10787b), 31, this.f10788c);
    }
}
