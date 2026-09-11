package s0;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ListIterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15012i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15013r;

    public a(int i10, int i11) {
        this.f15012i = i10;
        this.f15013r = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f15012i < this.f15013r;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15012i > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15012i;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15012i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
