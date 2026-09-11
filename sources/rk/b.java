package rk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final byte[] f14881v;
    public final int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f14882x;

    public b(int i10, e eVar, Object obj, byte[] bArr, int i11, int i12, e eVar2) {
        super(i10, eVar, obj, eVar2);
        this.f14881v = bArr;
        this.w = i11;
        this.f14882x = i12;
    }

    public final boolean b(byte[] bArr, int i10, int i11) {
        int i12 = this.f14882x;
        int i13 = this.w;
        if (i12 - i13 != i11 - i10) {
            return false;
        }
        byte[] bArr2 = this.f14881v;
        if (bArr2 == bArr) {
            return true;
        }
        while (i13 < i12) {
            int i14 = i13 + 1;
            int i15 = i10 + 1;
            if (bArr2[i13] != bArr[i10]) {
                return false;
            }
            i13 = i14;
            i10 = i15;
        }
        return true;
    }

    public b() {
        this.f14881v = null;
        this.f14882x = 0;
        this.w = 0;
    }
}
