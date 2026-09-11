package y0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements List, fh.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f20034i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f20035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20037t;

    public b0(q qVar, int i10, int i11) {
        this.f20034i = qVar;
        this.f20035r = i10;
        this.f20036s = qVar.n();
        this.f20037t = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i10 = this.f20035r + this.f20037t;
        q qVar = this.f20034i;
        qVar.add(i10, obj);
        this.f20037t++;
        this.f20036s = qVar.n();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f20037t, collection);
    }

    public final void b() {
        if (this.f20034i.n() != this.f20036s) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10;
        s0.c cVar;
        g gVarJ;
        boolean z3;
        if (this.f20037t > 0) {
            b();
            q qVar = this.f20034i;
            int i11 = this.f20035r;
            int i12 = this.f20037t + i11;
            do {
                Object obj = r.f20093a;
                synchronized (obj) {
                    p pVar = qVar.f20092i;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", pVar);
                    p pVar2 = (p) m.i(pVar);
                    i10 = pVar2.f20090d;
                    cVar = pVar2.f20089c;
                }
                kotlin.jvm.internal.l.c(cVar);
                s0.f fVarN = cVar.n();
                fVarN.subList(i11, i12).clear();
                s0.c cVarK = fVarN.k();
                if (kotlin.jvm.internal.l.a(cVarK, cVar)) {
                    break;
                }
                p pVar3 = qVar.f20092i;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", pVar3);
                synchronized (m.f20078b) {
                    gVarJ = m.j();
                    p pVar4 = (p) m.v(pVar3, qVar, gVarJ);
                    synchronized (obj) {
                        int i13 = pVar4.f20090d;
                        if (i13 == i10) {
                            pVar4.f20089c = cVarK;
                            pVar4.f20090d = i13 + 1;
                            z3 = true;
                            pVar4.f20091e++;
                        } else {
                            z3 = false;
                        }
                    }
                }
                m.m(gVarJ, qVar);
            } while (!z3);
            this.f20037t = 0;
            this.f20036s = this.f20034i.n();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        b();
        r.b(i10, this.f20037t);
        return this.f20034i.get(this.f20035r + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i10 = this.f20037t;
        int i11 = this.f20035r;
        Iterator it = gh.a.F(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((rg.w) it).nextInt();
            if (kotlin.jvm.internal.l.a(obj, this.f20034i.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f20037t == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i10 = this.f20037t;
        int i11 = this.f20035r;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (kotlin.jvm.internal.l.a(obj, this.f20034i.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        s0.c cVar;
        g gVarJ;
        boolean z3;
        b();
        q qVar = this.f20034i;
        int i11 = this.f20035r;
        int i12 = this.f20037t + i11;
        int size = qVar.size();
        do {
            Object obj = r.f20093a;
            synchronized (obj) {
                p pVar = qVar.f20092i;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", pVar);
                p pVar2 = (p) m.i(pVar);
                i10 = pVar2.f20090d;
                cVar = pVar2.f20089c;
            }
            kotlin.jvm.internal.l.c(cVar);
            s0.f fVarN = cVar.n();
            fVarN.subList(i11, i12).retainAll(collection);
            s0.c cVarK = fVarN.k();
            if (kotlin.jvm.internal.l.a(cVarK, cVar)) {
                break;
            }
            p pVar3 = qVar.f20092i;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", pVar3);
            synchronized (m.f20078b) {
                gVarJ = m.j();
                p pVar4 = (p) m.v(pVar3, qVar, gVarJ);
                synchronized (obj) {
                    int i13 = pVar4.f20090d;
                    if (i13 == i10) {
                        pVar4.f20089c = cVarK;
                        pVar4.f20090d = i13 + 1;
                        pVar4.f20091e++;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            m.m(gVarJ, qVar);
        } while (!z3);
        int size2 = size - qVar.size();
        if (size2 > 0) {
            this.f20036s = this.f20034i.n();
            this.f20037t -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        r.b(i10, this.f20037t);
        b();
        int i11 = i10 + this.f20035r;
        q qVar = this.f20034i;
        Object obj2 = qVar.set(i11, obj);
        this.f20036s = qVar.n();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f20037t;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > this.f20037t) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        b();
        int i12 = this.f20035r;
        return new b0(this.f20034i, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        b();
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.f9665i = i10 - 1;
        return new rg.z(vVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        int i11 = i10 + this.f20035r;
        q qVar = this.f20034i;
        boolean zAddAll = qVar.addAll(i11, collection);
        if (zAddAll) {
            this.f20037t = collection.size() + this.f20037t;
            this.f20036s = qVar.n();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        b();
        int i11 = this.f20035r + i10;
        q qVar = this.f20034i;
        Object objRemove = qVar.remove(i11);
        this.f20037t--;
        this.f20036s = qVar.n();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        b();
        int i11 = this.f20035r + i10;
        q qVar = this.f20034i;
        qVar.add(i11, obj);
        this.f20037t++;
        this.f20036s = qVar.n();
    }
}
