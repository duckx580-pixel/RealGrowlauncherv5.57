package zc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x2 f21246n = new x2();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Handler f21247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static File f21248p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f21250b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f21252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a3 f21253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k1.a f21254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s8.e2 f21255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21257i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f21258k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b3 f21260m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21251c = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z2 f21259l = z2.f21308c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc.m f21249a = new yc.m(this);

    public static void c(wb.a aVar) {
        synchronized (x2.class) {
            try {
                if (f21247o == null) {
                    f21247o = new Handler(Looper.getMainLooper());
                }
                f21247o.post(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static File f(Context context) {
        File file;
        synchronized (x2.class) {
            try {
                if (f21248p == null) {
                    f21248p = context.getDir("fiverocks", 0);
                }
                file = f21248p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return file;
    }

    public final void a(Context context, String str, String str2, String str3) {
        synchronized (this) {
            try {
                if (this.f21257i) {
                    return;
                }
                d(context);
                boolean z3 = this.f21252d != null;
                boolean z10 = i3.f20898c;
                if (z10 && !z3) {
                    if (z10) {
                        Log.println(6, "Tapjoy", "The given context was null");
                    }
                    throw new IllegalStateException("The given context was null");
                }
                if (z3) {
                    if (str2 == null || str2.length() != 24 || !str2.matches("[0-9a-f]{24}")) {
                        i3.f("Invalid App ID: {}", str2);
                        return;
                    }
                    if (str3 == null || str3.length() != 20 || !str3.matches("[0-9A-Za-z\\-_]{20}")) {
                        i3.f("Invalid App Key: {}", str3);
                        return;
                    }
                    this.j = str;
                    this.f21258k = "12.10.0";
                    try {
                        c0 c0Var = new c0("TapjoySDK 12.10.0 (" + Build.MODEL + "; Android " + Build.VERSION.RELEASE + "; " + Locale.getDefault() + ")", new URL("https://rpc.tapjoy.com/"));
                        i3.f20899d = Executors.newCachedThreadPool();
                        s8.e2 e2Var = this.f21255g;
                        e2Var.f15321u = c0Var;
                        e2Var.a();
                        this.f21257i = true;
                        pa.a aVar = new pa.a(new File(f(this.f21252d), "install"));
                        if (aVar.b() == null && aVar.a()) {
                            k1.a aVar2 = this.f21254f;
                            aVar2.c(aVar2.a(b1.APP, "install"));
                        }
                        a3 a3Var = this.f21253e;
                        if (!TextUtils.isEmpty(str2) && !str2.equals(a3Var.f20713b.f20862d.I())) {
                            a3Var.f20713b.f20862d.J(str2);
                            SharedPreferences.Editor editorEdit = a3Var.f20713b.f20864f.edit();
                            editorEdit.putBoolean("gcm.onServer", false);
                            editorEdit.apply();
                        }
                    } catch (MalformedURLException e8) {
                        throw new IllegalArgumentException(e8);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(String str, boolean z3) {
        a3 a3Var = this.f21253e;
        h3 h3Var = a3Var.f20713b;
        String strI = h3Var.f20859a.I();
        l1 l1Var = a3Var.f20712a;
        l1Var.f20968s = str;
        l1Var.f20969t = Boolean.valueOf(z3);
        h3Var.f20859a.J(str);
        c2 c2Var = h3Var.f20860b;
        ((SharedPreferences) c2Var.f1693a).edit().putBoolean((String) c2Var.f1694b, z3).apply();
        k3.f20942e = str;
        k3.f20943f = z3;
        k3.f20940c.countDown();
        if (TextUtils.isEmpty(strI) || str.equals(strI)) {
            return;
        }
        SharedPreferences.Editor editorEdit = h3Var.f20864f.edit();
        editorEdit.putBoolean("gcm.onServer", false);
        editorEdit.apply();
    }

    public final void d(Context context) {
        synchronized (this) {
            try {
                if (this.f21252d == null) {
                    Context applicationContext = context.getApplicationContext();
                    this.f21252d = applicationContext;
                    f2.f20825c.a(applicationContext);
                    this.f21253e = a3.b(applicationContext);
                    File file = new File(f(applicationContext), "events2");
                    if (this.f21255g == null) {
                        this.f21255g = new s8.e2(file);
                    }
                    k1.a aVar = new k1.a(this.f21253e, this.f21255g);
                    this.f21254f = aVar;
                    this.f21260m = new b3(aVar);
                    this.f21250b = new c0(applicationContext);
                    n2 n2Var = new n2(new File(f(applicationContext), "usages"), this.f21254f);
                    if (n2.j == null) {
                        n2.j = n2Var;
                        if (n2.f21015k) {
                            try {
                                n2Var.f21022g.execute(new m2(n2Var, 1, c5.b(), null, null, null));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    p3 p3Var = p3.f21055f;
                    p3Var.f21056a = applicationContext.getApplicationContext();
                    p3Var.f21057b = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2E", 0);
                    p3Var.f21058c = applicationContext.getSharedPreferences("tapjoyCacheDataMMF2U", 0);
                    p3Var.f21060e.submit(new wb.a(11, p3Var));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e(String str) {
        if ((this.f21257i || this.f21256h != null) && this.f21252d != null) {
            return true;
        }
        if (!i3.f20898c) {
            return false;
        }
        String strConcat = str.concat(": Should be called after initializing the SDK");
        if (!i3.f20898c || strConcat == null) {
            return false;
        }
        Log.println(6, "Tapjoy", strConcat);
        return false;
    }
}
