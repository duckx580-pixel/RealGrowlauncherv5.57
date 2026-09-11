package s0;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object[] f15029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f15030t;

    public g(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        super(i10, i11);
        this.f15029s = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f15030t = new j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f15030t;
        if (jVar.hasNext()) {
            this.f15012i++;
            return jVar.next();
        }
        int i10 = this.f15012i;
        this.f15012i = i10 + 1;
        return this.f15029s[i10 - jVar.f15013r];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f15012i;
        j jVar = this.f15030t;
        int i11 = jVar.f15013r;
        if (i10 <= i11) {
            this.f15012i = i10 - 1;
            return jVar.previous();
        }
        int i12 = i10 - 1;
        this.f15012i = i12;
        return this.f15029s[i12 - i11];
    }
}
