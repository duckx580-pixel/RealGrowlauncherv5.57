package v2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jj.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18510h;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f18506d = atomicReferenceFieldUpdater;
        this.f18507e = atomicReferenceFieldUpdater2;
        this.f18508f = atomicReferenceFieldUpdater3;
        this.f18509g = atomicReferenceFieldUpdater4;
        this.f18510h = atomicReferenceFieldUpdater5;
    }

    @Override // jj.l
    public final void E(f fVar, f fVar2) {
        this.f18507e.lazySet(fVar, fVar2);
    }

    @Override // jj.l
    public final void F(f fVar, Thread thread) {
        this.f18506d.lazySet(fVar, thread);
    }

    @Override // jj.l
    public final boolean f(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18509g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // jj.l
    public final boolean g(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18510h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // jj.l
    public final boolean h(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18508f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
