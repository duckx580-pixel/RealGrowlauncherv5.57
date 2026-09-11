package kj;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f9645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f9646b;

    public m(l lVar) {
        this.f9646b = lVar;
    }

    @Override // kj.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f9646b.a(sSLSocket);
    }

    @Override // kj.n
    public final boolean b() {
        return true;
    }

    @Override // kj.n
    public final String c(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // kj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f9645a == null && this.f9646b.a(sSLSocket)) {
                this.f9645a = this.f9646b.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f9645a;
    }
}
