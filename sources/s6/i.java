package s6;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f15215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f15216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f15217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f15218d;

    public i(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f15218d = bool;
        this.f15217c = bool2;
        this.f15216b = bool3;
        this.f15215a = bool4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f15218d, iVar.f15218d) && l.a(this.f15217c, iVar.f15217c) && l.a(this.f15216b, iVar.f15216b) && l.a(this.f15215a, iVar.f15215a);
    }

    public final int hashCode() {
        Boolean bool = this.f15218d;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.f15217c;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.f15216b;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.f15215a;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "AppsFlyerConsent(isUserSubjectToGDPR=" + this.f15218d + ", hasConsentForDataUsage=" + this.f15217c + ", hasConsentForAdsPersonalization=" + this.f15216b + ", hasConsentForAdStorage=" + this.f15215a + ")";
    }
}
