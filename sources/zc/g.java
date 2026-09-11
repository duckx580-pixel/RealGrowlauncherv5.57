package zc;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedList f20834i;

    public g(LinkedList linkedList) {
        this.f20834i = linkedList;
    }

    @Override // zc.h
    public final Object C(int i10) {
        return this.f20834i.get(i10);
    }

    @Override // zc.h
    public final void K(int i10) {
        b5.e(this.f20834i, i10);
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        return this.f20834i.add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f20834i.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f20834i.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20834i.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f20834i.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        Object objPeek = peek();
        if (objPeek != null) {
            return objPeek;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return this.f20834i.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f20834i.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f20834i.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f20834i.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f20834i.add(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        LinkedList linkedList = this.f20834i;
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.get(0);
    }

    @Override // java.util.Queue
    public final Object poll() {
        LinkedList linkedList = this.f20834i;
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.remove(0);
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objPoll = poll();
        if (objPoll != null) {
            return objPoll;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f20834i.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f20834i.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f20834i.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f20834i.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f20834i.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f20834i.toArray(objArr);
    }
}
