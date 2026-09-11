package jj;

import bj.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f8930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f8931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f8932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f8933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f8934g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f8930c = method;
        this.f8931d = method2;
        this.f8932e = method3;
        this.f8933f = cls;
        this.f8934g = cls2;
    }

    @Override // jj.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f8932e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // jj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((x) obj) != x.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(rg.m.O(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x) it.next()).f3241i);
        }
        try {
            this.f8930c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f8933f, this.f8934g}, new i(arrayList2)));
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // jj.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f8931d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            i iVar = (i) invocationHandler;
            boolean z3 = iVar.f8927a;
            if (!z3 && iVar.f8928b == null) {
                n.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z3) {
                return null;
            }
            return iVar.f8928b;
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
