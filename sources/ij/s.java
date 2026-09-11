package ij;

import java.io.InterruptedIOException;
import oj.d0;
import oj.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oj.g f8369i = new oj.g();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f8372t;

    public s(v vVar, boolean z3) {
        this.f8372t = vVar;
        this.f8371s = z3;
    }

    @Override // oj.d0
    public final void P(oj.g gVar, long j) {
        byte[] bArr = cj.a.f3572a;
        oj.g gVar2 = this.f8369i;
        gVar2.P(gVar, j);
        while (gVar2.f13078r >= 16384) {
            a(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z3) {
        long jMin;
        v vVar;
        boolean z10;
        int i10;
        synchronized (this.f8372t) {
            this.f8372t.j.h();
            while (true) {
                try {
                    v vVar2 = this.f8372t;
                    if (vVar2.f8382c >= vVar2.f8383d && !this.f8371s && !this.f8370r) {
                        synchronized (vVar2) {
                            i10 = vVar2.f8389k;
                        }
                        if (i10 != 0) {
                            break;
                        }
                        try {
                            this.f8372t.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f8372t.j.k();
            this.f8372t.b();
            v vVar3 = this.f8372t;
            jMin = Math.min(vVar3.f8383d - vVar3.f8382c, this.f8369i.f13078r);
            vVar = this.f8372t;
            vVar.f8382c += jMin;
            z10 = z3 && jMin == this.f8369i.f13078r;
        }
        vVar.j.h();
        try {
            v vVar4 = this.f8372t;
            vVar4.f8392n.h(vVar4.f8391m, z10, this.f8369i, jMin);
        } finally {
            this.f8372t.j.k();
        }
    }

    @Override // oj.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10;
        v vVar = this.f8372t;
        byte[] bArr = cj.a.f3572a;
        synchronized (vVar) {
            if (this.f8370r) {
                return;
            }
            v vVar2 = this.f8372t;
            synchronized (vVar2) {
                i10 = vVar2.f8389k;
            }
            boolean z3 = i10 == 0;
            v vVar3 = this.f8372t;
            if (!vVar3.f8387h.f8371s) {
                if (this.f8369i.f13078r > 0) {
                    while (this.f8369i.f13078r > 0) {
                        a(true);
                    }
                } else if (z3) {
                    vVar3.f8392n.h(vVar3.f8391m, true, null, 0L);
                }
            }
            synchronized (this.f8372t) {
                this.f8370r = true;
            }
            this.f8372t.f8392n.flush();
            this.f8372t.a();
        }
    }

    @Override // oj.d0
    public final h0 d() {
        return this.f8372t.j;
    }

    @Override // oj.d0, java.io.Flushable
    public final void flush() {
        v vVar = this.f8372t;
        byte[] bArr = cj.a.f3572a;
        synchronized (vVar) {
            this.f8372t.b();
        }
        while (this.f8369i.f13078r > 0) {
            a(false);
            this.f8372t.f8392n.flush();
        }
    }
}
