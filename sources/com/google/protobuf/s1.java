package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Iterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Iterator f4656i;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4656i.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f4656i.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
