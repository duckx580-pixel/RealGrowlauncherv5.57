package y;

import s3.f2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0.z0 f19911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0.z0 f19912d;

    public a(int i10, String str) {
        this.f19909a = i10;
        this.f19910b = str;
        o0.n0 n0Var = o0.n0.f12510u;
        this.f19911c = o0.p.I(k3.c.f9223e, n0Var);
        this.f19912d = o0.p.I(Boolean.TRUE, n0Var);
    }

    @Override // y.y0
    public final int a(q2.b bVar, q2.l lVar) {
        return e().f9226c;
    }

    @Override // y.y0
    public final int b(q2.b bVar, q2.l lVar) {
        return e().f9224a;
    }

    @Override // y.y0
    public final int c(q2.b bVar) {
        return e().f9227d;
    }

    @Override // y.y0
    public final int d(q2.b bVar) {
        return e().f9225b;
    }

    public final k3.c e() {
        return (k3.c) this.f19911c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f19909a == ((a) obj).f19909a;
        }
        return false;
    }

    public final void f(f2 f2Var, int i10) {
        int i11 = this.f19909a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f19911c.setValue(f2Var.f15063a.f(i11));
            this.f19912d.setValue(Boolean.valueOf(f2Var.f15063a.p(i11)));
        }
    }

    public final int hashCode() {
        return this.f19909a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19910b);
        sb2.append('(');
        sb2.append(e().f9224a);
        sb2.append(", ");
        sb2.append(e().f9225b);
        sb2.append(", ");
        sb2.append(e().f9226c);
        sb2.append(", ");
        return s.h0.g(sb2, e().f9227d, ')');
    }
}
