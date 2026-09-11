package f0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qg.g f5724a;

    static {
        rg.s sVar = rg.s.f14664i;
        f5724a = new qg.g(sVar, sVar);
    }

    public static final void a(d2.e eVar, List list, o0.o oVar, int i10) {
        oVar.V(-1794596951);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            d2.d dVar = (d2.d) list.get(i11);
            eh.f fVar = (eh.f) dVar.f4832a;
            int i12 = dVar.f4833b;
            int i13 = dVar.f4834c;
            h hVar = h.f5712b;
            oVar.U(-1323940314);
            int i14 = oVar.P;
            o0.d1 d1VarN = oVar.n();
            v1.j.f18438q.getClass();
            v1.n nVar = v1.i.f18413b;
            w0.a aVarJ = t1.w0.j(a1.k.f196a);
            oVar.X();
            if (oVar.O) {
                oVar.m(nVar);
            } else {
                oVar.j0();
            }
            o0.p.Q(v1.i.f18417f, hVar, oVar);
            o0.p.Q(v1.i.f18416e, d1VarN, oVar);
            v1.h hVar2 = v1.i.f18420i;
            if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i14))) {
                k0.g.t(i14, oVar, i14, hVar2);
            }
            k0.g.z(oVar, aVarJ, oVar, 0, 2058660585);
            fVar.invoke(eVar.subSequence(i12, i13).f4836i, oVar, 0);
            oVar.r(false);
            oVar.r(true);
            oVar.r(false);
        }
        o0.h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new a0.n(eVar, list, i10, 2);
        }
    }
}
