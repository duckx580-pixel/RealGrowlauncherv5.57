package kj;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f9644a = new j();

    @Override // kj.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // kj.n
    public final boolean b() {
        boolean z3 = jj.h.f8925d;
        return jj.h.f8925d;
    }

    @Override // kj.n
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // kj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            jj.n nVar = jj.n.f8941a;
            Object[] array = mc.a.f(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
