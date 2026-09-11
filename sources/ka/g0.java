package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f9385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f9386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f9387e;

    public g0(long j, String str, j1 j1Var, k1 k1Var, l1 l1Var) {
        this.f9383a = j;
        this.f9384b = str;
        this.f9385c = j1Var;
        this.f9386d = k1Var;
        this.f9387e = l1Var;
    }

    public final boolean equals(Object obj) {
        l1 l1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            g0 g0Var = (g0) ((m1) obj);
            l1 l1Var2 = g0Var.f9387e;
            if (this.f9383a == g0Var.f9383a && this.f9384b.equals(g0Var.f9384b) && this.f9385c.equals(g0Var.f9385c) && this.f9386d.equals(g0Var.f9386d) && ((l1Var = this.f9387e) != null ? l1Var.equals(l1Var2) : l1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9383a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f9384b.hashCode()) * 1000003) ^ this.f9385c.hashCode()) * 1000003) ^ this.f9386d.hashCode()) * 1000003;
        l1 l1Var = this.f9387e;
        return iHashCode ^ (l1Var == null ? 0 : l1Var.hashCode());
    }

    public final String toString() {
        return "Event{timestamp=" + this.f9383a + ", type=" + this.f9384b + ", app=" + this.f9385c + ", device=" + this.f9386d + ", log=" + this.f9387e + "}";
    }
}
