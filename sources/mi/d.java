package mi;

import o0.d1;
import o0.p1;
import t1.h0;
import t1.w0;
import y.r;
import y.s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11758i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.a f11759r;

    public /* synthetic */ d(w0.a aVar, int i10) {
        this.f11758i = i10;
        this.f11759r = aVar;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f11758i;
        s sVar = (s) obj;
        o0.o oVar = (o0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                kotlin.jvm.internal.l.f("$this$Card", sVar);
                if ((iIntValue & 17) == 16 && oVar.D()) {
                    oVar.P();
                } else {
                    a1.n nVarI = androidx.compose.foundation.layout.a.i(a1.k.f196a, t6.k.u(8, oVar));
                    oVar.U(-483455358);
                    h0 h0VarA = r.a(y.i.f19954c, a1.a.A, oVar);
                    oVar.U(-1323940314);
                    int i11 = oVar.P;
                    d1 d1VarN = oVar.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarJ = w0.j(nVarI);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar);
                    } else {
                        oVar.j0();
                    }
                    o0.p.Q(v1.i.f18417f, h0VarA, oVar);
                    o0.p.Q(v1.i.f18416e, d1VarN, oVar);
                    v1.h hVar = v1.i.f18420i;
                    if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i11))) {
                        k0.g.t(i11, oVar, i11, hVar);
                    }
                    k0.g.u(0, aVarJ, new p1(oVar), oVar, 2058660585);
                    this.f11759r.invoke(s.f19993a, oVar, 6);
                    oVar.r(false);
                    android.support.v4.media.session.a.t(oVar, true, false, false);
                }
                break;
            case 1:
                kotlin.jvm.internal.l.f("$this$Card", sVar);
                if ((iIntValue & 17) == 16 && oVar.D()) {
                    oVar.P();
                } else {
                    a1.n nVarI2 = androidx.compose.foundation.layout.a.i(a1.k.f196a, t6.k.u(8, oVar));
                    oVar.U(-483455358);
                    h0 h0VarA2 = r.a(y.i.f19954c, a1.a.A, oVar);
                    oVar.U(-1323940314);
                    int i12 = oVar.P;
                    d1 d1VarN2 = oVar.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar2 = v1.i.f18413b;
                    w0.a aVarJ2 = w0.j(nVarI2);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar2);
                    } else {
                        oVar.j0();
                    }
                    o0.p.Q(v1.i.f18417f, h0VarA2, oVar);
                    o0.p.Q(v1.i.f18416e, d1VarN2, oVar);
                    v1.h hVar2 = v1.i.f18420i;
                    if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i12))) {
                        k0.g.t(i12, oVar, i12, hVar2);
                    }
                    k0.g.u(0, aVarJ2, new p1(oVar), oVar, 2058660585);
                    this.f11759r.invoke(s.f19993a, oVar, 6);
                    oVar.r(false);
                    android.support.v4.media.session.a.t(oVar, true, false, false);
                }
                break;
            default:
                kotlin.jvm.internal.l.f("$this$Card", sVar);
                if ((iIntValue & 17) == 16 && oVar.D()) {
                    oVar.P();
                } else {
                    a1.n nVarI3 = androidx.compose.foundation.layout.a.i(a1.k.f196a, t6.k.u(8, oVar));
                    oVar.U(-483455358);
                    h0 h0VarA3 = r.a(y.i.f19954c, a1.a.A, oVar);
                    oVar.U(-1323940314);
                    int i13 = oVar.P;
                    d1 d1VarN3 = oVar.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar3 = v1.i.f18413b;
                    w0.a aVarJ3 = w0.j(nVarI3);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar3);
                    } else {
                        oVar.j0();
                    }
                    o0.p.Q(v1.i.f18417f, h0VarA3, oVar);
                    o0.p.Q(v1.i.f18416e, d1VarN3, oVar);
                    v1.h hVar3 = v1.i.f18420i;
                    if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i13))) {
                        k0.g.t(i13, oVar, i13, hVar3);
                    }
                    k0.g.u(0, aVarJ3, new p1(oVar), oVar, 2058660585);
                    this.f11759r.invoke(s.f19993a, oVar, 6);
                    oVar.r(false);
                    android.support.v4.media.session.a.t(oVar, true, false, false);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
