package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17068e;

    public u1(int i10, int i11, int i12, int i13, String str) {
        this.f17065b = i10;
        this.f17066c = i11;
        this.f17064a = i12;
        this.f17068e = i13;
        this.f17067d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f17065b == u1Var.f17065b && this.f17066c == u1Var.f17066c && this.f17064a == u1Var.f17064a && this.f17068e == u1Var.f17068e && kotlin.jvm.internal.l.a(this.f17067d, u1Var.f17067d);
    }

    public final int hashCode() {
        return this.f17067d.hashCode() + android.support.v4.media.session.a.z(this.f17068e, android.support.v4.media.session.a.z(this.f17064a, android.support.v4.media.session.a.z(this.f17066c, Integer.hashCode(this.f17065b) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = android.support.v4.media.session.a.o("CmpTcfData(policyVersion=", this.f17065b, ", gdprApplies=", this.f17066c, ", cmpSdkId=");
        gb.e.j(sbO, this.f17064a, ", cmpSdkVersion=", this.f17068e, ", tcString=");
        return k0.g.l(sbO, this.f17067d, ")");
    }
}
