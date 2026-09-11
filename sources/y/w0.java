package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.z0 f20002b;

    public w0(c0 c0Var, String str) {
        this.f20001a = str;
        this.f20002b = o0.p.I(c0Var, o0.n0.f12510u);
    }

    @Override // y.y0
    public final int a(q2.b bVar, q2.l lVar) {
        return e().f19925c;
    }

    @Override // y.y0
    public final int b(q2.b bVar, q2.l lVar) {
        return e().f19923a;
    }

    @Override // y.y0
    public final int c(q2.b bVar) {
        return e().f19926d;
    }

    @Override // y.y0
    public final int d(q2.b bVar) {
        return e().f19924b;
    }

    public final c0 e() {
        return (c0) this.f20002b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            return kotlin.jvm.internal.l.a(e(), ((w0) obj).e());
        }
        return false;
    }

    public final void f(c0 c0Var) {
        this.f20002b.setValue(c0Var);
    }

    public final int hashCode() {
        return this.f20001a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20001a);
        sb2.append("(left=");
        sb2.append(e().f19923a);
        sb2.append(", top=");
        sb2.append(e().f19924b);
        sb2.append(", right=");
        sb2.append(e().f19925c);
        sb2.append(", bottom=");
        return s.h0.g(sb2, e().f19926d, ')');
    }
}
