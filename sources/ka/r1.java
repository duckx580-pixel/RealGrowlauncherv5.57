package ka;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements List, RandomAccess {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f9501i;

    public r1(List list) {
        this.f9501i = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f9501i.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f9501i.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f9501i.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9501i.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f9501i.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f9501i.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f9501i.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f9501i.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f9501i.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f9501i.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f9501i.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f9501i.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f9501i.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f9501i.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f9501i.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f9501i.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        return this.f9501i.set(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f9501i.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return this.f9501i.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f9501i.toArray();
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f9501i.add(i10, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f9501i.addAll(i10, collection);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return this.f9501i.listIterator(i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        return this.f9501i.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f9501i.toArray(objArr);
    }
}
