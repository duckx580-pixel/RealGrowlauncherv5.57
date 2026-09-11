package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends androidx.fragment.app.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f16853d;

    public i0(a0 a0Var, byte[] bArr) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, a0Var);
        this.f1694b = bArr;
        this.f1693a = null;
        this.f16853d = a0Var;
        this.f16852c = 3;
    }

    @Override // androidx.fragment.app.h
    public final String e(String str) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str);
        return "[RD]: ".concat(str);
    }

    @Override // androidx.fragment.app.h
    public final String s() {
        return new z3(this.f16853d).a(cb.f.j(z3.f17140e));
    }

    @Override // androidx.fragment.app.h
    public final int t() {
        return this.f16852c;
    }

    @Override // androidx.fragment.app.h
    public final boolean y() {
        return false;
    }
}
