package s8;

import android.os.SystemClock;
import android.util.Pair;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends x2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f15504u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o0 f15505v;
    public final o0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0 f15506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0 f15507y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o0 f15508z;

    public n2(a3 a3Var) {
        super(a3Var);
        this.f15504u = new HashMap();
        r0 r0Var = ((y0) this.f3470r).f15664x;
        y0.h(r0Var);
        this.f15505v = new o0(r0Var, "last_delete_stale", 0L);
        r0 r0Var2 = ((y0) this.f3470r).f15664x;
        y0.h(r0Var2);
        this.w = new o0(r0Var2, "backoff", 0L);
        r0 r0Var3 = ((y0) this.f3470r).f15664x;
        y0.h(r0Var3);
        this.f15506x = new o0(r0Var3, "last_upload", 0L);
        r0 r0Var4 = ((y0) this.f3470r).f15664x;
        y0.h(r0Var4);
        this.f15507y = new o0(r0Var4, "last_upload_attempt", 0L);
        r0 r0Var5 = ((y0) this.f3470r).f15664x;
        y0.h(r0Var5);
        this.f15508z = new o0(r0Var5, "midnight_offset", 0L);
    }

    public final Pair x(String str) {
        m2 m2Var;
        t();
        y0 y0Var = (y0) this.f3470r;
        y0Var.D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f15504u;
        m2 m2Var2 = (m2) map.get(str);
        if (m2Var2 != null && jElapsedRealtime < m2Var2.f15485c) {
            return new Pair(m2Var2.f15483a, Boolean.valueOf(m2Var2.f15484b));
        }
        long jZ = y0Var.w.z(str, z.f15669b) + jElapsedRealtime;
        try {
            b8.n0 n0VarA = u7.a.a(y0Var.f15658i);
            boolean z3 = n0VarA.f2841c;
            String str2 = n0VarA.f2840b;
            m2Var = str2 != null ? new m2(jZ, str2, z3) : new m2(jZ, PredefinedUICustomizationFont.defaultFamily, z3);
        } catch (Exception e8) {
            i0 i0Var = y0Var.f15665y;
            y0.k(i0Var);
            i0Var.D.c("Unable to get advertising id", e8);
            m2Var = new m2(jZ, PredefinedUICustomizationFont.defaultFamily, false);
        }
        map.put(str, m2Var);
        return new Pair(m2Var.f15483a, Boolean.valueOf(m2Var.f15484b));
    }

    public final String y(String str, boolean z3) {
        t();
        String str2 = z3 ? (String) x(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestA = e3.A();
        if (messageDigestA == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestA.digest(str2.getBytes())));
    }

    @Override // s8.x2
    public final void w() {
    }
}
