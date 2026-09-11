package c0;

import oh.x;
import qg.o;
import t1.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a implements d {
    public final v.k F;
    public final u1.h G;

    public j(v.k kVar) {
        this.F = kVar;
        u1.h hVar = new u1.h(c.f3261a);
        hVar.f17561h.setValue(this);
        this.G = hVar;
    }

    public static final f1.d G0(j jVar, p pVar, eh.a aVar) {
        f1.d dVar;
        p pVar2 = jVar.E;
        if (pVar2 == null || !pVar2.h()) {
            pVar2 = null;
        }
        if (pVar2 != null) {
            if (!pVar.h()) {
                pVar = null;
            }
            if (pVar != null && (dVar = (f1.d) aVar.invoke()) != null) {
                f1.d dVarP = pVar2.p(pVar, false);
                return dVar.f(vd.a.b(dVarP.f5979a, dVarP.f5980b));
            }
        }
        return null;
    }

    @Override // u1.d
    public final u5.f O() {
        return this.G;
    }

    @Override // c0.d
    public final Object j0(p pVar, eh.a aVar, wg.c cVar) throws Throwable {
        Object objG = x.g(new i(this, pVar, aVar, new bj.f(this, pVar, aVar), null), cVar);
        return objG == vg.a.f18663i ? objG : o.f13926a;
    }
}
