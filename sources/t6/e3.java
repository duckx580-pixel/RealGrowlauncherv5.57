package t6;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.migration.internal.MigrationDataProvider;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f16774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f16777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u5.c f16778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public JSONObject f16779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f16780g;

    public e3(a0 a0Var, u5.c cVar) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, a0Var);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, cVar);
        this.f16774a = a0Var;
        this.f16778e = cVar;
    }

    public final void a() {
        this.f16776c = false;
        MigrationDataProvider.clear();
    }

    public final void b(String str, b3 b3Var, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put(str, jSONObject);
        HashMap map2 = new HashMap();
        map2.put("branch", map);
        HashMap map3 = new HashMap();
        map3.put("external", map2);
        b3Var.c(map3);
        HashMap map4 = b3Var.f16728a;
        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, map4);
        int i10 = d3.f16764a[b3Var.a().ordinal()];
        Long l10 = i10 != 1 ? i10 != 2 ? null : this.f16777d : this.f16780g;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            Map mapE = f.E(map4);
            kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, mapE);
            mapE.put("migration", rg.y.F(new qg.g("delay", Long.valueOf(jLongValue))));
        }
    }

    public final void c(b3 b3Var) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, b3Var);
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            b("attr", b3Var, attributionData);
            this.f16775b = true;
        }
        MigrationDataProvider.clear();
    }

    public final JSONObject d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForAttributionData = MigrationDataProvider.waitForAttributionData(3000L);
        if (jSONObjectWaitForAttributionData != null) {
            this.f16777d = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return jSONObjectWaitForAttributionData;
    }

    public final void e(b3 b3Var) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, b3Var);
        JSONObject jSONObject = this.f16779f;
        if (jSONObject != null) {
            b("attr", b3Var, jSONObject);
        } else {
            JSONObject jSONObjectD = d();
            if (jSONObjectD != null) {
                b("attr", b3Var, jSONObjectD);
            }
        }
        MigrationDataProvider.clear();
    }

    public final void f(b3 b3Var) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, b3Var);
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(3000L);
        if (jSONObjectWaitForDeepLinkingData != null) {
            this.f16780g = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            b("dl", b3Var, jSONObjectWaitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    public final void g(Intent intent, b bVar) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, intent);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, bVar);
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.f16776c = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            HashMap map = a.f16694h;
            Object declaredConstructor = map.get(862139947);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) a.b((char) (62049 - ExpandableListView.getPackedPositionGroup(0L)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 37 - (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Uri.class, b.class);
                map.put(862139947, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(data, bVar);
            Object method = map.get(-180621578);
            if (method == null) {
                method = ((Class) a.b((char) (62050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36)).getMethod("getMediationNetwork", null);
                map.put(-180621578, method);
            }
            Object objInvoke = ((Method) method).invoke(objNewInstance, null);
            Object method2 = map.get(614194017);
            if (method2 == null) {
                method2 = ((Class) a.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.blue(0) + 37, 52 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("AFAdRevenueData", null);
                map.put(614194017, method2);
            }
            this.f16776c = !((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
