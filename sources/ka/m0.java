package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f9455c;

    public m0(String str, int i10, r1 r1Var) {
        this.f9453a = str;
        this.f9454b = i10;
        this.f9455c = r1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            m0 m0Var = (m0) ((h1) obj);
            if (this.f9453a.equals(m0Var.f9453a) && this.f9454b == m0Var.f9454b) {
                if (this.f9455c.f9501i.equals(m0Var.f9455c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f9453a.hashCode() ^ 1000003) * 1000003) ^ this.f9454b) * 1000003) ^ this.f9455c.f9501i.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f9453a + ", importance=" + this.f9454b + ", frames=" + this.f9455c + "}";
    }
}
