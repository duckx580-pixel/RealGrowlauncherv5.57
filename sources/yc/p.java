package yc;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tapjoy.TJPlacement;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import zc.a2;
import zc.c2;
import zc.d4;
import zc.f2;
import zc.g3;
import zc.i3;
import zc.l2;
import zc.n1;
import zc.n2;
import zc.p2;
import zc.q1;
import zc.x2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f20392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20394d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f20396f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20399i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f20403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q1 f20404o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f20402m = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f20395e = new a2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20397g = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20405p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d4 f20406q = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g3 f20398h = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f20407r = false;
    public volatile boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f20400k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f20401l = false;

    public p(String str, String str2) {
        l lVar = new l(this);
        m mVar = new m(this);
        Activity activityA = zc.m.a();
        this.f20391a = activityA;
        if (activityA == null) {
            c0.a(3, "TJCorePlacement", "getVisibleActivity() is NULL. Activity can be explicitly set via `Tapjoy.setActivity(Activity)`");
        }
        String strI = i();
        u uVar = new u();
        uVar.A = false;
        uVar.f20414i = str2;
        uVar.f20415r = strI;
        if (!TextUtils.isEmpty(strI)) {
            uVar.f20416s = strI.substring(0, strI.indexOf(47, strI.indexOf("//") + 3));
        }
        uVar.f20419v = "app";
        this.f20392b = uVar;
        uVar.f20418u = str;
        this.f20393c = UUID.randomUUID().toString();
        d dVar = new d();
        this.f20396f = dVar;
        dVar.f20267k = lVar;
        dVar.f20268l = mVar;
    }

    public static void g(p pVar, String str) throws m0 {
        if (str == null) {
            throw new m0("TJPlacement request failed due to null response");
        }
        try {
            StringBuilder sb2 = new StringBuilder("Disable preload flag is set for placement ");
            u uVar = pVar.f20392b;
            sb2.append(uVar.f20418u);
            c0.a(3, "TJCorePlacement", sb2.toString());
            uVar.f20420x = new JSONObject(str).getString("redirect_url");
            uVar.A = true;
            uVar.w = true;
            c0.a(3, "TJCorePlacement", "redirect_url:" + uVar.f20420x);
        } catch (JSONException unused) {
            throw new m0("TJPlacement request failed, malformed server response");
        }
    }

    public final TJPlacement a(String str) {
        TJPlacement tJPlacement;
        synchronized (this.f20402m) {
            try {
                tJPlacement = (TJPlacement) this.f20402m.get(str);
                if (tJPlacement != null) {
                    c0.a(3, "TJCorePlacement", "Returning " + str + " placement: " + tJPlacement.f4731e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tJPlacement;
    }

    public final void b() {
        synchronized (this) {
            String strI = this.f20392b.f20415r;
            if (TextUtils.isEmpty(strI)) {
                strI = i();
                if (TextUtils.isEmpty(strI)) {
                    l2 l2VarC = n2.c("TJPlacement.requestContent");
                    l2VarC.f20976b.put("failure", "TJPlacement is missing APP_ID");
                    l2VarC.d();
                    d(a("REQUEST"), 2, new q("TJPlacement is missing APP_ID"));
                    return;
                }
                u uVar = this.f20392b;
                uVar.f20415r = strI;
                if (!TextUtils.isEmpty(strI)) {
                    uVar.f20416s = strI.substring(0, strI.indexOf(47, strI.indexOf("//") + 3));
                }
            }
            c0.a(3, "TJCorePlacement", "sendContentRequest -- URL: " + strI + " name: " + this.f20392b.f20418u);
            f(strI, null);
        }
    }

    public final void c(TJPlacement tJPlacement) {
        a2 a2Var = this.f20395e;
        u uVar = this.f20392b;
        String str = uVar.f20418u;
        String str2 = uVar.f20419v;
        String str3 = this.f20398h != null ? "mm" : this.f20400k ? "ad" : "none";
        a2Var.f20707c = 0;
        HashSet hashSet = n2.f21013h;
        l2 l2Var = new l2("PlacementContent.funnel");
        try {
            l2Var.f20978d = SystemClock.elapsedRealtime();
        } catch (NullPointerException unused) {
            l2Var.f20978d = -1L;
        }
        l2Var.f20976b.put("placement", str);
        l2Var.f20976b.put("placement_type", str2);
        l2Var.f20976b.put("content_type", str3);
        l2Var.f20976b.put("state", Integer.valueOf(a2Var.f20707c));
        a2Var.f20706b = l2Var;
        a2Var.f20706b.d();
        if (!"none".equals(str3)) {
            l2 l2Var2 = new l2("PlacementContent.ready");
            try {
                l2Var2.f20978d = SystemClock.elapsedRealtime();
            } catch (NullPointerException unused2) {
                l2Var2.f20978d = -1L;
            }
            l2Var2.f20976b.put("placement", str);
            l2Var2.f20976b.put("placement_type", str2);
            l2Var2.f20976b.put("content_type", str3);
            a2Var.f20709e = l2Var2;
        }
        if (tJPlacement == null || tJPlacement.f4729c == null) {
            return;
        }
        c0.a(4, "TJCorePlacement", "Content request delivered successfully for placement " + this.f20392b.f20418u + ", contentAvailable: " + this.f20400k + ", mediationAgent: null");
        tJPlacement.f4729c.onRequestSuccess(tJPlacement);
    }

    public final void d(TJPlacement tJPlacement, int i10, q qVar) {
        v vVar;
        c0.c("TJCorePlacement", new ec.c(i10, 4, "Content request failed for placement " + this.f20392b.f20418u + "; Reason= " + qVar.f20408a));
        if (tJPlacement == null || (vVar = tJPlacement.f4729c) == null) {
            return;
        }
        vVar.onRequestFailure(tJPlacement, qVar);
    }

    public final void e(TJPlacement tJPlacement, String str) {
        synchronized (this.f20402m) {
            this.f20402m.put(str, tJPlacement);
            c0.a(3, "TJCorePlacement", "Setting " + str + " placement: " + tJPlacement.f4731e);
        }
    }

    public final void f(String str, HashMap map) throws Throwable {
        Throwable th2;
        String strI;
        long jLongValue;
        synchronized (this) {
            try {
                try {
                    if (this.f20407r) {
                        c0.a(4, "TJCorePlacement", "Placement " + this.f20392b.f20418u + " is already requesting content");
                        l2 l2VarC = n2.c("TJPlacement.requestContent");
                        l2VarC.c("already doing");
                        l2VarC.d();
                        return;
                    }
                    u uVar = this.f20392b;
                    uVar.f20417t = null;
                    uVar.f20420x = null;
                    uVar.w = false;
                    uVar.f20421y = false;
                    uVar.A = false;
                    uVar.f20422z = null;
                    uVar.B = false;
                    a2 a2Var = this.f20395e;
                    a2Var.f20706b = null;
                    a2Var.f20708d = null;
                    a2Var.f20705a = null;
                    d dVar = this.f20396f;
                    dVar.w = false;
                    dVar.f20281z = false;
                    dVar.f20279x = false;
                    this.f20407r = false;
                    this.j = false;
                    this.f20400k = false;
                    this.f20401l = false;
                    this.f20398h = null;
                    this.f20406q = null;
                    this.f20407r = true;
                    TJPlacement tJPlacementA = a("REQUEST");
                    HashMap mapN = i0.n();
                    q0.i(mapN, "app_id", i0.I0);
                    this.f20403n = mapN;
                    mapN.putAll(i0.j());
                    q0.i(this.f20403n, "event_name", this.f20392b.f20418u);
                    q0.i(this.f20403n, "event_preload", "true");
                    q0.i(this.f20403n, "debug", Boolean.toString(i3.f20898c));
                    x2 x2Var = x2.f21246n;
                    HashMap map2 = this.f20403n;
                    zc.c0 c0Var = x2Var.f21250b;
                    if (c0Var == null) {
                        strI = null;
                    } else {
                        c2 c2Var = (c2) c0Var.f20735a;
                        String strI2 = c2Var.I();
                        if (strI2 != null && !new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()).equals(strI2)) {
                            c2Var.J(null);
                            ((c2) c0Var.f20736b).J(null);
                        }
                        strI = ((c2) c0Var.f20736b).I();
                    }
                    q0.i(map2, "action_id_exclusion", strI);
                    q0.i(this.f20403n, "system_placement", String.valueOf(this.f20399i));
                    HashMap map3 = this.f20403n;
                    tJPlacementA.getClass();
                    q0.i(map3, "push_id", null);
                    q0.i(this.f20403n, "mediation_source", null);
                    q0.i(this.f20403n, "adapter_version", null);
                    String str2 = i0.f20322f;
                    if (!TextUtils.isEmpty(str2)) {
                        q0.i(this.f20403n, "cp", str2);
                    }
                    if (map != null) {
                        this.f20403n.putAll(map);
                    }
                    String str3 = "placement_request_content_retry_timeout";
                    Iterator it = f2.f20825c.f20826a.f21075a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jLongValue = 0;
                            break;
                        }
                        Map map4 = ((p2) it.next()).f21054a;
                        Object obj = map4 != null ? map4.get(str3) : null;
                        if (obj != null) {
                            if (obj instanceof Number) {
                                jLongValue = ((Number) obj).longValue();
                                break;
                            } else if (obj instanceof String) {
                                try {
                                    jLongValue = Long.parseLong((String) obj);
                                    break;
                                } catch (IllegalArgumentException unused) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    try {
                        new n(this, n2.e("TJPlacement.requestContent"), new n1(jLongValue), str, tJPlacementA, f2.f20825c.f20826a.d()).start();
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            th2 = th;
            throw th2;
        }
    }

    public final void h() {
        v vVar;
        if (this.j) {
            return;
        }
        this.f20401l = true;
        c0.a(4, "TJCorePlacement", "Content is ready for placement " + this.f20392b.f20418u);
        if (this.f20396f.f20279x) {
            a2 a2Var = this.f20395e;
            Boolean bool = Boolean.TRUE;
            l2 l2Var = a2Var.f20706b;
            if (l2Var != null) {
                l2Var.a("prerendered", bool);
            }
            l2 l2Var2 = a2Var.f20709e;
            if (l2Var2 != null) {
                l2Var2.a("prerendered", bool);
            }
        }
        a2 a2Var2 = this.f20395e;
        l2 l2Var3 = a2Var2.f20709e;
        if (l2Var3 != null) {
            a2Var2.f20709e = null;
            l2Var3.b();
            l2Var3.d();
        }
        TJPlacement tJPlacementA = a("REQUEST");
        if (tJPlacementA == null || (vVar = tJPlacementA.f4729c) == null) {
            return;
        }
        vVar.onContentReady(tJPlacementA);
        this.j = true;
    }

    public final String i() {
        String str = i0.I0;
        if (TextUtils.isEmpty(str)) {
            c0.a(4, "TJCorePlacement", "Placement content URL cannot be generated for null app ID");
            return PredefinedUICustomizationFont.defaultFamily;
        }
        return i0.i("TJC_OPTION_PLACEMENT_SERVICE_URL") + "v1/apps/" + str + "/content?";
    }
}
