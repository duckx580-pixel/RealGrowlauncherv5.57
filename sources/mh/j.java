package mh;

import androidx.work.v;
import java.util.Iterator;
import java.util.NoSuchElementException;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, ug.c, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11734i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f11735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ug.c f11736s;

    public final RuntimeException a() {
        int i10 = this.f11734i;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f11734i);
    }

    public final void c(Object obj, wg.h hVar) {
        this.f11735r = obj;
        this.f11734i = 3;
        this.f11736s = hVar;
        vg.a aVar = vg.a.f18663i;
    }

    @Override // ug.c
    public final ug.h getContext() {
        return ug.i.f17989i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f11734i;
            if (i10 != 0) {
                break;
            }
            this.f11734i = 5;
            ug.c cVar = this.f11736s;
            kotlin.jvm.internal.l.c(cVar);
            this.f11736s = null;
            cVar.resumeWith(o.f13926a);
        }
        if (i10 == 1) {
            kotlin.jvm.internal.l.c(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f11734i;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f11734i = 1;
            kotlin.jvm.internal.l.c(null);
            throw null;
        }
        if (i10 != 3) {
            throw a();
        }
        this.f11734i = 0;
        Object obj = this.f11735r;
        this.f11735r = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // ug.c
    public final void resumeWith(Object obj) {
        v.B(obj);
        this.f11734i = 4;
    }
}
