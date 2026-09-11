package qk;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rk.c f14417a;

    static {
        try {
            DataInputStream dataInputStreamG0 = rk.a.g0("CaseFold");
            int i10 = dataInputStreamG0.readInt();
            rk.c cVar = new rk.c(i10, 3);
            for (int i11 = 0; i11 < i10; i11++) {
                cVar.r(dataInputStreamG0.readInt(), new h(dataInputStreamG0));
            }
            dataInputStreamG0.close();
            f14417a = cVar;
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
