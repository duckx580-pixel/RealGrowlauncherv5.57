package q0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements List, fh.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f13638i;

    public c(f fVar) {
        this.f13638i = fVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f13638i.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        f fVar = this.f13638i;
        return fVar.e(fVar.f13646s, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f13638i.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13638i.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        f fVar = this.f13638i;
        fVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!fVar.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        qd.a.b(i10, this);
        return this.f13638i.f13644i[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f13638i.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f13638i.l();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        f fVar = this.f13638i;
        int i10 = fVar.f13646s;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        Object[] objArr = fVar.f13644i;
        while (!l.a(obj, objArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13638i.n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f13638i;
        fVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = fVar.f13646s;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fVar.n(it.next());
        }
        return i10 != fVar.f13646s;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f13638i;
        int i10 = fVar.f13646s;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(fVar.f13644i[i11])) {
                fVar.o(i11);
            }
        }
        return i10 != fVar.f13646s;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        qd.a.b(i10, this);
        return this.f13638i.q(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f13638i.f13646s;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        qd.a.c(i10, i11, this);
        return new d(i10, i11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f13638i.a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new e(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        qd.a.b(i10, this);
        return this.f13638i.o(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f13638i.e(i10, collection);
    }
}
