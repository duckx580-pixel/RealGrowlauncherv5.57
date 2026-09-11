package ck;

import java.util.Iterator;
import s8.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3591i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Iterator f3592r;

    public k(p pVar) {
        this.f3592r = pVar.f15530i.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3591i) {
        }
        return this.f3592r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3591i) {
            case 0:
                return this.f3592r.next();
            default:
                return (String) this.f3592r.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3591i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public k(Iterator it) {
        this.f3592r = it;
    }
}
