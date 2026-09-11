package oh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements eh.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12907s = AtomicIntegerFieldUpdater.newUpdater(q1.class, "_state");
    private volatile int _state;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Thread f12908i = Thread.currentThread();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g0 f12909r;

    public q1(w0 w0Var) {
    }

    public static void b(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void a() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12907s;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                g0 g0Var = this.f12909r;
                if (g0Var != null) {
                    g0Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12907s;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    b(i10);
                    throw null;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 2)) {
                this.f12908i.interrupt();
                atomicIntegerFieldUpdater.set(this, 3);
                break;
            }
        }
        return qg.o.f13926a;
    }
}
