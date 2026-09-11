package s8;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.f7;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2 f15601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u2 f15602d;

    public t2(u2 u2Var) {
        this.f15602d = u2Var;
        y0 y0Var = (y0) u2Var.f3470r;
        this.f15601c = new s2(this, y0Var, 0);
        y0Var.D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f15599a = jElapsedRealtime;
        this.f15600b = jElapsedRealtime;
    }

    public final boolean a(boolean z3, boolean z10, long j) {
        u2 u2Var = this.f15602d;
        u2Var.t();
        u2Var.u();
        ((f7) e7.f3767r.f3768i.a()).getClass();
        y0 y0Var = (y0) u2Var.f3470r;
        if (!y0Var.w.C(null, z.f15672c0)) {
            r0 r0Var = y0Var.f15664x;
            y0.h(r0Var);
            o0 o0Var = r0Var.E;
            y0Var.D.getClass();
            o0Var.b(System.currentTimeMillis());
        } else if (y0Var.d()) {
            r0 r0Var2 = y0Var.f15664x;
            y0.h(r0Var2);
            o0 o0Var2 = r0Var2.E;
            y0Var.D.getClass();
            o0Var2.b(System.currentTimeMillis());
        }
        long j10 = j - this.f15599a;
        if (!z3 && j10 < 1000) {
            i0 i0Var = y0Var.f15665y;
            y0.k(i0Var);
            i0Var.E.c("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j10));
            return false;
        }
        if (!z10) {
            j10 = j - this.f15600b;
            this.f15600b = j;
        }
        i0 i0Var2 = y0Var.f15665y;
        y0.k(i0Var2);
        i0Var2.E.c("Recording user engagement, ms", Long.valueOf(j10));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        boolean zE = y0Var.w.E();
        c2 c2Var = y0Var.E;
        y0.i(c2Var);
        e3.F(c2Var.z(!zE), bundle, true);
        if (!z10) {
            v1 v1Var = y0Var.F;
            y0.i(v1Var);
            v1Var.A("auto", "_e", bundle);
        }
        this.f15599a = j;
        s2 s2Var = this.f15601c;
        s2Var.a();
        s2Var.c(3600000L);
        return true;
    }
}
