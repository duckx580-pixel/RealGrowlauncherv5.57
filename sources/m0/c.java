package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10445i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.a f10446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10447s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w0.a aVar, int i10) {
        super(2);
        this.f10445i = 4;
        this.f10446r = aVar;
        this.f10447s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10445i;
        y.s sVar = y.s.f19993a;
        a1.k kVar = a1.k.f196a;
        qg.o oVar = qg.o.f13926a;
        int i11 = this.f10447s;
        w0.a aVar = this.f10446r;
        switch (i10) {
            case 0:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    n7 n7Var = (n7) oVar2.k(o7.f11096a);
                    float f9 = n0.e.f11900a;
                    l7.a(o7.a(n7Var, n0.g0.f11965t), aVar, oVar2, (i11 << 3) & R.styleable.AppCompatTheme_windowActionBarOverlay);
                }
                break;
            case 1:
                o0.o oVar3 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar3.D()) {
                    oVar3.P();
                } else {
                    int i12 = (i11 >> 6) & 7168;
                    oVar3.U(-483455358);
                    t1.h0 h0VarA = y.r.a(y.i.f19954c, a1.a.A, oVar3);
                    oVar3.U(-1323940314);
                    q2.b bVar = (q2.b) oVar3.k(w1.b1.f18759e);
                    q2.l lVar = (q2.l) oVar3.k(w1.b1.f18764k);
                    w1.d2 d2Var = (w1.d2) oVar3.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarI = t1.w0.i(kVar);
                    oVar3.X();
                    if (oVar3.O) {
                        oVar3.m(nVar);
                    } else {
                        oVar3.j0();
                    }
                    oVar3.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarA, oVar3);
                    o0.p.Q(v1.i.f18415d, bVar, oVar3);
                    o0.p.Q(v1.i.f18418g, lVar, oVar3);
                    k0.g.u(0, aVarI, gb.e.f(oVar3, d2Var, v1.i.f18419h, oVar3), oVar3, 2058660585);
                    aVar.invoke(sVar, oVar3, Integer.valueOf(((i12 >> 6) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 6));
                    oVar3.r(false);
                    android.support.v4.media.session.a.t(oVar3, true, false, false);
                }
                break;
            case 2:
                o0.o oVar4 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar4.D()) {
                    oVar4.P();
                } else {
                    int i13 = (i11 >> 15) & 7168;
                    oVar4.U(-483455358);
                    t1.h0 h0VarA2 = y.r.a(y.i.f19954c, a1.a.A, oVar4);
                    oVar4.U(-1323940314);
                    q2.b bVar2 = (q2.b) oVar4.k(w1.b1.f18759e);
                    q2.l lVar2 = (q2.l) oVar4.k(w1.b1.f18764k);
                    w1.d2 d2Var2 = (w1.d2) oVar4.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar2 = v1.i.f18413b;
                    w0.a aVarI2 = t1.w0.i(kVar);
                    oVar4.X();
                    if (oVar4.O) {
                        oVar4.m(nVar2);
                    } else {
                        oVar4.j0();
                    }
                    oVar4.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarA2, oVar4);
                    o0.p.Q(v1.i.f18415d, bVar2, oVar4);
                    o0.p.Q(v1.i.f18418g, lVar2, oVar4);
                    k0.g.u(0, aVarI2, gb.e.f(oVar4, d2Var2, v1.i.f18419h, oVar4), oVar4, 2058660585);
                    aVar.invoke(sVar, oVar4, Integer.valueOf(((i13 >> 6) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 6));
                    oVar4.r(false);
                    android.support.v4.media.session.a.t(oVar4, true, false, false);
                }
                break;
            case 3:
                o0.o oVar5 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar5.D()) {
                    oVar5.P();
                } else {
                    a1.n nVarN = androidx.compose.foundation.layout.c.n(kVar, n0.m.f12010a);
                    a1.d dVar = a1.a.f179t;
                    oVar5.U(733328855);
                    t1.h0 h0VarC = y.n.c(dVar, false, oVar5);
                    oVar5.U(-1323940314);
                    q2.b bVar3 = (q2.b) oVar5.k(w1.b1.f18759e);
                    q2.l lVar3 = (q2.l) oVar5.k(w1.b1.f18764k);
                    w1.d2 d2Var3 = (w1.d2) oVar5.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar3 = v1.i.f18413b;
                    w0.a aVarI3 = t1.w0.i(nVarN);
                    oVar5.X();
                    if (oVar5.O) {
                        oVar5.m(nVar3);
                    } else {
                        oVar5.j0();
                    }
                    oVar5.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarC, oVar5);
                    o0.p.Q(v1.i.f18415d, bVar3, oVar5);
                    o0.p.Q(v1.i.f18418g, lVar3, oVar5);
                    k0.g.u(0, aVarI3, gb.e.f(oVar5, d2Var3, v1.i.f18419h, oVar5), oVar5, 2058660585);
                    aVar.invoke(oVar5, Integer.valueOf((i11 >> 18) & 14));
                    oVar5.r(false);
                    oVar5.r(true);
                    oVar5.r(false);
                    oVar5.r(false);
                }
                break;
            default:
                o0.o oVar6 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar6.D()) {
                    oVar6.P();
                } else {
                    a1.n nVarD = te.a.D(androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.a.k(kVar, 0.0f, z2.f11524c, 1)), te.a.x(oVar6));
                    int i14 = i11 & 7168;
                    oVar6.U(-483455358);
                    t1.h0 h0VarA3 = y.r.a(y.i.f19954c, a1.a.A, oVar6);
                    oVar6.U(-1323940314);
                    q2.b bVar4 = (q2.b) oVar6.k(w1.b1.f18759e);
                    q2.l lVar4 = (q2.l) oVar6.k(w1.b1.f18764k);
                    w1.d2 d2Var4 = (w1.d2) oVar6.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar4 = v1.i.f18413b;
                    w0.a aVarI4 = t1.w0.i(nVarD);
                    oVar6.X();
                    if (oVar6.O) {
                        oVar6.m(nVar4);
                    } else {
                        oVar6.j0();
                    }
                    oVar6.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarA3, oVar6);
                    o0.p.Q(v1.i.f18415d, bVar4, oVar6);
                    o0.p.Q(v1.i.f18418g, lVar4, oVar6);
                    k0.g.u(0, aVarI4, gb.e.f(oVar6, d2Var4, v1.i.f18419h, oVar6), oVar6, 2058660585);
                    aVar.invoke(sVar, oVar6, Integer.valueOf(((i14 >> 6) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 6));
                    oVar6.r(false);
                    android.support.v4.media.session.a.t(oVar6, true, false, false);
                }
                break;
        }
        return oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(w0.a aVar, int i10, int i11) {
        super(2);
        this.f10445i = i11;
        this.f10446r = aVar;
        this.f10447s = i10;
    }
}
