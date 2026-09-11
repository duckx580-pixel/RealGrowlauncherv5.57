package bi;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements zh.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh.g f2957a;

    public e0(zh.g gVar) {
        this.f2957a = gVar;
    }

    @Override // zh.g
    public final boolean c() {
        return false;
    }

    @Override // zh.g
    public final int d(String str) {
        kotlin.jvm.internal.l.f("name", str);
        Integer numK = nh.o.K(str);
        if (numK != null) {
            return numK.intValue();
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.l.k(str, " is not a valid list index"));
    }

    @Override // zh.g
    public final xd.c e() {
        return zh.j.f21367c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.l.a(this.f2957a, e0Var.f2957a) && kotlin.jvm.internal.l.a(a(), e0Var.a());
    }

    @Override // zh.g
    public final int f() {
        return 1;
    }

    @Override // zh.g
    public final String g(int i10) {
        return String.valueOf(i10);
    }

    @Override // zh.g
    public final List h(int i10) {
        if (i10 >= 0) {
            return rg.s.f14664i;
        }
        StringBuilder sbN = android.support.v4.media.session.a.n(i10, "Illegal index ", ", ");
        sbN.append(a());
        sbN.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f2957a.hashCode() * 31);
    }

    @Override // zh.g
    public final zh.g i(int i10) {
        if (i10 >= 0) {
            return this.f2957a;
        }
        StringBuilder sbN = android.support.v4.media.session.a.n(i10, "Illegal index ", ", ");
        sbN.append(a());
        sbN.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbN.toString().toString());
    }

    @Override // zh.g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return a() + '(' + this.f2957a + ')';
    }
}
