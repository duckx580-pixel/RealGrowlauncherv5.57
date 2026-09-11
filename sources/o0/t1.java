package o0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12581i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f12584t;

    public t1(int i10, int i11, u1 u1Var) {
        this.f12583s = i11;
        this.f12584t = u1Var;
        this.f12582r = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12581i) {
            case 0:
                return this.f12582r < this.f12583s;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12581i) {
            case 0:
                if (!hasNext()) {
                    return null;
                }
                u1 u1Var = (u1) this.f12584t;
                Object[] objArr = u1Var.f12590c;
                int i10 = this.f12582r;
                this.f12582r = i10 + 1;
                return objArr[u1Var.g(i10)];
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12581i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t1(r1 r1Var, h0 h0Var) {
        this.f12584t = r1Var;
        this.f12582r = r1Var.w;
    }
}
