package t6;

import android.util.Base64;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16947d;

    public o(String str, String str2, String str3, int i10) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str2);
        this.f16945b = str;
        this.f16944a = str2;
        this.f16947d = str3;
        this.f16946c = i10;
    }

    public final String a() {
        String str = this.f16945b;
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str);
        Charset charset = nh.a.f12288a;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, bytes);
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.f16944a;
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str2);
        byte[] bytes2 = str2.getBytes(charset);
        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, bytes2);
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.f16947d;
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str3);
        byte[] bytes3 = str3.getBytes(charset);
        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, bytes3);
        String strEncodeToString3 = Base64.encodeToString(bytes3, 2);
        int i10 = this.f16946c;
        StringBuilder sbO = k0.g.o("label=", strEncodeToString, "\nhashName=", strEncodeToString2, "\nstackTrace=");
        sbO.append(strEncodeToString3);
        sbO.append("\nc=");
        sbO.append(i10);
        return sbO.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.l.a(this.f16945b, oVar.f16945b) && kotlin.jvm.internal.l.a(this.f16944a, oVar.f16944a) && kotlin.jvm.internal.l.a(this.f16947d, oVar.f16947d) && this.f16946c == oVar.f16946c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16946c) + ((this.f16947d.hashCode() + ((this.f16944a.hashCode() + (this.f16945b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i10 = this.f16946c;
        StringBuilder sbO = k0.g.o("ExceptionInfo(label=", this.f16945b, ", hashName=", this.f16944a, ", stackTrace=");
        sbO.append(this.f16947d);
        sbO.append(", counter=");
        sbO.append(i10);
        sbO.append(")");
        return sbO.toString();
    }
}
