package jj;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kj.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f8919e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kj.i f8921d;

    static {
        boolean z3 = false;
        if (mc.a.l() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f8919e = z3;
    }

    public c() throws NoSuchMethodException {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e8) {
            n.f8941a.getClass();
            n.i(5, "unable to load android socket classes", e8);
            oVar = null;
        }
        ArrayList arrayListC0 = rg.k.C0(new kj.n[]{oVar, new kj.m(kj.f.f9634f), new kj.m(kj.k.f9644a), new kj.m(kj.h.f9640a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListC0) {
            if (((kj.n) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f8920c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f8921d = new kj.i(method3, method2, method);
    }

    @Override // jj.n
    public final vd.a b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        kj.b bVar = x509TrustManagerExtensions != null ? new kj.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new nj.a(c(x509TrustManager));
    }

    @Override // jj.n
    public final nj.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            kotlin.jvm.internal.l.e("method", declaredMethod);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // jj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        kotlin.jvm.internal.l.f("protocols", list);
        Iterator it = this.f8920c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((kj.n) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        kj.n nVar = (kj.n) next;
        if (nVar != null) {
            nVar.d(sSLSocket, str, list);
        }
    }

    @Override // jj.n
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        kotlin.jvm.internal.l.f("address", inetSocketAddress);
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e8) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e8;
            }
            throw new IOException("Exception in connect", e8);
        }
    }

    @Override // jj.n
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f8920c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((kj.n) next).a(sSLSocket)) {
                break;
            }
        }
        kj.n nVar = (kj.n) next;
        if (nVar != null) {
            return nVar.c(sSLSocket);
        }
        return null;
    }

    @Override // jj.n
    public final Object g() {
        kj.i iVar = this.f8921d;
        iVar.getClass();
        Method method = iVar.f9641a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = iVar.f9642b;
                kotlin.jvm.internal.l.c(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // jj.n
    public final boolean h(String str) {
        kotlin.jvm.internal.l.f("hostname", str);
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // jj.n
    public final void j(String str, Object obj) {
        kotlin.jvm.internal.l.f("message", str);
        kj.i iVar = this.f8921d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f9643c;
                kotlin.jvm.internal.l.c(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(5, str, null);
    }
}
