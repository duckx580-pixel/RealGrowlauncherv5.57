package mh;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11727i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f11728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f11730t;

    public g(Object obj, Map map) {
        this.f11727i = 1;
        this.f11728r = obj;
        this.f11730t = map;
    }

    public void a() {
        Object objInvoke;
        h hVar = (h) this.f11730t;
        if (this.f11729s == -2) {
            objInvoke = ((androidx.activity.c) hVar.f11732b).f683r;
        } else {
            eh.c cVar = (eh.c) hVar.f11733c;
            Object obj = this.f11728r;
            kotlin.jvm.internal.l.c(obj);
            objInvoke = cVar.invoke(obj);
        }
        this.f11728r = objInvoke;
        this.f11729s = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11727i) {
            case 0:
                if (this.f11729s < 0) {
                    a();
                }
                return this.f11729s == 1;
            default:
                return this.f11729s < ((Map) this.f11730t).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11727i) {
            case 0:
                if (this.f11729s < 0) {
                    a();
                }
                if (this.f11729s == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f11728r;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
                this.f11729s = -1;
                return obj;
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f11728r;
                this.f11729s++;
                Object obj3 = ((Map) this.f11730t).get(obj2);
                if (obj3 != null) {
                    this.f11728r = ((u0.a) obj3).f17546b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11727i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(h hVar) {
        this.f11727i = 0;
        this.f11730t = hVar;
        this.f11729s = -2;
    }
}
