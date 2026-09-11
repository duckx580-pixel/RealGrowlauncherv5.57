package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f16998e = sb.c.D("googleplay", "playstore", "googleplaystore");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg.k f16999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qg.k f17000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f17001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f17002d;

    public q1(a0 a0Var, b0 b0Var) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, a0Var);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, b0Var);
        this.f17002d = a0Var;
        this.f17001c = b0Var;
        this.f17000b = android.support.v4.media.session.b.q(new o1(this, 1));
        this.f16999a = android.support.v4.media.session.b.q(new o1(this, 0));
    }

    public static String a() {
        int i10 = p1.f16956a[t.g.c(3)];
        if (i10 == 1) {
            return "appsflyersdk.com";
        }
        if (i10 == 2 || i10 == 3) {
            return PredefinedUICustomizationFont.defaultFamily;
        }
        throw new a2.d();
    }

    public final String b() {
        int i10 = p1.f16956a[t.g.c(3)];
        if (i10 == 1) {
            return (String) this.f16999a.getValue();
        }
        if (i10 == 2 || i10 == 3) {
            return PredefinedUICustomizationFont.defaultFamily;
        }
        throw new a2.d();
    }
}
