package ug;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c, wg.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17990r = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f17991i;
    private volatile Object result;

    public j(c cVar, vg.a aVar) {
        this.f17991i = cVar;
        this.result = aVar;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        vg.a aVar = vg.a.f18664r;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17990r;
            vg.a aVar2 = vg.a.f18663i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return vg.a.f18663i;
        }
        if (obj == vg.a.f18665s) {
            return vg.a.f18663i;
        }
        if (obj instanceof qg.h) {
            throw ((qg.h) obj).f13913i;
        }
        return obj;
    }

    @Override // wg.d
    public final wg.d getCallerFrame() {
        c cVar = this.f17991i;
        if (cVar instanceof wg.d) {
            return (wg.d) cVar;
        }
        return null;
    }

    @Override // ug.c
    public final h getContext() {
        return this.f17991i.getContext();
    }

    @Override // ug.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            vg.a aVar = vg.a.f18664r;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17990r;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            vg.a aVar2 = vg.a.f18663i;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f17990r;
            vg.a aVar3 = vg.a.f18665s;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f17991i.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f17991i;
    }
}
