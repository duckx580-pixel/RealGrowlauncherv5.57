package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19988a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19989b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t6.k f19990c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Float.compare(this.f19988a, q0Var.f19988a) == 0 && this.f19989b == q0Var.f19989b && kotlin.jvm.internal.l.a(this.f19990c, q0Var.f19990c);
    }

    public final int hashCode() {
        int iC = s.h0.c(Float.hashCode(this.f19988a) * 31, 31, this.f19989b);
        t6.k kVar = this.f19990c;
        return iC + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f19988a + ", fill=" + this.f19989b + ", crossAxisAlignment=" + this.f19990c + ')';
    }
}
