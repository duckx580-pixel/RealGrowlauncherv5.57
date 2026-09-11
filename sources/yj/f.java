package yj;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    @Override // yj.g
    public final int a(int i10) {
        int i11 = this.f20451b;
        if (i10 == i11 || (i10 >= 0 && i10 < i11)) {
            return i10;
        }
        d(i10, i11 - 1, "Char");
        throw null;
    }

    @Override // yj.g
    public final int b(int i10) {
        int i11 = this.f20451b;
        if (i10 == i11 || (i10 >= 0 && i10 < i11)) {
            return i10;
        }
        d(i10, i11 - 1, "Byte");
        throw null;
    }
}
