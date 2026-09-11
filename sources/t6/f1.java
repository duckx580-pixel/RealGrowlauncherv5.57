package t6;

import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16794i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g1 f16795r;

    public /* synthetic */ f1() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16794i) {
            case 0:
                synchronized (this.f16795r.f16809b) {
                    try {
                        d1 d1Var = (d1) this.f16795r.f16809b.pollFirst();
                        if (d1Var == null) {
                            return;
                        }
                        this.f16795r.f16813f.add(d1Var);
                        long jA = d1Var.a();
                        c1 c1Var = new c1(Thread.currentThread());
                        if (jA > 0) {
                            this.f16795r.f16816i.schedule(c1Var, jA);
                        }
                        g1 g1Var = this.f16795r;
                        ExecutorService executorService = g1Var.f16814g;
                        f1 f1Var = new f1();
                        f1Var.f16795r = g1Var;
                        executorService.execute(f1Var);
                        if (!this.f16795r.f16809b.isEmpty()) {
                            g1 g1Var2 = this.f16795r;
                            g1Var2.j.submit(new f1(g1Var2));
                        }
                        try {
                            s6.h.f15212b.b(6, "starting task execution: ".concat(String.valueOf(d1Var)));
                            n1 n1VarCall = d1Var.call();
                            c1Var.cancel();
                            g1 g1Var3 = this.f16795r;
                            g1Var3.f16814g.execute(new a8.h1((Object) g1Var3, (Object) d1Var, (Serializable) n1VarCall, 20));
                            return;
                        } catch (InterruptedIOException | InterruptedException unused) {
                            s6.h.f15212b.b(6, "task was interrupted: ".concat(String.valueOf(d1Var)));
                            n1 n1Var = n1.f16936s;
                            d1Var.w = n1Var;
                            g1 g1Var4 = this.f16795r;
                            g1Var4.f16814g.execute(new a8.h1((Object) g1Var4, (Object) d1Var, (Serializable) n1Var, 20));
                            return;
                        } catch (Throwable unused2) {
                            c1Var.cancel();
                            g1 g1Var5 = this.f16795r;
                            g1Var5.f16814g.execute(new a8.h1((Object) g1Var5, (Object) d1Var, (Serializable) n1.f16934i, 20));
                            return;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                for (i1 i1Var : this.f16795r.f16815h) {
                }
                return;
        }
    }

    public f1(g1 g1Var) {
        this.f16795r = g1Var;
    }
}
