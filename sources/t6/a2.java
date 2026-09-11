package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f16705e = TimeUnit.HOURS.toSeconds(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f16706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qg.k f16707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qg.k f16708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f16709d;

    public a2(a0 a0Var, y1 y1Var) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, a0Var);
        this.f16706a = a0Var;
        this.f16709d = y1Var;
        this.f16708c = android.support.v4.media.session.b.q(new z1(this, 0));
        this.f16707b = android.support.v4.media.session.b.q(new z1(this, 1));
    }

    public final boolean a() {
        x3 x3Var;
        y1 y1Var = this.f16709d;
        v3 v3Var = y1Var.f17126b;
        if (v3Var == null) {
            s6.h.f15212b.l(9, "active config is missing - fetching from CDN", true);
            return true;
        }
        y3 y3Var = v3Var.f17087d;
        return ((y3Var == null || (x3Var = y3Var.f17132b) == null) ? false : x3Var.a()) || System.currentTimeMillis() - y1Var.f17129e > TimeUnit.SECONDS.toMillis(y1Var.f17128d);
    }

    public final long b() {
        Object objI;
        String strD = this.f16706a.d("com.appsflyer.rc.cache.max-age-fallback");
        long j = f16705e;
        if (strD == null) {
            return j;
        }
        try {
            objI = Long.valueOf(Long.parseLong(strD));
        } catch (Throwable th2) {
            objI = androidx.work.v.i(th2);
        }
        Throwable thA = qg.i.a(objI);
        if (thA != null) {
            s6.h.r("Can't read maxAgeFallback from Manifest: " + thA.getMessage(), thA);
            objI = Long.valueOf(j);
        }
        return ((Number) objI).longValue();
    }
}
