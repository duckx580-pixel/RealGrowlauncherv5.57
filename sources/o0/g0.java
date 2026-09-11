package o0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r1 f12422i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12425t;

    public g0(r1 r1Var, int i10, int i11) {
        this.f12422i = r1Var;
        this.f12423r = i11;
        this.f12424s = i10;
        this.f12425t = r1Var.w;
        if (r1Var.f12564v) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12424s < this.f12423r;
    }

    @Override // java.util.Iterator
    public final Object next() {
        r1 r1Var = this.f12422i;
        int i10 = r1Var.w;
        int i11 = this.f12425t;
        if (i10 != i11) {
            throw new ConcurrentModificationException();
        }
        int i12 = this.f12424s;
        this.f12424s = p.i(r1Var.f12559i, i12) + i12;
        return new s1(r1Var, i12, i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
