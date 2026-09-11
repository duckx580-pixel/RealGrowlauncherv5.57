package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17059c;

    public t1(long j, String str, boolean z3) {
        this.f17059c = str;
        this.f17058b = j;
        this.f17057a = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return kotlin.jvm.internal.l.a(this.f17059c, t1Var.f17059c) && this.f17058b == t1Var.f17058b && this.f17057a == t1Var.f17057a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        int iHashCode = this.f17059c.hashCode();
        int iHashCode2 = Long.hashCode(this.f17058b);
        boolean z3 = this.f17057a;
        ?? r22 = z3;
        if (z3) {
            r22 = 1;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + r22;
    }

    public final String toString() {
        return "AFUninstallToken(token=" + this.f17059c + ", receivedTime=" + this.f17058b + ", isQueued=" + this.f17057a + ")";
    }
}
