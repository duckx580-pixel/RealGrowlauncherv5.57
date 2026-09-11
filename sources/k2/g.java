package k2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9169b;

    public g(int i10, int i11) {
        this.f9168a = i10;
        this.f9169b = i11;
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.").toString());
        }
    }

    @Override // k2.i
    public final void a(j jVar) {
        int i10 = jVar.f9174c;
        f2.b bVar = jVar.f9172a;
        int i11 = this.f9169b;
        int iB = i10 + i11;
        if (((i10 ^ iB) & (i11 ^ iB)) < 0) {
            iB = bVar.b();
        }
        jVar.a(jVar.f9174c, Math.min(iB, bVar.b()));
        int i12 = jVar.f9173b;
        int i13 = this.f9168a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        jVar.a(Math.max(0, i14), jVar.f9173b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9168a == gVar.f9168a && this.f9169b == gVar.f9169b;
    }

    public final int hashCode() {
        return (this.f9168a * 31) + this.f9169b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f9168a);
        sb2.append(", lengthAfterCursor=");
        return h0.g(sb2, this.f9169b, ')');
    }
}
