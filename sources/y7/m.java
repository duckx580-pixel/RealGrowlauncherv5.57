package y7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f20201f;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f20201f = bArr;
    }

    @Override // y7.l
    public final byte[] C() {
        return this.f20201f;
    }
}
