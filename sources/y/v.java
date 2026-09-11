package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f19999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f20000b;

    public v(y0 y0Var, y0 y0Var2) {
        this.f19999a = y0Var;
        this.f20000b = y0Var2;
    }

    @Override // y.y0
    public final int a(q2.b bVar, q2.l lVar) {
        int iA = this.f19999a.a(bVar, lVar) - this.f20000b.a(bVar, lVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // y.y0
    public final int b(q2.b bVar, q2.l lVar) {
        int iB = this.f19999a.b(bVar, lVar) - this.f20000b.b(bVar, lVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // y.y0
    public final int c(q2.b bVar) {
        int iC = this.f19999a.c(bVar) - this.f20000b.c(bVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // y.y0
    public final int d(q2.b bVar) {
        int iD = this.f19999a.d(bVar) - this.f20000b.d(bVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.l.a(vVar.f19999a, this.f19999a) && kotlin.jvm.internal.l.a(vVar.f20000b, this.f20000b);
    }

    public final int hashCode() {
        return this.f20000b.hashCode() + (this.f19999a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f19999a + " - " + this.f20000b + ')';
    }
}
