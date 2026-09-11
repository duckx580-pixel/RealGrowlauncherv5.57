package qg;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13915s = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "r");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile eh.a f13916i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Object f13917r;

    @Override // qg.d
    public final Object getValue() {
        Object obj = this.f13917r;
        n nVar = n.f13925a;
        if (obj != nVar) {
            return obj;
        }
        eh.a aVar = this.f13916i;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13915s;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != nVar) {
                }
            }
            this.f13916i = null;
            return objInvoke;
        }
        return this.f13917r;
    }

    public final String toString() {
        return this.f13917r != n.f13925a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
