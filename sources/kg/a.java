package kg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import org.json.JSONObject;
import yc.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static t f9615b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f9616a;

    public String a() {
        String str;
        String str2;
        Context context = this.f9616a;
        try {
            JSONObject jSONObject = new JSONObject();
            PackageManager packageManager = context.getPackageManager();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
                str = (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : PredefinedUICustomizationFont.defaultFamily);
            } catch (PackageManager.NameNotFoundException unused) {
                str = null;
            }
            jSONObject.put("appName", str);
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused2) {
                str2 = null;
            }
            jSONObject.put("appVersion", str2);
            jSONObject.put("package", context.getPackageName());
            jSONObject.put("sdkVersion", "1.2.0");
            return jSONObject.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
