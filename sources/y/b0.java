package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f19918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.b f19919b;

    public b0(y0 y0Var, q2.b bVar) {
        this.f19918a = y0Var;
        this.f19919b = bVar;
    }

    @Override // y.m0
    public final float a() {
        y0 y0Var = this.f19918a;
        q2.b bVar = this.f19919b;
        return bVar.K(y0Var.c(bVar));
    }

    @Override // y.m0
    public final float b(q2.l lVar) {
        y0 y0Var = this.f19918a;
        q2.b bVar = this.f19919b;
        return bVar.K(y0Var.b(bVar, lVar));
    }

    @Override // y.m0
    public final float c() {
        y0 y0Var = this.f19918a;
        q2.b bVar = this.f19919b;
        return bVar.K(y0Var.d(bVar));
    }

    @Override // y.m0
    public final float d(q2.l lVar) {
        y0 y0Var = this.f19918a;
        q2.b bVar = this.f19919b;
        return bVar.K(y0Var.a(bVar, lVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.l.a(this.f19918a, b0Var.f19918a) && kotlin.jvm.internal.l.a(this.f19919b, b0Var.f19919b);
    }

    public final int hashCode() {
        return this.f19919b.hashCode() + (this.f19918a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f19918a + ", density=" + this.f19919b + ')';
    }
}
