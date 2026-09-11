package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12292i = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public kh.d f12295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ mh.h f12296u;

    public b(mh.h hVar) {
        this.f12296u = hVar;
        int iE = gh.a.e(0, 0, ((CharSequence) hVar.f11732b).length());
        this.f12293r = iE;
        this.f12294s = iE;
    }

    public final void a() {
        qg.g gVar;
        mh.h hVar = this.f12296u;
        CharSequence charSequence = (CharSequence) hVar.f11732b;
        int i10 = this.f12294s;
        if (i10 < 0) {
            this.f12292i = 0;
            this.f12295t = null;
            return;
        }
        if (i10 <= charSequence.length() && (gVar = (qg.g) ((eh.e) hVar.f11733c).invoke(charSequence, Integer.valueOf(this.f12294s))) != null) {
            int iIntValue = ((Number) gVar.f13911i).intValue();
            int iIntValue2 = ((Number) gVar.f13912r).intValue();
            this.f12295t = gh.a.F(this.f12293r, iIntValue);
            int i11 = iIntValue + iIntValue2;
            this.f12293r = i11;
            this.f12294s = i11 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f12295t = new kh.d(this.f12293r, h.Q(charSequence), 1);
            this.f12294s = -1;
        }
        this.f12292i = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12292i == -1) {
            a();
        }
        return this.f12292i == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12292i == -1) {
            a();
        }
        if (this.f12292i == 0) {
            throw new NoSuchElementException();
        }
        kh.d dVar = this.f12295t;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.ranges.IntRange", dVar);
        this.f12295t = null;
        this.f12292i = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
