package kh;

import java.util.NoSuchElementException;
import rg.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9624i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9627t;

    public c(int i10, int i11, int i12) {
        this.f9624i = i12;
        this.f9625r = i11;
        boolean z3 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z3 = true;
        }
        this.f9626s = z3;
        this.f9627t = z3 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9626s;
    }

    @Override // rg.w
    public final int nextInt() {
        int i10 = this.f9627t;
        if (i10 != this.f9625r) {
            this.f9627t = this.f9624i + i10;
            return i10;
        }
        if (!this.f9626s) {
            throw new NoSuchElementException();
        }
        this.f9626s = false;
        return i10;
    }
}
