package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends androidx.fragment.app.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16933c;

    public n0(byte[] bArr, Map map) {
        this.f1694b = bArr;
        this.f1693a = map;
        this.f16933c = 2;
    }

    @Override // androidx.fragment.app.h
    public final String e(String str) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str);
        return "[Exception Manager]: ".concat(str);
    }

    @Override // androidx.fragment.app.h
    public final String s() {
        return k0.g.g("https://", f.M().C(), "monitorsdk.", f.M().B(), "/remote-debug/exception-manager");
    }

    @Override // androidx.fragment.app.h
    public final int t() {
        return this.f16933c;
    }
}
