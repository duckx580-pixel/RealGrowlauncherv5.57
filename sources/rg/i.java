package rg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Collection, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object[] f14657i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f14658r;

    public i(Object[] objArr, boolean z3) {
        this.f14657i = objArr;
        this.f14658r = z3;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return k.o0(this.f14657i, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!k.o0(this.f14657i, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f14657i.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return kotlin.jvm.internal.l.i(this.f14657i);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f14657i.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f14657i;
        if (this.f14658r && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
        return objArrCopyOf;
    }
}
