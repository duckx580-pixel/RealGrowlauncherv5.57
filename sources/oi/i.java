package oi;

import com.rtsoft.growtopia.R;
import g1.f0;
import java.util.List;
import launcher.powerkuy.growlauncher.api.model.User;
import m0.e1;
import m0.g1;
import m0.l7;
import m0.n7;
import m0.o7;
import o0.d1;
import o0.p1;
import o0.s0;
import t1.h0;
import t1.w0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12977i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f12979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12981u;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10, int i11, int i12) {
        this.f12977i = i12;
        this.f12979s = obj;
        this.f12980t = obj2;
        this.f12981u = obj3;
        this.f12978r = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12977i) {
            case 0:
                final List list = (List) this.f12979s;
                final eh.c cVar = (eh.c) this.f12980t;
                final s0 s0Var = (s0) this.f12981u;
                o0.o oVar = (o0.o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    a1.n nVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f(a1.k.f196a, 1.0f), 0.0f, t6.k.u(2, oVar), 1);
                    oVar.U(-1224400529);
                    boolean zH = oVar.h(list) | oVar.f(cVar);
                    final int i10 = this.f12978r;
                    boolean zD = zH | oVar.d(i10);
                    Object objL = oVar.L();
                    if (zD || objL == o0.k.f12458a) {
                        objL = new eh.c() { // from class: oi.j
                            @Override // eh.c
                            public final Object invoke(Object obj3) {
                                z.e eVar = (z.e) obj3;
                                kotlin.jvm.internal.l.f("$this$LazyColumn", eVar);
                                final List list2 = list;
                                int size = list2.size();
                                final eh.c cVar2 = cVar;
                                final int i11 = i10;
                                final s0 s0Var2 = s0Var;
                                eVar.K(size, null, z.k.f20514s, new w0.a(401524642, new eh.g() { // from class: oi.k
                                    @Override // eh.g
                                    public final Object e(Object obj4, Object obj5, Object obj6, Object obj7) {
                                        long jB;
                                        long jI;
                                        final int iIntValue = ((Integer) obj5).intValue();
                                        o0.o oVar2 = (o0.o) obj6;
                                        int iIntValue2 = ((Integer) obj7).intValue();
                                        kotlin.jvm.internal.l.f("$this$items", (z.a) obj4);
                                        if ((iIntValue2 & 48) == 0) {
                                            iIntValue2 |= oVar2.d(iIntValue) ? 32 : 16;
                                        }
                                        if ((iIntValue2 & 145) == 144 && oVar2.D()) {
                                            oVar2.P();
                                        } else {
                                            String str = (String) list2.get(iIntValue);
                                            a1.n nVarH = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.c.f(a1.k.f196a, 1.0f), t6.k.u(18, oVar2));
                                            oVar2.U(-1746271574);
                                            final eh.c cVar3 = cVar2;
                                            boolean zF = ((iIntValue2 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 32) | oVar2.f(cVar3);
                                            Object objL2 = oVar2.L();
                                            if (zF || objL2 == o0.k.f12458a) {
                                                final s0 s0Var3 = s0Var2;
                                                objL2 = new eh.a() { // from class: oi.f
                                                    @Override // eh.a
                                                    public final Object invoke() {
                                                        cVar3.invoke(Integer.valueOf(iIntValue));
                                                        s0Var3.setValue(Boolean.FALSE);
                                                        return qg.o.f13926a;
                                                    }
                                                };
                                                oVar2.g0(objL2);
                                            }
                                            oVar2.r(false);
                                            a1.n nVarF = androidx.compose.foundation.a.f(nVarH, false, (eh.a) objL2, 7);
                                            int i12 = i11;
                                            if (iIntValue == i12) {
                                                oVar2.U(-681852044);
                                                jB = g1.t.b(((e1) oVar2.k(g1.f10686a)).l(), 0.3f);
                                                oVar2.r(false);
                                            } else {
                                                oVar2.U(-681847219);
                                                oVar2.r(false);
                                                jB = g1.t.f6915m;
                                            }
                                            a1.n nVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(nVarF, jB, f0.f6868a), t6.k.u(8, oVar2), t6.k.u(3, oVar2));
                                            a1.d dVar = a1.a.f178s;
                                            oVar2.U(733328855);
                                            h0 h0VarC = y.n.c(dVar, false, oVar2);
                                            oVar2.U(-1323940314);
                                            int i13 = oVar2.P;
                                            d1 d1VarN = oVar2.n();
                                            v1.j.f18438q.getClass();
                                            v1.n nVar = v1.i.f18413b;
                                            w0.a aVarJ = w0.j(nVarJ);
                                            oVar2.X();
                                            if (oVar2.O) {
                                                oVar2.m(nVar);
                                            } else {
                                                oVar2.j0();
                                            }
                                            o0.p.Q(v1.i.f18417f, h0VarC, oVar2);
                                            o0.p.Q(v1.i.f18416e, d1VarN, oVar2);
                                            v1.h hVar = v1.i.f18420i;
                                            if (oVar2.O || !kotlin.jvm.internal.l.a(oVar2.L(), Integer.valueOf(i13))) {
                                                k0.g.t(i13, oVar2, i13, hVar);
                                            }
                                            k0.g.u(0, aVarJ, new p1(oVar2), oVar2, 2058660585);
                                            d2.x xVar = ((n7) oVar2.k(o7.f11096a)).f11047l;
                                            long jW = u5.f.w(4294967296L, t6.k.u(8, oVar2));
                                            if (iIntValue == i12) {
                                                oVar2.U(901122531);
                                                jI = ((e1) oVar2.k(g1.f10686a)).k();
                                                oVar2.r(false);
                                            } else {
                                                oVar2.U(901126469);
                                                jI = ((e1) oVar2.k(g1.f10686a)).i();
                                                oVar2.r(false);
                                            }
                                            l7.b(str, null, jI, jW, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, xVar, oVar2, 0, 3120, 55282);
                                            k0.g.A(oVar2, false, true, false, false);
                                        }
                                        return qg.o.f13926a;
                                    }
                                }, true));
                                return qg.o.f13926a;
                            }
                        };
                        oVar.g0(objL);
                    }
                    oVar.r(false);
                    k8.g.a(nVarK, null, null, null, null, null, false, (eh.c) objL, oVar, 0, 254);
                }
                return qg.o.f13926a;
            case 1:
                ((Integer) obj2).getClass();
                c.d((k1.f) this.f12979s, (String) this.f12980t, (String) this.f12981u, (o0.o) obj, o0.p.S(1), this.f12978r);
                break;
            case 2:
                ((Integer) obj2).getClass();
                c.m((String) this.f12981u, this.f12978r, (List) this.f12979s, (eh.c) this.f12980t, (o0.o) obj, o0.p.S(1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                pi.c.d((String) this.f12979s, (String) this.f12980t, (User) this.f12981u, (o0.o) obj, o0.p.S(this.f12978r | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                si.b.a((a1.n) this.f12979s, (eh.e) this.f12980t, (eh.a) this.f12981u, (o0.o) obj, o0.p.S(1), this.f12978r);
                break;
            default:
                ((Integer) obj2).getClass();
                xi.b.c((li.s) this.f12979s, this.f12978r, (eh.a) this.f12981u, (eh.c) this.f12980t, (o0.o) obj, o0.p.S(1));
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ i(String str, int i10, List list, eh.c cVar, int i11) {
        this.f12977i = 2;
        this.f12981u = str;
        this.f12978r = i10;
        this.f12979s = list;
        this.f12980t = cVar;
    }

    public /* synthetic */ i(String str, String str2, User user, int i10) {
        this.f12977i = 3;
        this.f12979s = str;
        this.f12980t = str2;
        this.f12981u = user;
        this.f12978r = i10;
    }

    public /* synthetic */ i(List list, eh.c cVar, int i10, s0 s0Var) {
        this.f12977i = 0;
        this.f12979s = list;
        this.f12980t = cVar;
        this.f12978r = i10;
        this.f12981u = s0Var;
    }

    public /* synthetic */ i(li.s sVar, int i10, eh.a aVar, eh.c cVar, int i11) {
        this.f12977i = 5;
        this.f12979s = sVar;
        this.f12978r = i10;
        this.f12981u = aVar;
        this.f12980t = cVar;
    }
}
