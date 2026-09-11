package t6;

import android.util.Base64;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Scanner;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f16766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f16767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16771f;

    public e0(char[] cArr) {
        Object obj;
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                String strNextLine = scanner.nextLine();
                if (strNextLine.startsWith("url=")) {
                    this.f16771f = strNextLine.substring(4).trim();
                } else if (strNextLine.startsWith("version=")) {
                    this.f16768c = strNextLine.substring(8).trim();
                } else if (strNextLine.startsWith("headers=")) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(strNextLine.substring(8).trim(), 2), Charset.defaultCharset()));
                        if (jSONObject.length() == 0) {
                            obj = rg.t.f14665i;
                        } else {
                            Iterator<String> itKeys = jSONObject.keys();
                            kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, itKeys);
                            mh.i iVarT = mh.k.t(itKeys);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj2 : (mh.a) iVarT) {
                                Object obj3 = jSONObject.get((String) obj2);
                                linkedHashMap.put(obj2, kotlin.jvm.internal.l.a(obj3, JSONObject.NULL) ? "null" : obj3.toString());
                            }
                            obj = linkedHashMap;
                        }
                        this.f16770e = obj;
                    } catch (Exception e8) {
                        s6.h.f15212b.c(7, "Error parsing headers", e8);
                        this.f16770e = new HashMap();
                    }
                } else if (strNextLine.startsWith("data=")) {
                    this.f16767b = Base64.decode(strNextLine.substring(5).trim(), 2);
                } else if (strNextLine.startsWith("type=")) {
                    String strTrim = strNextLine.substring(5).trim();
                    try {
                        this.f16766a = h1.valueOf(strTrim);
                    } catch (Exception e10) {
                        s6.h.f15212b.c(7, "Unknown task type: ".concat(String.valueOf(strTrim)), e10);
                    }
                }
            } catch (Throwable th2) {
                try {
                    scanner.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        scanner.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Objects.equals(this.f16768c, e0Var.f16768c) && Arrays.equals(this.f16767b, e0Var.f16767b) && Objects.equals(this.f16771f, e0Var.f16771f) && Objects.equals(this.f16769d, e0Var.f16769d) && Objects.equals(this.f16770e, e0Var.f16770e) && this.f16766a == e0Var.f16766a;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public final int hashCode() {
        String str = this.f16768c;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = Arrays.hashCode(this.f16767b);
        String str2 = this.f16771f;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f16769d;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        h1 h1Var = this.f16766a;
        int iHashCode5 = h1Var != null ? h1Var.hashCode() : 0;
        ?? r62 = this.f16770e;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (r62 != 0 ? r62.hashCode() : 0);
    }
}
