package t6;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.rtsoft.growtopia.R;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al.h f16833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f16834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f16835c;

    public h(al.h hVar, u uVar, x1 x1Var) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, hVar);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, uVar);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, x1Var);
        this.f16833a = hVar;
        this.f16835c = uVar;
        this.f16834b = x1Var;
    }

    public static final void c(h hVar, AppSetIdInfo appSetIdInfo) {
        al.h hVar2 = hVar.f16833a;
        int scope = appSetIdInfo.getScope();
        String id2 = appSetIdInfo.getId();
        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, id2);
        hVar2.f642f = new i(scope, id2);
    }

    public final boolean a() {
        if (this.f16834b.f()) {
            return false;
        }
        this.f16833a.getClass();
        u uVar = this.f16835c;
        Context context = (Context) uVar.f17063i;
        if (context == null) {
            return false;
        }
        try {
            return y7.d.f20179d.b(context, y7.e.f20180a) == 0 && c4.d((Context) uVar.f17063i);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        Context context = (Context) this.f16835c.f17063i;
        if (context != null) {
            try {
                Task appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
                v8.e eVar = new v8.e(this) { // from class: t6.g

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final h f16798i;

                    {
                        this.f16798i = this;
                    }

                    @Override // v8.e
                    public final void f(Object obj) {
                        h.c(this.f16798i, (AppSetIdInfo) obj);
                    }
                };
                v8.l lVar = (v8.l) appSetIdInfo;
                lVar.getClass();
                lVar.a(v8.i.f18623a, eVar);
            } catch (Throwable th2) {
                m3.g(s6.h.f15212b, 34, "Error while trying to  fetch App set ID", th2, false, false, false, false, R.styleable.AppCompatTheme_windowNoTitle);
            }
        }
    }
}
