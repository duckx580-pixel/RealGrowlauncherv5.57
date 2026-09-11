package pk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends lk.j {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i0 f13552y = new i0("US-ASCII", mk.a.f11821a, mk.a.f11822b);

    @Override // lk.a
    public final byte[] B() {
        return this.f10093x;
    }

    @Override // lk.a
    public final boolean j(int i10, int i11) {
        if (i10 < 128) {
            return k(i10, i11);
        }
        return false;
    }

    @Override // lk.j, lk.a
    public final int s(byte[] bArr, int i10, int i11) {
        return (bArr[i10] & 128) == 0 ? 1 : -1;
    }
}
