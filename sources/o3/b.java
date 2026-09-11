package o3;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static {
        int i10 = Build.VERSION.SDK_INT;
        a aVar = a.f12650a;
        if (i10 >= 30) {
            aVar.a(30);
        }
        if (i10 >= 30) {
            aVar.a(31);
        }
        if (i10 >= 30) {
            aVar.a(33);
        }
        if (i10 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        kotlin.jvm.internal.l.e("CODENAME", str);
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.l.e("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase);
        String upperCase2 = "Tiramisu".toUpperCase(locale);
        kotlin.jvm.internal.l.e("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase2);
        return upperCase.compareTo(upperCase2) >= 0;
    }
}
