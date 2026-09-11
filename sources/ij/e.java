package ij;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b[] f8318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f8319b;

    static {
        b bVar = new b(b.f8299i, PredefinedUICustomizationFont.defaultFamily);
        oj.j jVar = b.f8296f;
        b bVar2 = new b(jVar, "GET");
        b bVar3 = new b(jVar, "POST");
        oj.j jVar2 = b.f8297g;
        b bVar4 = new b(jVar2, "/");
        b bVar5 = new b(jVar2, "/index.html");
        oj.j jVar3 = b.f8298h;
        b bVar6 = new b(jVar3, "http");
        b bVar7 = new b(jVar3, "https");
        oj.j jVar4 = b.f8295e;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(jVar4, "200"), new b(jVar4, "204"), new b(jVar4, "206"), new b(jVar4, "304"), new b(jVar4, "400"), new b(jVar4, "404"), new b(jVar4, "500"), new b("accept-charset", PredefinedUICustomizationFont.defaultFamily), new b("accept-encoding", "gzip, deflate"), new b("accept-language", PredefinedUICustomizationFont.defaultFamily), new b("accept-ranges", PredefinedUICustomizationFont.defaultFamily), new b("accept", PredefinedUICustomizationFont.defaultFamily), new b("access-control-allow-origin", PredefinedUICustomizationFont.defaultFamily), new b("age", PredefinedUICustomizationFont.defaultFamily), new b("allow", PredefinedUICustomizationFont.defaultFamily), new b("authorization", PredefinedUICustomizationFont.defaultFamily), new b("cache-control", PredefinedUICustomizationFont.defaultFamily), new b("content-disposition", PredefinedUICustomizationFont.defaultFamily), new b("content-encoding", PredefinedUICustomizationFont.defaultFamily), new b("content-language", PredefinedUICustomizationFont.defaultFamily), new b("content-length", PredefinedUICustomizationFont.defaultFamily), new b("content-location", PredefinedUICustomizationFont.defaultFamily), new b("content-range", PredefinedUICustomizationFont.defaultFamily), new b("content-type", PredefinedUICustomizationFont.defaultFamily), new b("cookie", PredefinedUICustomizationFont.defaultFamily), new b("date", PredefinedUICustomizationFont.defaultFamily), new b("etag", PredefinedUICustomizationFont.defaultFamily), new b("expect", PredefinedUICustomizationFont.defaultFamily), new b("expires", PredefinedUICustomizationFont.defaultFamily), new b("from", PredefinedUICustomizationFont.defaultFamily), new b("host", PredefinedUICustomizationFont.defaultFamily), new b("if-match", PredefinedUICustomizationFont.defaultFamily), new b("if-modified-since", PredefinedUICustomizationFont.defaultFamily), new b("if-none-match", PredefinedUICustomizationFont.defaultFamily), new b("if-range", PredefinedUICustomizationFont.defaultFamily), new b("if-unmodified-since", PredefinedUICustomizationFont.defaultFamily), new b("last-modified", PredefinedUICustomizationFont.defaultFamily), new b("link", PredefinedUICustomizationFont.defaultFamily), new b("location", PredefinedUICustomizationFont.defaultFamily), new b("max-forwards", PredefinedUICustomizationFont.defaultFamily), new b("proxy-authenticate", PredefinedUICustomizationFont.defaultFamily), new b("proxy-authorization", PredefinedUICustomizationFont.defaultFamily), new b("range", PredefinedUICustomizationFont.defaultFamily), new b("referer", PredefinedUICustomizationFont.defaultFamily), new b("refresh", PredefinedUICustomizationFont.defaultFamily), new b("retry-after", PredefinedUICustomizationFont.defaultFamily), new b("server", PredefinedUICustomizationFont.defaultFamily), new b("set-cookie", PredefinedUICustomizationFont.defaultFamily), new b("strict-transport-security", PredefinedUICustomizationFont.defaultFamily), new b("transfer-encoding", PredefinedUICustomizationFont.defaultFamily), new b("user-agent", PredefinedUICustomizationFont.defaultFamily), new b("vary", PredefinedUICustomizationFont.defaultFamily), new b("via", PredefinedUICustomizationFont.defaultFamily), new b("www-authenticate", PredefinedUICustomizationFont.defaultFamily)};
        f8318a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(bVarArr[i10].f8301b)) {
                linkedHashMap.put(bVarArr[i10].f8301b, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.l.e("Collections.unmodifiableMap(result)", mapUnmodifiableMap);
        f8319b = mapUnmodifiableMap;
    }

    public static void a(oj.j jVar) throws IOException {
        kotlin.jvm.internal.l.f("name", jVar);
        int iC = jVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            byte b4 = (byte) 65;
            byte b10 = (byte) 90;
            byte bH = jVar.h(i10);
            if (b4 <= bH && b10 >= bH) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(jVar.p()));
            }
        }
    }
}
