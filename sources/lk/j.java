package lk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[] f10093x;

    public j(String str, short[] sArr, byte[] bArr) {
        super(str, 1, 1, sArr);
        this.f10093x = bArr;
    }

    @Override // lk.a
    public final int f(byte[] bArr, int i10, int i11) {
        if (i10 > 255) {
            return -401;
        }
        bArr[i11] = (byte) i10;
        return 1;
    }

    @Override // lk.a
    public final int g(int i10) {
        return 1;
    }

    @Override // lk.a
    public final int[] h(int i10, sk.a aVar) {
        return null;
    }

    @Override // lk.a
    public final boolean o(byte[] bArr) {
        return true;
    }

    @Override // lk.a
    public int s(byte[] bArr, int i10, int i11) {
        return 1;
    }

    @Override // lk.a
    public final int u(byte[] bArr, int i10, int i11) {
        return bArr[i10] & 255;
    }

    @Override // lk.a
    public final int z(byte[] bArr, int i10, int i11) {
        return i11 - i10;
    }

    @Override // lk.a
    public final int r(int i10, int i11, int i12, byte[] bArr) {
        return i11;
    }
}
