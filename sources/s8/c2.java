package s8;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends p0 {
    public z1 A;
    public boolean B;
    public final Object C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile z1 f15283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile z1 f15284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z1 f15285v;
    public final ConcurrentHashMap w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Activity f15286x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f15287y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile z1 f15288z;

    public c2(y0 y0Var) {
        super(y0Var);
        this.C = new Object();
        this.w = new ConcurrentHashMap();
    }

    public final String A(Class cls) {
        y0 y0Var = (y0) this.f3470r;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str = length > 0 ? strArrSplit[length - 1] : PredefinedUICustomizationFont.defaultFamily;
        int length2 = str.length();
        y0Var.getClass();
        return length2 > 100 ? str.substring(0, 100) : str;
    }

    public final void B(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((y0) this.f3470r).w.E() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.w.put(activity, new z1(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final z1 C(Activity activity) {
        b8.a0.h(activity);
        z1 z1Var = (z1) this.w.get(activity);
        if (z1Var == null) {
            String strA = A(activity.getClass());
            e3 e3Var = ((y0) this.f3470r).B;
            y0.h(e3Var);
            z1 z1Var2 = new z1(null, strA, e3Var.s0());
            this.w.put(activity, z1Var2);
            z1Var = z1Var2;
        }
        return this.f15288z != null ? this.f15288z : z1Var;
    }

    public final void D(Activity activity, z1 z1Var, boolean z3) {
        z1 z1Var2;
        z1 z1Var3 = this.f15283t == null ? this.f15284u : this.f15283t;
        if (z1Var.f15720b == null) {
            z1Var2 = new z1(z1Var.f15719a, activity != null ? A(activity.getClass()) : null, z1Var.f15721c, z1Var.f15723e, z1Var.f15724f);
        } else {
            z1Var2 = z1Var;
        }
        this.f15284u = this.f15283t;
        this.f15283t = z1Var2;
        ((y0) this.f3470r).D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        x0 x0Var = ((y0) this.f3470r).f15666z;
        y0.k(x0Var);
        x0Var.B(new a2(this, z1Var2, z1Var3, jElapsedRealtime, z3));
    }

    @Override // s8.p0
    public final boolean w() {
        return false;
    }

    public final void x(z1 z1Var, z1 z1Var2, long j, boolean z3, Bundle bundle) {
        boolean z10 = z1Var.f15723e;
        y0 y0Var = (y0) this.f3470r;
        t();
        boolean z11 = false;
        boolean z12 = (z1Var2 != null && z1Var2.f15721c == z1Var.f15721c && f1.e(z1Var2.f15720b, z1Var.f15720b) && f1.e(z1Var2.f15719a, z1Var.f15719a)) ? false : true;
        if (z3 && this.f15285v != null) {
            z11 = true;
        }
        if (z12) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            e3.F(z1Var, bundle2, true);
            if (z1Var2 != null) {
                String str = z1Var2.f15719a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = z1Var2.f15720b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", z1Var2.f15721c);
            }
            if (z11) {
                u2 u2Var = y0Var.A;
                y0.i(u2Var);
                t2 t2Var = u2Var.f15612v;
                long j10 = j - t2Var.f15600b;
                t2Var.f15600b = j;
                if (j10 > 0) {
                    e3 e3Var = y0Var.B;
                    y0.h(e3Var);
                    e3Var.D(bundle2, j10);
                }
            }
            if (!y0Var.w.E()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z10 ? "auto" : "app";
            y0Var.D.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z10) {
                long j11 = z1Var.f15724f;
                if (j11 != 0) {
                    jCurrentTimeMillis = j11;
                }
            }
            v1 v1Var = y0Var.F;
            y0.i(v1Var);
            v1Var.B(jCurrentTimeMillis, bundle2, str3, "_vs");
        }
        if (z11) {
            y(this.f15285v, true, j);
        }
        this.f15285v = z1Var;
        if (z10) {
            this.A = z1Var;
        }
        l2 l2VarS = y0Var.s();
        l2VarS.t();
        l2VarS.u();
        l2VarS.F(new androidx.fragment.app.d(28, l2VarS, z1Var));
    }

    public final void y(z1 z1Var, boolean z3, long j) {
        y0 y0Var = (y0) this.f3470r;
        u uVarM = y0Var.m();
        y0Var.D.getClass();
        uVarM.w(SystemClock.elapsedRealtime());
        boolean z10 = z1Var != null && z1Var.f15722d;
        u2 u2Var = y0Var.A;
        y0.i(u2Var);
        if (!u2Var.f15612v.a(z10, z3, j) || z1Var == null) {
            return;
        }
        z1Var.f15722d = false;
    }

    public final z1 z(boolean z3) {
        u();
        t();
        if (!z3) {
            return this.f15285v;
        }
        z1 z1Var = this.f15285v;
        return z1Var != null ? z1Var : this.A;
    }
}
