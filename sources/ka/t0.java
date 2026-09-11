package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fa.d f9517f;

    public t0(String str, String str2, String str3, String str4, int i10, fa.d dVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f9512a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f9513b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f9514c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f9515d = str4;
        this.f9516e = i10;
        this.f9517f = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f9512a.equals(t0Var.f9512a) && this.f9513b.equals(t0Var.f9513b) && this.f9514c.equals(t0Var.f9514c) && this.f9515d.equals(t0Var.f9515d) && this.f9516e == t0Var.f9516e && this.f9517f.equals(t0Var.f9517f);
    }

    public final int hashCode() {
        return ((((((((((this.f9512a.hashCode() ^ 1000003) * 1000003) ^ this.f9513b.hashCode()) * 1000003) ^ this.f9514c.hashCode()) * 1000003) ^ this.f9515d.hashCode()) * 1000003) ^ this.f9516e) * 1000003) ^ this.f9517f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f9512a + ", versionCode=" + this.f9513b + ", versionName=" + this.f9514c + ", installUuid=" + this.f9515d + ", deliveryMechanism=" + this.f9516e + ", developmentPlatformProvider=" + this.f9517f + "}";
    }
}
