package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.m0 f17482b;

    public p(float f9, g1.m0 m0Var) {
        this.f17481a = f9;
        this.f17482b = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return q2.e.a(this.f17481a, pVar.f17481a) && this.f17482b.equals(pVar.f17482b);
    }

    public final int hashCode() {
        return this.f17482b.hashCode() + (Float.hashCode(this.f17481a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) q2.e.b(this.f17481a)) + ", brush=" + this.f17482b + ')';
    }
}
