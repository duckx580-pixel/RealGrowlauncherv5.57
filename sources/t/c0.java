package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f16033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16035c;

    public c0(u uVar, int i10, long j) {
        this.f16033a = uVar;
        this.f16034b = i10;
        this.f16035c = j;
    }

    @Override // t.i
    public final l1 a(j1 j1Var) {
        return new p1(this.f16033a.a(j1Var), this.f16034b, this.f16035c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f16033a.equals(this.f16033a) && c0Var.f16034b == this.f16034b && c0Var.f16035c == this.f16035c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16035c) + ((g.c(this.f16034b) + (this.f16033a.hashCode() * 31)) * 31);
    }
}
