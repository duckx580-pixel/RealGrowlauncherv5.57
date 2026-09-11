package ij;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends oj.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f8379m;

    public u(v vVar) {
        this.f8379m = vVar;
    }

    @Override // oj.d
    public final void j() {
        this.f8379m.e(9);
        n nVar = this.f8379m.f8392n;
        synchronized (nVar) {
            long j = nVar.D;
            long j10 = nVar.C;
            if (j < j10) {
                return;
            }
            nVar.C = j10 + 1;
            nVar.E = System.nanoTime() + ((long) 1000000000);
            nVar.f8348x.c(new ej.b(k0.g.l(new StringBuilder(), nVar.f8344s, " ping"), nVar), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
