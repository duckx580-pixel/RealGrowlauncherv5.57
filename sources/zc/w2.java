package zc;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends g3 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static w2 f21220q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n3 f21222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x2 f21223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21225i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f21226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i4 f21227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Activity f21228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z2 f21229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f21230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v2 f21231p;

    public w2(x2 x2Var, String str, n3 n3Var, Context context) {
        this.f21223g = x2Var;
        this.f21221e = str;
        this.f21222f = n3Var;
        this.f21226k = context;
    }

    public static void f(w2 w2Var) {
        z2 z2Var;
        if (w2Var.f21225i) {
            w2Var.f21225i = false;
            Handler handler = w2Var.f21230o;
            if (handler != null) {
                handler.removeCallbacks(w2Var.f21231p);
                w2Var.f21231p = null;
                w2Var.f21230o = null;
            }
            if (f21220q == w2Var) {
                f21220q = null;
            }
            x2 x2Var = w2Var.f21223g;
            LinkedHashMap linkedHashMap = w2Var.f21222f.f21025d;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - w2Var.j;
            k1.a aVar = x2Var.f21254f;
            v0 v0VarA = aVar.a(b1.CAMPAIGN, "view");
            v0VarA.j = Long.valueOf(jElapsedRealtime);
            if (linkedHashMap != null) {
                v0VarA.f21186s = n.b(linkedHashMap);
            }
            aVar.c(v0VarA);
            if (!w2Var.f20842a && (z2Var = w2Var.f21229n) != null) {
                z2Var.a(w2Var.f21221e, w2Var.f20844c, null);
                w2Var.f21229n = null;
            }
            ViewGroup viewGroup = (ViewGroup) w2Var.f21227l.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(w2Var.f21227l);
            }
            w2Var.f21227l = null;
            Activity activity = w2Var.f21228m;
            if (activity instanceof TJContentActivity) {
                activity.finish();
            }
            w2Var.f21228m = null;
        }
    }

    @Override // zc.g3
    public final void b(z2 z2Var, a2 a2Var) {
        Activity activity;
        this.f21229n = z2Var;
        WeakReference weakReference = (WeakReference) m.f20990c.f21376a;
        Activity activityA = (Activity) (weakReference != null ? weakReference.get() : null);
        if (activityA == null) {
            activityA = m.a();
        }
        this.f21228m = activityA;
        if (activityA != null && !activityA.isFinishing()) {
            try {
                e(this.f21228m, z2Var, a2Var);
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Context baseContext = this.f21226k;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        this.f21228m = activity;
        if (activity != null && !activity.isFinishing()) {
            try {
                e(this.f21228m, z2Var, a2Var);
                return;
            } catch (WindowManager.BadTokenException unused2) {
            }
        }
        String str = this.f21221e;
        i3.f("Failed to show the content for \"{}\". No usable activity found.", str);
        z2Var.a(str, this.f20844c, null);
    }

    @Override // zc.g3
    public final void c() {
        Iterator it = this.f21222f.f21024c.iterator();
        while (it.hasNext()) {
            for (u3 u3Var : ((v3) it.next()).f21202c) {
                s3 s3Var = u3Var.f21158l;
                if (s3Var != null) {
                    s3Var.b();
                }
                s3 s3Var2 = u3Var.f21159m;
                if (s3Var2 != null) {
                    s3Var2.b();
                }
            }
        }
    }

    @Override // zc.g3
    public final boolean d() {
        s3 s3Var;
        Iterator it = this.f21222f.f21024c.iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            for (u3 u3Var : ((v3) it.next()).f21202c) {
                s3 s3Var2 = u3Var.f21158l;
                if ((s3Var2 != null && s3Var2.f21114b == null && s3Var2.f21115c == null) || ((s3Var = u3Var.f21159m) != null && s3Var.f21114b == null && s3Var.f21115c == null)) {
                    z3 = false;
                    break;
                }
            }
            z3 = true;
            if (!z3) {
                return false;
            }
        }
        return z3;
    }

    public final void e(Activity activity, z2 z2Var, a2 a2Var) {
        n3 n3Var = this.f21222f;
        float f9 = n3Var.f21026e;
        if (this.f21224h) {
            yc.c0.c("hf", new ec.c(4, 4, "Content is already displayed"));
            return;
        }
        this.f21224h = true;
        this.f21225i = true;
        f21220q = this;
        this.f20845d = a2Var.f20705a;
        b3 b3Var = new b3(this, activity, z2Var);
        i4 i4Var = new i4(activity);
        i4Var.f20902s = e5.f20806s;
        i4Var.f20903t = 0;
        i4Var.f20904u = 0;
        i4Var.f20905v = null;
        i4Var.w = null;
        i4Var.f20906x = null;
        i4Var.f20900i = n3Var;
        i4Var.f20901r = b3Var;
        this.f21227l = i4Var;
        Window window = activity.getWindow();
        i4 i4Var2 = this.f21227l;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        Window.Callback callback = window.getCallback();
        window.setCallback(null);
        window.addContentView(i4Var2, layoutParams);
        window.setCallback(callback);
        this.j = SystemClock.elapsedRealtime();
        LinkedHashMap linkedHashMap = n3Var.f21025d;
        k1.a aVar = this.f21223g.f21254f;
        v0 v0VarA = aVar.a(b1.CAMPAIGN, "impression");
        if (linkedHashMap != null) {
            v0VarA.f21186s = n.b(linkedHashMap);
        }
        aVar.c(v0VarA);
        a2Var.b();
        androidx.fragment.app.h hVar = this.f20845d;
        if (hVar != null) {
            hVar.j();
        }
        z2Var.c(this.f21221e);
        if (f9 > 0.0f) {
            Handler handler = new Handler(Looper.getMainLooper());
            this.f21230o = handler;
            v2 v2Var = new v2(this, 1);
            this.f21231p = v2Var;
            handler.postDelayed(v2Var, (long) (f9 * 1000.0f));
        }
    }
}
