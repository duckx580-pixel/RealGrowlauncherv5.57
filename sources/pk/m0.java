package pk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends qk.a {
    public static final m0 C = new m0("UTF-32LE");

    @Override // lk.i, lk.a
    public final int f(byte[] bArr, int i10, int i11) {
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((65280 & i10) >>> 8);
        bArr[i11 + 2] = (byte) ((16711680 & i10) >>> 16);
        bArr[i11 + 3] = (byte) ((i10 & (-16777216)) >>> 24);
        return 4;
    }

    @Override // lk.a
    public final boolean m(byte[] bArr, int i10, int i11) {
        int i12 = i10 + 3;
        return i12 < i11 && bArr[i12] == 0 && bArr[i10 + 2] == 0 && bArr[i10 + 1] == 0 && bArr[i10] == 10;
    }

    @Override // qk.i, lk.a
    public final int t(int i10, byte[] bArr, k8.j jVar, int i11, byte[] bArr2) {
        int i12 = jVar.f9288i;
        if (!lk.a.i(bArr[i12] & 255) || bArr[i12 + 1] != 0 || bArr[i12 + 2] != 0 || bArr[i12 + 3] != 0) {
            return super.t(i10, bArr, jVar, i11, bArr2);
        }
        bArr2[0] = mk.a.f11822b[bArr[i12] & 255];
        bArr2[1] = 0;
        bArr2[2] = 0;
        bArr2[3] = 0;
        jVar.f9288i += 4;
        return 4;
    }

    @Override // lk.i, lk.a
    public final int u(byte[] bArr, int i10, int i11) {
        return ((((((bArr[i10 + 3] & 255) * 256) + (bArr[i10 + 2] & 255)) * 256) + (bArr[i10 + 1] & 255)) * 256) + (bArr[i10] & 255);
    }
}
