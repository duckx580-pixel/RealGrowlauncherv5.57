package s8;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f15634i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final BlockingQueue f15635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15636s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0 f15637t;

    public w0(x0 x0Var, String str, BlockingQueue blockingQueue) {
        this.f15637t = x0Var;
        b8.a0.h(blockingQueue);
        this.f15634i = new Object();
        this.f15635r = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f15637t.f15644z) {
            try {
                if (!this.f15636s) {
                    this.f15637t.A.release();
                    this.f15637t.f15644z.notifyAll();
                    x0 x0Var = this.f15637t;
                    if (this == x0Var.f15639t) {
                        x0Var.f15639t = null;
                    } else if (this == x0Var.f15640u) {
                        x0Var.f15640u = null;
                    } else {
                        i0 i0Var = ((y0) x0Var.f3470r).f15665y;
                        y0.k(i0Var);
                        i0Var.w.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f15636s = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z3 = false;
        while (!z3) {
            try {
                this.f15637t.A.acquire();
                z3 = true;
            } catch (InterruptedException e8) {
                i0 i0Var = ((y0) this.f15637t.f3470r).f15665y;
                y0.k(i0Var);
                i0Var.f15413z.c(String.valueOf(getName()).concat(" was interrupted"), e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                v0 v0Var = (v0) this.f15635r.poll();
                if (v0Var != null) {
                    Process.setThreadPriority(true != v0Var.f15623r ? 10 : threadPriority);
                    v0Var.run();
                } else {
                    synchronized (this.f15634i) {
                        if (this.f15635r.peek() == null) {
                            try {
                                this.f15634i.wait(30000L);
                            } catch (InterruptedException e10) {
                                i0 i0Var2 = ((y0) this.f15637t.f3470r).f15665y;
                                y0.k(i0Var2);
                                i0Var2.f15413z.c(String.valueOf(getName()).concat(" was interrupted"), e10);
                            }
                        }
                    }
                    synchronized (this.f15637t.f15644z) {
                        if (this.f15635r.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
