package rk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f14889v;
    public final int w;

    public d(int i10, e eVar, Object obj, byte[] bArr, int i11, e eVar2) {
        super(i10, eVar, obj, eVar2);
        this.f14889v = bArr;
        this.w = i11;
    }

    public final boolean b(byte[] bArr, int i10, int i11) {
        if (i11 - i10 == this.w) {
            byte[] bArr2 = this.f14889v;
            if (bArr == bArr2) {
                return true;
            }
            int i12 = 0;
            while (i10 < i11) {
                int i13 = i10 + 1;
                int i14 = bArr[i10] & 255;
                byte[] bArr3 = mk.a.f11822b;
                int i15 = i12 + 1;
                if (bArr3[i14] == bArr3[bArr2[i12] & 255]) {
                    i10 = i13;
                    i12 = i15;
                }
            }
            return true;
        }
        return false;
    }

    public d() {
        this.f14889v = null;
        this.w = 0;
    }
}
