package ui;

import android.app.Application;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import rh.h1;
import rh.r0;
import rh.w0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.lifecycle.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f18031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f18032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f18033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f18034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1 f18035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0 f18036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1 f18037i;
    public final r0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f18040m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Application application) {
        super(application);
        kotlin.jvm.internal.l.f("application", application);
        h1 h1VarC = w0.c(new k2.u(6, 0L, PredefinedUICustomizationFont.defaultFamily));
        this.f18031c = h1VarC;
        this.f18032d = new r0(h1VarC);
        h1 h1VarC2 = w0.c(Boolean.TRUE);
        this.f18033e = h1VarC2;
        this.f18034f = new r0(h1VarC2);
        Boolean bool = Boolean.FALSE;
        h1 h1VarC3 = w0.c(bool);
        this.f18035g = h1VarC3;
        this.f18036h = new r0(h1VarC3);
        h1 h1VarC4 = w0.c(bool);
        this.f18037i = h1VarC4;
        this.j = new r0(h1VarC4);
        this.f18039l = PredefinedUICustomizationFont.defaultFamily;
    }

    public final void f(k2.u uVar) {
        kotlin.jvm.internal.l.f("newValue", uVar);
        h1 h1Var = this.f18031c;
        h1Var.getClass();
        h1Var.k(null, uVar);
        Boolean boolValueOf = Boolean.valueOf(!kotlin.jvm.internal.l.a(uVar.f9196a.f4836i, this.f18039l));
        h1 h1Var2 = this.f18035g;
        h1Var2.getClass();
        h1Var2.k(null, boolValueOf);
    }
}
