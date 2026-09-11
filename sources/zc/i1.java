package zc;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends g0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t0 f20890v = new t0(3, 9, i1.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f20891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Long f20892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Long f20893u;

    public i1(String str, Long l10, Long l11, p4 p4Var) {
        super(f20890v, p4Var);
        this.f20891s = str;
        this.f20892t = l10;
        this.f20893u = l11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return a().equals(i1Var.a()) && this.f20891s.equals(i1Var.f20891s) && this.f20892t.equals(i1Var.f20892t) && b5.g(this.f20893u, i1Var.f20893u);
    }

    public final int hashCode() {
        int i10 = this.f20835i;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = a().hashCode();
        int iHashCode2 = this.f20891s.hashCode();
        int iHashCode3 = this.f20892t.hashCode();
        Long l10 = this.f20893u;
        int iHashCode4 = (((((iHashCode * 37) + iHashCode2) * 37) + iHashCode3) * 37) + (l10 != null ? l10.hashCode() : 0);
        this.f20835i = iHashCode4;
        return iHashCode4;
    }

    public final String toString() {
        StringBuilder sbM = k0.g.m(", id=");
        sbM.append(this.f20891s);
        sbM.append(", received=");
        sbM.append(this.f20892t);
        Long l10 = this.f20893u;
        if (l10 != null) {
            sbM.append(", clicked=");
            sbM.append(l10);
        }
        StringBuilder sbReplace = sbM.replace(0, 2, "Push{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
