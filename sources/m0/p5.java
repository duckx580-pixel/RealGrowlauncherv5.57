package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11125c;

    public p5(String str, String str2, int i10) {
        k0.g.s(i10, "duration");
        this.f11123a = str;
        this.f11124b = str2;
        this.f11125c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p5.class != obj.getClass()) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return this.f11123a.equals(p5Var.f11123a) && kotlin.jvm.internal.l.a(this.f11124b, p5Var.f11124b) && this.f11125c == p5Var.f11125c;
    }

    public final int hashCode() {
        int iHashCode = this.f11123a.hashCode() * 31;
        String str = this.f11124b;
        return t.g.c(this.f11125c) + s.h0.c((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, false);
    }
}
