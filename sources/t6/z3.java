package t6;

import android.content.Context;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f17138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f17139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f17141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f17142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f17143h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f17144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cb.f f17145b;

    static {
        int i10 = f.f16782i;
        f17142g = "https://%sattr.%s/api/v6.17/androidevent?app_id=";
        f17143h = "https://%sconversions.%s/api/v6.17/androidevent?app_id=";
        f17138c = "https://%slaunches.%s/api/v6.17/androidevent?app_id=";
        f17141f = "https://%sinapps.%s/api/v6.17/androidevent?app_id=";
        f17139d = "https://%sregister.%s/api/v6.17/androidevent?app_id=";
        f17140e = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    public z3(a0 a0Var) {
        cb.f fVar = new cb.f(15);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, a0Var);
        this.f17144a = a0Var;
        this.f17145b = fVar;
    }

    public final String a(String str) {
        return s.h0.e(str, ((Context) this.f17144a.f16701e.f17063i).getPackageName());
    }

    public final String b(String str, boolean z3) {
        if (z3) {
            return str;
        }
        String strC = this.f17144a.c();
        String strConcat = strC != null ? "&channel=".concat(strC) : null;
        if (strConcat == null) {
            strConcat = PredefinedUICustomizationFont.defaultFamily;
        }
        return s.h0.e(str, strConcat);
    }
}
