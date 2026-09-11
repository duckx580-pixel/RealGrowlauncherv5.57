package qi;

import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.FileDownloadKt;
import androidx.compose.material.icons.rounded.CheckKt;
import androidx.compose.material.icons.rounded.CloseKt;
import androidx.compose.material.icons.rounded.PlayArrowKt;
import androidx.compose.material.icons.rounded.StopKt;
import androidx.work.v;
import g1.t;
import i0.k;
import kotlin.jvm.internal.l;
import m0.f2;
import m0.l7;
import m0.y;
import o0.o;
import pf.i;
import pf.m;
import xf.j;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13982i;

    public /* synthetic */ b(int i10) {
        this.f13982i = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13982i) {
            case 0:
                o oVar = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    l7.b("Crash Log", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar, 6, 0, 131070);
                }
                return qg.o.f13926a;
            case 1:
                o oVar2 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    y.b(d.f13987c, null, null, null, null, null, oVar2, 6, 126);
                }
                return qg.o.f13926a;
            case 2:
                o oVar3 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar3.D()) {
                    oVar3.P();
                } else {
                    l7.b("Crash Log Preview", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar3, 6, 0, 131070);
                }
                return qg.o.f13926a;
            case 3:
                o oVar4 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar4.D()) {
                    oVar4.P();
                } else {
                    f2.b(ArrowBackKt.getArrowBack(j0.a.f8712a), "Back", null, 0L, oVar4, 48, 12);
                }
                return qg.o.f13926a;
            case 4:
                o oVar5 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar5.D()) {
                    oVar5.P();
                } else {
                    f2.b(FileDownloadKt.getFileDownload(j0.a.f8712a), "Download", null, 0L, oVar5, 48, 12);
                }
                return qg.o.f13926a;
            case 5:
                o oVar6 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar6.D()) {
                    oVar6.P();
                } else {
                    l7.b("Settings", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar6, 6, 0, 131070);
                }
                return qg.o.f13926a;
            case 6:
                o oVar7 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar7.D()) {
                    oVar7.P();
                } else {
                    f2.b(ArrowBackKt.getArrowBack(j0.a.f8712a), "Back", null, 0L, oVar7, 48, 12);
                }
                return qg.o.f13926a;
            case 7:
                o oVar8 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar8.D()) {
                    oVar8.P();
                } else {
                    v.b("Discord ID", null, 0L, null, oVar8, 6, 14);
                }
                return qg.o.f13926a;
            case 8:
                o oVar9 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar9.D()) {
                    oVar9.P();
                } else {
                    v.b("Password", null, 0L, null, oVar9, 6, 14);
                }
                return qg.o.f13926a;
            case 9:
                l.f("<unused var>", (String) obj);
                l.f("<unused var>", (String) obj2);
                return qg.o.f13926a;
            case 10:
                o oVar10 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar10.D()) {
                    oVar10.P();
                } else {
                    k.b(PlayArrowKt.getPlayArrow(j0.c.f8713a), "Run", androidx.compose.foundation.layout.c.n(a1.k.f196a, t6.k.u(18, oVar10)), t.f6911h, oVar10, 3120, 0);
                }
                return qg.o.f13926a;
            case 11:
                o oVar11 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar11.D()) {
                    oVar11.P();
                } else {
                    k.b(StopKt.getStop(j0.c.f8713a), "Stop", androidx.compose.foundation.layout.c.n(a1.k.f196a, t6.k.u(18, oVar11)), t.f6910g, oVar11, 3120, 0);
                }
                return qg.o.f13926a;
            case 12:
                o oVar12 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar12.D()) {
                    oVar12.P();
                } else {
                    k.b(CheckKt.getCheck(j0.c.f8713a), "Create", androidx.compose.foundation.layout.c.n(a1.k.f196a, t6.k.u(18, oVar12)), t.f6911h, oVar12, 3120, 0);
                }
                return qg.o.f13926a;
            case 13:
                o oVar13 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar13.D()) {
                    oVar13.P();
                } else {
                    k.b(CloseKt.getClose(j0.c.f8713a), "Cancel", androidx.compose.foundation.layout.c.n(a1.k.f196a, t6.k.u(18, oVar13)), t.f6910g, oVar13, 3120, 0);
                }
                return qg.o.f13926a;
            case 14:
                o oVar14 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar14.D()) {
                    oVar14.P();
                } else {
                    k.b(CheckKt.getCheck(j0.c.f8713a), "Paste", androidx.compose.foundation.layout.c.n(a1.k.f196a, t6.k.u(18, oVar14)), t.f6911h, oVar14, 3120, 0);
                }
                return qg.o.f13926a;
            case 15:
                o oVar15 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar15.D()) {
                    oVar15.P();
                } else {
                    k.b(CloseKt.getClose(j0.c.f8713a), "Cancel", androidx.compose.foundation.layout.c.n(a1.k.f196a, t6.k.u(18, oVar15)), t.f6910g, oVar15, 3120, 0);
                }
                return qg.o.f13926a;
            case 16:
                ((Boolean) obj).getClass();
                ((Boolean) obj2).getClass();
                return qg.o.f13926a;
            case 17:
                uf.c cVar = (uf.c) obj;
                pf.c cVar2 = (pf.c) obj2;
                l.f("editor", cVar);
                l.f("pos", cVar2);
                long jO = cVar.f17847z.o(cVar2.f13384b, cVar2.f13385c);
                return cVar.getText().n().B((int) (jO >> 32), (int) (jO & 4294967295L));
            case 18:
                uf.c cVar3 = (uf.c) obj;
                pf.c cVar4 = (pf.c) obj2;
                l.f("editor", cVar3);
                l.f("pos", cVar4);
                pf.h text = cVar3.getText();
                l.e("getText(...)", text);
                pf.c cVar5 = tf.h.c(cVar4, text, true).f13427a;
                l.e("getStart(...)", cVar5);
                return cVar3.getText().n().B(cVar5.f13384b, cVar5.f13385c);
            case 19:
                uf.c cVar6 = (uf.c) obj;
                pf.c cVar7 = (pf.c) obj2;
                l.f("editor", cVar6);
                l.f("pos", cVar7);
                pf.h text2 = cVar6.getText();
                l.e("getText(...)", text2);
                pf.c cVar8 = tf.h.c(cVar7, text2, false).f13428b;
                l.e("getEnd(...)", cVar8);
                return cVar6.getText().n().B(cVar8.f13384b, cVar8.f13385c);
            case 20:
                uf.c cVar9 = (uf.c) obj;
                pf.c cVar10 = (pf.c) obj2;
                l.f("editor", cVar9);
                l.f("pos", cVar10);
                xf.d dVar = cVar9.f17847z;
                int iL = dVar.l(cVar10.f13383a);
                int iB = tf.h.b(iL - ((int) Math.ceil(cVar9.getHeight() / cVar9.getRowHeight())), dVar.a() - 1);
                int i10 = cVar10.f13385c - dVar.q(iL).f19725d;
                j jVarQ = dVar.q(iB);
                int i11 = jVarQ.f19722a;
                int i12 = jVarQ.f19725d;
                return cVar9.getText().n().B(i11, tf.h.b(i10, jVarQ.f19726e - i12) + i12);
            case 21:
                uf.c cVar11 = (uf.c) obj;
                pf.c cVar12 = (pf.c) obj2;
                l.f("editor", cVar11);
                l.f("pos", cVar12);
                xf.d dVar2 = cVar11.f17847z;
                int iL2 = dVar2.l(cVar12.f13383a);
                int iB2 = tf.h.b(((int) Math.ceil(cVar11.getHeight() / cVar11.getRowHeight())) + iL2, dVar2.a() - 1);
                int i13 = cVar12.f13385c - dVar2.q(iL2).f19725d;
                j jVarQ2 = dVar2.q(iB2);
                int i14 = jVarQ2.f19722a;
                int i15 = jVarQ2.f19725d;
                return cVar11.getText().n().B(i14, tf.h.b(i13, jVarQ2.f19726e - i15) + i15);
            case 22:
                uf.c cVar13 = (uf.c) obj;
                pf.c cVar14 = (pf.c) obj2;
                l.f("editor", cVar13);
                l.f("pos", cVar14);
                xf.d dVar3 = cVar13.f17847z;
                int i16 = cVar14.f13385c - dVar3.q(dVar3.l(cVar14.f13383a)).f19725d;
                j jVarQ3 = dVar3.q(cVar13.getFirstVisibleRow());
                int i17 = jVarQ3.f19722a;
                int i18 = jVarQ3.f19725d;
                return cVar13.getText().n().B(i17, tf.h.b(i16, jVarQ3.f19726e - i18) + i18);
            case 23:
                uf.c cVar15 = (uf.c) obj;
                pf.c cVar16 = (pf.c) obj2;
                l.f("editor", cVar15);
                l.f("pos", cVar16);
                xf.d dVar4 = cVar15.f17847z;
                int i19 = cVar16.f13385c - dVar4.q(dVar4.l(cVar16.f13383a)).f19725d;
                j jVarQ4 = dVar4.q(cVar15.getLastVisibleRow());
                int i20 = jVarQ4.f19722a;
                int i21 = jVarQ4.f19725d;
                return cVar15.getText().n().B(i20, tf.h.b(i19, jVarQ4.f19726e - i21) + i21);
            case 24:
                uf.c cVar17 = (uf.c) obj;
                pf.c cVar18 = (pf.c) obj2;
                l.f("editor", cVar17);
                l.f("pos", cVar18);
                if (!cVar17.getProps().L) {
                    return cVar17.getText().n().B(cVar18.f13384b, 0);
                }
                i iVarO = cVar17.getText().o(cVar18.f13384b);
                int iC = (int) (m.c(iVarO, 0, iVarO.f13401r) >> 32);
                return (cVar18.f13385c == iC || iC == cVar17.getText().o(cVar18.f13384b).f13401r) ? cVar17.getText().n().B(cVar18.f13384b, 0) : cVar17.getText().n().B(cVar18.f13384b, iC);
            case 25:
                uf.c cVar19 = (uf.c) obj;
                pf.c cVar20 = (pf.c) obj2;
                l.f("editor", cVar19);
                l.f("pos", cVar20);
                int i22 = cVar19.getText().o(cVar20.f13384b).f13401r;
                if (!cVar19.getProps().L) {
                    return cVar19.getText().n().B(cVar20.f13384b, i22);
                }
                i iVarO2 = cVar19.getText().o(cVar20.f13384b);
                int iC2 = (int) (m.c(iVarO2, 0, iVarO2.f13401r) & 4294967295L);
                return cVar20.f13385c != iC2 ? cVar19.getText().n().B(cVar20.f13384b, iC2) : cVar19.getText().n().B(cVar20.f13384b, i22);
            case 26:
                l.f("<unused var>", (uf.c) obj);
                l.f("<unused var>", (pf.c) obj2);
                pf.c cVar21 = new pf.c();
                cVar21.f13385c = 0;
                cVar21.f13384b = 0;
                cVar21.f13383a = 0;
                return cVar21;
            case 27:
                uf.c cVar22 = (uf.c) obj;
                l.f("editor", cVar22);
                l.f("<unused var>", (pf.c) obj2);
                return cVar22.getText().n().A(cVar22.getText().f13394t);
            case 28:
                uf.c cVar23 = (uf.c) obj;
                pf.c cVar24 = (pf.c) obj2;
                l.f("editor", cVar23);
                l.f("pos", cVar24);
                xf.d dVar5 = cVar23.f17847z;
                int iL3 = dVar5.l(cVar24.f13383a);
                j jVarQ5 = dVar5.q(iL3);
                int i23 = iL3 + 1;
                int i24 = (i23 == dVar5.a() || dVar5.q(i23).f19722a != jVarQ5.f19722a) ? jVarQ5.f19726e : jVarQ5.f19726e - 1;
                if (!cVar23.getProps().L) {
                    return cVar23.getText().n().B(jVarQ5.f19722a, jVarQ5.f19725d);
                }
                int iC3 = (int) (m.c(cVar23.getText().o(cVar24.f13384b), jVarQ5.f19725d, i24) >> 32);
                return (cVar24.f13385c == iC3 || iC3 == i24) ? cVar23.getText().n().B(cVar24.f13384b, jVarQ5.f19725d) : cVar23.getText().n().B(cVar24.f13384b, iC3);
            default:
                uf.c cVar25 = (uf.c) obj;
                pf.c cVar26 = (pf.c) obj2;
                l.f("editor", cVar25);
                l.f("pos", cVar26);
                xf.d dVar6 = cVar25.f17847z;
                int iL4 = dVar6.l(cVar26.f13383a);
                j jVarQ6 = dVar6.q(iL4);
                int i25 = iL4 + 1;
                int i26 = (i25 == dVar6.a() || dVar6.q(i25).f19722a != jVarQ6.f19722a) ? jVarQ6.f19726e : jVarQ6.f19726e - 1;
                if (!cVar25.getProps().L) {
                    return cVar25.getText().n().B(jVarQ6.f19722a, i26);
                }
                int iC4 = (int) (m.c(cVar25.getText().o(cVar26.f13384b), jVarQ6.f19725d, i26) & 4294967295L);
                return cVar26.f13385c != iC4 ? cVar25.getText().n().B(cVar26.f13384b, iC4) : cVar25.getText().n().B(cVar26.f13384b, i26);
        }
    }
}
