package androidx.activity;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.lifecycle.p0;
import fi.b1;
import fi.d0;
import fi.d1;
import fi.f1;
import fi.g1;
import fi.i1;
import fi.j1;
import fi.k1;
import fi.l1;
import fi.m1;
import fi.p1;
import fi.r1;
import fi.s0;
import fi.s1;
import fi.t1;
import fi.u1;
import fi.v1;
import fi.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import launcher.powerkuy.App;
import launcher.powerkuy.growlauncher.DeeplinkActivity;
import launcher.powerkuy.growlauncher.LuaManager;
import launcher.powerkuy.growlauncher.ScriptHubWebActivity;
import launcher.powerkuy.growlauncher.extra.SettingActivity;
import launcher.powerkuy.growlauncher.login.LoginActivity;
import launcher.powerkuy.growlauncher.module.EditTextActivity;
import r4.a0;
import rh.h1;
import zc.m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f682i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f683r;

    public /* synthetic */ c(int i10, Object obj) {
        this.f682i = i10;
        this.f683r = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f682i;
        qg.o oVar = qg.o.f13926a;
        Object obj = this.f683r;
        switch (i10) {
            case 0:
                ((n) obj).reportFullyDrawn();
                return null;
            case 1:
                int i11 = DeeplinkActivity.f9855r;
                ((DeeplinkActivity) obj).finish();
                return oVar;
            case 2:
                int i12 = LuaManager.f9857i;
                ((LuaManager) obj).finish();
                return oVar;
            case 3:
                ((s0) obj).h();
                return oVar;
            case 4:
                b1.d((b1) obj);
                return oVar;
            case 5:
                d1.d((d1) obj);
                return oVar;
            case 6:
                f1.d((f1) obj);
                return oVar;
            case 7:
                g1.d((g1) obj);
                return oVar;
            case 8:
                i1.d((i1) obj);
                return oVar;
            case 9:
                j1.d((j1) obj);
                return oVar;
            case 10:
                k1.d((k1) obj);
                return oVar;
            case 11:
                l1.d((l1) obj);
                return oVar;
            case 12:
                m1.d((m1) obj);
                return oVar;
            case 13:
                p1.d((p1) obj);
                return oVar;
            case 14:
                r1.d((r1) obj);
                return oVar;
            case 15:
                s1.d((s1) obj);
                return oVar;
            case 16:
                t1.d((t1) obj);
                return oVar;
            case 17:
                u1.d((u1) obj);
                return oVar;
            case 18:
                v1.d((v1) obj);
                return oVar;
            case 19:
                w1.d((w1) obj);
                return oVar;
            case 20:
                int i13 = ScriptHubWebActivity.f9860v;
                ((ScriptHubWebActivity) obj).finish();
                return oVar;
            case 21:
                return obj;
            case 22:
                ((a0) obj).i();
                return oVar;
            case 23:
                return kotlin.jvm.internal.l.i((Object[]) obj);
            case 24:
                int i14 = SettingActivity.f9870i;
                ((SettingActivity) obj).finish();
                return oVar;
            case 25:
                li.g gVar = (li.g) obj;
                h1 h1Var = gVar.f9969f;
                String strF = ((hi.a) gVar.f9965b.getValue()).f();
                if (!nh.h.W(strF) && !((List) h1Var.getValue()).contains(strF)) {
                    ArrayList arrayListP0 = rg.l.p0((Collection) h1Var.getValue(), strF);
                    h1Var.k(null, arrayListP0);
                    App app = App.f9849i;
                    kotlin.jvm.internal.l.e("ctx", app);
                    jj.d.K(app, arrayListP0);
                }
                return oVar;
            case 26:
                int i15 = LoginActivity.f9871i;
                ((LoginActivity) obj).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://discord.gg/powerkuyofficial")));
                return oVar;
            case 27:
                int i16 = EditTextActivity.f9878i;
                ((EditTextActivity) obj).finish();
                return oVar;
            case 28:
                ui.g gVar2 = (ui.g) obj;
                d0 d0Var = new d0(17);
                if (((Boolean) gVar2.f18037i.getValue()).booleanValue()) {
                    Toast.makeText(gVar2.e(), "Cannot save encrypted file!", 0).show();
                    d0Var.invoke(Boolean.FALSE);
                } else {
                    String str = gVar2.f18038k;
                    if (str != null) {
                        oh.x.s(p0.j(gVar2), null, 0, new ui.f(gVar2, str, ((k2.u) gVar2.f18031c.getValue()).f9196a.f4836i, d0Var, null, 1), 3);
                    }
                }
                return oVar;
            default:
                Boolean bool = (Boolean) ((yi.a) ((m0) obj).f20991a).f20443b.getValue();
                bool.getClass();
                return bool;
        }
    }
}
