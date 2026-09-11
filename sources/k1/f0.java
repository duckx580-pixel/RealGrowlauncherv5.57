package k1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9035i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Iterator f9036r;

    public f0(t0.e eVar) {
        t0.l[] lVarArr = new t0.l[8];
        for (int i10 = 0; i10 < 8; i10++) {
            lVarArr[i10] = new t0.n(this);
        }
        this.f9036r = new t0.f(eVar, lVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9035i) {
            case 0:
                return this.f9036r.hasNext();
            default:
                return ((t0.f) this.f9036r).f16238s;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9035i) {
            case 0:
                return (i0) this.f9036r.next();
            default:
                return (Map.Entry) ((t0.f) this.f9036r).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9035i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((t0.f) this.f9036r).remove();
                return;
        }
    }

    public f0(g0 g0Var) {
        this.f9036r = g0Var.f9048z.iterator();
    }
}
