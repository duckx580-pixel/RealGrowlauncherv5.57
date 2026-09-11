package oj;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface d0 extends Closeable, Flushable {
    void P(g gVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    h0 d();

    void flush();
}
