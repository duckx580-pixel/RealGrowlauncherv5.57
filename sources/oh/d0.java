package oh;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends th.q {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12855u = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_decision");
    private volatile int _decision;

    @Override // th.q, oh.f1
    public final void s(Object obj) {
        x(obj);
    }

    @Override // th.q, oh.f1
    public final void x(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f12855u;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                th.a.h(x.u(obj), qd.a.j(this.f17226t));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
