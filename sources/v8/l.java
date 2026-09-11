package v8;

import a8.w0;
import b8.a0;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import t6.e1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18636a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f18637b = new w0(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f18639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f18641f;

    @Override // com.google.android.gms.tasks.Task
    public final l a(Executor executor, e eVar) {
        this.f18637b.g(new k(executor, eVar));
        m();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception b() {
        Exception exc;
        synchronized (this.f18636a) {
            exc = this.f18641f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object c() {
        Object obj;
        synchronized (this.f18636a) {
            try {
                a0.j("Task is not yet complete", this.f18638c);
                if (this.f18639d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f18641f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f18640e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object d() {
        Object obj;
        synchronized (this.f18636a) {
            try {
                a0.j("Task is not yet complete", this.f18638c);
                if (this.f18639d) {
                    throw new CancellationException("Task is already canceled.");
                }
                if (z7.e.class.isInstance(this.f18641f)) {
                    throw ((Throwable) z7.e.class.cast(this.f18641f));
                }
                Exception exc = this.f18641f;
                if (exc != null) {
                    throw new f(exc);
                }
                obj = this.f18640e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean e() {
        boolean z3;
        synchronized (this.f18636a) {
            try {
                z3 = false;
                if (this.f18638c && !this.f18639d && this.f18641f == null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // com.google.android.gms.tasks.Task
    public final l f(Executor executor, g gVar) {
        l lVar = new l();
        this.f18637b.g(new k(executor, gVar, lVar, 6));
        m();
        return lVar;
    }

    public final l g(Executor executor, a aVar) {
        l lVar = new l();
        this.f18637b.g(new k(executor, aVar, lVar, 0));
        m();
        return lVar;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f18636a) {
            z3 = this.f18638c;
        }
        return z3;
    }

    public final void i(Exception exc) {
        a0.i("Exception must not be null", exc);
        synchronized (this.f18636a) {
            l();
            this.f18638c = true;
            this.f18641f = exc;
        }
        this.f18637b.h(this);
    }

    public final void j(Object obj) {
        synchronized (this.f18636a) {
            l();
            this.f18638c = true;
            this.f18640e = obj;
        }
        this.f18637b.h(this);
    }

    public final void k() {
        synchronized (this.f18636a) {
            try {
                if (this.f18638c) {
                    return;
                }
                this.f18638c = true;
                this.f18639d = true;
                this.f18637b.h(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        if (this.f18638c) {
            int i10 = e1.f16772i;
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excB = b();
            String strConcat = excB != null ? "failure" : e() ? "result ".concat(String.valueOf(c())) : this.f18639d ? "cancellation" : "unknown issue";
        }
    }

    public final void m() {
        synchronized (this.f18636a) {
            try {
                if (this.f18638c) {
                    this.f18637b.h(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
