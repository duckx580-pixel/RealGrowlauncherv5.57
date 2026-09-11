package t1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Collection, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f16266i = new LinkedHashSet();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f16266i.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f16266i.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16266i.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f16266i.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f16266i.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f16266i.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f16266i.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f16266i.remove(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f16266i.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f16266i.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
