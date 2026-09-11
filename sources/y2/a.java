package y2;

import k0.g;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20130d;

    public final String toString() {
        String strK = g.k(new StringBuilder(), this.f20127a, ':');
        switch (this.f20128b) {
            case 900:
                StringBuilder sbM = g.m(strK);
                sbM.append(this.f20129c);
                return sbM.toString();
            case 901:
                StringBuilder sbM2 = g.m(strK);
                sbM2.append(this.f20130d);
                return sbM2.toString();
            case 902:
                StringBuilder sbM3 = g.m(strK);
                sbM3.append("#" + ("00000000" + Integer.toHexString(this.f20129c)).substring(r1.length() - 8));
                return sbM3.toString();
            case 903:
                return h0.e(strK, null);
            default:
                return h0.e(strK, "????");
        }
    }
}
