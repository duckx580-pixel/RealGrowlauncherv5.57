package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9492d;

    public q0(int i10, String str, String str2, boolean z3) {
        this.f9489a = i10;
        this.f9490b = str;
        this.f9491c = str2;
        this.f9492d = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            q0 q0Var = (q0) ((n1) obj);
            if (this.f9489a == q0Var.f9489a && this.f9490b.equals(q0Var.f9490b) && this.f9491c.equals(q0Var.f9491c) && this.f9492d == q0Var.f9492d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f9489a ^ 1000003) * 1000003) ^ this.f9490b.hashCode()) * 1000003) ^ this.f9491c.hashCode()) * 1000003) ^ (this.f9492d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f9489a + ", version=" + this.f9490b + ", buildVersion=" + this.f9491c + ", jailbroken=" + this.f9492d + "}";
    }
}
