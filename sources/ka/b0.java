package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f9328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b1 f9330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o1 f9331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c1 f9333i;
    public final r1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9334k;

    public b0(String str, String str2, long j, Long l10, boolean z3, b1 b1Var, o1 o1Var, n1 n1Var, c1 c1Var, r1 r1Var, int i10) {
        this.f9325a = str;
        this.f9326b = str2;
        this.f9327c = j;
        this.f9328d = l10;
        this.f9329e = z3;
        this.f9330f = b1Var;
        this.f9331g = o1Var;
        this.f9332h = n1Var;
        this.f9333i = c1Var;
        this.j = r1Var;
        this.f9334k = i10;
    }

    @Override // ka.p1
    public final u5.q a() {
        u5.q qVar = new u5.q();
        qVar.f17700a = this.f9325a;
        qVar.f17701b = this.f9326b;
        qVar.f17702c = Long.valueOf(this.f9327c);
        qVar.f17703d = this.f9328d;
        qVar.f17704e = Boolean.valueOf(this.f9329e);
        qVar.f17705f = this.f9330f;
        qVar.f17706g = this.f9331g;
        qVar.f17707h = this.f9332h;
        qVar.f17708i = this.f9333i;
        qVar.j = this.j;
        qVar.f17709k = Integer.valueOf(this.f9334k);
        return qVar;
    }

    public final boolean equals(Object obj) {
        Long l10;
        o1 o1Var;
        n1 n1Var;
        c1 c1Var;
        r1 r1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            b0 b0Var = (b0) ((p1) obj);
            r1 r1Var2 = b0Var.j;
            c1 c1Var2 = b0Var.f9333i;
            n1 n1Var2 = b0Var.f9332h;
            o1 o1Var2 = b0Var.f9331g;
            Long l11 = b0Var.f9328d;
            if (this.f9325a.equals(b0Var.f9325a) && this.f9326b.equals(b0Var.f9326b) && this.f9327c == b0Var.f9327c && ((l10 = this.f9328d) != null ? l10.equals(l11) : l11 == null) && this.f9329e == b0Var.f9329e && this.f9330f.equals(b0Var.f9330f) && ((o1Var = this.f9331g) != null ? o1Var.equals(o1Var2) : o1Var2 == null) && ((n1Var = this.f9332h) != null ? n1Var.equals(n1Var2) : n1Var2 == null) && ((c1Var = this.f9333i) != null ? c1Var.equals(c1Var2) : c1Var2 == null) && ((r1Var = this.j) != null ? r1Var.f9501i.equals(r1Var2) : r1Var2 == null) && this.f9334k == b0Var.f9334k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f9325a.hashCode() ^ 1000003) * 1000003) ^ this.f9326b.hashCode()) * 1000003;
        long j = this.f9327c;
        int i10 = (iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l10 = this.f9328d;
        int iHashCode2 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f9329e ? 1231 : 1237)) * 1000003) ^ this.f9330f.hashCode()) * 1000003;
        o1 o1Var = this.f9331g;
        int iHashCode3 = (iHashCode2 ^ (o1Var == null ? 0 : o1Var.hashCode())) * 1000003;
        n1 n1Var = this.f9332h;
        int iHashCode4 = (iHashCode3 ^ (n1Var == null ? 0 : n1Var.hashCode())) * 1000003;
        c1 c1Var = this.f9333i;
        int iHashCode5 = (iHashCode4 ^ (c1Var == null ? 0 : c1Var.hashCode())) * 1000003;
        r1 r1Var = this.j;
        return ((iHashCode5 ^ (r1Var != null ? r1Var.f9501i.hashCode() : 0)) * 1000003) ^ this.f9334k;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f9325a);
        sb2.append(", identifier=");
        sb2.append(this.f9326b);
        sb2.append(", startedAt=");
        sb2.append(this.f9327c);
        sb2.append(", endedAt=");
        sb2.append(this.f9328d);
        sb2.append(", crashed=");
        sb2.append(this.f9329e);
        sb2.append(", app=");
        sb2.append(this.f9330f);
        sb2.append(", user=");
        sb2.append(this.f9331g);
        sb2.append(", os=");
        sb2.append(this.f9332h);
        sb2.append(", device=");
        sb2.append(this.f9333i);
        sb2.append(", events=");
        sb2.append(this.j);
        sb2.append(", generatorType=");
        return k0.g.i(sb2, this.f9334k, "}");
    }
}
