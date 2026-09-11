package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.b f19986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19987b;

    public q(t1.a1 a1Var, long j) {
        this.f19986a = a1Var;
        this.f19987b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.l.a(this.f19986a, qVar.f19986a) && q2.a.b(this.f19987b, qVar.f19987b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f19987b) + (this.f19986a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f19986a + ", constraints=" + ((Object) q2.a.k(this.f19987b)) + ')';
    }
}
