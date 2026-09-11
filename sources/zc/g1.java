package zc;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends g0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t0 f20837v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f20838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f20839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f20840u;

    static {
        int i10 = 3;
        f20837v = new t0(i10, 7, g1.class);
    }

    public g1(String str, String str2) {
        this(str, str2, null, p4.f21062u);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return a().equals(g1Var.a()) && b5.g(this.f20838s, g1Var.f20838s) && b5.g(this.f20839t, g1Var.f20839t) && b5.g(this.f20840u, g1Var.f20840u);
    }

    public final int hashCode() {
        int i10 = this.f20835i;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = a().hashCode();
        String str = this.f20838s;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.f20839t;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f20840u;
        int iHashCode4 = (((((iHashCode * 37) + iHashCode2) * 37) + iHashCode3) * 37) + (str3 != null ? str3.hashCode() : 0);
        this.f20835i = iHashCode4;
        return iHashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f20838s;
        if (str != null) {
            sb2.append(", fq7Change=");
            sb2.append(str);
        }
        String str2 = this.f20839t;
        if (str2 != null) {
            sb2.append(", fq30Change=");
            sb2.append(str2);
        }
        String str3 = this.f20840u;
        if (str3 != null) {
            sb2.append(", pushId=");
            sb2.append(str3);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "Meta{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public g1(String str, String str2, String str3, p4 p4Var) {
        super(f20837v, p4Var);
        this.f20838s = str;
        this.f20839t = str2;
        this.f20840u = str3;
    }
}
