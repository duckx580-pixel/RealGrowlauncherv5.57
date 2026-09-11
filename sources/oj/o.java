package oj;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h0 f13097e;

    public o(h0 h0Var) {
        kotlin.jvm.internal.l.f("delegate", h0Var);
        this.f13097e = h0Var;
    }

    @Override // oj.h0
    public final h0 a() {
        return this.f13097e.a();
    }

    @Override // oj.h0
    public final h0 b() {
        return this.f13097e.b();
    }

    @Override // oj.h0
    public final long c() {
        return this.f13097e.c();
    }

    @Override // oj.h0
    public final h0 d(long j) {
        return this.f13097e.d(j);
    }

    @Override // oj.h0
    public final boolean e() {
        return this.f13097e.e();
    }

    @Override // oj.h0
    public final void f() throws InterruptedIOException {
        this.f13097e.f();
    }

    @Override // oj.h0
    public final h0 g(long j) {
        kotlin.jvm.internal.l.f("unit", TimeUnit.MILLISECONDS);
        return this.f13097e.g(j);
    }
}
