package t0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object[] f16257i = k.f16252e.f16256d;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16259s;

    public final void a(Object[] objArr, int i10, int i11) {
        this.f16257i = objArr;
        this.f16258r = i10;
        this.f16259s = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16259s < this.f16258r;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
