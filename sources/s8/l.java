package s8;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile com.google.android.gms.internal.measurement.f0 f15460d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f15461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.d f15462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f15463c;

    public l(e1 e1Var) {
        b8.a0.h(e1Var);
        this.f15461a = e1Var;
        this.f15462b = new androidx.fragment.app.d(22, this, e1Var);
    }

    public final void a() {
        this.f15463c = 0L;
        d().removeCallbacks(this.f15462b);
    }

    public abstract void b();

    public final void c(long j) {
        a();
        if (j >= 0) {
            this.f15461a.e().getClass();
            this.f15463c = System.currentTimeMillis();
            if (d().postDelayed(this.f15462b, j)) {
                return;
            }
            this.f15461a.c().w.c("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final Handler d() {
        com.google.android.gms.internal.measurement.f0 f0Var;
        if (f15460d != null) {
            return f15460d;
        }
        synchronized (l.class) {
            try {
                if (f15460d == null) {
                    f15460d = new com.google.android.gms.internal.measurement.f0(this.f15461a.j().getMainLooper(), 0);
                }
                f0Var = f15460d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f0Var;
    }
}
