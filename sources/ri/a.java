package ri;

import a1.k;
import androidx.compose.material.icons.filled.DesktopMacKt;
import androidx.work.v;
import com.rtsoft.growtopia.R;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import fi.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import k0.g;
import kotlin.jvm.internal.l;
import launcher.powerkuy.App;
import launcher.powerkuy.growlauncher.api.model.AppConfiguration;
import m0.a0;
import o0.d1;
import o0.h1;
import o0.n0;
import o0.o;
import o0.p;
import rg.m;
import t1.h0;
import t1.w0;
import v1.h;
import v1.j;
import v1.n;
import w0.f;
import y.i;
import y.r;
import y.r0;
import y.s;
import y.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0.a f14864a = new w0.a(1780837341, new qi.b(5), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w0.a f14865b = new w0.a(-1025165380, new qi.b(6), false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0.a f14866c = new w0.a(919037350, new t(24), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0.a f14867d = new w0.a(-1745593969, new t(25), false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w0.a f14868e = new w0.a(-1433921166, new t(26), false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w0.a f14869f = new w0.a(-2128649735, new t(27), false);

    static {
        new w0.a(750450324, new t(28), false);
    }

    public static final void a(final String str, final boolean z3, final eh.a aVar, final eh.a aVar2, o oVar, int i10) {
        o oVar2;
        l.f("mac", str);
        l.f("onUse", aVar);
        l.f("onDelete", aVar2);
        oVar.V(-28465247);
        if ((((oVar.f(str) ? 4 : 2) | i10 | (oVar.g(z3) ? 32 : 16) | (oVar.h(aVar) ? 256 : 128) | (oVar.h(aVar2) ? 2048 : 1024)) & 1171) == 1170 && oVar.D()) {
            oVar.P();
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            xd.c.c(androidx.compose.foundation.layout.c.f(k.f196a, 1.0f), null, null, f.b(oVar, -315366, new eh.f() { // from class: ri.d
                @Override // eh.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    o oVar3 = (o) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    l.f("$this$GLCardSimple", (s) obj);
                    if ((iIntValue & 17) == 16 && oVar3.D()) {
                        oVar3.P();
                    } else {
                        a1.c cVar = a1.a.f183y;
                        oVar3.U(693286680);
                        h0 h0VarA = r0.a(i.f19952a, cVar, oVar3);
                        oVar3.U(-1323940314);
                        int i11 = oVar3.P;
                        d1 d1VarN = oVar3.n();
                        j.f18438q.getClass();
                        n nVar = v1.i.f18413b;
                        k kVar = k.f196a;
                        w0.a aVarJ = w0.j(kVar);
                        oVar3.X();
                        if (oVar3.O) {
                            oVar3.m(nVar);
                        } else {
                            oVar3.j0();
                        }
                        h hVar = v1.i.f18417f;
                        p.Q(hVar, h0VarA, oVar3);
                        h hVar2 = v1.i.f18416e;
                        p.Q(hVar2, d1VarN, oVar3);
                        h hVar3 = v1.i.f18420i;
                        if (oVar3.O || !l.a(oVar3.L(), Integer.valueOf(i11))) {
                            g.t(i11, oVar3, i11, hVar3);
                        }
                        g.z(oVar3, aVarJ, oVar3, 0, 2058660585);
                        a1.n nVarA = s0.a(s0.f19994a, kVar, 1.0f);
                        oVar3.U(-483455358);
                        h0 h0VarA2 = r.a(i.f19954c, a1.a.A, oVar3);
                        oVar3.U(-1323940314);
                        int i12 = oVar3.P;
                        d1 d1VarN2 = oVar3.n();
                        w0.a aVarJ2 = w0.j(nVarA);
                        oVar3.X();
                        if (oVar3.O) {
                            oVar3.m(nVar);
                        } else {
                            oVar3.j0();
                        }
                        p.Q(hVar, h0VarA2, oVar3);
                        p.Q(hVar2, d1VarN2, oVar3);
                        if (oVar3.O || !l.a(oVar3.L(), Integer.valueOf(i12))) {
                            g.t(i12, oVar3, i12, hVar3);
                        }
                        g.z(oVar3, aVarJ2, oVar3, 0, 2058660585);
                        v.b(str, null, 0L, null, oVar3, 0, 14);
                        boolean z10 = z3;
                        if (z10) {
                            oVar3.U(-1706110832);
                            v.b("Active", null, 0L, null, oVar3, 6, 14);
                        } else {
                            oVar3.U(-1354312574);
                        }
                        oVar3.r(false);
                        g.A(oVar3, false, true, false, false);
                        w9.a.b(aVar, null, !z10, null, a.f14866c, oVar3, 24576, 10);
                        ud.a.h(androidx.compose.foundation.layout.c.q(kVar, t6.k.u(4, oVar3)), oVar3);
                        w9.a.b(aVar2, null, false, a0.c(0L, oVar3, 15), a.f14867d, oVar3, 24576, 6);
                        g.A(oVar3, false, true, false, false);
                    }
                    return qg.o.f13926a;
                }
            }), oVar2, 3078, 6);
        }
        h1 h1VarV = oVar2.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new oi.a(i10, 1, aVar, aVar2, str, z3);
        }
    }

    public static final void b(a1.n nVar, hi.a aVar, final li.g gVar, o oVar, int i10) {
        l.f("config", aVar);
        oVar.V(-1163174434);
        int i11 = i10 | (oVar.f(nVar) ? 4 : 2) | (oVar.h(aVar) ? 32 : 16) | (oVar.h(gVar) ? 256 : 128);
        if ((i11 & 147) == 146 && oVar.D()) {
            oVar.P();
        } else {
            o0.s0 s0VarU = p.u(gVar.f9968e, oVar);
            o0.s0 s0VarU2 = p.u(gVar.f9970g, oVar);
            j0.a aVar2 = j0.a.f8712a;
            k1.f desktopMac = DesktopMacKt.getDesktopMac(aVar2);
            Boolean boolValueOf = Boolean.valueOf(((AppConfiguration) s0VarU.getValue()).getFullscreen());
            oVar.U(5004770);
            int i12 = i11 & 896;
            boolean z3 = i12 == 256 || oVar.h(gVar);
            Object objL = oVar.L();
            n0 n0Var = o0.k.f12458a;
            if (z3 || objL == n0Var) {
                final int i13 = 0;
                objL = new eh.e() { // from class: ri.c
                    @Override // eh.e
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        Object value2;
                        char cCharAt;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i14 = i13;
                        int i15 = 0;
                        qg.o oVar2 = qg.o.f13926a;
                        li.g gVar2 = gVar;
                        switch (i14) {
                            case 0:
                                l.f("value1", obj);
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var = gVar2.f9967d;
                                do {
                                    value = h1Var.getValue();
                                } while (!h1Var.i(value, AppConfiguration.copy$default((AppConfiguration) value, zBooleanValue, false, 2, null)));
                                App app = App.f9849i;
                                l.e("ctx", app);
                                jj.d.I(app, "fullscreen", zBooleanValue);
                                break;
                            case 1:
                                l.f("value1", obj);
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var2 = gVar2.f9967d;
                                do {
                                    value2 = h1Var2.getValue();
                                } while (!h1Var2.i(value2, AppConfiguration.copy$default((AppConfiguration) value2, false, zBooleanValue2, 1, null)));
                                App app2 = App.f9849i;
                                l.e("ctx", app2);
                                jj.d.I(app2, "pin_luaeditor", zBooleanValue2);
                                break;
                            case 2:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar2.g((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    Random random = new Random();
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i15 < 6) {
                                        int iNextInt = random.nextInt(256);
                                        te.a.j(16);
                                        String string = Integer.toString(iNextInt, 16);
                                        l.e("toString(...)", string);
                                        sb2.append(nh.h.Z(string));
                                        if (i15 < 5) {
                                            sb2.append(":");
                                        }
                                        i15++;
                                    }
                                    String string2 = sb2.toString();
                                    l.e("toString(...)", string2);
                                    String upperCase = string2.toUpperCase(Locale.ROOT);
                                    l.e("toUpperCase(...)", upperCase);
                                    gVar2.g(upperCase);
                                }
                                break;
                            case 3:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar2.f((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    StringBuilder sb3 = new StringBuilder(36);
                                    while (i15 < 36) {
                                        if (i15 == 8 || i15 == 13 || i15 == 18 || i15 == 23) {
                                            cCharAt = '-';
                                        } else {
                                            ih.a aVar3 = ih.d.f8292i;
                                            cCharAt = "0123456789abcdef".charAt(ih.d.f8292i.f().nextInt(16));
                                        }
                                        sb3.append(cCharAt);
                                        i15++;
                                    }
                                    String string3 = sb3.toString();
                                    l.e("toString(...)", string3);
                                    gVar2.f(string3);
                                }
                                break;
                            case 4:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar2.h((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    kh.d dVar = new kh.d(1, 32, 1);
                                    ArrayList arrayList = new ArrayList(m.O(dVar, 10));
                                    kh.c it = dVar.iterator();
                                    while (it.f9626s) {
                                        it.nextInt();
                                        ih.a aVar4 = ih.d.f8292i;
                                        arrayList.add(Character.valueOf("0123456789ABCDEF".charAt(ih.d.f8292i.f().nextInt(16))));
                                    }
                                    gVar2.h(rg.l.j0(arrayList, PredefinedUICustomizationFont.defaultFamily, null, null, null, 62));
                                }
                                break;
                            case 5:
                                l.f("value1", obj);
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var3 = gVar2.f9965b;
                                do {
                                    value3 = h1Var3.getValue();
                                } while (!h1Var3.i(value3, hi.a.a((hi.a) value3, null, null, null, zBooleanValue3, null, null, 55)));
                                gVar2.e();
                                break;
                            case 6:
                                l.f("value1", obj);
                                String str = (String) obj;
                                rh.h1 h1Var4 = gVar2.f9965b;
                                do {
                                    value4 = h1Var4.getValue();
                                } while (!h1Var4.i(value4, hi.a.a((hi.a) value4, null, null, null, false, str, null, 47)));
                                gVar2.e();
                                break;
                            default:
                                l.f("value1", obj);
                                String str2 = (String) obj;
                                rh.h1 h1Var5 = gVar2.f9965b;
                                do {
                                    value5 = h1Var5.getValue();
                                } while (!h1Var5.i(value5, hi.a.a((hi.a) value5, null, null, null, false, null, str2, 31)));
                                gVar2.e();
                                break;
                        }
                        return oVar2;
                    }
                };
                oVar.g0(objL);
            }
            oVar.r(false);
            pi.g gVar2 = new pi.g(3, "-", "Fullscreen launch", "Use fullscreen mode when launch growtopia", desktopMac, boolValueOf, (eh.e) objL);
            k1.f desktopMac2 = DesktopMacKt.getDesktopMac(aVar2);
            Boolean boolValueOf2 = Boolean.valueOf(((AppConfiguration) s0VarU.getValue()).getPin_luaeditor());
            oVar.U(5004770);
            boolean z10 = i12 == 256 || oVar.h(gVar);
            Object objL2 = oVar.L();
            if (z10 || objL2 == n0Var) {
                final int i14 = 1;
                objL2 = new eh.e() { // from class: ri.c
                    @Override // eh.e
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        Object value2;
                        char cCharAt;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i142 = i14;
                        int i15 = 0;
                        qg.o oVar2 = qg.o.f13926a;
                        li.g gVar22 = gVar;
                        switch (i142) {
                            case 0:
                                l.f("value1", obj);
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var = gVar22.f9967d;
                                do {
                                    value = h1Var.getValue();
                                } while (!h1Var.i(value, AppConfiguration.copy$default((AppConfiguration) value, zBooleanValue, false, 2, null)));
                                App app = App.f9849i;
                                l.e("ctx", app);
                                jj.d.I(app, "fullscreen", zBooleanValue);
                                break;
                            case 1:
                                l.f("value1", obj);
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var2 = gVar22.f9967d;
                                do {
                                    value2 = h1Var2.getValue();
                                } while (!h1Var2.i(value2, AppConfiguration.copy$default((AppConfiguration) value2, false, zBooleanValue2, 1, null)));
                                App app2 = App.f9849i;
                                l.e("ctx", app2);
                                jj.d.I(app2, "pin_luaeditor", zBooleanValue2);
                                break;
                            case 2:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.g((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    Random random = new Random();
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i15 < 6) {
                                        int iNextInt = random.nextInt(256);
                                        te.a.j(16);
                                        String string = Integer.toString(iNextInt, 16);
                                        l.e("toString(...)", string);
                                        sb2.append(nh.h.Z(string));
                                        if (i15 < 5) {
                                            sb2.append(":");
                                        }
                                        i15++;
                                    }
                                    String string2 = sb2.toString();
                                    l.e("toString(...)", string2);
                                    String upperCase = string2.toUpperCase(Locale.ROOT);
                                    l.e("toUpperCase(...)", upperCase);
                                    gVar22.g(upperCase);
                                }
                                break;
                            case 3:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.f((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    StringBuilder sb3 = new StringBuilder(36);
                                    while (i15 < 36) {
                                        if (i15 == 8 || i15 == 13 || i15 == 18 || i15 == 23) {
                                            cCharAt = '-';
                                        } else {
                                            ih.a aVar3 = ih.d.f8292i;
                                            cCharAt = "0123456789abcdef".charAt(ih.d.f8292i.f().nextInt(16));
                                        }
                                        sb3.append(cCharAt);
                                        i15++;
                                    }
                                    String string3 = sb3.toString();
                                    l.e("toString(...)", string3);
                                    gVar22.f(string3);
                                }
                                break;
                            case 4:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.h((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    kh.d dVar = new kh.d(1, 32, 1);
                                    ArrayList arrayList = new ArrayList(m.O(dVar, 10));
                                    kh.c it = dVar.iterator();
                                    while (it.f9626s) {
                                        it.nextInt();
                                        ih.a aVar4 = ih.d.f8292i;
                                        arrayList.add(Character.valueOf("0123456789ABCDEF".charAt(ih.d.f8292i.f().nextInt(16))));
                                    }
                                    gVar22.h(rg.l.j0(arrayList, PredefinedUICustomizationFont.defaultFamily, null, null, null, 62));
                                }
                                break;
                            case 5:
                                l.f("value1", obj);
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var3 = gVar22.f9965b;
                                do {
                                    value3 = h1Var3.getValue();
                                } while (!h1Var3.i(value3, hi.a.a((hi.a) value3, null, null, null, zBooleanValue3, null, null, 55)));
                                gVar22.e();
                                break;
                            case 6:
                                l.f("value1", obj);
                                String str = (String) obj;
                                rh.h1 h1Var4 = gVar22.f9965b;
                                do {
                                    value4 = h1Var4.getValue();
                                } while (!h1Var4.i(value4, hi.a.a((hi.a) value4, null, null, null, false, str, null, 47)));
                                gVar22.e();
                                break;
                            default:
                                l.f("value1", obj);
                                String str2 = (String) obj;
                                rh.h1 h1Var5 = gVar22.f9965b;
                                do {
                                    value5 = h1Var5.getValue();
                                } while (!h1Var5.i(value5, hi.a.a((hi.a) value5, null, null, null, false, null, str2, 31)));
                                gVar22.e();
                                break;
                        }
                        return oVar2;
                    }
                };
                oVar.g0(objL2);
            }
            oVar.r(false);
            pi.g gVar3 = new pi.g(3, "-", "Pin Lua Editor", "Keep floating lua editor when menu is open", desktopMac2, boolValueOf2, (eh.e) objL2);
            k1.f desktopMac3 = DesktopMacKt.getDesktopMac(aVar2);
            String strF = aVar.f();
            oVar.U(5004770);
            boolean z11 = i12 == 256 || oVar.h(gVar);
            Object objL3 = oVar.L();
            if (z11 || objL3 == n0Var) {
                final int i15 = 2;
                objL3 = new eh.e() { // from class: ri.c
                    @Override // eh.e
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        Object value2;
                        char cCharAt;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i142 = i15;
                        int i152 = 0;
                        qg.o oVar2 = qg.o.f13926a;
                        li.g gVar22 = gVar;
                        switch (i142) {
                            case 0:
                                l.f("value1", obj);
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var = gVar22.f9967d;
                                do {
                                    value = h1Var.getValue();
                                } while (!h1Var.i(value, AppConfiguration.copy$default((AppConfiguration) value, zBooleanValue, false, 2, null)));
                                App app = App.f9849i;
                                l.e("ctx", app);
                                jj.d.I(app, "fullscreen", zBooleanValue);
                                break;
                            case 1:
                                l.f("value1", obj);
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var2 = gVar22.f9967d;
                                do {
                                    value2 = h1Var2.getValue();
                                } while (!h1Var2.i(value2, AppConfiguration.copy$default((AppConfiguration) value2, false, zBooleanValue2, 1, null)));
                                App app2 = App.f9849i;
                                l.e("ctx", app2);
                                jj.d.I(app2, "pin_luaeditor", zBooleanValue2);
                                break;
                            case 2:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.g((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    Random random = new Random();
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i152 < 6) {
                                        int iNextInt = random.nextInt(256);
                                        te.a.j(16);
                                        String string = Integer.toString(iNextInt, 16);
                                        l.e("toString(...)", string);
                                        sb2.append(nh.h.Z(string));
                                        if (i152 < 5) {
                                            sb2.append(":");
                                        }
                                        i152++;
                                    }
                                    String string2 = sb2.toString();
                                    l.e("toString(...)", string2);
                                    String upperCase = string2.toUpperCase(Locale.ROOT);
                                    l.e("toUpperCase(...)", upperCase);
                                    gVar22.g(upperCase);
                                }
                                break;
                            case 3:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.f((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    StringBuilder sb3 = new StringBuilder(36);
                                    while (i152 < 36) {
                                        if (i152 == 8 || i152 == 13 || i152 == 18 || i152 == 23) {
                                            cCharAt = '-';
                                        } else {
                                            ih.a aVar3 = ih.d.f8292i;
                                            cCharAt = "0123456789abcdef".charAt(ih.d.f8292i.f().nextInt(16));
                                        }
                                        sb3.append(cCharAt);
                                        i152++;
                                    }
                                    String string3 = sb3.toString();
                                    l.e("toString(...)", string3);
                                    gVar22.f(string3);
                                }
                                break;
                            case 4:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.h((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    kh.d dVar = new kh.d(1, 32, 1);
                                    ArrayList arrayList = new ArrayList(m.O(dVar, 10));
                                    kh.c it = dVar.iterator();
                                    while (it.f9626s) {
                                        it.nextInt();
                                        ih.a aVar4 = ih.d.f8292i;
                                        arrayList.add(Character.valueOf("0123456789ABCDEF".charAt(ih.d.f8292i.f().nextInt(16))));
                                    }
                                    gVar22.h(rg.l.j0(arrayList, PredefinedUICustomizationFont.defaultFamily, null, null, null, 62));
                                }
                                break;
                            case 5:
                                l.f("value1", obj);
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var3 = gVar22.f9965b;
                                do {
                                    value3 = h1Var3.getValue();
                                } while (!h1Var3.i(value3, hi.a.a((hi.a) value3, null, null, null, zBooleanValue3, null, null, 55)));
                                gVar22.e();
                                break;
                            case 6:
                                l.f("value1", obj);
                                String str = (String) obj;
                                rh.h1 h1Var4 = gVar22.f9965b;
                                do {
                                    value4 = h1Var4.getValue();
                                } while (!h1Var4.i(value4, hi.a.a((hi.a) value4, null, null, null, false, str, null, 47)));
                                gVar22.e();
                                break;
                            default:
                                l.f("value1", obj);
                                String str2 = (String) obj;
                                rh.h1 h1Var5 = gVar22.f9965b;
                                do {
                                    value5 = h1Var5.getValue();
                                } while (!h1Var5.i(value5, hi.a.a((hi.a) value5, null, null, null, false, null, str2, 31)));
                                gVar22.e();
                                break;
                        }
                        return oVar2;
                    }
                };
                oVar.g0(objL3);
            }
            oVar.r(false);
            pi.g gVar4 = new pi.g(2, "SETTING_MAC", "Mac Address", "Modify your mac address to login growtopia.", desktopMac3, strF, (eh.e) objL3);
            k1.f desktopMac4 = DesktopMacKt.getDesktopMac(aVar2);
            String strB = aVar.b();
            oVar.U(5004770);
            boolean z12 = i12 == 256 || oVar.h(gVar);
            Object objL4 = oVar.L();
            if (z12 || objL4 == n0Var) {
                final int i16 = 3;
                objL4 = new eh.e() { // from class: ri.c
                    @Override // eh.e
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        Object value2;
                        char cCharAt;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i142 = i16;
                        int i152 = 0;
                        qg.o oVar2 = qg.o.f13926a;
                        li.g gVar22 = gVar;
                        switch (i142) {
                            case 0:
                                l.f("value1", obj);
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var = gVar22.f9967d;
                                do {
                                    value = h1Var.getValue();
                                } while (!h1Var.i(value, AppConfiguration.copy$default((AppConfiguration) value, zBooleanValue, false, 2, null)));
                                App app = App.f9849i;
                                l.e("ctx", app);
                                jj.d.I(app, "fullscreen", zBooleanValue);
                                break;
                            case 1:
                                l.f("value1", obj);
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var2 = gVar22.f9967d;
                                do {
                                    value2 = h1Var2.getValue();
                                } while (!h1Var2.i(value2, AppConfiguration.copy$default((AppConfiguration) value2, false, zBooleanValue2, 1, null)));
                                App app2 = App.f9849i;
                                l.e("ctx", app2);
                                jj.d.I(app2, "pin_luaeditor", zBooleanValue2);
                                break;
                            case 2:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.g((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    Random random = new Random();
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i152 < 6) {
                                        int iNextInt = random.nextInt(256);
                                        te.a.j(16);
                                        String string = Integer.toString(iNextInt, 16);
                                        l.e("toString(...)", string);
                                        sb2.append(nh.h.Z(string));
                                        if (i152 < 5) {
                                            sb2.append(":");
                                        }
                                        i152++;
                                    }
                                    String string2 = sb2.toString();
                                    l.e("toString(...)", string2);
                                    String upperCase = string2.toUpperCase(Locale.ROOT);
                                    l.e("toUpperCase(...)", upperCase);
                                    gVar22.g(upperCase);
                                }
                                break;
                            case 3:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.f((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    StringBuilder sb3 = new StringBuilder(36);
                                    while (i152 < 36) {
                                        if (i152 == 8 || i152 == 13 || i152 == 18 || i152 == 23) {
                                            cCharAt = '-';
                                        } else {
                                            ih.a aVar3 = ih.d.f8292i;
                                            cCharAt = "0123456789abcdef".charAt(ih.d.f8292i.f().nextInt(16));
                                        }
                                        sb3.append(cCharAt);
                                        i152++;
                                    }
                                    String string3 = sb3.toString();
                                    l.e("toString(...)", string3);
                                    gVar22.f(string3);
                                }
                                break;
                            case 4:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.h((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    kh.d dVar = new kh.d(1, 32, 1);
                                    ArrayList arrayList = new ArrayList(m.O(dVar, 10));
                                    kh.c it = dVar.iterator();
                                    while (it.f9626s) {
                                        it.nextInt();
                                        ih.a aVar4 = ih.d.f8292i;
                                        arrayList.add(Character.valueOf("0123456789ABCDEF".charAt(ih.d.f8292i.f().nextInt(16))));
                                    }
                                    gVar22.h(rg.l.j0(arrayList, PredefinedUICustomizationFont.defaultFamily, null, null, null, 62));
                                }
                                break;
                            case 5:
                                l.f("value1", obj);
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var3 = gVar22.f9965b;
                                do {
                                    value3 = h1Var3.getValue();
                                } while (!h1Var3.i(value3, hi.a.a((hi.a) value3, null, null, null, zBooleanValue3, null, null, 55)));
                                gVar22.e();
                                break;
                            case 6:
                                l.f("value1", obj);
                                String str = (String) obj;
                                rh.h1 h1Var4 = gVar22.f9965b;
                                do {
                                    value4 = h1Var4.getValue();
                                } while (!h1Var4.i(value4, hi.a.a((hi.a) value4, null, null, null, false, str, null, 47)));
                                gVar22.e();
                                break;
                            default:
                                l.f("value1", obj);
                                String str2 = (String) obj;
                                rh.h1 h1Var5 = gVar22.f9965b;
                                do {
                                    value5 = h1Var5.getValue();
                                } while (!h1Var5.i(value5, hi.a.a((hi.a) value5, null, null, null, false, null, str2, 31)));
                                gVar22.e();
                                break;
                        }
                        return oVar2;
                    }
                };
                oVar.g0(objL4);
            }
            oVar.r(false);
            pi.g gVar5 = new pi.g(2, "SETTING_GID", "Setting GID", "Modify your GID to login growtopia.", desktopMac4, strB, (eh.e) objL4);
            k1.f desktopMac5 = DesktopMacKt.getDesktopMac(aVar2);
            String strG = aVar.g();
            oVar.U(5004770);
            boolean z13 = i12 == 256 || oVar.h(gVar);
            Object objL5 = oVar.L();
            if (z13 || objL5 == n0Var) {
                final int i17 = 4;
                objL5 = new eh.e() { // from class: ri.c
                    @Override // eh.e
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        Object value2;
                        char cCharAt;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i142 = i17;
                        int i152 = 0;
                        qg.o oVar2 = qg.o.f13926a;
                        li.g gVar22 = gVar;
                        switch (i142) {
                            case 0:
                                l.f("value1", obj);
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var = gVar22.f9967d;
                                do {
                                    value = h1Var.getValue();
                                } while (!h1Var.i(value, AppConfiguration.copy$default((AppConfiguration) value, zBooleanValue, false, 2, null)));
                                App app = App.f9849i;
                                l.e("ctx", app);
                                jj.d.I(app, "fullscreen", zBooleanValue);
                                break;
                            case 1:
                                l.f("value1", obj);
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var2 = gVar22.f9967d;
                                do {
                                    value2 = h1Var2.getValue();
                                } while (!h1Var2.i(value2, AppConfiguration.copy$default((AppConfiguration) value2, false, zBooleanValue2, 1, null)));
                                App app2 = App.f9849i;
                                l.e("ctx", app2);
                                jj.d.I(app2, "pin_luaeditor", zBooleanValue2);
                                break;
                            case 2:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.g((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    Random random = new Random();
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i152 < 6) {
                                        int iNextInt = random.nextInt(256);
                                        te.a.j(16);
                                        String string = Integer.toString(iNextInt, 16);
                                        l.e("toString(...)", string);
                                        sb2.append(nh.h.Z(string));
                                        if (i152 < 5) {
                                            sb2.append(":");
                                        }
                                        i152++;
                                    }
                                    String string2 = sb2.toString();
                                    l.e("toString(...)", string2);
                                    String upperCase = string2.toUpperCase(Locale.ROOT);
                                    l.e("toUpperCase(...)", upperCase);
                                    gVar22.g(upperCase);
                                }
                                break;
                            case 3:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.f((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    StringBuilder sb3 = new StringBuilder(36);
                                    while (i152 < 36) {
                                        if (i152 == 8 || i152 == 13 || i152 == 18 || i152 == 23) {
                                            cCharAt = '-';
                                        } else {
                                            ih.a aVar3 = ih.d.f8292i;
                                            cCharAt = "0123456789abcdef".charAt(ih.d.f8292i.f().nextInt(16));
                                        }
                                        sb3.append(cCharAt);
                                        i152++;
                                    }
                                    String string3 = sb3.toString();
                                    l.e("toString(...)", string3);
                                    gVar22.f(string3);
                                }
                                break;
                            case 4:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.h((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    kh.d dVar = new kh.d(1, 32, 1);
                                    ArrayList arrayList = new ArrayList(m.O(dVar, 10));
                                    kh.c it = dVar.iterator();
                                    while (it.f9626s) {
                                        it.nextInt();
                                        ih.a aVar4 = ih.d.f8292i;
                                        arrayList.add(Character.valueOf("0123456789ABCDEF".charAt(ih.d.f8292i.f().nextInt(16))));
                                    }
                                    gVar22.h(rg.l.j0(arrayList, PredefinedUICustomizationFont.defaultFamily, null, null, null, 62));
                                }
                                break;
                            case 5:
                                l.f("value1", obj);
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var3 = gVar22.f9965b;
                                do {
                                    value3 = h1Var3.getValue();
                                } while (!h1Var3.i(value3, hi.a.a((hi.a) value3, null, null, null, zBooleanValue3, null, null, 55)));
                                gVar22.e();
                                break;
                            case 6:
                                l.f("value1", obj);
                                String str = (String) obj;
                                rh.h1 h1Var4 = gVar22.f9965b;
                                do {
                                    value4 = h1Var4.getValue();
                                } while (!h1Var4.i(value4, hi.a.a((hi.a) value4, null, null, null, false, str, null, 47)));
                                gVar22.e();
                                break;
                            default:
                                l.f("value1", obj);
                                String str2 = (String) obj;
                                rh.h1 h1Var5 = gVar22.f9965b;
                                do {
                                    value5 = h1Var5.getValue();
                                } while (!h1Var5.i(value5, hi.a.a((hi.a) value5, null, null, null, false, null, str2, 31)));
                                gVar22.e();
                                break;
                        }
                        return oVar2;
                    }
                };
                oVar.g0(objL5);
            }
            oVar.r(false);
            pi.g gVar6 = new pi.g(2, "SETTING_RID", "Setting RID", "Modify your RID (device identifier) to login growtopia.", desktopMac5, strG, (eh.e) objL5);
            k1.f desktopMac6 = DesktopMacKt.getDesktopMac(aVar2);
            Boolean boolValueOf3 = Boolean.valueOf(aVar.d());
            oVar.U(5004770);
            boolean z14 = i12 == 256 || oVar.h(gVar);
            Object objL6 = oVar.L();
            if (z14 || objL6 == n0Var) {
                final int i18 = 5;
                objL6 = new eh.e() { // from class: ri.c
                    @Override // eh.e
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        Object value2;
                        char cCharAt;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i142 = i18;
                        int i152 = 0;
                        qg.o oVar2 = qg.o.f13926a;
                        li.g gVar22 = gVar;
                        switch (i142) {
                            case 0:
                                l.f("value1", obj);
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var = gVar22.f9967d;
                                do {
                                    value = h1Var.getValue();
                                } while (!h1Var.i(value, AppConfiguration.copy$default((AppConfiguration) value, zBooleanValue, false, 2, null)));
                                App app = App.f9849i;
                                l.e("ctx", app);
                                jj.d.I(app, "fullscreen", zBooleanValue);
                                break;
                            case 1:
                                l.f("value1", obj);
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var2 = gVar22.f9967d;
                                do {
                                    value2 = h1Var2.getValue();
                                } while (!h1Var2.i(value2, AppConfiguration.copy$default((AppConfiguration) value2, false, zBooleanValue2, 1, null)));
                                App app2 = App.f9849i;
                                l.e("ctx", app2);
                                jj.d.I(app2, "pin_luaeditor", zBooleanValue2);
                                break;
                            case 2:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.g((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    Random random = new Random();
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i152 < 6) {
                                        int iNextInt = random.nextInt(256);
                                        te.a.j(16);
                                        String string = Integer.toString(iNextInt, 16);
                                        l.e("toString(...)", string);
                                        sb2.append(nh.h.Z(string));
                                        if (i152 < 5) {
                                            sb2.append(":");
                                        }
                                        i152++;
                                    }
                                    String string2 = sb2.toString();
                                    l.e("toString(...)", string2);
                                    String upperCase = string2.toUpperCase(Locale.ROOT);
                                    l.e("toUpperCase(...)", upperCase);
                                    gVar22.g(upperCase);
                                }
                                break;
                            case 3:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.f((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    StringBuilder sb3 = new StringBuilder(36);
                                    while (i152 < 36) {
                                        if (i152 == 8 || i152 == 13 || i152 == 18 || i152 == 23) {
                                            cCharAt = '-';
                                        } else {
                                            ih.a aVar3 = ih.d.f8292i;
                                            cCharAt = "0123456789abcdef".charAt(ih.d.f8292i.f().nextInt(16));
                                        }
                                        sb3.append(cCharAt);
                                        i152++;
                                    }
                                    String string3 = sb3.toString();
                                    l.e("toString(...)", string3);
                                    gVar22.f(string3);
                                }
                                break;
                            case 4:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.h((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    kh.d dVar = new kh.d(1, 32, 1);
                                    ArrayList arrayList = new ArrayList(m.O(dVar, 10));
                                    kh.c it = dVar.iterator();
                                    while (it.f9626s) {
                                        it.nextInt();
                                        ih.a aVar4 = ih.d.f8292i;
                                        arrayList.add(Character.valueOf("0123456789ABCDEF".charAt(ih.d.f8292i.f().nextInt(16))));
                                    }
                                    gVar22.h(rg.l.j0(arrayList, PredefinedUICustomizationFont.defaultFamily, null, null, null, 62));
                                }
                                break;
                            case 5:
                                l.f("value1", obj);
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var3 = gVar22.f9965b;
                                do {
                                    value3 = h1Var3.getValue();
                                } while (!h1Var3.i(value3, hi.a.a((hi.a) value3, null, null, null, zBooleanValue3, null, null, 55)));
                                gVar22.e();
                                break;
                            case 6:
                                l.f("value1", obj);
                                String str = (String) obj;
                                rh.h1 h1Var4 = gVar22.f9965b;
                                do {
                                    value4 = h1Var4.getValue();
                                } while (!h1Var4.i(value4, hi.a.a((hi.a) value4, null, null, null, false, str, null, 47)));
                                gVar22.e();
                                break;
                            default:
                                l.f("value1", obj);
                                String str2 = (String) obj;
                                rh.h1 h1Var5 = gVar22.f9965b;
                                do {
                                    value5 = h1Var5.getValue();
                                } while (!h1Var5.i(value5, hi.a.a((hi.a) value5, null, null, null, false, null, str2, 31)));
                                gVar22.e();
                                break;
                        }
                        return oVar2;
                    }
                };
                oVar.g0(objL6);
            }
            oVar.r(false);
            pi.g gVar7 = new pi.g(3, "SETTING_GL_SPOOF", "Spoof OpenGL", "Report custom OpenGL version and extensions to growtopia.", desktopMac6, boolValueOf3, (eh.e) objL6);
            k1.f desktopMac7 = DesktopMacKt.getDesktopMac(aVar2);
            String strE = aVar.e();
            oVar.U(5004770);
            boolean z15 = i12 == 256 || oVar.h(gVar);
            Object objL7 = oVar.L();
            if (z15 || objL7 == n0Var) {
                final int i19 = 6;
                objL7 = new eh.e() { // from class: ri.c
                    @Override // eh.e
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        Object value2;
                        char cCharAt;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i142 = i19;
                        int i152 = 0;
                        qg.o oVar2 = qg.o.f13926a;
                        li.g gVar22 = gVar;
                        switch (i142) {
                            case 0:
                                l.f("value1", obj);
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var = gVar22.f9967d;
                                do {
                                    value = h1Var.getValue();
                                } while (!h1Var.i(value, AppConfiguration.copy$default((AppConfiguration) value, zBooleanValue, false, 2, null)));
                                App app = App.f9849i;
                                l.e("ctx", app);
                                jj.d.I(app, "fullscreen", zBooleanValue);
                                break;
                            case 1:
                                l.f("value1", obj);
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var2 = gVar22.f9967d;
                                do {
                                    value2 = h1Var2.getValue();
                                } while (!h1Var2.i(value2, AppConfiguration.copy$default((AppConfiguration) value2, false, zBooleanValue2, 1, null)));
                                App app2 = App.f9849i;
                                l.e("ctx", app2);
                                jj.d.I(app2, "pin_luaeditor", zBooleanValue2);
                                break;
                            case 2:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.g((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    Random random = new Random();
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i152 < 6) {
                                        int iNextInt = random.nextInt(256);
                                        te.a.j(16);
                                        String string = Integer.toString(iNextInt, 16);
                                        l.e("toString(...)", string);
                                        sb2.append(nh.h.Z(string));
                                        if (i152 < 5) {
                                            sb2.append(":");
                                        }
                                        i152++;
                                    }
                                    String string2 = sb2.toString();
                                    l.e("toString(...)", string2);
                                    String upperCase = string2.toUpperCase(Locale.ROOT);
                                    l.e("toUpperCase(...)", upperCase);
                                    gVar22.g(upperCase);
                                }
                                break;
                            case 3:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.f((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    StringBuilder sb3 = new StringBuilder(36);
                                    while (i152 < 36) {
                                        if (i152 == 8 || i152 == 13 || i152 == 18 || i152 == 23) {
                                            cCharAt = '-';
                                        } else {
                                            ih.a aVar3 = ih.d.f8292i;
                                            cCharAt = "0123456789abcdef".charAt(ih.d.f8292i.f().nextInt(16));
                                        }
                                        sb3.append(cCharAt);
                                        i152++;
                                    }
                                    String string3 = sb3.toString();
                                    l.e("toString(...)", string3);
                                    gVar22.f(string3);
                                }
                                break;
                            case 4:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.h((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    kh.d dVar = new kh.d(1, 32, 1);
                                    ArrayList arrayList = new ArrayList(m.O(dVar, 10));
                                    kh.c it = dVar.iterator();
                                    while (it.f9626s) {
                                        it.nextInt();
                                        ih.a aVar4 = ih.d.f8292i;
                                        arrayList.add(Character.valueOf("0123456789ABCDEF".charAt(ih.d.f8292i.f().nextInt(16))));
                                    }
                                    gVar22.h(rg.l.j0(arrayList, PredefinedUICustomizationFont.defaultFamily, null, null, null, 62));
                                }
                                break;
                            case 5:
                                l.f("value1", obj);
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var3 = gVar22.f9965b;
                                do {
                                    value3 = h1Var3.getValue();
                                } while (!h1Var3.i(value3, hi.a.a((hi.a) value3, null, null, null, zBooleanValue3, null, null, 55)));
                                gVar22.e();
                                break;
                            case 6:
                                l.f("value1", obj);
                                String str = (String) obj;
                                rh.h1 h1Var4 = gVar22.f9965b;
                                do {
                                    value4 = h1Var4.getValue();
                                } while (!h1Var4.i(value4, hi.a.a((hi.a) value4, null, null, null, false, str, null, 47)));
                                gVar22.e();
                                break;
                            default:
                                l.f("value1", obj);
                                String str2 = (String) obj;
                                rh.h1 h1Var5 = gVar22.f9965b;
                                do {
                                    value5 = h1Var5.getValue();
                                } while (!h1Var5.i(value5, hi.a.a((hi.a) value5, null, null, null, false, null, str2, 31)));
                                gVar22.e();
                                break;
                        }
                        return oVar2;
                    }
                };
                oVar.g0(objL7);
            }
            oVar.r(false);
            pi.g gVar8 = new pi.g(1, "SETTING_GL_VERSION", "OpenGL Version", "Custom OpenGL Version for Growtopia.", desktopMac7, strE, (eh.e) objL7);
            k1.f desktopMac8 = DesktopMacKt.getDesktopMac(aVar2);
            String strC = aVar.c();
            oVar.U(5004770);
            boolean z16 = i12 == 256 || oVar.h(gVar);
            Object objL8 = oVar.L();
            if (z16 || objL8 == n0Var) {
                final int i20 = 7;
                objL8 = new eh.e() { // from class: ri.c
                    @Override // eh.e
                    public final Object invoke(Object obj, Object obj2) {
                        Object value;
                        Object value2;
                        char cCharAt;
                        Object value3;
                        Object value4;
                        Object value5;
                        int i142 = i20;
                        int i152 = 0;
                        qg.o oVar2 = qg.o.f13926a;
                        li.g gVar22 = gVar;
                        switch (i142) {
                            case 0:
                                l.f("value1", obj);
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var = gVar22.f9967d;
                                do {
                                    value = h1Var.getValue();
                                } while (!h1Var.i(value, AppConfiguration.copy$default((AppConfiguration) value, zBooleanValue, false, 2, null)));
                                App app = App.f9849i;
                                l.e("ctx", app);
                                jj.d.I(app, "fullscreen", zBooleanValue);
                                break;
                            case 1:
                                l.f("value1", obj);
                                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var2 = gVar22.f9967d;
                                do {
                                    value2 = h1Var2.getValue();
                                } while (!h1Var2.i(value2, AppConfiguration.copy$default((AppConfiguration) value2, false, zBooleanValue2, 1, null)));
                                App app2 = App.f9849i;
                                l.e("ctx", app2);
                                jj.d.I(app2, "pin_luaeditor", zBooleanValue2);
                                break;
                            case 2:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.g((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    Random random = new Random();
                                    StringBuilder sb2 = new StringBuilder();
                                    while (i152 < 6) {
                                        int iNextInt = random.nextInt(256);
                                        te.a.j(16);
                                        String string = Integer.toString(iNextInt, 16);
                                        l.e("toString(...)", string);
                                        sb2.append(nh.h.Z(string));
                                        if (i152 < 5) {
                                            sb2.append(":");
                                        }
                                        i152++;
                                    }
                                    String string2 = sb2.toString();
                                    l.e("toString(...)", string2);
                                    String upperCase = string2.toUpperCase(Locale.ROOT);
                                    l.e("toUpperCase(...)", upperCase);
                                    gVar22.g(upperCase);
                                }
                                break;
                            case 3:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.f((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    StringBuilder sb3 = new StringBuilder(36);
                                    while (i152 < 36) {
                                        if (i152 == 8 || i152 == 13 || i152 == 18 || i152 == 23) {
                                            cCharAt = '-';
                                        } else {
                                            ih.a aVar3 = ih.d.f8292i;
                                            cCharAt = "0123456789abcdef".charAt(ih.d.f8292i.f().nextInt(16));
                                        }
                                        sb3.append(cCharAt);
                                        i152++;
                                    }
                                    String string3 = sb3.toString();
                                    l.e("toString(...)", string3);
                                    gVar22.f(string3);
                                }
                                break;
                            case 4:
                                l.f("value1", obj);
                                if (l.a(obj2, 1)) {
                                    gVar22.h((String) obj);
                                }
                                if (l.a(obj2, 2)) {
                                    kh.d dVar = new kh.d(1, 32, 1);
                                    ArrayList arrayList = new ArrayList(m.O(dVar, 10));
                                    kh.c it = dVar.iterator();
                                    while (it.f9626s) {
                                        it.nextInt();
                                        ih.a aVar4 = ih.d.f8292i;
                                        arrayList.add(Character.valueOf("0123456789ABCDEF".charAt(ih.d.f8292i.f().nextInt(16))));
                                    }
                                    gVar22.h(rg.l.j0(arrayList, PredefinedUICustomizationFont.defaultFamily, null, null, null, 62));
                                }
                                break;
                            case 5:
                                l.f("value1", obj);
                                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                                rh.h1 h1Var3 = gVar22.f9965b;
                                do {
                                    value3 = h1Var3.getValue();
                                } while (!h1Var3.i(value3, hi.a.a((hi.a) value3, null, null, null, zBooleanValue3, null, null, 55)));
                                gVar22.e();
                                break;
                            case 6:
                                l.f("value1", obj);
                                String str = (String) obj;
                                rh.h1 h1Var4 = gVar22.f9965b;
                                do {
                                    value4 = h1Var4.getValue();
                                } while (!h1Var4.i(value4, hi.a.a((hi.a) value4, null, null, null, false, str, null, 47)));
                                gVar22.e();
                                break;
                            default:
                                l.f("value1", obj);
                                String str2 = (String) obj;
                                rh.h1 h1Var5 = gVar22.f9965b;
                                do {
                                    value5 = h1Var5.getValue();
                                } while (!h1Var5.i(value5, hi.a.a((hi.a) value5, null, null, null, false, null, str2, 31)));
                                gVar22.e();
                                break;
                        }
                        return oVar2;
                    }
                };
                oVar.g0(objL8);
            }
            oVar.r(false);
            List listD = sb.c.D(gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, new pi.g(1, "SETTING_GL_EXTENSIONS", "OpenGL Extensions", "Custom OpenGL Extension for Growtopia.", desktopMac8, strC, (eh.e) objL8));
            a1.n nVarK = androidx.compose.foundation.layout.a.k(nVar.j(androidx.compose.foundation.layout.c.f1184c), t6.k.u(20, oVar), 0.0f, 2);
            oVar.U(-1224400529);
            boolean zH = oVar.h(listD) | (i12 == 256 || oVar.h(gVar)) | oVar.f(s0VarU2) | ((i11 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 32 || oVar.h(aVar));
            Object objL9 = oVar.L();
            if (zH || objL9 == n0Var) {
                fi.k kVar = new fi.k(listD, gVar, s0VarU2, aVar, 2);
                oVar.g0(kVar);
                objL9 = kVar;
            }
            oVar.r(false);
            k8.g.a(nVarK, null, null, null, null, null, false, (eh.c) objL9, oVar, 0, 254);
        }
        h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new fi.h(nVar, aVar, gVar, i10, 12);
        }
    }
}
