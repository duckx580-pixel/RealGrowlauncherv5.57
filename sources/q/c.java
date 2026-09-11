package q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13559i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13560r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13561s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f13562t;

    public c(e eVar) {
        this.f13562t = eVar;
        this.f13559i = eVar.f13628s - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f13561s) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f13560r;
        e eVar = this.f13562t;
        return kotlin.jvm.internal.l.a(key, eVar.g(i10)) && kotlin.jvm.internal.l.a(entry.getValue(), eVar.j(this.f13560r));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f13561s) {
            return this.f13562t.g(this.f13560r);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f13561s) {
            return this.f13562t.j(this.f13560r);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13560r < this.f13559i;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f13561s) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f13560r;
        e eVar = this.f13562t;
        Object objG = eVar.g(i10);
        Object objJ = eVar.j(this.f13560r);
        return (objG == null ? 0 : objG.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f13560r++;
        this.f13561s = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f13561s) {
            throw new IllegalStateException();
        }
        this.f13562t.h(this.f13560r);
        this.f13560r--;
        this.f13559i--;
        this.f13561s = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f13561s) {
            return this.f13562t.i(this.f13560r, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
