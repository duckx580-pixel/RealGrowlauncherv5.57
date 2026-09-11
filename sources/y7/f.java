package y7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f20183b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f20184c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20186e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f20182a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f20185d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f20184c) {
                try {
                    PackageInfo packageInfoE = i8.b.a(context).e(64, "com.google.android.gms");
                    g.a(context);
                    if (packageInfoE == null || g.d(packageInfoE, false) || !g.d(packageInfoE, true)) {
                        f20183b = false;
                    } else {
                        f20183b = true;
                    }
                    f20184c = true;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e8);
                    f20184c = true;
                }
            }
            return f20183b || !"user".equals(Build.TYPE);
        } catch (Throwable th2) {
            f20184c = true;
            throw th2;
        }
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
