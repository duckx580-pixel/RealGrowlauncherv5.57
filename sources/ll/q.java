package ll;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends bj.f0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bj.f0 f10188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final oj.z f10189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IOException f10190t;

    public q(bj.f0 f0Var) {
        this.f10188r = f0Var;
        this.f10189s = jj.d.i(new b6.b(this, f0Var.g()));
    }

    @Override // bj.f0
    public final long c() {
        return this.f10188r.c();
    }

    @Override // bj.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10188r.close();
    }

    @Override // bj.f0
    public final bj.s e() {
        return this.f10188r.e();
    }

    @Override // bj.f0
    public final oj.i g() {
        return this.f10189s;
    }
}
