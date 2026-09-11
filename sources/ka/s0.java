package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f9504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f9505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f9506c;

    public s0(t0 t0Var, v0 v0Var, u0 u0Var) {
        this.f9504a = t0Var;
        this.f9505b = v0Var;
        this.f9506c = u0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f9504a.equals(s0Var.f9504a) && this.f9505b.equals(s0Var.f9505b) && this.f9506c.equals(s0Var.f9506c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f9504a.hashCode() ^ 1000003) * 1000003) ^ this.f9505b.hashCode()) * 1000003) ^ this.f9506c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f9504a + ", osData=" + this.f9505b + ", deviceData=" + this.f9506c + "}";
    }
}
