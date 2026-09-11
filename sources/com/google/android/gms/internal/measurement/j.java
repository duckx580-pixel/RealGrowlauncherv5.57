package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Iterator f3833i;

    public j(Iterator it) {
        this.f3833i = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3833i.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new r((String) this.f3833i.next());
    }
}
