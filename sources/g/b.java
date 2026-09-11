package g;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static String a(e eVar) {
        if (eVar instanceof d) {
            return "image/*";
        }
        if (eVar instanceof c) {
            return null;
        }
        throw new a2.d();
    }

    public static boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }
}
