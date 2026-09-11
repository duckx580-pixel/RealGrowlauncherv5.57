package s0;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15016s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15017t;

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f15017t = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f15016s) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f15017t;
                int i10 = this.f15012i;
                this.f15012i = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f15012i++;
                return this.f15017t;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f15016s) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f15017t;
                int i10 = this.f15012i - 1;
                this.f15012i = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f15012i--;
                return this.f15017t;
        }
    }

    public d(int i10, Object obj) {
        super(i10, 1);
        this.f15017t = obj;
    }
}
