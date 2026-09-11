package h4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f7546i.mark(Integer.MAX_VALUE);
    }

    public final void c(long j) throws IOException {
        int i10 = this.f7547r;
        if (i10 > j) {
            this.f7547r = 0;
            this.f7546i.reset();
        } else {
            j -= (long) i10;
        }
        a((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f7546i.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
