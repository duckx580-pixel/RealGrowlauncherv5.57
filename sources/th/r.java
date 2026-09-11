package th;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oh.k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends c implements k1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f17227t = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f17228s;

    public r(long j, r rVar, int i10) {
        super(rVar);
        this.f17228s = j;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // th.c
    public final boolean c() {
        return f17227t.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f17227t.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i10, ug.h hVar);

    public final void h() {
        if (f17227t.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f17227t;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
