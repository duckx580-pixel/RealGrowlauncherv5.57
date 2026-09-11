package c6;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f3400i;

    public g(c cVar) {
        this.f3400i = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3400i.close();
    }
}
