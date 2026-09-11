package kj;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends vd.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X509TrustManager f9629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X509TrustManagerExtensions f9630g;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f9629f = x509TrustManager;
        this.f9630g = x509TrustManagerExtensions;
    }

    @Override // vd.a
    public final List c(String str, List list) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.l.f("chain", list);
        kotlin.jvm.internal.l.f("hostname", str);
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.f9630g.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            kotlin.jvm.internal.l.e("x509TrustManagerExtensio…ficates, \"RSA\", hostname)", listCheckServerTrusted);
            return listCheckServerTrusted;
        } catch (CertificateException e8) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e8.getMessage());
            sSLPeerUnverifiedException.initCause(e8);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f9629f == this.f9629f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9629f);
    }
}
