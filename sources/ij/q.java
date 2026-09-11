package ij;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oj.f0;
import oj.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8359i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final oj.i f8364v;

    public q(oj.i iVar) {
        kotlin.jvm.internal.l.f("source", iVar);
        this.f8364v = iVar;
    }

    @Override // oj.f0
    public final h0 d() {
        return this.f8364v.d();
    }

    @Override // oj.f0
    public final long q(oj.g gVar, long j) throws IOException {
        int i10;
        int i11;
        kotlin.jvm.internal.l.f("sink", gVar);
        do {
            int i12 = this.f8362t;
            oj.i iVar = this.f8364v;
            if (i12 == 0) {
                iVar.skip(this.f8363u);
                this.f8363u = 0;
                if ((this.f8360r & 4) == 0) {
                    i10 = this.f8361s;
                    int iR = cj.a.r(iVar);
                    this.f8362t = iR;
                    this.f8359i = iR;
                    int i13 = iVar.readByte() & 255;
                    this.f8360r = iVar.readByte() & 255;
                    Logger logger = r.f8365t;
                    if (logger.isLoggable(Level.FINE)) {
                        oj.j jVar = f.f8320a;
                        logger.fine(f.a(this.f8361s, this.f8359i, i13, this.f8360r, true));
                    }
                    i11 = iVar.readInt() & Integer.MAX_VALUE;
                    this.f8361s = i11;
                    if (i13 != 9) {
                        throw new IOException(i13 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jQ = iVar.q(gVar, Math.min(j, i12));
                if (jQ != -1) {
                    this.f8362t -= (int) jQ;
                    return jQ;
                }
            }
            return -1L;
        } while (i11 == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
