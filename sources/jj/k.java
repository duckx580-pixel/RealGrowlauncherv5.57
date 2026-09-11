package jj;

import bj.x;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import nh.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f8935c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numK = property != null ? o.K(property) : null;
        boolean z3 = false;
        if (numK == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z3 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numK.intValue() >= 9) {
            z3 = true;
        }
        f8935c = z3;
    }

    @Override // jj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
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
        kotlin.jvm.internal.l.e("sslParameters", sSLParameters);
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // jj.n
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals(PredefinedUICustomizationFont.defaultFamily)) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
