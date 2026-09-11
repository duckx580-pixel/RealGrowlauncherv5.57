package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f19997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f19998b;

    public u0(y0 y0Var, y0 y0Var2) {
        this.f19997a = y0Var;
        this.f19998b = y0Var2;
    }

    @Override // y.y0
    public final int a(q2.b bVar, q2.l lVar) {
        return Math.max(this.f19997a.a(bVar, lVar), this.f19998b.a(bVar, lVar));
    }

    @Override // y.y0
    public final int b(q2.b bVar, q2.l lVar) {
        return Math.max(this.f19997a.b(bVar, lVar), this.f19998b.b(bVar, lVar));
    }

    @Override // y.y0
    public final int c(q2.b bVar) {
        return Math.max(this.f19997a.c(bVar), this.f19998b.c(bVar));
    }

    @Override // y.y0
    public final int d(q2.b bVar) {
        return Math.max(this.f19997a.d(bVar), this.f19998b.d(bVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return kotlin.jvm.internal.l.a(u0Var.f19997a, this.f19997a) && kotlin.jvm.internal.l.a(u0Var.f19998b, this.f19998b);
    }

    public final int hashCode() {
        return (this.f19998b.hashCode() * 31) + this.f19997a.hashCode();
    }

    public final String toString() {
        return "(" + this.f19997a + " ∪ " + this.f19998b + ')';
    }
}
