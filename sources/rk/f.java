package rk;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f14895i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f14896r;

    public f(c cVar) {
        this.f14896r = cVar;
        this.f14895i = (e) cVar.f14887s.f14893t;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14895i != this.f14896r.f14887s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        e eVar = this.f14895i;
        this.f14895i = (e) eVar.f14893t;
        return eVar.f14894u;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new ok.c("not supported operation exception");
    }
}
