package t6;

import android.content.Context;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends a1 {
    public final z2 F;
    public final a0 G;
    public final u H;
    public final p2 I;

    public u0(a0 a0Var, t tVar, p2 p2Var, u uVar) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, null);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, a0Var);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, tVar);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, p2Var);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, uVar);
        z2 z2Var = new z2(null, null, null);
        h1 h1Var = h1.CONVERSION;
        super(h1.PLAY_INTEGRITY_API, new h1[]{h1Var}, tVar, "PIA");
        this.G = a0Var;
        this.I = p2Var;
        this.H = uVar;
        this.F = z2Var;
        this.f16757i.add(h1Var);
    }

    @Override // t6.a1, t6.d1
    public final long a() {
        return TimeUnit.MINUTES.toMillis(1L);
    }

    @Override // t6.a1, t6.d1
    public final boolean f() {
        return false;
    }

    @Override // t6.a1
    public final h0 i(String str) throws JSONException {
        g0 g0Var;
        String str2;
        z2 z2Var = this.F;
        HashMap map = z2Var.f16728a;
        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, map);
        a0 a0Var = this.G;
        map.put("app_id", ((Context) a0Var.f16701e.f17063i).getPackageName());
        map.put("sdk_version", "6.17.5");
        map.put("app_version_name", a0Var.f().versionName);
        this.I.a(map);
        try {
            throw null;
        } catch (Throwable th2) {
            m3.g(s6.h.f15212b, 3, "Error while adding PIA data to payload", th2, true, false, false, false, 96);
            h0 h0VarB = this.D.b(z2Var, this.A.g(), this.H);
            HashMap map2 = z2Var.f16728a;
            kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, map2);
            if (h0VarB != null && (g0Var = h0VarB.f16839d) != null && (str2 = g0Var.f16805g) != null) {
                JSONObject jSONObject = new JSONObject(map2);
                if (jSONObject.has("pia")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
                    if (jSONObject2.has("pia_token")) {
                        jSONObject2.put("pia_token", a.a.v(jSONObject2.getString("pia_token")));
                    }
                }
                a.a.B(toString() + ": preparing data: ", jSONObject);
                String string = jSONObject.toString();
                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, string);
                ((j0) this.C).r(str2, string);
            }
            return h0VarB;
        }
    }

    @Override // t6.a1
    public final boolean k() {
        return false;
    }

    @Override // t6.a1
    public final void j() {
    }
}
