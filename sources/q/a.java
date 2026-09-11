package q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13553i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f13556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13557u;

    public a(int i10) {
        this.f13553i = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13554r < this.f13553i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f13554r;
        switch (this.f13556t) {
            case 0:
                objG = ((e) this.f13557u).g(i10);
                break;
            case 1:
                objG = ((e) this.f13557u).j(i10);
                break;
            default:
                objG = ((f) this.f13557u).f13568r[i10];
                break;
        }
        this.f13554r++;
        this.f13555s = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f13555s) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f13554r - 1;
        this.f13554r = i10;
        switch (this.f13556t) {
            case 0:
                ((e) this.f13557u).h(i10);
                break;
            case 1:
                ((e) this.f13557u).h(i10);
                break;
            default:
                ((f) this.f13557u).b(i10);
                break;
        }
        this.f13553i--;
        this.f13555s = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f13569s);
        this.f13556t = 2;
        this.f13557u = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i10) {
        this(eVar.f13628s);
        this.f13556t = i10;
        switch (i10) {
            case 1:
                this.f13557u = eVar;
                this(eVar.f13628s);
                break;
            default:
                this.f13557u = eVar;
                break;
        }
    }
}
