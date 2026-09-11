package rh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends sh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14741a = AtomicReferenceFieldUpdater.newUpdater(i1.class, Object.class, "_state");
    private volatile Object _state;

    @Override // sh.d
    public final boolean a(sh.b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14741a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, w0.f14841b);
        return true;
    }

    @Override // sh.d
    public final ug.c[] b(sh.b bVar) {
        f14741a.set(this, null);
        return sh.c.f15798a;
    }
}
