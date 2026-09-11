package xk;

import fl.e;
import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractQueue {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f19905i;

    public a(e eVar) {
        this.f19905i = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f19905i.f();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.f19905i.next();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw new UnsupportedOperationException();
    }
}
