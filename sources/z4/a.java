package z4;

import com.usercentrics.sdk.models.location.LocationConstants;
import java.util.Locale;
import k0.g;
import kotlin.jvm.internal.l;
import nh.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20592g;

    public a(String str, String str2, boolean z3, int i10, String str3, int i11) {
        this.f20586a = str;
        this.f20587b = str2;
        this.f20588c = z3;
        this.f20589d = i10;
        this.f20590e = str3;
        this.f20591f = i11;
        Locale locale = Locale.US;
        l.e(LocationConstants.US_COUNTRY_CODE, locale);
        String upperCase = str2.toUpperCase(locale);
        l.e("this as java.lang.String).toUpperCase(locale)", upperCase);
        this.f20592g = h.M(upperCase, "INT", false) ? 3 : (h.M(upperCase, "CHAR", false) || h.M(upperCase, "CLOB", false) || h.M(upperCase, "TEXT", false)) ? 2 : h.M(upperCase, "BLOB", false) ? 5 : (h.M(upperCase, "REAL", false) || h.M(upperCase, "FLOA", false) || h.M(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f20589d != aVar.f20589d) {
                return false;
            }
            int i10 = aVar.f20591f;
            String str = aVar.f20590e;
            if (!this.f20586a.equals(aVar.f20586a) || this.f20588c != aVar.f20588c) {
                return false;
            }
            String str2 = this.f20590e;
            int i11 = this.f20591f;
            if (i11 == 1 && i10 == 2 && str2 != null && !rk.a.Q(str2, str)) {
                return false;
            }
            if (i11 == 2 && i10 == 1 && str != null && !rk.a.Q(str, str2)) {
                return false;
            }
            if (i11 != 0 && i11 == i10) {
                if (str2 != null) {
                    if (!rk.a.Q(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f20592g != aVar.f20592g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f20586a.hashCode() * 31) + this.f20592g) * 31) + (this.f20588c ? 1231 : 1237)) * 31) + this.f20589d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f20586a);
        sb2.append("', type='");
        sb2.append(this.f20587b);
        sb2.append("', affinity='");
        sb2.append(this.f20592g);
        sb2.append("', notNull=");
        sb2.append(this.f20588c);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f20589d);
        sb2.append(", defaultValue='");
        String str = this.f20590e;
        if (str == null) {
            str = "undefined";
        }
        return g.l(sb2, str, "'}");
    }
}
