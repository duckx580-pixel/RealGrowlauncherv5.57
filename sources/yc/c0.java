package yc;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.rtsoft.growtopia.SharedActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import s8.o2;
import zc.i3;
import zc.r0;
import zc.x2;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f20254a = {"com.tapjoy.TJAdUnitActivity", "com.tapjoy.TJContentActivity"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f20255b = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f20256c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f20257d = 6;

    public static void a(int i10, String str, String str2) {
        String strM = android.support.v4.media.session.a.m("TapjoyLog:", str);
        if (f20257d <= i10) {
            if (str2.length() <= 4096) {
                Log.println(i10, strM, str2);
                return;
            }
            int i11 = 0;
            while (i11 <= str2.length() / 4096) {
                int i12 = i11 + 1;
                int length = i12 * 4096;
                if (length > str2.length()) {
                    length = str2.length();
                }
                Log.println(i10, strM, str2.substring(i11 * 4096, length));
                i11 = i12;
            }
        }
    }

    public static void b(String str, boolean z3) {
        String str2;
        u5.e eVar;
        if (z3 || (eVar = u5.e.f17652t) == null || ((String) eVar.f17654r) == null) {
            if (str.equals("internal")) {
                f20257d = 2;
                new Handler(Looper.getMainLooper()).post(new ac.b(9));
            } else if (str.equals("debug_on")) {
                f20257d = 4;
            } else {
                if (!str.equals("debug_off")) {
                    a(3, "TapjoyLog", "unrecognized loggingLevel: ".concat(str));
                }
                f20257d = 6;
            }
            str2 = "logThreshold=" + f20257d;
        } else {
            str2 = "setLoggingLevel -- log setting already persisted";
        }
        a(3, "TapjoyLog", str2);
    }

    public static void c(String str, ec.c cVar) {
        if (f20257d == 2 || cVar.f5480c != 1) {
            a(6, str, cVar.toString());
        }
    }

    public static void d(String str, String str2) {
        c(str, new ec.c(1, 4, str2));
    }

    public static void e(SharedActivity sharedActivity) {
        r0 r0Var = r0.f21090d;
        if (r0Var.f21092b != null) {
            if (!r0Var.f21091a) {
                a(5, "TapjoyAPI", "Can not call getCurrencyBalance because Tapjoy SDK has not successfully connected.");
                return;
            }
            kg.a aVar = r0Var.f21092b;
            aVar.getClass();
            kg.a.f9615b = sharedActivity;
            HashMap mapN = i0.n();
            q0.i(mapN, "app_id", i0.I0);
            mapN.putAll(i0.j());
            new Thread(new o2(25, aVar, mapN, false)).start();
        }
    }

    public static void f(SharedActivity sharedActivity) {
        r0.f21090d.getClass();
        if (sharedActivity != null) {
            zc.m.f20988a.f21376a = new WeakReference(sharedActivity);
        } else {
            int i10 = 4;
            c("TapjoyAPI", new ec.c(i10, 4, "Cannot set activity to NULL"));
        }
    }

    public static void g(boolean z3) {
        f20256c = z3;
        x2 x2Var = x2.f21246n;
        if (i3.f20898c != z3) {
            i3.f20898c = z3;
            i3.d(z3 ? "The debug mode has been enabled" : "The debug mode has been disabled");
            if (z3 && x2Var.f21257i) {
                x2Var.f21255g.a();
            }
        }
        b(f20256c ? "debug_on" : "debug_off", false);
    }
}
