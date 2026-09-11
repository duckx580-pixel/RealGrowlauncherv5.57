package ni;

import i2.x;
import m0.e1;
import m0.f2;
import m0.g1;
import m0.l7;
import m0.n7;
import m0.o7;
import o0.d1;
import o0.e2;
import o0.o;
import o0.p;
import o0.p1;
import t1.h0;
import t1.w0;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12321i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k1.f f12322r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f12323s;

    public /* synthetic */ e(int i10, String str, k1.f fVar) {
        this.f12321i = 2;
        this.f12322r = fVar;
        this.f12323s = str;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12321i) {
            case 0:
                o oVar = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    float fU = t6.k.u(8, oVar);
                    float fU2 = t6.k.u(4, oVar);
                    a1.k kVar = a1.k.f196a;
                    a1.n nVarJ = androidx.compose.foundation.layout.a.j(kVar, fU, fU2);
                    a1.c cVar = a1.a.f183y;
                    oVar.U(693286680);
                    h0 h0VarA = r0.a(y.i.f19952a, cVar, oVar);
                    oVar.U(-1323940314);
                    int i10 = oVar.P;
                    d1 d1VarN = oVar.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarJ = w0.j(nVarJ);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar);
                    } else {
                        oVar.j0();
                    }
                    p.Q(v1.i.f18417f, h0VarA, oVar);
                    p.Q(v1.i.f18416e, d1VarN, oVar);
                    v1.h hVar = v1.i.f18420i;
                    if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i10))) {
                        k0.g.t(i10, oVar, i10, hVar);
                    }
                    k0.g.u(0, aVarJ, new p1(oVar), oVar, 2058660585);
                    f2.b(this.f12322r, null, null, 0L, oVar, 48, 12);
                    ud.a.h(androidx.compose.foundation.layout.c.q(kVar, t6.k.u(2, oVar)), oVar);
                    l7.b(this.f12323s, null, 0L, t6.k.v(7, oVar), null, x.w, null, 0L, null, t6.k.v(8, oVar), 2, false, 1, 0, null, null, oVar, 196608, 3120, 119766);
                    k0.g.A(oVar, false, true, false, false);
                }
                break;
            case 1:
                o oVar2 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    a1.c cVar2 = a1.a.f183y;
                    a1.k kVar2 = a1.k.f196a;
                    a1.n nVarK = androidx.compose.foundation.layout.a.k(kVar2, 12, 0.0f, 2);
                    oVar2.U(693286680);
                    h0 h0VarA2 = r0.a(y.i.f19952a, cVar2, oVar2);
                    oVar2.U(-1323940314);
                    int i11 = oVar2.P;
                    d1 d1VarN2 = oVar2.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar2 = v1.i.f18413b;
                    w0.a aVarJ2 = w0.j(nVarK);
                    oVar2.X();
                    if (oVar2.O) {
                        oVar2.m(nVar2);
                    } else {
                        oVar2.j0();
                    }
                    p.Q(v1.i.f18417f, h0VarA2, oVar2);
                    p.Q(v1.i.f18416e, d1VarN2, oVar2);
                    v1.h hVar2 = v1.i.f18420i;
                    if (oVar2.O || !kotlin.jvm.internal.l.a(oVar2.L(), Integer.valueOf(i11))) {
                        k0.g.t(i11, oVar2, i11, hVar2);
                    }
                    k0.g.u(0, aVarJ2, new p1(oVar2), oVar2, 2058660585);
                    a1.n nVarN = androidx.compose.foundation.layout.c.n(kVar2, 16);
                    e2 e2Var = g1.f10686a;
                    f2.b(this.f12322r, null, nVarN, ((e1) oVar2.k(e2Var)).j(), oVar2, 432, 0);
                    ud.a.h(androidx.compose.foundation.layout.c.q(kVar2, 8), oVar2);
                    l7.b(this.f12323s, null, ((e1) oVar2.k(e2Var)).j(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar2.k(o7.f11096a)).f11049n, oVar2, 0, 0, 65530);
                    k0.g.A(oVar2, false, true, false, false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xi.b.e(this.f12322r, this.f12323s, (o) obj, p.S(1));
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ e(k1.f fVar, String str, int i10, byte b4) {
        this.f12321i = i10;
        this.f12322r = fVar;
        this.f12323s = str;
    }
}
