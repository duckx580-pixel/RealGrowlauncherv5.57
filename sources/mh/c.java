package mh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements i, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f11721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11722b;

    public c(i iVar, int i10) {
        kotlin.jvm.internal.l.f("sequence", iVar);
        this.f11721a = iVar;
        this.f11722b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // mh.d
    public final i a(int i10) {
        int i11 = this.f11722b + i10;
        return i11 < 0 ? new c(this, i10) : new c(this.f11721a, i11);
    }

    @Override // mh.i
    public final Iterator iterator() {
        return new b(this);
    }
}
