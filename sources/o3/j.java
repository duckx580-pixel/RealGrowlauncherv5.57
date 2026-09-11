package o3;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f12655b = new j(new k(i.a(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f12656a;

    public j(k kVar) {
        this.f12656a = kVar;
    }

    public static j a(String str) {
        if (str == null || str.isEmpty()) {
            return f12655b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = h.a(strArrSplit[i10]);
        }
        return new j(new k(i.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f12656a.equals(((j) obj).f12656a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12656a.f12657a.hashCode();
    }

    public final String toString() {
        return this.f12656a.f12657a.toString();
    }
}
