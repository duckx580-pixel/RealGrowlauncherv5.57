package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements ListIterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListIterator f1568i;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1568i.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1568i.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f1568i.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1568i.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f1568i.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1568i.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
