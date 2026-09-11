package ja;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends InputStream {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8882i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f8884s;

    public g(i iVar, f fVar) {
        this.f8884s = iVar;
        this.f8882i = iVar.u(fVar.f8880a + 4);
        this.f8883r = fVar.f8881b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f8883r;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.f8882i;
        i iVar = this.f8884s;
        iVar.n(i13, i10, i11, bArr);
        this.f8882i = iVar.u(this.f8882i + i11);
        this.f8883r -= i11;
        return i11;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f8883r == 0) {
            return -1;
        }
        i iVar = this.f8884s;
        iVar.f8885i.seek(this.f8882i);
        int i10 = iVar.f8885i.read();
        this.f8882i = iVar.u(this.f8882i + 1);
        this.f8883r--;
        return i10;
    }
}
