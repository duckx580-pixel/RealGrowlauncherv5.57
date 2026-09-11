package ij;

import java.io.IOException;
import java.io.InterruptedIOException;
import oj.f0;
import oj.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oj.g f8373i = new oj.g();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oj.g f8374r = new oj.g();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8377u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f8378v;

    public t(v vVar, long j, boolean z3) {
        this.f8378v = vVar;
        this.f8376t = j;
        this.f8377u = z3;
    }

    public final void a(long j) {
        byte[] bArr = cj.a.f3572a;
        this.f8378v.f8392n.g(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.f8378v) {
            this.f8375s = true;
            oj.g gVar = this.f8374r;
            j = gVar.f13078r;
            gVar.a();
            v vVar = this.f8378v;
            if (vVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            vVar.notifyAll();
        }
        if (j > 0) {
            a(j);
        }
        this.f8378v.a();
    }

    @Override // oj.f0
    public final h0 d() {
        return this.f8378v.f8388i;
    }

    @Override // oj.f0
    public final long q(oj.g gVar, long j) throws Throwable {
        int i10;
        Throwable a0Var;
        long j10;
        long jQ;
        boolean z3;
        int i11;
        kotlin.jvm.internal.l.f("sink", gVar);
        long j11 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(k0.g.f(j, "byteCount < 0: ").toString());
        }
        while (true) {
            synchronized (this.f8378v) {
                this.f8378v.f8388i.h();
                try {
                    v vVar = this.f8378v;
                    synchronized (vVar) {
                        i10 = vVar.f8389k;
                    }
                    if (i10 == 0 || this.f8377u) {
                        a0Var = null;
                    } else {
                        a0Var = this.f8378v.f8390l;
                        if (a0Var == null) {
                            v vVar2 = this.f8378v;
                            synchronized (vVar2) {
                                i11 = vVar2.f8389k;
                            }
                            k0.g.p(i11);
                            a0Var = new a0(i11);
                        }
                    }
                    if (this.f8375s) {
                        throw new IOException("stream closed");
                    }
                    oj.g gVar2 = this.f8374r;
                    long j12 = gVar2.f13078r;
                    if (j12 > j11) {
                        jQ = gVar2.q(gVar, Math.min(j, j12));
                        v vVar3 = this.f8378v;
                        long j13 = vVar3.f8380a + jQ;
                        vVar3.f8380a = j13;
                        j10 = -1;
                        long j14 = j13 - vVar3.f8381b;
                        if (a0Var == null && j14 >= vVar3.f8392n.F.a() / 2) {
                            v vVar4 = this.f8378v;
                            vVar4.f8392n.m(j14, vVar4.f8391m);
                            v vVar5 = this.f8378v;
                            vVar5.f8381b = vVar5.f8380a;
                        }
                    } else {
                        j10 = -1;
                        if (this.f8377u || a0Var != null) {
                            jQ = -1;
                        } else {
                            try {
                                this.f8378v.wait();
                                z3 = true;
                                jQ = -1;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    z3 = false;
                } finally {
                    this.f8378v.f8388i.k();
                }
            }
            if (!z3) {
                if (jQ != j10) {
                    a(jQ);
                    return jQ;
                }
                if (a0Var == null) {
                    return j10;
                }
                throw a0Var;
            }
            j11 = 0;
        }
    }
}
