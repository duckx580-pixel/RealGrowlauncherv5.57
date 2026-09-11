package oj;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13062i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13064s;

    public c(InputStream inputStream, h0 h0Var) {
        kotlin.jvm.internal.l.f("input", inputStream);
        this.f13063r = inputStream;
        this.f13064s = h0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f13062i) {
            case 0:
                e0 e0Var = (e0) this.f13063r;
                c cVar = (c) this.f13064s;
                e0Var.h();
                try {
                    cVar.close();
                    if (e0Var.i()) {
                        throw e0Var.k(null);
                    }
                    return;
                } catch (IOException e8) {
                    if (!e0Var.i()) {
                        throw e8;
                    }
                    throw e0Var.k(e8);
                } finally {
                    e0Var.i();
                }
            default:
                ((InputStream) this.f13063r).close();
                return;
        }
    }

    @Override // oj.f0
    public final h0 d() {
        switch (this.f13062i) {
            case 0:
                return (e0) this.f13063r;
            default:
                return (h0) this.f13064s;
        }
    }

    @Override // oj.f0
    public final long q(g gVar, long j) {
        switch (this.f13062i) {
            case 0:
                kotlin.jvm.internal.l.f("sink", gVar);
                e0 e0Var = (e0) this.f13063r;
                c cVar = (c) this.f13064s;
                e0Var.h();
                try {
                    long jQ = cVar.q(gVar, j);
                    if (e0Var.i()) {
                        throw e0Var.k(null);
                    }
                    return jQ;
                } catch (IOException e8) {
                    if (e0Var.i()) {
                        throw e0Var.k(e8);
                    }
                    throw e8;
                } finally {
                    e0Var.i();
                }
            default:
                kotlin.jvm.internal.l.f("sink", gVar);
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(k0.g.f(j, "byteCount < 0: ").toString());
                }
                try {
                    ((h0) this.f13064s).f();
                    a0 a0VarD0 = gVar.d0(1);
                    int i10 = ((InputStream) this.f13063r).read(a0VarD0.f13049a, a0VarD0.f13051c, (int) Math.min(j, 8192 - a0VarD0.f13051c));
                    if (i10 == -1) {
                        if (a0VarD0.f13050b == a0VarD0.f13051c) {
                            gVar.f13077i = a0VarD0.a();
                            b0.a(a0VarD0);
                        }
                        return -1L;
                    }
                    a0VarD0.f13051c += i10;
                    long j10 = i10;
                    gVar.f13078r += j10;
                    return j10;
                } catch (AssertionError e10) {
                    if (jj.d.v(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
        }
    }

    public final String toString() {
        switch (this.f13062i) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f13064s) + ')';
            default:
                return "source(" + ((InputStream) this.f13063r) + ')';
        }
    }

    public c(e0 e0Var, c cVar) {
        this.f13063r = e0Var;
        this.f13064s = cVar;
    }
}
