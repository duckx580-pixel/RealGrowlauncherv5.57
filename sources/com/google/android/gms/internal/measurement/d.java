package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Iterator f3729i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Iterator f3730r;

    public d(Iterator it, Iterator it2) {
        this.f3729i = it;
        this.f3730r = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3729i.hasNext()) {
            return true;
        }
        return this.f3730r.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f3729i;
        if (it.hasNext()) {
            return new r(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f3730r;
        if (it2.hasNext()) {
            return new r((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
