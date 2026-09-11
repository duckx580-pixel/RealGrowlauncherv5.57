package kj;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9640a = new g();

    @Override // kj.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // kj.n
    public final boolean b() {
        boolean z3 = jj.e.f8922d;
        return jj.e.f8922d;
    }

    @Override // kj.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(PredefinedUICustomizationFont.defaultFamily))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // kj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            kotlin.jvm.internal.l.e("sslParameters", parameters);
            jj.n nVar = jj.n.f8941a;
            Object[] array = mc.a.f(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
