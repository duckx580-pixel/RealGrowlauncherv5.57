package fi;

import com.rtsoft.growtopia.R;
import java.io.File;
import launcher.powerkuy.growlauncher.luamanager.LuaManager;
import launcher.powerkuy.growlauncher.script.ScriptMain;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6311i;

    public /* synthetic */ d0(int i10) {
        this.f6311i = i10;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10 = this.f6311i;
        int i11 = 4;
        int i12 = 6;
        int i13 = 2;
        qg.o oVar = qg.o.f13926a;
        switch (i10) {
            case 0:
                File file = (File) obj;
                kotlin.jvm.internal.l.f("it", file);
                String absolutePath = file.getAbsolutePath();
                kotlin.jvm.internal.l.e("getAbsolutePath(...)", absolutePath);
                return absolutePath;
            case 1:
                return Boolean.valueOf(obj == null);
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 3:
                kotlin.jvm.internal.l.f("$this$AnimatedContent", (s.l) obj);
                return u5.f.z(s.z.h(new d0(i13)).a(s.z.c(null, 3)), s.z.i(new d0(i11)).a(s.z.d(null, 3)));
            case 4:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 5:
                kotlin.jvm.internal.l.f("$this$AnimatedContent", (s.l) obj);
                return u5.f.z(s.z.h(new d0(i13)).a(s.z.c(null, 3)), s.z.i(new d0(i12)).a(s.z.d(null, 3)));
            case 6:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 7:
                h2 h2Var = (h2) obj;
                kotlin.jvm.internal.l.f("it", h2Var);
                return Integer.valueOf(h2Var.f6388c);
            case 8:
                kotlin.jvm.internal.l.f("it", (String) obj);
                return oVar;
            case 9:
                s.l lVar = (s.l) obj;
                kotlin.jvm.internal.l.f("$this$AnimatedContent", lVar);
                if (((Boolean) lVar.c()).booleanValue()) {
                    return u5.f.z(s.z.g(new d0(i13), t.d.n(300, 150, null, 4)).a(s.z.c(t.d.n(300, 150, null, 4), 2)), s.z.d(null, 3));
                }
                return u5.f.z(s.z.c(null, 3), s.z.i(new d0(i13)).a(s.z.d(null, 3)));
            case 10:
                pi.g gVar = (pi.g) obj;
                kotlin.jvm.internal.l.f("it", gVar);
                return gVar.f13486c;
            case 11:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("it", str);
                return str;
            case 12:
                kotlin.jvm.internal.l.f("it", (eh.a) obj);
                return oVar;
            case 13:
                String str2 = (String) obj;
                kotlin.jvm.internal.l.f("path", str2);
                LuaManager.Execute(str2);
                return oVar;
            case 14:
                i1.d dVar = (i1.d) obj;
                kotlin.jvm.internal.l.f("$this$Canvas", dVar);
                long j = g1.t.f6907d;
                float f9 = 2;
                float f10 = 4;
                i1.d.u0(dVar, j, dVar.W(f9), vd.a.b(f1.f.d(dVar.e()) - dVar.W(f10), f1.f.b(dVar.e()) - dVar.W(f10)), null, R.styleable.AppCompatTheme_windowNoTitle);
                float f11 = 10;
                i1.d.u0(dVar, j, dVar.W(f9), vd.a.b(f1.f.d(dVar.e()) - dVar.W(f11), f1.f.b(dVar.e()) - dVar.W(f10)), null, R.styleable.AppCompatTheme_windowNoTitle);
                i1.d.u0(dVar, j, dVar.W(f9), vd.a.b(f1.f.d(dVar.e()) - dVar.W(f10), f1.f.b(dVar.e()) - dVar.W(f11)), null, R.styleable.AppCompatTheme_windowNoTitle);
                return oVar;
            case 15:
                String str3 = (String) obj;
                kotlin.jvm.internal.l.f("path", str3);
                LuaManager.StopExecute(str3);
                return oVar;
            case 16:
                kotlin.jvm.internal.l.f("it", (eh.a) obj);
                return oVar;
            case 17:
                ((Boolean) obj).getClass();
                return oVar;
            case 18:
                uf.c cVar = (uf.c) obj;
                kotlin.jvm.internal.l.f("it", cVar);
                cVar.d0();
                return oVar;
            case 19:
                uf.c cVar2 = (uf.c) obj;
                kotlin.jvm.internal.l.f("it", cVar2);
                cVar2.d0();
                return oVar;
            case 20:
                return Boolean.valueOf(!((we.h) obj).f19172c);
            case 21:
                ((we.x) obj).getClass();
                return false;
            case 22:
                throw s.h0.d(obj);
            case 23:
                String str4 = (String) obj;
                kotlin.jvm.internal.l.f("it", str4);
                wi.f fVar = wi.d.f19296b;
                fVar.getClass();
                rh.h1 h1Var = fVar.f19305f;
                h1Var.getClass();
                h1Var.k(null, str4);
                return oVar;
            case 24:
                String str5 = (String) obj;
                kotlin.jvm.internal.l.f("it", str5);
                wi.f fVar2 = wi.d.f19296b;
                fVar2.getClass();
                rh.h1 h1Var2 = fVar2.j;
                h1Var2.getClass();
                h1Var2.k(null, str5);
                return oVar;
            case 25:
                int i14 = ScriptMain.f9882i;
                kotlin.jvm.internal.l.f("$this$NavHost", (s.l) obj);
                return s.z.c(t.d.n(700, 0, null, 6), 2);
            default:
                int i15 = ScriptMain.f9882i;
                kotlin.jvm.internal.l.f("$this$NavHost", (s.l) obj);
                return s.z.d(t.d.n(700, 0, null, 6), 2);
        }
    }
}
