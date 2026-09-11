package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16148a;

    public n0(int i10) {
        this.f16148a = i10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n0) && ((n0) obj).f16148a == this.f16148a;
    }

    public final int hashCode() {
        return this.f16148a;
    }

    @Override // t.i
    public final n1 a(j1 j1Var) {
        return new k8.j(this.f16148a);
    }
}
