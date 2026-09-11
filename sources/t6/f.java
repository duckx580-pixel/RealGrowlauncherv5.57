package t6;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.rtsoft.growtopia.R;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qd.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f16786b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u5.l f16790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile SharedPreferences f16792h;
    public static final char[] j = {35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f16783k = new f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f16782i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f16784l = (f16782i + 87) % 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16787c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16785a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16788d = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f16789e = new t();

    public f() {
        u5.n nVarI = I().i();
        nVarI.getClass();
        s6.h hVar = s6.h.f15212b;
        int i10 = 0;
        if (((k3) nVarI.f17675a) == null) {
            nVarI.f17675a = new k3((t) nVarI.f17677c, i10);
        }
        k3 k3Var = (k3) nVarI.f17675a;
        kotlin.jvm.internal.l.c(k3Var);
        s6.h.y(k3Var);
        I().i().h();
        g1 g1VarS = I().s();
        e eVar = new e();
        eVar.f16765a = this;
        g1VarS.f16815h.add(eVar);
    }

    public static boolean A() {
        f16784l = (f16782i + 51) % 128;
        boolean zA = s6.j.b().a("waitForCustomerId", false);
        int i10 = f16782i + R.styleable.AppCompatTheme_windowFixedWidthMinor;
        f16784l = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (!(!zA)) {
            if (((String) L(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis())) == null) {
                f16784l = (f16782i + 123) % 128;
                return true;
            }
        }
        f16784l = (f16782i + 41) % 128;
        return false;
    }

    public static int D(b0 b0Var, String str, boolean z3) {
        int i10;
        int i11 = f16784l + 15;
        f16782i = i11 % 128;
        if (i11 % 2 != 0) {
            i10 = b0Var.i(0, str);
            if (!z3) {
                return i10;
            }
        } else {
            i10 = b0Var.i(0, str);
            if (!z3) {
                return i10;
            }
        }
        f16782i = (f16784l + 13) % 128;
        int i12 = i10 + 1;
        b0Var.d(i12, str);
        return i12;
    }

    public static Map E(Map map) {
        if (!map.containsKey("meta")) {
            HashMap map2 = new HashMap();
            map.put("meta", map2);
            return map2;
        }
        f16784l = (f16782i + R.styleable.AppCompatTheme_windowFixedHeightMinor) % 128;
        Map map3 = (Map) map.get("meta");
        f16782i = (f16784l + 81) % 128;
        return map3;
    }

    public static void F(String str, String str2) {
        int i10 = f16784l + 19;
        f16782i = i10 % 128;
        if (i10 % 2 != 0) {
            s6.j.b().e(str, str2);
            throw new ArithmeticException("divide by zero");
        }
        s6.j.b().e(str, str2);
        int i11 = f16782i + 73;
        f16784l = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static String H(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j10));
        int i10 = f16784l + 3;
        f16782i = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        throw new ArithmeticException("divide by zero");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c A[PHI: r6
      0x004c: PHI (r6v8 n7.e) = (r6v7 n7.e), (r6v16 n7.e) binds: [B:10:0x004a, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void K(java.lang.Object[] r6) {
        /*
            r0 = 0
            r0 = r6[r0]
            t6.f r0 = (t6.f) r0
            r1 = 1
            r2 = r6[r1]
            android.content.Context r2 = (android.content.Context) r2
            r3 = 2
            r4 = r6[r3]
            java.util.Map r4 = (java.util.Map) r4
            r5 = 3
            r6 = r6[r5]
            if (r6 != 0) goto L86
            int r6 = t6.f.f16784l
            int r6 = r6 + 59
            int r5 = r6 % 128
            t6.f.f16782i = r5
            int r6 = r6 % r3
            java.lang.String r5 = "purchases"
            if (r6 == 0) goto L37
            r0.v(r2)
            t6.t r6 = r0.I()
            n7.e r6 = r6.o()
            java.lang.String[] r0 = new java.lang.String[r1]
            r0[r1] = r5
            boolean r0 = r6.t(r4, r0)
            if (r0 == 0) goto L78
            goto L4c
        L37:
            r0.v(r2)
            t6.t r6 = r0.I()
            n7.e r6 = r6.o()
            java.lang.String[] r0 = new java.lang.String[]{r5}
            boolean r0 = r6.t(r4, r0)
            if (r0 == 0) goto L78
        L4c:
            t6.w0 r0 = new t6.w0
            java.lang.Object r1 = r6.f12172r
            t6.t r1 = (t6.t) r1
            t6.h1 r2 = t6.h1.RC_CDN
            t6.h1 r5 = t6.h1.FETCH_ADVERTISING_ID
            t6.h1[] r2 = new t6.h1[]{r2, r5}
            java.lang.String r5 = ""
            kotlin.jvm.internal.l.f(r5, r4)
            r0.<init>(r2, r1, r4)
            t6.h1 r1 = t6.h1.CONVERSION
            java.util.HashSet r2 = r0.f16762v
            r2.add(r1)
            java.lang.Object r6 = r6.f12173s
            t6.g1 r6 = (t6.g1) r6
            java.util.concurrent.ExecutorService r1 = r6.f16814g
            s8.o2 r2 = new s8.o2
            r4 = 7
            r2.<init>(r4, r6, r0)
            r1.execute(r2)
        L78:
            int r6 = t6.f.f16782i
            int r6 = r6 + 63
            int r0 = r6 % 128
            t6.f.f16784l = r0
            int r6 = r6 % r3
            if (r6 == 0) goto L84
            return
        L84:
            r6 = 0
            throw r6
        L86:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.f.K(java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x0790  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object L(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 2486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.f.L(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static f M() {
        int i10 = f16782i + 9;
        f16784l = i10 % 128;
        if (i10 % 2 != 0) {
            return f16783k;
        }
        throw null;
    }

    public static boolean N(Context context) {
        f16784l = (f16782i + R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu) % 128;
        try {
            if (y7.d.f20179d.b(context, y7.e.f20180a) == 0) {
                f16782i = (f16784l + 83) % 128;
                return true;
            }
        } catch (Throwable th2) {
            s6.h.r("WARNING:  Google play services is unavailable. ", th2);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e8) {
            s6.h.f15212b.c(27, "WARNING:  Google Play Services is unavailable. ", e8);
            return false;
        }
    }

    public static String t(b0 b0Var, String str) {
        f16784l = (f16782i + 71) % 128;
        String strG = b0Var.g("CACHED_CHANNEL");
        if (strG == null) {
            b0Var.j("CACHED_CHANNEL", str);
            f16784l = (f16782i + 37) % 128;
            return str;
        }
        int i10 = f16784l + 87;
        f16782i = i10 % 128;
        if (i10 % 2 == 0) {
            return strG;
        }
        throw null;
    }

    public static void w(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i10)));
                }
            } catch (JSONException e8) {
                s6.h.u("error at timeStampArr", e8);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (itKeys2.hasNext()) {
                f16784l = (f16782i + 7) % 128;
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i11 = 0;
                    while (i11 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i11) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i11) == ((Long) arrayList.get(1)).longValue()) {
                            break;
                        }
                        f16782i = (f16784l + 61) % 128;
                        if (jSONArray2.getLong(i11) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            break;
                        }
                        i11++;
                        str = next;
                    }
                } catch (JSONException e10) {
                    s6.h.u("error at manageExtraReferrers", e10);
                }
            }
            break loop2;
        }
        if (str != null) {
            f16782i = (f16784l + R.styleable.AppCompatTheme_windowActionBar) % 128;
            jSONObject.remove(str);
        }
    }

    public static int z(b0 b0Var, boolean z3) {
        int i10 = f16782i + 65;
        f16784l = i10 % 128;
        if (i10 % 2 == 0) {
            D(b0Var, "appsFlyerCount", z3);
            throw null;
        }
        int iD = D(b0Var, "appsFlyerCount", z3);
        f16782i = (f16784l + 71) % 128;
        return iD;
    }

    public final String B() {
        int i10 = f16784l + 29;
        f16782i = i10 % 128;
        I().d().getClass();
        String strA = q1.a();
        if (i10 % 2 == 0) {
            return strA;
        }
        throw new ArithmeticException("divide by zero");
    }

    public final String C() {
        int i10 = f16784l + 17;
        f16782i = i10 % 128;
        q1 q1VarD = I().d();
        if (i10 % 2 == 0) {
            return q1VarD.b();
        }
        q1VarD.b();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(t6.b3 r28) {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.f.G(t6.b3):void");
    }

    public final t I() {
        int i10 = (f16784l + 91) % 128;
        f16782i = i10;
        f16784l = (i10 + R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
        return this.f16789e;
    }

    public final b0 J(Context context) {
        f16784l = (f16782i + 13) % 128;
        v(context);
        b0 b0VarQ = I().q();
        int i10 = f16782i + 85;
        f16784l = i10 % 128;
        if (i10 % 2 != 0) {
            return b0VarQ;
        }
        throw null;
    }

    public final boolean O() {
        int i10 = f16784l + 123;
        f16782i = i10 % 128;
        if (i10 % 2 != 0) {
            I().c().f();
            throw new ArithmeticException("divide by zero");
        }
        boolean zF = I().c().f();
        f16784l = (f16782i + 55) % 128;
        return zF;
    }

    public final void P(s6.i iVar) {
        int i10 = f16784l + 41;
        f16782i = i10 % 128;
        if (i10 % 2 == 0) {
            I().v().f639c = iVar;
        } else {
            I().v().f639c = iVar;
            throw null;
        }
    }

    public final void Q(String... strArr) {
        al.h hVarV = I().v();
        ae.c cVar = new ae.c();
        if (strArr == null || strArr.length == 0) {
            cVar.f594i = null;
        } else {
            Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || !patternCompile.matcher(str).matches()) {
                    s6.h.x("Invalid partner name: ".concat(String.valueOf(str)));
                } else {
                    arrayList.add(str.toLowerCase(Locale.getDefault()));
                }
            }
            if (arrayList.contains("all")) {
                cVar.f594i = new String[]{"all"};
            } else if (arrayList.isEmpty()) {
                cVar.f594i = null;
            } else {
                cVar.f594i = (String[]) arrayList.toArray(new String[0]);
            }
        }
        hVarV.f643g = cVar;
        f16782i = (f16784l + 39) % 128;
    }

    public final void R(Context context, String str) {
        String strG;
        int i10 = f16784l + 93;
        f16782i = i10 % 128;
        if (i10 % 2 != 0) {
            I().D().getClass();
            throw new ArithmeticException("divide by zero");
        }
        if (((j) I().D().f16715s) != null) {
            f16784l = (f16782i + 31) % 128;
            return;
        }
        if (!this.f16791g) {
            s6.h.f15212b.o(1, "ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            int i11 = f16782i + 99;
            f16784l = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (str == null) {
                return;
            }
        }
        v(context);
        l3 l3VarM = I().m();
        l3VarM.d(context instanceof Activity ? j3.f16877r : context instanceof Application ? j3.f16876i : j3.f16878s);
        if (this.f16786b == null) {
            int i12 = f16782i + 53;
            f16784l = i12 % 128;
            if (i12 % 2 == 0) {
                c4.c(context);
                throw null;
            }
            Application applicationC = c4.c(context);
            if (applicationC == null) {
                return;
            }
            int i13 = f16782i + 69;
            f16784l = i13 % 128;
            if (i13 % 2 == 0) {
                this.f16786b = applicationC;
                throw null;
            }
            this.f16786b = applicationC;
        }
        ((j0) I().r()).t("start", str);
        s6.h hVar = s6.h.f15212b;
        hVar.k(27, "Starting AppsFlyer: (v6.17.5.366)");
        hVar.k(27, "Build Number: 366");
        s6.j jVarB = s6.j.b();
        b0 b0VarQ = I().q();
        synchronized (jVarB) {
            try {
            } catch (JSONException e8) {
                s6.h.r("Failed loading properties", e8);
            } finally {
            }
            if (!jVarB.f15222c && (strG = b0VarQ.g("savedProperties")) != null) {
                s6.h.q("Loading properties..");
                JSONObject jSONObject = new JSONObject(strG);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (jVarB.f15221b.get(next) == null) {
                        jVarB.f15221b.put(next, jSONObject.getString(next));
                    }
                }
                for (int i14 = 0; i14 < 5; i14++) {
                    jVarB.f15221b.remove(new String[]{"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"}[i14]);
                }
                jVarB.d(b0VarQ);
                jVarB.f15222c = true;
                StringBuilder sb2 = new StringBuilder("Done loading properties: ");
                sb2.append(jVarB.f15222c);
                s6.h.q(sb2.toString());
            }
        }
        if (!TextUtils.isEmpty(str)) {
            I().c().b(str);
        } else if (TextUtils.isEmpty(I().c().g())) {
            L(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
            return;
        }
        I().n().d(u());
        x();
        Context baseContext = this.f16786b.getBaseContext();
        PackageInfo packageInfoF = this.f16789e.a().f();
        s6.h hVar2 = s6.h.f15212b;
        try {
            ApplicationInfo applicationInfo = packageInfoF.applicationInfo;
            if (applicationInfo != null && (applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (baseContext.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", baseContext.getPackageName()) != 0) {
                        f16782i = (f16784l + 65) % 128;
                        hVar2.l(27, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                    } else {
                        hVar2.n(27, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>");
                        f16782i = (f16784l + 49) % 128;
                    }
                } else if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                    hVar2.l(27, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    hVar2.n(27, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>");
                }
            }
        } catch (Throwable th2) {
            s6.h.f15212b.c(27, "Exception while checking BackupRules: ", th2);
        }
        I().t().getClass();
        b bVarD = this.f16789e.D();
        com.google.android.gms.internal.measurement.j3 j3Var = new com.google.android.gms.internal.measurement.j3(18, false);
        j3Var.f3837s = this;
        j3Var.f3836r = l3VarM;
        bVarD.getClass();
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, context);
        if (((j) bVarD.f16715s) != null) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.l.d(PredefinedUICustomizationFont.defaultFamily, applicationContext);
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks((j) bVarD.f16715s);
        }
        bVarD.f16715s = null;
        j jVar = new j((ScheduledExecutorService) bVarD.f16713i, (b) bVarD.f16714r, (q3) bVarD.f16716t, j3Var);
        bVarD.f16715s = jVar;
        if (context instanceof Activity) {
            jVar.onActivityResumed((Activity) context);
        }
        Application applicationC2 = c4.c(context);
        if (applicationC2 != null) {
            applicationC2.registerActivityLifecycleCallbacks((j) bVarD.f16715s);
        }
    }

    public final u5.l u() {
        u5.l lVar;
        synchronized (this) {
            try {
                int i10 = f16784l + 11;
                int i11 = i10 % 128;
                f16782i = i11;
                if (i10 % 2 != 0) {
                    throw new ArithmeticException("divide by zero");
                }
                if (this.f16790f == null) {
                    this.f16790f = new u5.l(this);
                    f16784l = (i11 + 81) % 128;
                }
                lVar = this.f16790f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    public final void v(Context context) {
        int i10 = (f16784l + 27) % 128;
        f16782i = i10;
        if (context != null) {
            int i11 = i10 + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
            f16784l = i11 % 128;
            int i12 = i11 % 2;
            t tVar = this.f16789e;
            if (i12 == 0) {
                u uVar = tVar.f17055y;
                throw null;
            }
            tVar.f17055y.f17063i = context.getApplicationContext();
        }
    }

    public final void x() {
        int i10;
        if (v0.C) {
            i10 = f16782i + R.styleable.AppCompatTheme_toolbarStyle;
        } else {
            t tVarI = I();
            g1 g1VarS = tVarI.s();
            g1VarS.f16814g.execute(new s8.o2(7, g1VarS, new v0(tVarI)));
            i10 = f16782i + 13;
        }
        f16784l = i10 % 128;
    }

    public final void y() {
        int i10 = f16782i + 43;
        f16784l = i10 % 128;
        if (i10 % 2 == 0) {
            F("enableTCFDataCollection", Boolean.toString(true));
            throw new ArithmeticException("divide by zero");
        }
        F("enableTCFDataCollection", Boolean.toString(true));
        f16782i = (f16784l + 39) % 128;
    }
}
