package bj;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d0 f3109i;

    public final byte[] a() throws IOException {
        long jC = c();
        if (jC > Integer.MAX_VALUE) {
            throw new IOException(k0.g.f(jC, "Cannot buffer entire body for content length: "));
        }
        oj.i iVarG = g();
        try {
            byte[] bArrR = iVarG.r();
            iVarG.close();
            int length = bArrR.length;
            if (jC == -1 || jC == length) {
                return bArrR;
            }
            throw new IOException("Content-Length (" + jC + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cj.a.d(g());
    }

    public abstract s e();

    public abstract oj.i g();

    public final String h() throws IOException {
        Charset charsetA;
        oj.i iVarG = g();
        try {
            s sVarE = e();
            if (sVarE == null || (charsetA = sVarE.a(nh.a.f12288a)) == null) {
                charsetA = nh.a.f12288a;
            }
            String strH = iVarG.H(cj.a.q(iVarG, charsetA));
            iVarG.close();
            return strH;
        } finally {
        }
    }
}
