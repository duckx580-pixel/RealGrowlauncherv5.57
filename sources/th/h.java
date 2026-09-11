package th;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oh.c0;
import oh.g0;
import oh.s1;
import oh.z;
import s8.o2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends oh.s implements c0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f17207x = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers");
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final oh.s f17208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f17209t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c0 f17210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f17211v;
    public final Object w;

    /* JADX WARN: Multi-variable type inference failed */
    public h(oh.s sVar, int i10) {
        this.f17208s = sVar;
        this.f17209t = i10;
        c0 c0Var = sVar instanceof c0 ? (c0) sVar : null;
        this.f17210u = c0Var == null ? z.f12942a : c0Var;
        this.f17211v = new j();
        this.w = new Object();
    }

    @Override // oh.s
    public final void C(ug.h hVar, Runnable runnable) {
        Runnable runnableC0;
        this.f17211v.a(runnable);
        if (f17207x.get(this) >= this.f17209t || !d0() || (runnableC0 = c0()) == null) {
            return;
        }
        this.f17208s.C(this, new o2(13, this, runnableC0));
    }

    @Override // oh.s
    public final void F(ug.h hVar, Runnable runnable) {
        Runnable runnableC0;
        this.f17211v.a(runnable);
        if (f17207x.get(this) >= this.f17209t || !d0() || (runnableC0 = c0()) == null) {
            return;
        }
        this.f17208s.F(this, new o2(13, this, runnableC0));
    }

    @Override // oh.s
    public final oh.s W(int i10) {
        a.a(1);
        return 1 >= this.f17209t ? this : super.W(1);
    }

    public final Runnable c0() {
        while (true) {
            Runnable runnable = (Runnable) this.f17211v.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.w) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17207x;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f17211v.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean d0() {
        synchronized (this.w) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17207x;
            if (atomicIntegerFieldUpdater.get(this) >= this.f17209t) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // oh.c0
    public final void h(long j, oh.f fVar) {
        this.f17210u.h(j, fVar);
    }

    @Override // oh.c0
    public final g0 o(long j, s1 s1Var, ug.h hVar) {
        return this.f17210u.o(j, s1Var, hVar);
    }
}
