package rg;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.b implements ListIterator {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f14653t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i10) {
        super(3, dVar);
        this.f14653t = dVar;
        int iB = dVar.b();
        if (i10 < 0 || i10 > iB) {
            throw new IndexOutOfBoundsException(android.support.v4.media.session.a.l("index: ", i10, iB, ", size: "));
        }
        this.f9652r = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9652r > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9652r;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9652r - 1;
        this.f9652r = i10;
        return this.f14653t.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9652r - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
