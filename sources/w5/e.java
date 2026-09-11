package w5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends sb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f19084e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f19080a = atomicReferenceFieldUpdater;
        this.f19081b = atomicReferenceFieldUpdater2;
        this.f19082c = atomicReferenceFieldUpdater3;
        this.f19083d = atomicReferenceFieldUpdater4;
        this.f19084e = atomicReferenceFieldUpdater5;
    }

    @Override // sb.c
    public final void H(h hVar, h hVar2) {
        this.f19081b.lazySet(hVar, hVar2);
    }

    @Override // sb.c
    public final void I(h hVar, Thread thread) {
        this.f19080a.lazySet(hVar, thread);
    }

    @Override // sb.c
    public final boolean k(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19083d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // sb.c
    public final boolean l(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19084e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // sb.c
    public final boolean m(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f19082c;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
