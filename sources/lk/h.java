package lk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends d {
    @Override // lk.a
    public final boolean j(int i10, int i11) {
        if (i10 < 256) {
            return k(i10, i11);
        }
        return false;
    }

    @Override // lk.a
    public int t(int i10, byte[] bArr, k8.j jVar, int i11, byte[] bArr2) {
        int i12 = jVar.f9288i;
        byte b4 = bArr[i12];
        if (b4 != -33 || (i10 & 1073741824) == 0) {
            bArr2[0] = this.f10093x[b4 & 255];
            jVar.f9288i = i12 + 1;
            return 1;
        }
        bArr2[0] = 115;
        bArr2[1] = 115;
        jVar.f9288i = i12 + 1;
        return 2;
    }
}
