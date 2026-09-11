package li;

import androidx.lifecycle.v0;
import java.io.StringReader;
import java.util.List;
import launcher.powerkuy.App;
import launcher.powerkuy.growlauncher.api.JavaForNative;
import launcher.powerkuy.growlauncher.api.model.AppConfiguration;
import rh.h1;
import rh.w0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f9965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f9966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f9967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f9968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1 f9969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1 f9970g;

    public g() {
        h1 h1VarC = w0.c(new hi.a("0"));
        this.f9965b = h1VarC;
        this.f9966c = h1VarC;
        h1 h1VarC2 = w0.c(new AppConfiguration(false, false));
        this.f9967d = h1VarC2;
        this.f9968e = h1VarC2;
        List list = rg.s.f14664i;
        h1 h1VarC3 = w0.c(list);
        this.f9969f = h1VarC3;
        this.f9970g = h1VarC3;
        String jsonConfiguration = JavaForNative.Configuration.getJsonConfiguration();
        try {
            Object objB = jsonConfiguration == null ? null : new com.google.gson.j().b(new StringReader(jsonConfiguration), new qb.a(hi.a.class));
            kotlin.jvm.internal.l.e("fromJson(...)", objB);
            h1VarC.k(null, objB);
        } catch (com.google.gson.s unused) {
        }
        h1 h1Var = this.f9967d;
        App app = App.f9849i;
        kotlin.jvm.internal.l.e("ctx", app);
        AppConfiguration appConfigurationP = jj.d.p(app);
        h1Var.getClass();
        h1Var.k(null, appConfigurationP);
        h1 h1Var2 = this.f9969f;
        App app2 = App.f9849i;
        kotlin.jvm.internal.l.e("ctx", app2);
        String string = app2.getSharedPreferences("app_configuration_pref", 0).getString("saved_macs", "[]");
        List list2 = (List) new com.google.gson.j().b(new StringReader(string != null ? string : "[]"), new qb.a(new ii.a().f13891b));
        list = list2 != null ? list2 : list;
        h1Var2.getClass();
        h1Var2.k(null, list);
    }

    public final void e() {
        JavaForNative.Configuration.setJsonConfiguration(new com.google.gson.j().f(this.f9965b.getValue()));
    }

    public final void f(String str) {
        kotlin.jvm.internal.l.f("gid", str);
        while (true) {
            h1 h1Var = this.f9965b;
            Object value = h1Var.getValue();
            String str2 = str;
            if (h1Var.i(value, hi.a.a((hi.a) value, null, str2, null, false, null, null, 61))) {
                e();
                return;
            }
            str = str2;
        }
    }

    public final void g(String str) {
        kotlin.jvm.internal.l.f("mac", str);
        while (true) {
            h1 h1Var = this.f9965b;
            Object value = h1Var.getValue();
            String str2 = str;
            if (h1Var.i(value, hi.a.a((hi.a) value, str2, null, null, false, null, null, 62))) {
                e();
                return;
            }
            str = str2;
        }
    }

    public final void h(String str) {
        kotlin.jvm.internal.l.f("rid", str);
        while (true) {
            h1 h1Var = this.f9965b;
            Object value = h1Var.getValue();
            String str2 = str;
            if (h1Var.i(value, hi.a.a((hi.a) value, null, null, str2, false, null, null, 59))) {
                e();
                return;
            }
            str = str2;
        }
    }
}
