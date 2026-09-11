package rg;

import java.util.List;
import java.util.ListIterator;
import y0.b0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements ListIterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14669i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f14670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f14671s;

    public z(nh.e eVar, int i10) {
        this.f14671s = eVar;
        List list = (List) eVar.f12305r;
        if (i10 >= 0 && i10 <= eVar.b()) {
            this.f14670r = list.listIterator(eVar.b() - i10);
            return;
        }
        StringBuilder sbN = android.support.v4.media.session.a.n(i10, "Position index ", " must be in range [");
        sbN.append(new kh.d(0, eVar.b(), 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f14669i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14669i) {
            case 0:
                return ((ListIterator) this.f14670r).hasPrevious();
            default:
                return ((kotlin.jvm.internal.v) this.f14670r).f9665i < ((b0) this.f14671s).f20037t - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f14669i) {
            case 0:
                return ((ListIterator) this.f14670r).hasNext();
            default:
                return ((kotlin.jvm.internal.v) this.f14670r).f9665i >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f14669i) {
            case 0:
                return ((ListIterator) this.f14670r).previous();
            default:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f14670r;
                int i10 = vVar.f9665i + 1;
                b0 b0Var = (b0) this.f14671s;
                y0.r.b(i10, b0Var.f20037t);
                vVar.f9665i = i10;
                return b0Var.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f14669i) {
            case 0:
                nh.e eVar = (nh.e) this.f14671s;
                return sb.c.t(eVar) - ((ListIterator) this.f14670r).previousIndex();
            default:
                return ((kotlin.jvm.internal.v) this.f14670r).f9665i + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f14669i) {
            case 0:
                return ((ListIterator) this.f14670r).next();
            default:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f14670r;
                int i10 = vVar.f9665i;
                b0 b0Var = (b0) this.f14671s;
                y0.r.b(i10, b0Var.f20037t);
                vVar.f9665i = i10 - 1;
                return b0Var.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f14669i) {
            case 0:
                nh.e eVar = (nh.e) this.f14671s;
                return sb.c.t(eVar) - ((ListIterator) this.f14670r).nextIndex();
            default:
                return ((kotlin.jvm.internal.v) this.f14670r).f9665i;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f14669i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f14669i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public z(kotlin.jvm.internal.v vVar, b0 b0Var) {
        this.f14670r = vVar;
        this.f14671s = b0Var;
    }
}
