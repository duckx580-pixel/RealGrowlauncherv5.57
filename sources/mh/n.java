package mh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Iterator f11739i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f11740r;

    public n(h hVar) {
        this.f11740r = hVar;
        this.f11739i = ((i) hVar.f11732b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11739i.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((eh.c) this.f11740r.f11733c).invoke(this.f11739i.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
