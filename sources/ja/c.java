package ja;

import hd.d0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d0 f8874s = new d0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f8875i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f8876r;

    public c(na.b bVar) {
        this.f8875i = bVar;
        this.f8876r = f8874s;
    }

    @Override // ja.h
    public void d(g gVar, int i10) throws IOException {
        int[] iArr = (int[]) this.f8876r;
        try {
            gVar.read((byte[]) this.f8875i, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            gVar.close();
        }
    }

    public c(byte[] bArr, int[] iArr) {
        this.f8875i = bArr;
        this.f8876r = iArr;
    }
}
