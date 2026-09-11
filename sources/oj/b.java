package oj;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13056i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13058s;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f13056i = i10;
        this.f13057r = obj;
        this.f13058s = obj2;
    }

    @Override // oj.d0
    public final void P(g gVar, long j) throws IOException {
        switch (this.f13056i) {
            case 0:
                gh.a.b(gVar.f13078r, 0L, j);
                long j10 = j;
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    a0 a0Var = gVar.f13077i;
                    kotlin.jvm.internal.l.c(a0Var);
                    while (true) {
                        if (j11 < 65536) {
                            j11 += (long) (a0Var.f13051c - a0Var.f13050b);
                            if (j11 >= j10) {
                                j11 = j10;
                            } else {
                                a0Var = a0Var.f13054f;
                                kotlin.jvm.internal.l.c(a0Var);
                            }
                        }
                    }
                    e0 e0Var = (e0) this.f13057r;
                    b bVar = (b) this.f13058s;
                    e0Var.h();
                    try {
                        try {
                            bVar.P(gVar, j11);
                            if (e0Var.i()) {
                                throw e0Var.k(null);
                            }
                            j10 -= j11;
                        } catch (IOException e8) {
                            if (!e0Var.i()) {
                                throw e8;
                            }
                            throw e0Var.k(e8);
                        }
                    } catch (Throwable th2) {
                        e0Var.i();
                        throw th2;
                    }
                }
                break;
            default:
                gh.a.b(gVar.f13078r, 0L, j);
                while (j > 0) {
                    ((h0) this.f13058s).f();
                    a0 a0Var2 = gVar.f13077i;
                    kotlin.jvm.internal.l.c(a0Var2);
                    int iMin = (int) Math.min(j, a0Var2.f13051c - a0Var2.f13050b);
                    ((OutputStream) this.f13057r).write(a0Var2.f13049a, a0Var2.f13050b, iMin);
                    int i10 = a0Var2.f13050b + iMin;
                    a0Var2.f13050b = i10;
                    long j12 = iMin;
                    j -= j12;
                    gVar.f13078r -= j12;
                    if (i10 == a0Var2.f13051c) {
                        gVar.f13077i = a0Var2.a();
                        b0.a(a0Var2);
                    }
                }
                return;
        }
    }

    @Override // oj.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f13056i) {
            case 0:
                e0 e0Var = (e0) this.f13057r;
                b bVar = (b) this.f13058s;
                e0Var.h();
                try {
                    bVar.close();
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
                ((OutputStream) this.f13057r).close();
                return;
        }
    }

    @Override // oj.d0
    public final h0 d() {
        switch (this.f13056i) {
            case 0:
                return (e0) this.f13057r;
            default:
                return (h0) this.f13058s;
        }
    }

    @Override // oj.d0, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f13056i) {
            case 0:
                e0 e0Var = (e0) this.f13057r;
                b bVar = (b) this.f13058s;
                e0Var.h();
                try {
                    bVar.flush();
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
                ((OutputStream) this.f13057r).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f13056i) {
            case 0:
                return "AsyncTimeout.sink(" + ((b) this.f13058s) + ')';
            default:
                return "sink(" + ((OutputStream) this.f13057r) + ')';
        }
    }
}
