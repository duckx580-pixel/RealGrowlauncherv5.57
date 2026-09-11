package kj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f9634f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f9635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f9636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f9637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f9638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f9639e;

    public f(Class cls) throws NoSuchMethodException {
        this.f9639e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.l.e("sslSocketClass.getDeclar…:class.javaPrimitiveType)", declaredMethod);
        this.f9635a = declaredMethod;
        this.f9636b = cls.getMethod("setHostname", String.class);
        this.f9637c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f9638d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // kj.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f9639e.isInstance(sSLSocket);
    }

    @Override // kj.n
    public final boolean b() {
        boolean z3 = jj.c.f8919e;
        return jj.c.f8919e;
    }

    @Override // kj.n
    public final String c(SSLSocket sSLSocket) {
        if (this.f9639e.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f9637c.invoke(sSLSocket, null);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    kotlin.jvm.internal.l.e("StandardCharsets.UTF_8", charset);
                    return new String(bArr, charset);
                }
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (NullPointerException e10) {
                if (!kotlin.jvm.internal.l.a(e10.getMessage(), "ssl == null")) {
                    throw e10;
                }
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
        return null;
    }

    @Override // kj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        if (this.f9639e.isInstance(sSLSocket)) {
            try {
                this.f9635a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f9636b.invoke(sSLSocket, str);
                }
                Method method = this.f9638d;
                jj.n nVar = jj.n.f8941a;
                method.invoke(sSLSocket, mc.a.j(list));
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
