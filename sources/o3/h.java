package o3;

import com.usercentrics.sdk.services.tcf.Constants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale[] f12654a = {new Locale(Constants.FALLBACK_LANGUAGE, "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr = f12654a;
            int length = localeArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    int length2 = localeArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            String strC = q3.d.c(q3.d.a(q3.d.b(locale)));
                            if (!strC.isEmpty()) {
                                return strC.equals(q3.d.c(q3.d.a(q3.d.b(locale2))));
                            }
                            String country = locale.getCountry();
                            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                                return true;
                            }
                        } else {
                            if (localeArr[i11].equals(locale2)) {
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    if (localeArr[i10].equals(locale)) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return false;
    }
}
