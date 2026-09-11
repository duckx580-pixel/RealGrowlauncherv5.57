package ja;

import android.util.Log;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8871a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8872b = 64;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8873c;

    public b(int i10) {
        this.f8873c = i10;
    }

    public static String a(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String strA = a(this.f8873c, str);
        if (this.f8871a.size() >= this.f8872b && !this.f8871a.containsKey(strA)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f8872b, null);
            return false;
        }
        String strA2 = a(this.f8873c, str2);
        String str3 = (String) this.f8871a.get(strA);
        if (str3 == null ? strA2 == null : str3.equals(strA2)) {
            return false;
        }
        HashMap map = this.f8871a;
        if (str2 == null) {
            strA2 = PredefinedUICustomizationFont.defaultFamily;
        }
        map.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f8873c, str);
                if (this.f8871a.size() < this.f8872b || this.f8871a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f8871a.put(strA, str2 == null ? PredefinedUICustomizationFont.defaultFamily : a(this.f8873c, str2));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f8872b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
