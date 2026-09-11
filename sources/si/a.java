package si;

import a1.d;
import a1.k;
import a1.n;
import androidx.compose.material.icons.filled.DownloadKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.ListKt;
import eh.f;
import g1.t;
import k0.g;
import kotlin.jvm.internal.l;
import m0.e1;
import m0.f2;
import m0.g1;
import m0.h4;
import m0.l7;
import m0.n7;
import m0.o7;
import o0.d1;
import o0.o;
import o0.p;
import o0.p1;
import t1.h0;
import t1.w0;
import v1.h;
import v1.i;
import v1.j;
import y.m0;
import y.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15849i;

    public /* synthetic */ a(int i10) {
        this.f15849i = i10;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15849i) {
            case 0:
                m0 m0Var = (m0) obj;
                o oVar = (o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                l.f("innerPadding", m0Var);
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar.f(m0Var) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && oVar.D()) {
                    oVar.P();
                } else {
                    b.a(androidx.compose.foundation.layout.a.h(k.f196a, m0Var), null, null, oVar, 0, 6);
                }
                break;
            case 1:
                o oVar2 = (o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue2 & 17) == 16 && oVar2.D()) {
                    oVar2.P();
                } else {
                    l7.b("Yes", null, t.f6910g, t6.k.v(12, oVar2), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar2, 390, 0, 131058);
                }
                break;
            case 2:
                o oVar3 = (o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue3 & 17) == 16 && oVar3.D()) {
                    oVar3.P();
                } else {
                    l7.b("No", null, t.f6907d, t6.k.v(12, oVar3), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar3, 390, 0, 131058);
                }
                break;
            case 3:
                o oVar4 = (o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue4 & 17) == 16 && oVar4.D()) {
                    oVar4.P();
                } else {
                    l7.b("Yes", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar4, 6, 0, 131070);
                }
                break;
            case 4:
                o oVar5 = (o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue5 & 17) == 16 && oVar5.D()) {
                    oVar5.P();
                } else {
                    l7.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar5, 6, 0, 131070);
                }
                break;
            case 5:
                o oVar6 = (o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                l.f("$this$Button", (s0) obj);
                if ((iIntValue6 & 17) == 16 && oVar6.D()) {
                    oVar6.P();
                } else {
                    l7.b("Fetch", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar6, 6, 0, 131070);
                }
                break;
            case 6:
                o oVar7 = (o) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue7 & 17) == 16 && oVar7.D()) {
                    oVar7.P();
                } else {
                    l7.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar7, 6, 0, 131070);
                }
                break;
            case 7:
                o oVar8 = (o) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                l.f("$this$item", (z.a) obj);
                if ((iIntValue8 & 17) == 16 && oVar8.D()) {
                    oVar8.P();
                } else {
                    l7.b("No public scripts yet.", null, ((e1) oVar8.k(g1.f10686a)).m(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar8.k(o7.f11096a)).f11046k, oVar8, 6, 0, 65530);
                }
                break;
            case 8:
                o oVar9 = (o) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                l.f("$this$item", (z.a) obj);
                if ((iIntValue9 & 17) == 16 && oVar9.D()) {
                    oVar9.P();
                } else {
                    k kVar = k.f196a;
                    n nVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.f(kVar, 1.0f), 8);
                    d dVar = a1.a.f179t;
                    oVar9.U(733328855);
                    h0 h0VarC = y.n.c(dVar, false, oVar9);
                    oVar9.U(-1323940314);
                    int i10 = oVar9.P;
                    d1 d1VarN = oVar9.n();
                    j.f18438q.getClass();
                    v1.n nVar = i.f18413b;
                    w0.a aVarJ = w0.j(nVarI);
                    oVar9.X();
                    if (oVar9.O) {
                        oVar9.m(nVar);
                    } else {
                        oVar9.j0();
                    }
                    p.Q(i.f18417f, h0VarC, oVar9);
                    p.Q(i.f18416e, d1VarN, oVar9);
                    h hVar = i.f18420i;
                    if (oVar9.O || !l.a(oVar9.L(), Integer.valueOf(i10))) {
                        g.t(i10, oVar9, i10, hVar);
                    }
                    g.u(0, aVarJ, new p1(oVar9), oVar9, 2058660585);
                    h4.a(androidx.compose.foundation.layout.c.n(kVar, 24), 0L, 0.0f, 0L, 0, oVar9, 6, 30);
                    g.A(oVar9, false, true, false, false);
                }
                break;
            case 9:
                o oVar10 = (o) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                l.f("$this$Button", (s0) obj);
                if ((iIntValue10 & 17) == 16 && oVar10.D()) {
                    oVar10.P();
                } else {
                    f2.b(ListKt.getList(j0.a.f8712a), null, null, 0L, oVar10, 48, 12);
                    ud.a.h(androidx.compose.foundation.layout.c.q(k.f196a, 8), oVar10);
                    l7.b("My Scripts", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar10, 6, 0, 131070);
                }
                break;
            case 10:
                o oVar11 = (o) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                l.f("$this$Button", (s0) obj);
                if ((iIntValue11 & 17) == 16 && oVar11.D()) {
                    oVar11.P();
                } else {
                    f2.b(EditKt.getEdit(j0.a.f8712a), null, null, 0L, oVar11, 48, 12);
                    ud.a.h(androidx.compose.foundation.layout.c.q(k.f196a, 8), oVar11);
                    l7.b("Edit Profile", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar11, 6, 0, 131070);
                }
                break;
            case 11:
                o oVar12 = (o) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                l.f("$this$Button", (s0) obj);
                if ((iIntValue12 & 17) == 16 && oVar12.D()) {
                    oVar12.P();
                } else {
                    k1.f download = DownloadKt.getDownload(j0.a.f8712a);
                    k kVar2 = k.f196a;
                    f2.b(download, "Download", androidx.compose.foundation.layout.c.n(kVar2, 20), 0L, oVar12, 432, 8);
                    ud.a.h(androidx.compose.foundation.layout.c.q(kVar2, 8), oVar12);
                    l7.b("Download", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar12, 6, 0, 131070);
                }
                break;
            case 12:
                o oVar13 = (o) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue13 & 17) == 16 && oVar13.D()) {
                    oVar13.P();
                } else {
                    l7.b("Open", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar13, 6, 0, 131070);
                }
                break;
            case 13:
                o oVar14 = (o) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue14 & 17) == 16 && oVar14.D()) {
                    oVar14.P();
                } else {
                    l7.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar14, 6, 0, 131070);
                }
                break;
            case 14:
                o oVar15 = (o) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue15 & 17) == 16 && oVar15.D()) {
                    oVar15.P();
                } else {
                    l7.b("Delete", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar15, 6, 0, 131070);
                }
                break;
            case 15:
                o oVar16 = (o) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue16 & 17) == 16 && oVar16.D()) {
                    oVar16.P();
                } else {
                    l7.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar16, 6, 0, 131070);
                }
                break;
            case 16:
                o oVar17 = (o) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                l.f("$this$item", (z.a) obj);
                if ((iIntValue17 & 17) == 16 && oVar17.D()) {
                    oVar17.P();
                } else {
                    l7.b("Recent Uploads", null, ((e1) oVar17.k(g1.f10686a)).d(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar17.k(o7.f11096a)).f11042f, oVar17, 6, 0, 65530);
                }
                break;
            case 17:
                o oVar18 = (o) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                l.f("$this$item", (z.a) obj);
                if ((iIntValue18 & 17) == 16 && oVar18.D()) {
                    oVar18.P();
                } else {
                    k kVar3 = k.f196a;
                    n nVarI2 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.f(kVar3, 1.0f), 8);
                    d dVar2 = a1.a.f179t;
                    oVar18.U(733328855);
                    h0 h0VarC2 = y.n.c(dVar2, false, oVar18);
                    oVar18.U(-1323940314);
                    int i11 = oVar18.P;
                    d1 d1VarN2 = oVar18.n();
                    j.f18438q.getClass();
                    v1.n nVar2 = i.f18413b;
                    w0.a aVarJ2 = w0.j(nVarI2);
                    oVar18.X();
                    if (oVar18.O) {
                        oVar18.m(nVar2);
                    } else {
                        oVar18.j0();
                    }
                    p.Q(i.f18417f, h0VarC2, oVar18);
                    p.Q(i.f18416e, d1VarN2, oVar18);
                    h hVar2 = i.f18420i;
                    if (oVar18.O || !l.a(oVar18.L(), Integer.valueOf(i11))) {
                        g.t(i11, oVar18, i11, hVar2);
                    }
                    g.u(0, aVarJ2, new p1(oVar18), oVar18, 2058660585);
                    h4.a(androidx.compose.foundation.layout.c.n(kVar3, 24), 0L, 0.0f, 0L, 0, oVar18, 6, 30);
                    g.A(oVar18, false, true, false, false);
                }
                break;
            case 18:
                o oVar19 = (o) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue19 & 17) == 16 && oVar19.D()) {
                    oVar19.P();
                } else {
                    l7.b("Delete", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar19, 6, 0, 131070);
                }
                break;
            default:
                o oVar20 = (o) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                l.f("$this$TextButton", (s0) obj);
                if ((iIntValue20 & 17) == 16 && oVar20.D()) {
                    oVar20.P();
                } else {
                    l7.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar20, 6, 0, 131070);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
