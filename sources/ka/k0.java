package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f9435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f9436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9437e;

    public k0(String str, String str2, r1 r1Var, e1 e1Var, int i10) {
        this.f9433a = str;
        this.f9434b = str2;
        this.f9435c = r1Var;
        this.f9436d = e1Var;
        this.f9437e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        e1 e1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1) {
            k0 k0Var = (k0) ((e1) obj);
            e1 e1Var2 = k0Var.f9436d;
            String str2 = k0Var.f9434b;
            if (this.f9433a.equals(k0Var.f9433a) && ((str = this.f9434b) != null ? str.equals(str2) : str2 == null)) {
                if (this.f9435c.f9501i.equals(k0Var.f9435c) && ((e1Var = this.f9436d) != null ? e1Var.equals(e1Var2) : e1Var2 == null) && this.f9437e == k0Var.f9437e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9433a.hashCode() ^ 1000003) * 1000003;
        String str = this.f9434b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f9435c.f9501i.hashCode()) * 1000003;
        e1 e1Var = this.f9436d;
        return ((iHashCode2 ^ (e1Var != null ? e1Var.hashCode() : 0)) * 1000003) ^ this.f9437e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f9433a);
        sb2.append(", reason=");
        sb2.append(this.f9434b);
        sb2.append(", frames=");
        sb2.append(this.f9435c);
        sb2.append(", causedBy=");
        sb2.append(this.f9436d);
        sb2.append(", overflowCount=");
        return k0.g.i(sb2, this.f9437e, "}");
    }
}
