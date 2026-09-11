package zc;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends g0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t0 f20930t = new t0(3, 11, k1.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f20931s;

    public k1(o0 o0Var, p4 p4Var) {
        super(f20930t, p4Var);
        this.f20931s = b5.c("elements", o0Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return a().equals(k1Var.a()) && this.f20931s.equals(k1Var.f20931s);
    }

    public final int hashCode() {
        int i10 = this.f20835i;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f20931s.hashCode() + (a().hashCode() * 37);
        this.f20835i = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        List list = this.f20931s;
        if (!list.isEmpty()) {
            sb2.append(", elements=");
            sb2.append(list);
        }
        StringBuilder sbReplace = sb2.replace(0, 2, "StringList{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
