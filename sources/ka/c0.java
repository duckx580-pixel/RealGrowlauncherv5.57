package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9349f;

    public c0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f9344a = str;
        this.f9345b = str2;
        this.f9346c = str3;
        this.f9347d = str4;
        this.f9348e = str5;
        this.f9349f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            c0 c0Var = (c0) ((b1) obj);
            String str5 = c0Var.f9349f;
            String str6 = c0Var.f9348e;
            String str7 = c0Var.f9347d;
            String str8 = c0Var.f9346c;
            if (this.f9344a.equals(c0Var.f9344a) && this.f9345b.equals(c0Var.f9345b) && ((str = this.f9346c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f9347d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f9348e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f9349f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f9344a.hashCode() ^ 1000003) * 1000003) ^ this.f9345b.hashCode()) * 1000003;
        String str = this.f9346c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f9347d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9348e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f9349f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f9344a);
        sb2.append(", version=");
        sb2.append(this.f9345b);
        sb2.append(", displayVersion=");
        sb2.append(this.f9346c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f9347d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f9348e);
        sb2.append(", developmentPlatformVersion=");
        return k0.g.l(sb2, this.f9349f, "}");
    }
}
