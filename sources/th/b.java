package th;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17197a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f17191a;

    @Override // th.n
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17197a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        lc.n nVar = a.f17191a;
        if (obj2 == nVar) {
            lc.n nVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == nVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, nVar, nVarC)) {
                        obj2 = nVarC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != nVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract lc.n c(Object obj);
}
