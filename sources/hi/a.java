package hi;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import k0.g;
import kotlin.jvm.internal.l;
import nb.b;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b("SETTING_MAC")
    private String f7691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b("SETTING_GID")
    private String f7692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b("SETTING_RID")
    private String f7693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b("SETTING_GL_SPOOF")
    private boolean f7694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b("SETTING_GL_VERSION")
    private String f7695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b("SETTING_GL_EXTENSIONS")
    private String f7696f;

    public a(String str, String str2, String str3, boolean z3, String str4, String str5) {
        this.f7691a = str;
        this.f7692b = str2;
        this.f7693c = str3;
        this.f7694d = z3;
        this.f7695e = str4;
        this.f7696f = str5;
    }

    public static a a(a aVar, String str, String str2, String str3, boolean z3, String str4, String str5, int i10) {
        if ((i10 & 1) != 0) {
            str = aVar.f7691a;
        }
        String str6 = str;
        if ((i10 & 2) != 0) {
            str2 = aVar.f7692b;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = aVar.f7693c;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            z3 = aVar.f7694d;
        }
        boolean z10 = z3;
        if ((i10 & 16) != 0) {
            str4 = aVar.f7695e;
        }
        String str9 = str4;
        if ((i10 & 32) != 0) {
            str5 = aVar.f7696f;
        }
        String str10 = str5;
        aVar.getClass();
        l.f("SETTING_MAC", str6);
        l.f("SETTING_GID", str7);
        l.f("SETTING_RID", str8);
        l.f("SETTING_GL_VERSION", str9);
        l.f("SETTING_GL_EXTENSIONS", str10);
        return new a(str6, str7, str8, z10, str9, str10);
    }

    public final String b() {
        return this.f7692b;
    }

    public final String c() {
        return this.f7696f;
    }

    public final boolean d() {
        return this.f7694d;
    }

    public final String e() {
        return this.f7695e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f7691a, aVar.f7691a) && l.a(this.f7692b, aVar.f7692b) && l.a(this.f7693c, aVar.f7693c) && this.f7694d == aVar.f7694d && l.a(this.f7695e, aVar.f7695e) && l.a(this.f7696f, aVar.f7696f);
    }

    public final String f() {
        return this.f7691a;
    }

    public final String g() {
        return this.f7693c;
    }

    public final int hashCode() {
        return this.f7696f.hashCode() + android.support.v4.media.session.a.i(h0.c(android.support.v4.media.session.a.i(android.support.v4.media.session.a.i(this.f7691a.hashCode() * 31, 31, this.f7692b), 31, this.f7693c), 31, this.f7694d), 31, this.f7695e);
    }

    public final String toString() {
        String str = this.f7691a;
        String str2 = this.f7692b;
        String str3 = this.f7693c;
        boolean z3 = this.f7694d;
        String str4 = this.f7695e;
        String str5 = this.f7696f;
        StringBuilder sbO = g.o("NativeConfiguration(SETTING_MAC=", str, ", SETTING_GID=", str2, ", SETTING_RID=");
        sbO.append(str3);
        sbO.append(", SETTING_GL_SPOOF=");
        sbO.append(z3);
        sbO.append(", SETTING_GL_VERSION=");
        sbO.append(str4);
        sbO.append(", SETTING_GL_EXTENSIONS=");
        sbO.append(str5);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ a(String str) {
        this("00:00:00:00:00:00", str, PredefinedUICustomizationFont.defaultFamily, false, "OpenGL ES 2.0", "GL_OES_rgb8_rgba8 GL_OES_depth24 GL_OES_vertex_half_float GL_OES_texture_float GL_OES_element_index_uint GL_OES_mapbuffer GL_OES_compressed_ETC1_RGB8_texture");
    }
}
