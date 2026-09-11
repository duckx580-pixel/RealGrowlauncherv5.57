package androidx.compose.material.icons.filled;

import bj.n;
import g1.m0;
import g1.t;
import j0.a;
import k0.c;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AirlinesKt {
    private static f _airlines;

    public static final f getAirlines(a aVar) {
        l.f("<this>", aVar);
        f fVar = _airlines;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Airlines", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarQ = c.q(13.0f, 4.0f, 2.0f, 20.0f, 17.0f);
        c.u(nVarQ, 3.0f, -16.0f, 13.0f);
        nVarQ.n(14.5f, 14.0f);
        nVarQ.i(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        nVarQ.i(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        nVarQ.q(2.5f, 1.12f, 2.5f, 2.5f);
        nVarQ.h(17.0f, 12.88f, 15.88f, 14.0f, 14.5f, 14.0f);
        nVarQ.g();
        e.a(eVar, nVarQ.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _airlines = fVarB;
        return fVarB;
    }
}
