package t6;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f16817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f16818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f16819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f16822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f16823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f16824h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return kotlin.jvm.internal.l.a(this.f16821e, g3Var.f16821e) && kotlin.jvm.internal.l.a(this.f16824h, g3Var.f16824h) && kotlin.jvm.internal.l.a(this.f16817a, g3Var.f16817a) && kotlin.jvm.internal.l.a(this.f16822f, g3Var.f16822f) && kotlin.jvm.internal.l.a(this.f16823g, g3Var.f16823g) && kotlin.jvm.internal.l.a(this.f16820d, g3Var.f16820d) && kotlin.jvm.internal.l.a(this.f16819c, g3Var.f16819c) && kotlin.jvm.internal.l.a(this.f16818b, g3Var.f16818b);
    }

    public final int hashCode() {
        String str = this.f16821e;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.f16824h;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.f16817a;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.f16822f;
        int iHashCode4 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.f16823g;
        int iHashCode5 = bool4 == null ? 0 : bool4.hashCode();
        String str2 = this.f16820d;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Boolean bool5 = this.f16819c;
        return this.f16818b.hashCode() + (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.f16821e + ", isLimited=" + this.f16824h + ", isEnabled=" + this.f16817a + ", isGaidWithGps=" + this.f16822f + ", isGaidWithSamsungCloudDev=" + this.f16823g + ", gaidError=" + this.f16820d + ", retry=" + this.f16819c + ", metadata=" + this.f16818b + ")";
    }
}
