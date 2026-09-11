package k1;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import s8.e2;
import zc.a3;
import zc.b1;
import zc.c1;
import zc.c5;
import zc.f1;
import zc.i3;
import zc.j3;
import zc.p4;
import zc.v0;
import zc.w0;
import zc.y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8968e;

    public a(a3 a3Var, e2 e2Var) {
        this.f8965b = 1;
        this.f8968e = new y0();
        this.f8966c = a3Var;
        this.f8967d = e2Var;
    }

    public v0 a(b1 b1Var, String str) {
        f1 f1VarD = ((a3) this.f8966c).d();
        v0 v0Var = new v0();
        v0Var.f21176h = a3.f20710f;
        v0Var.f21172d = b1Var;
        v0Var.f21173e = str;
        if (c5.f20751a) {
            v0Var.f21174f = Long.valueOf(c5.b());
            v0Var.f21175g = Long.valueOf(System.currentTimeMillis());
        } else {
            v0Var.f21174f = Long.valueOf(System.currentTimeMillis());
            v0Var.f21177i = Long.valueOf(SystemClock.elapsedRealtime());
        }
        v0Var.f21178k = f1VarD.f20822s;
        v0Var.f21179l = f1VarD.f20823t;
        v0Var.f21180m = f1VarD.f20824u;
        return v0Var;
    }

    public void b(String str, String str2, int i10, long j, long j10, HashMap map) {
        v0 v0VarA = a(b1.USAGES, str);
        v0VarA.f21191y = str2;
        v0VarA.f21192z = Integer.valueOf(i10);
        v0VarA.A = Long.valueOf(j);
        v0VarA.f21171c = Long.valueOf(j10);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                v0VarA.f21190x.add(new c1((String) entry.getKey(), (Long) entry.getValue(), p4.f21062u));
            }
        }
        c(v0VarA);
    }

    public void c(v0 v0Var) {
        synchronized (this) {
            try {
                if (v0Var.f21172d != b1.USAGES) {
                    int i10 = this.f8965b;
                    this.f8965b = i10 + 1;
                    v0Var.f21182o = Integer.valueOf(i10);
                    y0 y0Var = (y0) this.f8968e;
                    if (y0Var.f21287c != null) {
                        v0Var.f21183p = y0Var.I();
                    }
                    y0 y0Var2 = (y0) this.f8968e;
                    y0Var2.f21287c = v0Var.f21172d;
                    y0Var2.f21288d = v0Var.f21173e;
                    y0Var2.f21289e = v0Var.f21188u;
                }
                e2 e2Var = (e2) this.f8967d;
                w0 w0VarI = v0Var.I();
                try {
                    ((j3) e2Var.f15318r).c(w0VarI);
                    if (((zc.c0) e2Var.f15321u) == null) {
                        ((j3) e2Var.f15318r).flush();
                        return;
                    }
                    if (!i3.f20898c && w0VarI.E == b1.CUSTOM) {
                        e2Var.c(false);
                        return;
                    }
                    e2Var.c(true);
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a() {
        this.f8964a = 0L;
        this.f8965b = 0;
        this.f8968e = new i1.b();
    }
}
