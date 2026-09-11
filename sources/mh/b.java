package mh;

import java.util.Iterator;
import rg.v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11718i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Iterator f11719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11720s;

    public b(Iterator it) {
        kotlin.jvm.internal.l.f("iterator", it);
        this.f11719r = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f11718i) {
            case 0:
                break;
            default:
                return this.f11719r.hasNext();
        }
        while (true) {
            int i10 = this.f11720s;
            it = this.f11719r;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f11720s--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f11718i) {
            case 0:
                break;
            default:
                int i10 = this.f11720s;
                this.f11720s = i10 + 1;
                if (i10 >= 0) {
                    return new v(i10, this.f11719r.next());
                }
                sb.c.N();
                throw null;
        }
        while (true) {
            int i11 = this.f11720s;
            it = this.f11719r;
            if (i11 > 0 && it.hasNext()) {
                it.next();
                this.f11720s--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11718i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f11719r = cVar.f11721a.iterator();
        this.f11720s = cVar.f11722b;
    }
}
