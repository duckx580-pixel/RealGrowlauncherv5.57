package fi;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.material.icons.filled.DownloadKt;
import com.rtsoft.growtopia.R;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Locale;
import launcher.powerkuy.growlauncher.DeeplinkActivity;
import launcher.powerkuy.growlauncher.ScriptHubWebActivity;
import launcher.powerkuy.growlauncher.api.model.Creator;
import launcher.powerkuy.growlauncher.api.model.Script;
import m0.h4;
import m0.k3;
import m0.k5;
import m0.l7;
import m0.n7;
import m0.o7;
import m0.r2;
import m0.x3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6665i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6666r;

    public /* synthetic */ y(int i10, Object obj) {
        this.f6665i = i10;
        this.f6666r = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        String name;
        Script script = (Script) this.f6666r;
        o0.o oVar = (o0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.l.f("$this$Card", (y.s) obj);
        if ((iIntValue & 17) == 16 && oVar.D()) {
            oVar.P();
        } else {
            a1.k kVar = a1.k.f196a;
            a1.n nVarJ = androidx.compose.foundation.layout.a.i(kVar, 12).j(androidx.compose.foundation.layout.c.f1184c);
            y.c cVar = y.i.f19957f;
            oVar.U(-483455358);
            a1.b bVar = a1.a.A;
            t1.h0 h0VarA = y.r.a(cVar, bVar, oVar);
            oVar.U(-1323940314);
            int i10 = oVar.P;
            o0.d1 d1VarN = oVar.n();
            v1.j.f18438q.getClass();
            v1.n nVar = v1.i.f18413b;
            w0.a aVarJ = t1.w0.j(nVarJ);
            oVar.X();
            if (oVar.O) {
                oVar.m(nVar);
            } else {
                oVar.j0();
            }
            v1.h hVar = v1.i.f18417f;
            o0.p.Q(hVar, h0VarA, oVar);
            v1.h hVar2 = v1.i.f18416e;
            o0.p.Q(hVar2, d1VarN, oVar);
            v1.h hVar3 = v1.i.f18420i;
            if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i10))) {
                k0.g.t(i10, oVar, i10, hVar3);
            }
            k0.g.z(oVar, aVarJ, oVar, 0, 2058660585);
            oVar.U(-483455358);
            t1.h0 h0VarA2 = y.r.a(y.i.f19954c, bVar, oVar);
            oVar.U(-1323940314);
            int i11 = oVar.P;
            o0.d1 d1VarN2 = oVar.n();
            w0.a aVarJ2 = t1.w0.j(kVar);
            oVar.X();
            if (oVar.O) {
                oVar.m(nVar);
            } else {
                oVar.j0();
            }
            o0.p.Q(hVar, h0VarA2, oVar);
            o0.p.Q(hVar2, d1VarN2, oVar);
            if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i11))) {
                k0.g.t(i11, oVar, i11, hVar3);
            }
            k0.g.z(oVar, aVarJ2, oVar, 0, 2058660585);
            l7.b(script.getTitle(), null, m0.n1.t(oVar).i(), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, m0.n1.w(oVar).f11044h, oVar, 0, 3120, 55290);
            float f9 = 4;
            ud.a.h(androidx.compose.foundation.layout.c.h(kVar, f9), oVar);
            Creator creator = script.getCreator();
            if (creator == null || (name = creator.getName()) == null) {
                name = "Unknown";
            }
            l7.b(name, null, m0.n1.t(oVar).m(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, m0.n1.w(oVar).f11047l, oVar, 0, 0, 65530);
            ud.a.h(androidx.compose.foundation.layout.c.h(kVar, f9), oVar);
            String description = script.getDescription();
            if (description == null) {
                description = "No description.";
            }
            l7.b(description, null, m0.n1.t(oVar).j(), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, m0.n1.w(oVar).f11047l, oVar, 0, 3120, 55290);
            k0.g.A(oVar, false, true, false, false);
            oVar.U(693286680);
            t1.h0 h0VarA3 = y.r0.a(y.i.f19952a, a1.a.f182x, oVar);
            oVar.U(-1323940314);
            int i12 = oVar.P;
            o0.d1 d1VarN3 = oVar.n();
            w0.a aVarJ3 = t1.w0.j(kVar);
            oVar.X();
            if (oVar.O) {
                oVar.m(nVar);
            } else {
                oVar.j0();
            }
            o0.p.Q(hVar, h0VarA3, oVar);
            o0.p.Q(hVar2, d1VarN3, oVar);
            if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i12))) {
                k0.g.t(i12, oVar, i12, hVar3);
            }
            k0.g.z(oVar, aVarJ3, oVar, 0, 2058660585);
            m0.f2.b(DownloadKt.getDownload(j0.a.f8712a), "Downloads", androidx.compose.foundation.layout.c.n(kVar, 16), m0.n1.t(oVar).k(), oVar, 432, 0);
            ud.a.h(androidx.compose.foundation.layout.c.q(kVar, f9), oVar);
            l7.b(ki.a.c(script.getDownloads()).concat(" Downloads"), null, m0.n1.t(oVar).j(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, m0.n1.w(oVar).f11050o, oVar, 0, 0, 65530);
            k0.g.A(oVar, false, true, false, false);
            k0.g.A(oVar, false, true, false, false);
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o0.o oVar;
        boolean z3;
        o0.n0 n0Var;
        boolean z10;
        o0.o oVar2;
        boolean z11;
        int i10 = this.f6665i;
        o0.n0 n0Var2 = o0.k.f12458a;
        a1.k kVar = a1.k.f196a;
        int i11 = 14;
        final int i12 = 2;
        qg.o oVar3 = qg.o.f13926a;
        Object obj4 = this.f6666r;
        switch (i10) {
            case 0:
                o0.z0 z0Var = ((DeeplinkActivity) obj4).f9856i;
                o0.o oVar4 = (o0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i13 = DeeplinkActivity.f9855r;
                kotlin.jvm.internal.l.f("$this$Button", (y.s0) obj);
                if ((iIntValue & 17) == 16 && oVar4.D()) {
                    oVar4.P();
                } else {
                    if (((Boolean) z0Var.getValue()).booleanValue()) {
                        oVar4.U(-1896152798);
                        h4.a(androidx.compose.foundation.layout.c.n(kVar, 16), ((m0.e1) oVar4.k(m0.g1.f10686a)).e(), 2, 0L, 0, oVar4, 390, 24);
                        oVar = oVar4;
                        ud.a.h(androidx.compose.foundation.layout.c.q(kVar, 8), oVar);
                        z3 = false;
                    } else {
                        oVar = oVar4;
                        z3 = false;
                        oVar.U(-1900627772);
                    }
                    oVar.r(z3);
                    l7.b(((Boolean) z0Var.getValue()).booleanValue() ? "Importing…" : "Import", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131070);
                }
                return oVar3;
            case 1:
                ScriptHubWebActivity scriptHubWebActivity = (ScriptHubWebActivity) obj4;
                o0.z0 z0Var2 = scriptHubWebActivity.f9863s;
                y.m0 m0Var = (y.m0) obj;
                o0.o oVar5 = (o0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i14 = ScriptHubWebActivity.f9860v;
                kotlin.jvm.internal.l.f("padding", m0Var);
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= oVar5.f(m0Var) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && oVar5.D()) {
                    oVar5.P();
                } else if (((Boolean) scriptHubWebActivity.f9862r.getValue()).booleanValue() || ((Boolean) z0Var2.getValue()).booleanValue()) {
                    oVar5.U(-190442384);
                    a1.n nVarH = androidx.compose.foundation.layout.a.h(kVar, m0Var);
                    String str = ((Boolean) z0Var2.getValue()).booleanValue() ? "Authentication failed" : "Script Hub is unavailable";
                    String str2 = ((Boolean) z0Var2.getValue()).booleanValue() ? "Could not verify your GrowLauncher account. Please log in again." : "The server may be down. Please try again later.";
                    oVar5.U(5004770);
                    boolean zH = oVar5.h(scriptHubWebActivity);
                    Object objL = oVar5.L();
                    if (zH || objL == n0Var2) {
                        di.i iVar = new di.i(0, scriptHubWebActivity, ScriptHubWebActivity.class, "authenticateAndLoad", "authenticateAndLoad()V", 0, 2);
                        oVar5.g0(iVar);
                        objL = iVar;
                    }
                    oVar5.r(false);
                    s.j(nVarH, str, str2, (eh.a) ((lh.e) objL), oVar5, 0);
                    oVar5.r(false);
                } else {
                    oVar5.U(-189866249);
                    a1.n nVarH2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.f1184c, m0Var);
                    oVar5.U(5004770);
                    boolean zH2 = oVar5.h(scriptHubWebActivity);
                    Object objL2 = oVar5.L();
                    if (zH2 || objL2 == n0Var2) {
                        objL2 = new b(3, scriptHubWebActivity);
                        oVar5.g0(objL2);
                    }
                    oVar5.r(false);
                    t2.j.b((eh.c) objL2, nVarH2, null, oVar5, 0);
                    oVar5.r(false);
                }
                return oVar3;
            case 2:
                g1.a0 a0Var = (g1.a0) obj4;
                k5 k5Var = (k5) obj;
                o0.o oVar6 = (o0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("sliderState", k5Var);
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= oVar6.f(k5Var) ? 4 : 2;
                }
                if ((iIntValue3 & 19) == 18 && oVar6.D()) {
                    oVar6.P();
                } else {
                    a1.n nVarJ = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.c.f(kVar, 1.0f), t6.k.u(6, oVar6)).j(new VerticalAlignElement(a1.a.f183y));
                    oVar6.U(-1633490746);
                    boolean zF = oVar6.f(a0Var) | ((iIntValue3 & 14) == 4);
                    Object objL3 = oVar6.L();
                    if (zF || objL3 == n0Var2) {
                        objL3 = new f(2, k5Var, a0Var);
                        oVar6.g0(objL3);
                    }
                    oVar6.r(false);
                    qj.b.a(nVarJ, (eh.c) objL3, oVar6, 0);
                }
                return oVar3;
            case 3:
                o0.o oVar7 = (o0.o) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.l.f("$this$AnimatedVisibility", (s.q) obj);
                l7.b(((li.y) obj4).f10070b, androidx.compose.foundation.layout.a.j(kVar, t6.k.u(2, oVar7), t6.k.u(1, oVar7)), ((m0.e1) oVar7.k(m0.g1.f10686a)).i(), t6.k.v(5, oVar7), null, i2.x.f8058u, null, 0L, null, t6.k.v(6, oVar7), 0, false, 0, 0, null, null, oVar7, 196608, 0, 130000);
                return oVar3;
            case 4:
                r4.a0 a0Var2 = (r4.a0) obj4;
                y.m0 m0Var2 = (y.m0) obj;
                o0.o oVar8 = (o0.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("it", m0Var2);
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= oVar8.f(m0Var2) ? 4 : 2;
                }
                if ((iIntValue4 & 19) == 18 && oVar8.D()) {
                    oVar8.P();
                } else {
                    a1.n nVarH3 = androidx.compose.foundation.layout.a.h(kVar, m0Var2);
                    oVar8.U(733328855);
                    t1.h0 h0VarC = y.n.c(a1.a.f176i, false, oVar8);
                    oVar8.U(-1323940314);
                    int i15 = oVar8.P;
                    o0.d1 d1VarN = oVar8.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarJ = t1.w0.j(nVarH3);
                    oVar8.X();
                    if (oVar8.O) {
                        oVar8.m(nVar);
                    } else {
                        oVar8.j0();
                    }
                    o0.p.Q(v1.i.f18417f, h0VarC, oVar8);
                    o0.p.Q(v1.i.f18416e, d1VarN, oVar8);
                    v1.h hVar = v1.i.f18420i;
                    if (oVar8.O || !kotlin.jvm.internal.l.a(oVar8.L(), Integer.valueOf(i15))) {
                        k0.g.t(i15, oVar8, i15, hVar);
                    }
                    k0.g.u(0, aVarJ, new o0.p1(oVar8), oVar8, 2058660585);
                    qi.h.b(a0Var2, oVar8, 0);
                    oVar8.r(false);
                    oVar8.r(true);
                    oVar8.r(false);
                    oVar8.r(false);
                }
                return oVar3;
            case 5:
                li.g gVar = (li.g) obj4;
                o0.o oVar9 = (o0.o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (z.a) obj);
                if ((iIntValue5 & 17) == 16 && oVar9.D()) {
                    oVar9.P();
                } else {
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, t6.k.u(8, oVar9)), oVar9);
                    androidx.work.v.d("Saved MACs", null, 0L, oVar9, 6, 6);
                    androidx.work.v.b("Manage your MACs here.", null, 0L, null, oVar9, 6, 14);
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, t6.k.u(8, oVar9)), oVar9);
                    a1.n nVarF = androidx.compose.foundation.layout.c.f(kVar, 1.0f);
                    oVar9.U(5004770);
                    boolean zH3 = oVar9.h(gVar);
                    Object objL4 = oVar9.L();
                    if (zH3 || objL4 == n0Var2) {
                        objL4 = new androidx.activity.c(25, gVar);
                        oVar9.g0(objL4);
                    }
                    oVar9.r(false);
                    w9.a.b((eh.a) objL4, nVarF, false, null, ri.a.f14869f, oVar9, 24624, 12);
                    android.support.v4.media.session.a.q(8, oVar9, kVar, oVar9);
                }
                return oVar3;
            case 6:
                o0.n0 n0Var3 = o0.n0.f12510u;
                li.w wVar = (li.w) obj4;
                y.m0 m0Var3 = (y.m0) obj;
                o0.o oVar10 = (o0.o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("it", m0Var3);
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= oVar10.f(m0Var3) ? 4 : 2;
                }
                if ((iIntValue6 & 19) == 18 && oVar10.D()) {
                    oVar10.P();
                } else {
                    o0.s0 s0VarU = o0.p.u(wVar.f10064b, oVar10);
                    o0.s0 s0VarU2 = o0.p.u(wVar.f10066d, oVar10);
                    a1.n nVarH4 = androidx.compose.foundation.layout.a.h(kVar, m0Var3);
                    oVar10.U(733328855);
                    t1.h0 h0VarC2 = y.n.c(a1.a.f176i, false, oVar10);
                    oVar10.U(-1323940314);
                    int i16 = oVar10.P;
                    o0.d1 d1VarN2 = oVar10.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar2 = v1.i.f18413b;
                    w0.a aVarJ2 = t1.w0.j(nVarH4);
                    oVar10.X();
                    if (oVar10.O) {
                        oVar10.m(nVar2);
                    } else {
                        oVar10.j0();
                    }
                    v1.h hVar2 = v1.i.f18417f;
                    o0.p.Q(hVar2, h0VarC2, oVar10);
                    v1.h hVar3 = v1.i.f18416e;
                    o0.p.Q(hVar3, d1VarN2, oVar10);
                    v1.h hVar4 = v1.i.f18420i;
                    if (oVar10.O || !kotlin.jvm.internal.l.a(oVar10.L(), Integer.valueOf(i16))) {
                        k0.g.t(i16, oVar10, i16, hVar4);
                    }
                    k0.g.z(oVar10, aVarJ2, oVar10, 0, 2058660585);
                    a1.n nVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f(kVar, 1.0f), t6.k.u(18, oVar10), 0.0f, 2);
                    oVar10.U(-483455358);
                    y.b bVar = y.i.f19954c;
                    a1.b bVar2 = a1.a.A;
                    t1.h0 h0VarA = y.r.a(bVar, bVar2, oVar10);
                    oVar10.U(-1323940314);
                    int i17 = oVar10.P;
                    o0.d1 d1VarN3 = oVar10.n();
                    w0.a aVarJ3 = t1.w0.j(nVarK);
                    oVar10.X();
                    if (oVar10.O) {
                        oVar10.m(nVar2);
                    } else {
                        oVar10.j0();
                    }
                    o0.p.Q(hVar2, h0VarA, oVar10);
                    o0.p.Q(hVar3, d1VarN3, oVar10);
                    if (oVar10.O || !kotlin.jvm.internal.l.a(oVar10.L(), Integer.valueOf(i17))) {
                        k0.g.t(i17, oVar10, i17, hVar4);
                    }
                    k0.g.z(oVar10, aVarJ3, oVar10, 0, 2058660585);
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, t6.k.u(12, oVar10)), oVar10);
                    oVar10.U(-483455358);
                    t1.h0 h0VarA2 = y.r.a(bVar, bVar2, oVar10);
                    oVar10.U(-1323940314);
                    int i18 = oVar10.P;
                    o0.d1 d1VarN4 = oVar10.n();
                    w0.a aVarJ4 = t1.w0.j(kVar);
                    oVar10.X();
                    if (oVar10.O) {
                        oVar10.m(nVar2);
                    } else {
                        oVar10.j0();
                    }
                    o0.p.Q(hVar2, h0VarA2, oVar10);
                    o0.p.Q(hVar3, d1VarN4, oVar10);
                    if (oVar10.O || !kotlin.jvm.internal.l.a(oVar10.L(), Integer.valueOf(i18))) {
                        k0.g.t(i18, oVar10, i18, hVar4);
                    }
                    k0.g.z(oVar10, aVarJ4, oVar10, 0, 2058660585);
                    o0.e2 e2Var = o7.f11096a;
                    l7.b("Custom your", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar10.k(e2Var)).f11037a, oVar10, 6, 0, 65534);
                    d2.x xVar = ((n7) oVar10.k(e2Var)).f11037a;
                    o0.e2 e2Var2 = m0.g1.f10686a;
                    float f9 = 4;
                    l7.b("Theme", androidx.compose.foundation.layout.a.g(kVar, 0, -f9), ((m0.e1) oVar10.k(e2Var2)).k(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, xVar, oVar10, 54, 0, 65528);
                    k0.g.A(oVar10, false, true, false, false);
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, f9), oVar10);
                    l7.b("Design user interface with your own hex color", null, g1.t.f6907d, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar10.k(e2Var)).j, oVar10, 390, 0, 65530);
                    float f10 = 12;
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, f10), oVar10);
                    w0.a aVar = ui.a.f18006p;
                    w0.a aVarB = w0.f.b(oVar10, 139383337, new ui.t(wVar, s0VarU));
                    w0.a aVar2 = ui.a.f18007q;
                    float f11 = m0.j2.f10825a;
                    r2.a(aVar, null, aVarB, aVar2, null, m0.j2.a(((m0.e1) oVar10.k(e2Var2)).a(), oVar10, 510), 0.0f, 0.0f, oVar10, 27654, 422);
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, f10), oVar10);
                    a1.n nVarF2 = androidx.compose.foundation.layout.c.f(kVar, 1.0f);
                    a1.c cVar = a1.a.f183y;
                    oVar10.U(693286680);
                    t1.h0 h0VarA3 = y.r0.a(y.i.f19952a, cVar, oVar10);
                    oVar10.U(-1323940314);
                    int i19 = oVar10.P;
                    o0.d1 d1VarN5 = oVar10.n();
                    w0.a aVarJ5 = t1.w0.j(nVarF2);
                    oVar10.X();
                    if (oVar10.O) {
                        oVar10.m(nVar2);
                    } else {
                        oVar10.j0();
                    }
                    o0.p.Q(hVar2, h0VarA3, oVar10);
                    o0.p.Q(hVar3, d1VarN5, oVar10);
                    if (oVar10.O || !kotlin.jvm.internal.l.a(oVar10.L(), Integer.valueOf(i19))) {
                        k0.g.t(i19, oVar10, i19, hVar4);
                    }
                    k0.g.z(oVar10, aVarJ5, oVar10, 0, 2058660585);
                    oVar10.U(1849434622);
                    Object objL5 = oVar10.L();
                    if (objL5 == n0Var2) {
                        n0Var = n0Var3;
                        objL5 = o0.p.I(PredefinedUICustomizationFont.defaultFamily, n0Var);
                        oVar10.g0(objL5);
                    } else {
                        n0Var = n0Var3;
                    }
                    o0.s0 s0Var = (o0.s0) objL5;
                    Object objJ = android.support.v4.media.session.a.j(oVar10, false, 1849434622);
                    if (objJ == n0Var2) {
                        objJ = o0.p.I(PredefinedUICustomizationFont.defaultFamily, n0Var);
                        oVar10.g0(objJ);
                    }
                    o0.s0 s0Var2 = (o0.s0) objJ;
                    oVar10.r(false);
                    String str3 = (String) s0Var2.getValue();
                    y.s0 s0Var3 = y.s0.f19994a;
                    a1.n nVarA = y.s0.a(s0Var3, kVar, 1.0f);
                    oVar10.U(5004770);
                    Object objL6 = oVar10.L();
                    if (objL6 == n0Var2) {
                        objL6 = new l(s0Var2, i11);
                        oVar10.g0(objL6);
                    }
                    oVar10.r(false);
                    x3.a(str3, (eh.c) objL6, nVarA, false, null, ui.a.f18008r, ui.a.f18009s, null, null, false, null, null, null, true, 0, 0, null, null, null, oVar10, 14155824, 12582912, 8257336);
                    float f12 = 8;
                    ud.a.h(androidx.compose.foundation.layout.c.q(kVar, f12), oVar10);
                    String str4 = (String) s0Var.getValue();
                    a1.n nVarA2 = y.s0.a(s0Var3, kVar, 1.0f);
                    oVar10.U(5004770);
                    Object objL7 = oVar10.L();
                    if (objL7 == n0Var2) {
                        objL7 = new l(s0Var, 15);
                        oVar10.g0(objL7);
                    }
                    oVar10.r(false);
                    x3.a(str4, (eh.c) objL7, nVarA2, false, null, ui.a.f18010t, ui.a.f18011u, null, ui.a.f18012v, false, null, null, null, true, 0, 0, null, null, null, oVar10, 14155824, 12582918, 8256312);
                    ud.a.h(androidx.compose.foundation.layout.c.q(kVar, f12), oVar10);
                    oVar10.U(-1746271574);
                    boolean zH4 = oVar10.h(wVar);
                    Object objL8 = oVar10.L();
                    if (zH4 || objL8 == n0Var2) {
                        objL8 = new x(wVar, s0Var, s0Var2, 8);
                        oVar10.g0(objL8);
                    }
                    oVar10.r(false);
                    m0.n1.h((eh.a) objL8, null, false, null, null, null, ui.a.w, oVar10, 1572864, 62);
                    k0.g.A(oVar10, false, true, false, false);
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, f12), oVar10);
                    l7.b("Saved color", null, g1.t.f6909f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar10.k(e2Var)).j, oVar10, 390, 0, 65530);
                    oVar10.U(-1633490746);
                    boolean zF2 = oVar10.f(s0VarU2) | oVar10.h(wVar);
                    Object objL9 = oVar10.L();
                    if (zF2 || objL9 == n0Var2) {
                        objL9 = new f(5, s0VarU2, wVar);
                        oVar10.g0(objL9);
                    }
                    oVar10.r(false);
                    k8.g.a(null, null, null, null, null, null, false, (eh.c) objL9, oVar10, 0, 255);
                    k0.g.A(oVar10, false, true, false, false);
                    k0.g.A(oVar10, false, true, false, false);
                }
                return oVar3;
            case 7:
                final o0.w0 w0Var = (o0.w0) obj4;
                y.s0 s0Var4 = (y.s0) obj;
                o0.o oVar11 = (o0.o) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$NavigationBar", s0Var4);
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= oVar11.f(s0Var4) ? 4 : 2;
                }
                if ((iIntValue7 & 19) == 18 && oVar11.D()) {
                    oVar11.P();
                } else {
                    boolean z12 = w0Var.f() == 0;
                    oVar11.U(5004770);
                    Object objL10 = oVar11.L();
                    if (objL10 == n0Var2) {
                        z10 = false;
                        final Object[] objArr = null == true ? 1 : 0;
                        objL10 = new eh.a() { // from class: xi.j
                            @Override // eh.a
                            public final Object invoke() {
                                switch (objArr) {
                                    case 0:
                                        w0Var.g(0);
                                        break;
                                    case 1:
                                        w0Var.g(1);
                                        break;
                                    case 2:
                                        w0Var.g(2);
                                        break;
                                    default:
                                        w0Var.g(3);
                                        break;
                                }
                                return qg.o.f13926a;
                            }
                        };
                        oVar11.g0(objL10);
                    } else {
                        z10 = false;
                    }
                    oVar11.r(z10);
                    int i20 = (iIntValue7 & 14) | 1576320;
                    k3.b(s0Var4, z12, (eh.a) objL10, xi.b.f19759a, null, false, xi.b.f19760b, false, null, null, oVar11, i20);
                    final int i21 = 1;
                    boolean z13 = w0Var.f() == 1;
                    oVar11.U(5004770);
                    Object objL11 = oVar11.L();
                    if (objL11 == n0Var2) {
                        objL11 = new eh.a() { // from class: xi.j
                            @Override // eh.a
                            public final Object invoke() {
                                switch (i21) {
                                    case 0:
                                        w0Var.g(0);
                                        break;
                                    case 1:
                                        w0Var.g(1);
                                        break;
                                    case 2:
                                        w0Var.g(2);
                                        break;
                                    default:
                                        w0Var.g(3);
                                        break;
                                }
                                return qg.o.f13926a;
                            }
                        };
                        oVar11.g0(objL11);
                    }
                    oVar11.r(false);
                    k3.b(s0Var4, z13, (eh.a) objL11, xi.b.f19761c, null, false, xi.b.f19762d, false, null, null, oVar11, i20);
                    boolean z14 = w0Var.f() == 2;
                    oVar11.U(5004770);
                    Object objL12 = oVar11.L();
                    if (objL12 == n0Var2) {
                        objL12 = new eh.a() { // from class: xi.j
                            @Override // eh.a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        w0Var.g(0);
                                        break;
                                    case 1:
                                        w0Var.g(1);
                                        break;
                                    case 2:
                                        w0Var.g(2);
                                        break;
                                    default:
                                        w0Var.g(3);
                                        break;
                                }
                                return qg.o.f13926a;
                            }
                        };
                        oVar11.g0(objL12);
                    }
                    oVar11.r(false);
                    k3.b(s0Var4, z14, (eh.a) objL12, xi.b.f19763e, null, false, xi.b.f19764f, false, null, null, oVar11, i20);
                    final int i22 = 3;
                    boolean z15 = w0Var.f() == 3;
                    oVar11.U(5004770);
                    Object objL13 = oVar11.L();
                    if (objL13 == n0Var2) {
                        objL13 = new eh.a() { // from class: xi.j
                            @Override // eh.a
                            public final Object invoke() {
                                switch (i22) {
                                    case 0:
                                        w0Var.g(0);
                                        break;
                                    case 1:
                                        w0Var.g(1);
                                        break;
                                    case 2:
                                        w0Var.g(2);
                                        break;
                                    default:
                                        w0Var.g(3);
                                        break;
                                }
                                return qg.o.f13926a;
                            }
                        };
                        oVar11.g0(objL13);
                    }
                    oVar11.r(false);
                    k3.b(s0Var4, z15, (eh.a) objL13, xi.b.f19765g, null, false, xi.b.f19766h, false, null, null, oVar11, i20);
                }
                return oVar3;
            case 8:
                return a(obj, obj2, obj3);
            default:
                Creator creator = (Creator) obj4;
                o0.o oVar12 = (o0.o) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Card", (y.s) obj);
                if ((iIntValue8 & 17) == 16 && oVar12.D()) {
                    oVar12.P();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f1184c;
                    float f13 = 12;
                    a1.n nVarI = androidx.compose.foundation.layout.a.i(fillElement, f13);
                    a1.b bVar3 = a1.a.B;
                    y.c cVar2 = y.i.f19956e;
                    oVar12.U(-483455358);
                    t1.h0 h0VarA4 = y.r.a(cVar2, bVar3, oVar12);
                    oVar12.U(-1323940314);
                    int i23 = oVar12.P;
                    o0.d1 d1VarN6 = oVar12.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar3 = v1.i.f18413b;
                    w0.a aVarJ6 = t1.w0.j(nVarI);
                    oVar12.X();
                    if (oVar12.O) {
                        oVar12.m(nVar3);
                    } else {
                        oVar12.j0();
                    }
                    v1.h hVar5 = v1.i.f18417f;
                    o0.p.Q(hVar5, h0VarA4, oVar12);
                    v1.h hVar6 = v1.i.f18416e;
                    o0.p.Q(hVar6, d1VarN6, oVar12);
                    v1.h hVar7 = v1.i.f18420i;
                    if (oVar12.O || !kotlin.jvm.internal.l.a(oVar12.L(), Integer.valueOf(i23))) {
                        k0.g.t(i23, oVar12, i23, hVar7);
                    }
                    k0.g.z(oVar12, aVarJ6, oVar12, 0, 2058660585);
                    a1.n nVarK2 = o1.c.k(androidx.compose.foundation.layout.c.n(kVar, 60), e0.e.f5185a);
                    o0.e2 e2Var3 = m0.g1.f10686a;
                    a1.n nVarB = androidx.compose.foundation.a.b(nVarK2, ((m0.e1) oVar12.k(e2Var3)).l(), g1.f0.f6868a);
                    a1.d dVar = a1.a.f179t;
                    oVar12.U(733328855);
                    t1.h0 h0VarC3 = y.n.c(dVar, false, oVar12);
                    oVar12.U(-1323940314);
                    int i24 = oVar12.P;
                    o0.d1 d1VarN7 = oVar12.n();
                    w0.a aVarJ7 = t1.w0.j(nVarB);
                    oVar12.X();
                    if (oVar12.O) {
                        oVar12.m(nVar3);
                    } else {
                        oVar12.j0();
                    }
                    o0.p.Q(hVar5, h0VarC3, oVar12);
                    o0.p.Q(hVar6, d1VarN7, oVar12);
                    if (oVar12.O || !kotlin.jvm.internal.l.a(oVar12.L(), Integer.valueOf(i24))) {
                        k0.g.t(i24, oVar12, i24, hVar7);
                    }
                    k0.g.z(oVar12, aVarJ7, oVar12, 0, 2058660585);
                    String profileUrl = creator.getProfileUrl();
                    if (profileUrl == null || profileUrl.length() == 0) {
                        oVar2 = oVar12;
                        oVar2.U(1137227546);
                        String upperCase = nh.h.q0(1, creator.getName()).toUpperCase(Locale.ROOT);
                        kotlin.jvm.internal.l.e("toUpperCase(...)", upperCase);
                        l7.b(upperCase, null, ((m0.e1) oVar2.k(e2Var3)).f(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar2.k(o7.f11096a)).f11041e, oVar2, 0, 0, 65530);
                        z11 = false;
                        oVar2.r(false);
                    } else {
                        oVar12.U(1136847641);
                        t6.k.a(o1.c.C(xi.b.o(creator.getProfileUrl()), oVar12), "Creator Profile", fillElement, t1.i.f16289a, null, oVar12, 25008, R.styleable.AppCompatTheme_textColorAlertDialogListItem);
                        oVar2 = oVar12;
                        z11 = false;
                        oVar2.r(false);
                    }
                    k0.g.A(oVar2, z11, true, z11, z11);
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, f13), oVar2);
                    String name = creator.getName();
                    o0.e2 e2Var4 = o7.f11096a;
                    l7.b(name, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((n7) oVar2.k(e2Var4)).f11044h, oVar2, 0, 3120, 55294);
                    ud.a.h(androidx.compose.foundation.layout.c.h(kVar, 4), oVar2);
                    Integer totalDownloads = creator.getTotalDownloads();
                    l7.b((totalDownloads != null ? ki.a.c(totalDownloads.intValue()) : "0").concat(" Downloads"), null, ((m0.e1) oVar2.k(e2Var3)).j(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar2.k(e2Var4)).f11047l, oVar2, 0, 0, 65530);
                    k0.g.A(oVar2, false, true, false, false);
                }
                return oVar3;
        }
    }
}
