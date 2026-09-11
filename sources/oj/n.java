package oj;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f0 f13096i;

    public n(f0 f0Var) {
        kotlin.jvm.internal.l.f("delegate", f0Var);
        this.f13096i = f0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13096i.close();
    }

    @Override // oj.f0
    public final h0 d() {
        return this.f13096i.d();
    }

    @Override // oj.f0
    public long q(g gVar, long j) {
        kotlin.jvm.internal.l.f("sink", gVar);
        return this.f13096i.q(gVar, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f13096i + ')';
    }
}
