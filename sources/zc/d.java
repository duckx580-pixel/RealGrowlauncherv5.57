package zc;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f20755i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20756r = 0;

    public d(e eVar) {
        this.f20755i = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20756r < this.f20755i.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f20756r;
        this.f20756r = i10 + 1;
        return this.f20755i.C(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f20756r != 1) {
            throw new UnsupportedOperationException("For the first element only");
        }
        this.f20755i.K(1);
        this.f20756r = 0;
    }
}
