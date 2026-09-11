package q0;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ListIterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13642i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13643r;

    public e(int i10, List list) {
        this.f13642i = list;
        this.f13643r = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f13642i.add(this.f13643r, obj);
        this.f13643r++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13643r < this.f13642i.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13643r > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f13643r;
        this.f13643r = i10 + 1;
        return this.f13642i.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13643r;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f13643r - 1;
        this.f13643r = i10;
        return this.f13642i.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13643r - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f13643r - 1;
        this.f13643r = i10;
        this.f13642i.remove(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f13642i.set(this.f13643r, obj);
    }
}
