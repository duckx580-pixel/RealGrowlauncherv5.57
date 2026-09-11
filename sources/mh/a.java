package mh;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f11717a;

    public a(i iVar) {
        this.f11717a = new AtomicReference(iVar);
    }

    @Override // mh.i
    public final Iterator iterator() {
        i iVar = (i) this.f11717a.getAndSet(null);
        if (iVar != null) {
            return iVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
