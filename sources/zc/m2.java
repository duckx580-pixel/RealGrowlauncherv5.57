package zc;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n2 f20999i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f21000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f21001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f21002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f21003u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map f21004v;

    public m2(n2 n2Var, int i10, long j, String str, String str2, HashMap map) {
        this.f20999i = n2Var;
        this.f21000r = i10;
        this.f21001s = j;
        this.f21002t = str;
        this.f21003u = str2;
        this.f21004v = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n2 n2Var = this.f20999i;
        try {
            int i10 = this.f21000r;
            if (i10 == 1) {
                n2.a(n2Var, this.f21001s);
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                n2.b(n2Var, this.f21001s, this.f21002t, this.f21003u, this.f21004v);
            } else {
                if (n2Var.f21018c != null) {
                    r2.a(n2Var.f21018c);
                    n2Var.f21018c = null;
                }
                n2Var.f21016a.delete();
                n2Var.f21021f = 0L;
                n2Var.f21020e = 0L;
            }
        } catch (Throwable unused) {
            if (n2Var.f21018c != null) {
                r2.a(n2Var.f21018c);
                n2Var.f21018c = null;
            }
            n2Var.f21016a.delete();
            n2Var.f21021f = 0L;
            n2Var.f21020e = 0L;
        }
    }
}
