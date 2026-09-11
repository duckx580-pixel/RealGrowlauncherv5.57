package kj;

import android.net.ssl.SSLSockets;
import android.os.Build;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    @Override // kj.n
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // kj.n
    public final boolean b() {
        jj.n nVar = jj.n.f8941a;
        return mc.a.l() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // kj.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(PredefinedUICustomizationFont.defaultFamily))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // kj.n
    public final void d(SSLSocket sSLSocket, String str, List list) throws IOException {
        kotlin.jvm.internal.l.f("protocols", list);
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            kotlin.jvm.internal.l.e("sslParameters", sSLParameters);
            jj.n nVar = jj.n.f8941a;
            Object[] array = mc.a.f(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e8) {
            throw new IOException("Android internal error", e8);
        }
    }
}
