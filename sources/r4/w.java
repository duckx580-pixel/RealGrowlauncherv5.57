package r4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14574i = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f14576s;

    public w(x xVar) {
        this.f14576s = xVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14574i + 1 < this.f14576s.f14577y.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14575r = true;
        q.y yVar = this.f14576s.f14577y;
        int i10 = this.f14574i + 1;
        this.f14574i = i10;
        Object objG = yVar.g(i10);
        kotlin.jvm.internal.l.e("nodes.valueAt(++index)", objG);
        return (v) objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14575r) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        q.y yVar = this.f14576s.f14577y;
        ((v) yVar.g(this.f14574i)).f14569r = null;
        int i10 = this.f14574i;
        Object[] objArr = yVar.f13631s;
        Object obj = objArr[i10];
        Object obj2 = q.k.f13578b;
        if (obj != obj2) {
            objArr[i10] = obj2;
            yVar.f13629i = true;
        }
        this.f14574i = i10 - 1;
        this.f14575r = false;
    }
}
