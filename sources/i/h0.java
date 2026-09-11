package i;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import s8.o2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Executor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7844i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayDeque f7845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Runnable f7846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f7847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Executor f7848u;

    public h0(Executor executor) {
        this.f7844i = 1;
        this.f7848u = executor;
        this.f7845r = new ArrayDeque();
        this.f7847t = new Object();
    }

    public final void a() {
        switch (this.f7844i) {
            case 0:
                synchronized (this.f7847t) {
                    try {
                        Runnable runnable = (Runnable) this.f7845r.poll();
                        this.f7846s = runnable;
                        if (runnable != null) {
                            ((i0) this.f7848u).execute(runnable);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                Runnable runnable2 = (Runnable) this.f7845r.poll();
                this.f7846s = runnable2;
                if (runnable2 != null) {
                    this.f7848u.execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7844i) {
            case 0:
                synchronized (this.f7847t) {
                    try {
                        this.f7845r.add(new cf.f(5, this, runnable));
                        if (this.f7846s == null) {
                            a();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f7847t) {
                    try {
                        this.f7845r.add(new o2(15, this, runnable));
                        if (this.f7846s == null) {
                            a();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    public h0(i0 i0Var) {
        this.f7844i = 0;
        this.f7847t = new Object();
        this.f7845r = new ArrayDeque();
        this.f7848u = i0Var;
    }
}
