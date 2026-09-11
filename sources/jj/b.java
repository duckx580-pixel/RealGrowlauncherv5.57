package jj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements nj.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f8917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f8918b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f8917a = x509TrustManager;
        this.f8918b = method;
    }

    @Override // nj.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f8918b.invoke(this.f8917a, x509Certificate);
            if (objInvoke != null) {
                return ((TrustAnchor) objInvoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e8) {
            throw new AssertionError("unable to get issues and signature", e8);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f8917a, bVar.f8917a) && kotlin.jvm.internal.l.a(this.f8918b, bVar.f8918b);
    }

    public final int hashCode() {
        X509TrustManager x509TrustManager = this.f8917a;
        int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
        Method method = this.f8918b;
        return iHashCode + (method != null ? method.hashCode() : 0);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f8917a + ", findByIssuerAndSignatureMethod=" + this.f8918b + ")";
    }
}
