package s8;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends d1 {
    public static final AtomicLong B = new AtomicLong(Long.MIN_VALUE);
    public final Semaphore A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w0 f15639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w0 f15640u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final PriorityBlockingQueue f15641v;
    public final LinkedBlockingQueue w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u0 f15642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u0 f15643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f15644z;

    public x0(y0 y0Var) {
        super(y0Var);
        this.f15644z = new Object();
        this.A = new Semaphore(2);
        this.f15641v = new PriorityBlockingQueue();
        this.w = new LinkedBlockingQueue();
        this.f15642x = new u0(this, "Thread death: Uncaught exception on worker thread");
        this.f15643y = new u0(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(Runnable runnable) {
        v();
        v0 v0Var = new v0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f15644z) {
            try {
                this.w.add(v0Var);
                w0 w0Var = this.f15640u;
                if (w0Var == null) {
                    w0 w0Var2 = new w0(this, "Measurement Network", this.w);
                    this.f15640u = w0Var2;
                    w0Var2.setUncaughtExceptionHandler(this.f15643y);
                    this.f15640u.start();
                } else {
                    synchronized (w0Var.f15634i) {
                        w0Var.f15634i.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B(Runnable runnable) {
        v();
        E(new v0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void C(Runnable runnable) {
        v();
        E(new v0(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean D() {
        return Thread.currentThread() == this.f15639t;
    }

    public final void E(v0 v0Var) {
        synchronized (this.f15644z) {
            try {
                this.f15641v.add(v0Var);
                w0 w0Var = this.f15639t;
                if (w0Var == null) {
                    w0 w0Var2 = new w0(this, "Measurement Worker", this.f15641v);
                    this.f15639t = w0Var2;
                    w0Var2.setUncaughtExceptionHandler(this.f15642x);
                    this.f15639t.start();
                } else {
                    synchronized (w0Var.f15634i) {
                        w0Var.f15634i.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // cd.c
    public final void t() {
        if (Thread.currentThread() != this.f15639t) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // s8.d1
    public final boolean u() {
        return false;
    }

    public final void x() {
        if (Thread.currentThread() != this.f15640u) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object y(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            x0 x0Var = ((y0) this.f3470r).f15666z;
            y0.k(x0Var);
            x0Var.B(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                i0 i0Var = ((y0) this.f3470r).f15665y;
                y0.k(i0Var);
                i0Var.f15413z.b("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            i0 i0Var2 = ((y0) this.f3470r).f15665y;
            y0.k(i0Var2);
            i0Var2.f15413z.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final v0 z(Callable callable) {
        v();
        v0 v0Var = new v0(this, callable, false);
        if (Thread.currentThread() != this.f15639t) {
            E(v0Var);
            return v0Var;
        }
        if (!this.f15641v.isEmpty()) {
            i0 i0Var = ((y0) this.f3470r).f15665y;
            y0.k(i0Var);
            i0Var.f15413z.b("Callable skipped the worker queue.");
        }
        v0Var.run();
        return v0Var;
    }
}
