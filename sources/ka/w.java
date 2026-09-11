package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1 f9542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0 f9543i;

    public w(String str, String str2, int i10, String str3, String str4, String str5, p1 p1Var, z0 z0Var) {
        this.f9536b = str;
        this.f9537c = str2;
        this.f9538d = i10;
        this.f9539e = str3;
        this.f9540f = str4;
        this.f9541g = str5;
        this.f9542h = p1Var;
        this.f9543i = z0Var;
    }

    public final v a() {
        v vVar = new v(0);
        vVar.f9528c = this.f9536b;
        vVar.f9529d = this.f9537c;
        vVar.f9527b = Integer.valueOf(this.f9538d);
        vVar.f9530e = this.f9539e;
        vVar.f9531f = this.f9540f;
        vVar.f9532g = this.f9541g;
        vVar.f9533h = this.f9542h;
        vVar.f9534i = this.f9543i;
        return vVar;
    }

    public final boolean equals(Object obj) {
        p1 p1Var;
        z0 z0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            w wVar = (w) ((q1) obj);
            z0 z0Var2 = wVar.f9543i;
            p1 p1Var2 = wVar.f9542h;
            if (this.f9536b.equals(wVar.f9536b) && this.f9537c.equals(wVar.f9537c) && this.f9538d == wVar.f9538d && this.f9539e.equals(wVar.f9539e) && this.f9540f.equals(wVar.f9540f) && this.f9541g.equals(wVar.f9541g) && ((p1Var = this.f9542h) != null ? p1Var.equals(p1Var2) : p1Var2 == null) && ((z0Var = this.f9543i) != null ? z0Var.equals(z0Var2) : z0Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f9536b.hashCode() ^ 1000003) * 1000003) ^ this.f9537c.hashCode()) * 1000003) ^ this.f9538d) * 1000003) ^ this.f9539e.hashCode()) * 1000003) ^ this.f9540f.hashCode()) * 1000003) ^ this.f9541g.hashCode()) * 1000003;
        p1 p1Var = this.f9542h;
        int iHashCode2 = (iHashCode ^ (p1Var == null ? 0 : p1Var.hashCode())) * 1000003;
        z0 z0Var = this.f9543i;
        return iHashCode2 ^ (z0Var != null ? z0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f9536b + ", gmpAppId=" + this.f9537c + ", platform=" + this.f9538d + ", installationUuid=" + this.f9539e + ", buildVersion=" + this.f9540f + ", displayVersion=" + this.f9541g + ", session=" + this.f9542h + ", ndkPayload=" + this.f9543i + "}";
    }
}
