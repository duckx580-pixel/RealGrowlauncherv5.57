package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11507d;

    public z(long j, long j10, long j11, long j12) {
        this.f11504a = j;
        this.f11505b = j10;
        this.f11506c = j11;
        this.f11507d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return g1.t.c(this.f11504a, zVar.f11504a) && g1.t.c(this.f11505b, zVar.f11505b) && g1.t.c(this.f11506c, zVar.f11506c) && g1.t.c(this.f11507d, zVar.f11507d);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Long.hashCode(this.f11507d) + s.h0.b(s.h0.b(Long.hashCode(this.f11504a) * 31, 31, this.f11505b), 31, this.f11506c);
    }
}
