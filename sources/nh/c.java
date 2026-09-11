package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f12297i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f12299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12301u;

    public c(CharSequence charSequence) {
        kotlin.jvm.internal.l.f("string", charSequence);
        this.f12297i = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f12298r;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f12301u < 0) {
            this.f12298r = 2;
            return false;
        }
        CharSequence charSequence = this.f12297i;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i13 = this.f12299s; i13 < length2; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < charSequence.length() && charSequence.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f12298r = 1;
                this.f12301u = i10;
                this.f12300t = length;
                return true;
            }
        }
        i10 = -1;
        this.f12298r = 1;
        this.f12301u = i10;
        this.f12300t = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12298r = 0;
        int i10 = this.f12300t;
        int i11 = this.f12299s;
        this.f12299s = this.f12301u + i10;
        return this.f12297i.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
