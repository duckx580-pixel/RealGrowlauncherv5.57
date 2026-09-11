package lk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends i {
    public final boolean[] A;

    public b(String str, int[] iArr, int[][] iArr2, short[] sArr, boolean[] zArr) {
        super(str, 1, 2, iArr, iArr2, sArr);
        this.A = zArr;
    }

    @Override // lk.i, lk.a
    public int f(byte[] bArr, int i10, int i11) {
        return E(bArr, i10, i11);
    }

    @Override // lk.a
    public final boolean o(byte[] bArr) {
        return !this.A[bArr[0] & 255];
    }

    @Override // lk.a
    public final int r(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        if (i11 <= i10) {
            return i11;
        }
        if (this.A[bArr[i11] & 255]) {
            i13 = i11;
            while (i13 > i10) {
                int i14 = i13 - 1;
                if (this.f10090x[bArr[i14] & 255] <= 1) {
                    break;
                }
                i13 = i14;
            }
        } else {
            i13 = i11;
        }
        int iS = s(bArr, i13, i12) + i13;
        return iS > i11 ? i13 : iS + ((i11 - iS) & (-2));
    }

    @Override // lk.i, lk.a
    public int s(byte[] bArr, int i10, int i11) {
        return K(bArr, i10, i11);
    }
}
