package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8.j f16836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f16837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16838c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f16839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s1 f16840e;

    public h0(g0 g0Var, ExecutorService executorService, k8.j jVar, s1 s1Var) {
        this.f16839d = g0Var;
        this.f16837b = executorService;
        this.f16836a = jVar;
        this.f16840e = s1Var;
    }

    public final r1 a() throws u6.b {
        long j;
        HttpURLConnection httpURLConnection;
        int i10;
        Throwable th2;
        HttpURLConnection httpURLConnection2;
        byte[] bArr;
        Map map;
        boolean z3;
        String str;
        String str2;
        StringBuilder sb2;
        boolean z10;
        BufferedOutputStream bufferedOutputStream;
        String str3;
        if (this.f16838c.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        g0 g0Var = this.f16839d;
        k8.j jVar = this.f16836a;
        jVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            bArr = g0Var.f16802d;
            map = g0Var.f16799a;
            z3 = g0Var.f16800b;
            str = g0Var.f16805g;
            str2 = g0Var.f16806h;
            sb2 = new StringBuilder();
            sb2.append(str2);
            j = jCurrentTimeMillis;
        } catch (Throwable th3) {
            th = th3;
            j = jCurrentTimeMillis;
        }
        try {
            sb2.append(":");
            sb2.append(str);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] bArr2 = g0Var.f16802d;
            if (bArr2 != null) {
                if (z3) {
                    str3 = "<encrypted>";
                } else {
                    try {
                        str3 = new String(bArr2, Charset.defaultCharset());
                    } catch (Throwable th4) {
                        th2 = th4;
                        httpURLConnection2 = null;
                        i10 = 5;
                        try {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                            f0 f0Var = new f0(jCurrentTimeMillis2);
                            StringBuilder sb4 = new StringBuilder("error: ");
                            sb4.append(th2);
                            sb4.append("\n took ");
                            sb4.append(jCurrentTimeMillis2);
                            sb4.append("ms");
                            String string = sb4.toString();
                            s6.h hVar = s6.h.f15212b;
                            StringBuilder sb5 = new StringBuilder("[");
                            sb5.append(g0Var.hashCode());
                            sb5.append("] ");
                            sb5.append(string);
                            hVar.e(i10, sb5.toString(), th2, false, false, false);
                            throw new u6.a(th2, f0Var);
                        } catch (Throwable th5) {
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            throw th5;
                        }
                    }
                }
                sb3.append("\n payload: ");
                sb3.append(str3);
            }
            for (Map.Entry entry : map.entrySet()) {
                sb3.append("\n ");
                sb3.append((String) entry.getKey());
                sb3.append(": ");
                sb3.append((String) entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(g0Var.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            i10 = 5;
            try {
                s6.h.f15212b.b(5, sb6.toString());
                httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(str2);
                    if (g0Var.f16804f) {
                        httpURLConnection2.setUseCaches(false);
                    }
                    if (!g0Var.f16807i) {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                    }
                    int i11 = jVar.f9288i;
                    int i12 = g0Var.f16803e;
                    if (i12 != -1) {
                        i11 = i12;
                    }
                    httpURLConnection2.setConnectTimeout(i11);
                    httpURLConnection2.setReadTimeout(i11);
                    httpURLConnection2.addRequestProperty("Content-Type", z3 ? "application/octet-stream" : "application/json");
                    for (Map.Entry entry2 : map.entrySet()) {
                        httpURLConnection2.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    if (bArr != null) {
                        z10 = true;
                        httpURLConnection2.setDoOutput(true);
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(bArr.length);
                        httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                            try {
                                bufferedOutputStream2.write(bArr);
                                bufferedOutputStream2.close();
                            } catch (Throwable th6) {
                                th = th6;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            bufferedOutputStream = null;
                        }
                    } else {
                        z10 = true;
                    }
                    boolean z11 = httpURLConnection2.getResponseCode() / 100 == 2 ? z10 : false;
                    String strC = g0Var.f16801c ? k8.j.c(httpURLConnection2) : PredefinedUICustomizationFont.defaultFamily;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
                    f0 f0Var2 = new f0(jCurrentTimeMillis3);
                    StringBuilder sb8 = new StringBuilder("response code:");
                    sb8.append(httpURLConnection2.getResponseCode());
                    sb8.append(" ");
                    sb8.append(httpURLConnection2.getResponseMessage());
                    sb8.append("\n body:");
                    sb8.append(strC);
                    sb8.append("\n took ");
                    sb8.append(jCurrentTimeMillis3);
                    sb8.append("ms");
                    String string2 = sb8.toString();
                    s6.h hVar2 = s6.h.f15212b;
                    StringBuilder sb9 = new StringBuilder("[");
                    sb9.append(g0Var.hashCode());
                    sb9.append("] ");
                    sb9.append(string2);
                    String string3 = sb9.toString();
                    i10 = 5;
                    try {
                        hVar2.b(5, string3);
                        HashMap map2 = new HashMap(httpURLConnection2.getHeaderFields());
                        map2.remove(null);
                        int responseCode = httpURLConnection2.getResponseCode();
                        String str4 = strC;
                        r1 r1Var = new r1(str4, responseCode, z11, map2, f0Var2);
                        httpURLConnection2.disconnect();
                        try {
                            return new r1(this.f16840e.h(str4), responseCode, z11, r1Var.f17017a, r1Var.f17020d);
                        } catch (JSONException e8) {
                            s6.h.u("could not parse raw response - execute", e8);
                            throw new u6.b(e8.getMessage(), e8, r1Var);
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        th2 = th;
                        long jCurrentTimeMillis22 = System.currentTimeMillis() - j;
                        f0 f0Var3 = new f0(jCurrentTimeMillis22);
                        StringBuilder sb42 = new StringBuilder("error: ");
                        sb42.append(th2);
                        sb42.append("\n took ");
                        sb42.append(jCurrentTimeMillis22);
                        sb42.append("ms");
                        String string4 = sb42.toString();
                        s6.h hVar3 = s6.h.f15212b;
                        StringBuilder sb52 = new StringBuilder("[");
                        sb52.append(g0Var.hashCode());
                        sb52.append("] ");
                        sb52.append(string4);
                        hVar3.e(i10, sb52.toString(), th2, false, false, false);
                        throw new u6.a(th2, f0Var3);
                    }
                } catch (Throwable th9) {
                    th = th9;
                    i10 = 5;
                }
            } catch (Throwable th10) {
                th = th10;
                httpURLConnection = null;
                th2 = th;
                httpURLConnection2 = httpURLConnection;
                long jCurrentTimeMillis222 = System.currentTimeMillis() - j;
                f0 f0Var32 = new f0(jCurrentTimeMillis222);
                StringBuilder sb422 = new StringBuilder("error: ");
                sb422.append(th2);
                sb422.append("\n took ");
                sb422.append(jCurrentTimeMillis222);
                sb422.append("ms");
                String string42 = sb422.toString();
                s6.h hVar32 = s6.h.f15212b;
                StringBuilder sb522 = new StringBuilder("[");
                sb522.append(g0Var.hashCode());
                sb522.append("] ");
                sb522.append(string42);
                hVar32.e(i10, sb522.toString(), th2, false, false, false);
                throw new u6.a(th2, f0Var32);
            }
        } catch (Throwable th11) {
            th = th11;
            httpURLConnection = null;
            i10 = 5;
            th2 = th;
            httpURLConnection2 = httpURLConnection;
            long jCurrentTimeMillis2222 = System.currentTimeMillis() - j;
            f0 f0Var322 = new f0(jCurrentTimeMillis2222);
            StringBuilder sb4222 = new StringBuilder("error: ");
            sb4222.append(th2);
            sb4222.append("\n took ");
            sb4222.append(jCurrentTimeMillis2222);
            sb4222.append("ms");
            String string422 = sb4222.toString();
            s6.h hVar322 = s6.h.f15212b;
            StringBuilder sb5222 = new StringBuilder("[");
            sb5222.append(g0Var.hashCode());
            sb5222.append("] ");
            sb5222.append(string422);
            hVar322.e(i10, sb5222.toString(), th2, false, false, false);
            throw new u6.a(th2, f0Var322);
        }
    }
}
