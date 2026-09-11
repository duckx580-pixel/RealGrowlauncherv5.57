package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f9397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f9398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f9399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f9400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9401e;

    public h0(i1 i1Var, r1 r1Var, r1 r1Var2, Boolean bool, int i10) {
        this.f9397a = i1Var;
        this.f9398b = r1Var;
        this.f9399c = r1Var2;
        this.f9400d = bool;
        this.f9401e = i10;
    }

    public final boolean equals(Object obj) {
        r1 r1Var;
        r1 r1Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            h0 h0Var = (h0) ((j1) obj);
            Boolean bool2 = h0Var.f9400d;
            r1 r1Var3 = h0Var.f9399c;
            r1 r1Var4 = h0Var.f9398b;
            if (this.f9397a.equals(h0Var.f9397a) && ((r1Var = this.f9398b) != null ? r1Var.f9501i.equals(r1Var4) : r1Var4 == null) && ((r1Var2 = this.f9399c) != null ? r1Var2.f9501i.equals(r1Var3) : r1Var3 == null) && ((bool = this.f9400d) != null ? bool.equals(bool2) : bool2 == null) && this.f9401e == h0Var.f9401e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9397a.hashCode() ^ 1000003) * 1000003;
        r1 r1Var = this.f9398b;
        int iHashCode2 = (iHashCode ^ (r1Var == null ? 0 : r1Var.f9501i.hashCode())) * 1000003;
        r1 r1Var2 = this.f9399c;
        int iHashCode3 = (iHashCode2 ^ (r1Var2 == null ? 0 : r1Var2.f9501i.hashCode())) * 1000003;
        Boolean bool = this.f9400d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f9401e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f9397a);
        sb2.append(", customAttributes=");
        sb2.append(this.f9398b);
        sb2.append(", internalKeys=");
        sb2.append(this.f9399c);
        sb2.append(", background=");
        sb2.append(this.f9400d);
        sb2.append(", uiOrientation=");
        return k0.g.i(sb2, this.f9401e, "}");
    }
}
