package yj;

import java.util.Arrays;
import pk.n0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f20447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20448g;

    public e(String str, byte[] bArr) {
        super(str, bArr);
        this.f20448g = str.length() - 1;
    }

    @Override // yj.g
    public final int a(int i10) {
        int i11 = this.f20448g;
        if (i10 == i11 + 1) {
            return this.f20451b;
        }
        if (i10 < 0 || i10 > i11) {
            d(i10, i11, "Char");
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        int[] iArrE = e();
        int iBinarySearch = Arrays.binarySearch(iArrE, i10);
        while (iBinarySearch > 0 && iArrE[iBinarySearch - 1] == i10) {
            iBinarySearch--;
        }
        return iBinarySearch;
    }

    @Override // yj.g
    public final int b(int i10) {
        int i11 = this.f20451b;
        if (i10 == i11) {
            return this.f20448g + 1;
        }
        if (i10 < 0 || i10 >= i11) {
            d(i10, i11 - 1, "Byte");
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        return e()[i10];
    }

    public final int[] e() {
        int[] iArr = this.f20447f;
        if (iArr != null) {
            return iArr;
        }
        int i10 = this.f20451b;
        int[] iArr2 = new int[i10];
        int i11 = i10 - 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 <= i11) {
            int iS = n0.D.s(this.f20452c, i12, i10) + i12;
            while (i12 < iS) {
                iArr2[i12] = i13;
                i12++;
            }
            i13++;
        }
        this.f20447f = iArr2;
        return iArr2;
    }
}
