package q5;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13798d;

    public a(boolean z3, boolean z10, boolean z11, boolean z12) {
        this.f13795a = z3;
        this.f13796b = z10;
        this.f13797c = z11;
        this.f13798d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13795a == aVar.f13795a && this.f13796b == aVar.f13796b && this.f13797c == aVar.f13797c && this.f13798d == aVar.f13798d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        boolean z3 = this.f13795a;
        ?? r12 = z3;
        if (z3) {
            r12 = 1;
        }
        int i10 = r12 * 31;
        boolean z10 = this.f13796b;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int i11 = (i10 + r22) * 31;
        boolean z11 = this.f13797c;
        ?? r23 = z11;
        if (z11) {
            r23 = 1;
        }
        int i12 = (i11 + r23) * 31;
        boolean z12 = this.f13798d;
        return i12 + (z12 ? 1 : z12);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f13795a + ", isValidated=" + this.f13796b + ", isMetered=" + this.f13797c + ", isNotRoaming=" + this.f13798d + ')';
    }
}
