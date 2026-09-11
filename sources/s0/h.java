package s0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f15031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f15033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15034v;

    public h(f fVar, int i10) {
        super(i10, fVar.f15028x);
        this.f15031s = fVar;
        this.f15032t = fVar.n();
        this.f15034v = -1;
        b();
    }

    public final void a() {
        if (this.f15032t != this.f15031s.n()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // s0.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f15012i;
        f fVar = this.f15031s;
        fVar.add(i10, obj);
        this.f15012i++;
        this.f15013r = fVar.b();
        this.f15032t = fVar.n();
        this.f15034v = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f15031s;
        Object[] objArr = fVar.f15027v;
        if (objArr == null) {
            this.f15033u = null;
            return;
        }
        int i10 = (fVar.f15028x - 1) & (-32);
        int i11 = this.f15012i;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f15025t / 5) + 1;
        j jVar = this.f15033u;
        if (jVar == null) {
            this.f15033u = new j(objArr, i11, i10, i12);
            return;
        }
        jVar.f15012i = i11;
        jVar.f15013r = i10;
        jVar.f15037s = i12;
        if (jVar.f15038t.length < i12) {
            jVar.f15038t = new Object[i12];
        }
        jVar.f15038t[0] = objArr;
        ?? r62 = i11 == i10 ? 1 : 0;
        jVar.f15039u = r62;
        jVar.b(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15012i;
        this.f15034v = i10;
        j jVar = this.f15033u;
        f fVar = this.f15031s;
        if (jVar == null) {
            Object[] objArr = fVar.w;
            this.f15012i = i10 + 1;
            return objArr[i10];
        }
        if (jVar.hasNext()) {
            this.f15012i++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.w;
        int i11 = this.f15012i;
        this.f15012i = i11 + 1;
        return objArr2[i11 - jVar.f15013r];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15012i;
        this.f15034v = i10 - 1;
        j jVar = this.f15033u;
        f fVar = this.f15031s;
        if (jVar == null) {
            Object[] objArr = fVar.w;
            int i11 = i10 - 1;
            this.f15012i = i11;
            return objArr[i11];
        }
        int i12 = jVar.f15013r;
        if (i10 <= i12) {
            this.f15012i = i10 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.w;
        int i13 = i10 - 1;
        this.f15012i = i13;
        return objArr2[i13 - i12];
    }

    @Override // s0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f15034v;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f15031s;
        fVar.j(i10);
        int i11 = this.f15034v;
        if (i11 < this.f15012i) {
            this.f15012i = i11;
        }
        this.f15013r = fVar.b();
        this.f15032t = fVar.n();
        this.f15034v = -1;
        b();
    }

    @Override // s0.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f15034v;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f15031s;
        fVar.set(i10, obj);
        this.f15032t = fVar.n();
        b();
    }
}
