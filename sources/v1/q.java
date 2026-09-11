package v1;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements List, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18468i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f18470s;

    public q(r rVar, int i10, int i11) {
        this.f18470s = rVar;
        this.f18468i = i10;
        this.f18469r = i11;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof a1.m) && indexOf((a1.m) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((a1.m) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj = this.f18470s.f18471i[i10 + this.f18468i];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
        return (a1.m) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof a1.m)) {
            return -1;
        }
        a1.m mVar = (a1.m) obj;
        int i10 = this.f18468i;
        int i11 = this.f18469r;
        if (i10 <= i11) {
            int i12 = i10;
            while (!kotlin.jvm.internal.l.a(this.f18470s.f18471i[i12], mVar)) {
                if (i12 != i11) {
                    i12++;
                }
            }
            return i12 - i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f18468i;
        return new sg.a(this.f18470s, i10, i10, this.f18469r);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof a1.m)) {
            return -1;
        }
        a1.m mVar = (a1.m) obj;
        int i10 = this.f18469r;
        int i11 = this.f18468i;
        if (i11 <= i10) {
            while (!kotlin.jvm.internal.l.a(this.f18470s.f18471i[i10], mVar)) {
                if (i10 != i11) {
                    i10--;
                }
            }
            return i10 - i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i10 = this.f18468i;
        return new sg.a(this.f18470s, i10, i10, this.f18469r);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f18469r - this.f18468i;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f18468i;
        return new q(this.f18470s, i10 + i12, i12 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f18468i;
        int i12 = this.f18469r;
        return new sg.a(this.f18470s, i10 + i11, i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }
}
