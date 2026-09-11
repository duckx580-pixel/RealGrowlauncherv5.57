package sg;

import a1.m;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import v1.r;
import y0.q;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ListIterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15760i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f15764u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r rVar, int i10, int i11) {
        this(rVar, (i11 & 1) != 0 ? 0 : i10, 0, rVar.f18474t);
        this.f15760i = 2;
    }

    public void a() {
        if (((AbstractList) ((b) this.f15764u).f15769u).modCount != this.f15763t) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f15760i) {
            case 0:
                a();
                b bVar = (b) this.f15764u;
                int i10 = this.f15761r;
                this.f15761r = i10 + 1;
                bVar.add(i10, obj);
                this.f15762s = -1;
                this.f15763t = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                c cVar = (c) this.f15764u;
                int i11 = this.f15761r;
                this.f15761r = i11 + 1;
                cVar.add(i11, obj);
                this.f15762s = -1;
                this.f15763t = ((AbstractList) cVar).modCount;
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                c();
                q qVar = (q) this.f15764u;
                qVar.add(this.f15761r + 1, obj);
                this.f15762s = -1;
                this.f15761r++;
                this.f15763t = qVar.n();
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f15764u)).modCount != this.f15763t) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((q) this.f15764u).n() != this.f15763t) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15760i) {
            case 0:
                return this.f15761r < ((b) this.f15764u).f15767s;
            case 1:
                return this.f15761r < ((c) this.f15764u).f15772r;
            case 2:
                return this.f15761r < this.f15763t;
            default:
                return this.f15761r < ((q) this.f15764u).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f15760i) {
            case 0:
                if (this.f15761r > 0) {
                }
                break;
            case 1:
                if (this.f15761r > 0) {
                }
                break;
            case 2:
                if (this.f15761r > this.f15762s) {
                }
                break;
            default:
                if (this.f15761r >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f15760i) {
            case 0:
                a();
                int i10 = this.f15761r;
                b bVar = (b) this.f15764u;
                if (i10 >= bVar.f15767s) {
                    throw new NoSuchElementException();
                }
                this.f15761r = i10 + 1;
                this.f15762s = i10;
                return bVar.f15765i[bVar.f15766r + i10];
            case 1:
                b();
                int i11 = this.f15761r;
                c cVar = (c) this.f15764u;
                if (i11 >= cVar.f15772r) {
                    throw new NoSuchElementException();
                }
                this.f15761r = i11 + 1;
                this.f15762s = i11;
                return cVar.f15771i[i11];
            case 2:
                Object[] objArr = ((r) this.f15764u).f18471i;
                int i12 = this.f15761r;
                this.f15761r = i12 + 1;
                Object obj = objArr[i12];
                l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
                return (m) obj;
            default:
                c();
                int i13 = this.f15761r + 1;
                this.f15762s = i13;
                q qVar = (q) this.f15764u;
                y0.r.b(i13, qVar.size());
                Object obj2 = qVar.get(i13);
                this.f15761r = i13;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f15760i) {
            case 0:
                return this.f15761r;
            case 1:
                return this.f15761r;
            case 2:
                return this.f15761r - this.f15762s;
            default:
                return this.f15761r + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f15760i) {
            case 0:
                a();
                int i10 = this.f15761r;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f15761r = i11;
                this.f15762s = i11;
                b bVar = (b) this.f15764u;
                return bVar.f15765i[bVar.f15766r + i11];
            case 1:
                b();
                int i12 = this.f15761r;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f15761r = i13;
                this.f15762s = i13;
                return ((c) this.f15764u).f15771i[i13];
            case 2:
                Object[] objArr = ((r) this.f15764u).f18471i;
                int i14 = this.f15761r - 1;
                this.f15761r = i14;
                Object obj = objArr[i14];
                l.d("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
                return (m) obj;
            default:
                c();
                int i15 = this.f15761r;
                q qVar = (q) this.f15764u;
                y0.r.b(i15, qVar.size());
                int i16 = this.f15761r;
                this.f15762s = i16;
                this.f15761r--;
                return qVar.get(i16);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i10;
        switch (this.f15760i) {
            case 0:
                i10 = this.f15761r;
                break;
            case 1:
                i10 = this.f15761r;
                break;
            case 2:
                i10 = this.f15761r - this.f15762s;
                break;
            default:
                return this.f15761r;
        }
        return i10 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f15760i) {
            case 0:
                b bVar = (b) this.f15764u;
                a();
                int i10 = this.f15762s;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.j(i10);
                this.f15761r = this.f15762s;
                this.f15762s = -1;
                this.f15763t = ((AbstractList) bVar).modCount;
                return;
            case 1:
                c cVar = (c) this.f15764u;
                b();
                int i11 = this.f15762s;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.j(i11);
                this.f15761r = this.f15762s;
                this.f15762s = -1;
                this.f15763t = ((AbstractList) cVar).modCount;
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                c();
                q qVar = (q) this.f15764u;
                qVar.remove(this.f15761r);
                this.f15761r--;
                this.f15762s = -1;
                this.f15763t = qVar.n();
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f15760i) {
            case 0:
                a();
                int i10 = this.f15762s;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f15764u).set(i10, obj);
                return;
            case 1:
                b();
                int i11 = this.f15762s;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f15764u).set(i11, obj);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                q qVar = (q) this.f15764u;
                c();
                int i12 = this.f15762s;
                if (i12 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                qVar.set(i12, obj);
                this.f15763t = qVar.n();
                return;
        }
    }

    public a(r rVar, int i10, int i11, int i12) {
        this.f15760i = 2;
        this.f15764u = rVar;
        this.f15761r = i10;
        this.f15762s = i11;
        this.f15763t = i12;
    }

    public a(c cVar, int i10) {
        this.f15760i = 1;
        this.f15764u = cVar;
        this.f15761r = i10;
        this.f15762s = -1;
        this.f15763t = ((AbstractList) cVar).modCount;
    }

    public a(q qVar, int i10) {
        this.f15760i = 3;
        this.f15764u = qVar;
        this.f15761r = i10 - 1;
        this.f15762s = -1;
        this.f15763t = qVar.n();
    }

    public a(b bVar, int i10) {
        this.f15760i = 0;
        this.f15764u = bVar;
        this.f15761r = i10;
        this.f15762s = -1;
        this.f15763t = ((AbstractList) bVar).modCount;
    }
}
