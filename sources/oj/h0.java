package oj;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f13079d = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13082c;

    public h0 a() {
        this.f13080a = false;
        return this;
    }

    public h0 b() {
        this.f13082c = 0L;
        return this;
    }

    public long c() {
        if (this.f13080a) {
            return this.f13081b;
        }
        throw new IllegalStateException("No deadline");
    }

    public h0 d(long j) {
        this.f13080a = true;
        this.f13081b = j;
        return this;
    }

    public boolean e() {
        return this.f13080a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f13080a && this.f13081b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public h0 g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.l.f("unit", timeUnit);
        if (j < 0) {
            throw new IllegalArgumentException(k0.g.f(j, "timeout < 0: ").toString());
        }
        this.f13082c = timeUnit.toNanos(j);
        return this;
    }
}
