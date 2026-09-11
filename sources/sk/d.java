package sk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15865b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f15866a = new int[8];

    static {
        int i10 = 32;
        int i11 = 0;
        while (true) {
            i10 >>>= 1;
            if (i10 == 0) {
                f15865b = i11;
                return;
            }
            i11++;
        }
    }

    public final boolean a(int i10) {
        return ((1 << (i10 % 256)) & this.f15866a[i10 >>> f15865b]) != 0;
    }

    public final void b(int i10) {
        int i11 = i10 >>> f15865b;
        int[] iArr = this.f15866a;
        iArr[i11] = (~(1 << (i10 % 256))) & iArr[i11];
    }

    public final void c() {
        for (int i10 = 0; i10 < 8; i10++) {
            int[] iArr = this.f15866a;
            iArr[i10] = ~iArr[i10];
        }
    }

    public final void d(d dVar) {
        for (int i10 = 0; i10 < 8; i10++) {
            dVar.f15866a[i10] = ~this.f15866a[i10];
        }
    }

    public final boolean e() {
        for (int i10 = 0; i10 < 8; i10++) {
            if (this.f15866a[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int f() {
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (a(i11)) {
                i10++;
            }
        }
        return i10;
    }

    public final void g(int i10) {
        int i11 = i10 >>> f15865b;
        int[] iArr = this.f15866a;
        iArr[i11] = (1 << (i10 % 256)) | iArr[i11];
    }

    public final void h(r rVar, int i10) {
        if (a(i10)) {
            rVar.b();
        }
        g(i10);
    }

    public final void i(r rVar, int i10, int i11) {
        while (i10 <= i11 && i10 < 256) {
            if (rVar != null && a(i10)) {
                rVar.b();
            }
            g(i10);
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitSet");
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 % 64 == 0) {
                sb2.append("\n  ");
            }
            sb2.append(a(i10) ? "1" : "0");
        }
        return sb2.toString();
    }
}
