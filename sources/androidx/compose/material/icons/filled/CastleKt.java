package androidx.compose.material.icons.filled;

import bj.n;
import g1.m0;
import g1.t;
import j0.a;
import k0.d;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CastleKt {
    private static f _castle;

    public static final f getCastle(a aVar) {
        l.f("<this>", aVar);
        f fVar = _castle;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Castle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarG = k0.f.g(21.0f, 9.0f, 2.0f, -2.0f, 3.0f);
        k0.a.o(nVarG, -2.0f, 2.0f, -2.0f, 3.0f);
        k0.a.o(nVarG, -2.0f, 2.0f, -2.0f, 3.0f);
        nVarG.j(9.0f);
        nVarG.t(2.0f);
        nVarG.j(7.0f);
        nVarG.s(3.0f);
        nVarG.j(5.0f);
        nVarG.t(8.0f);
        nVarG.j(3.0f);
        nVarG.s(9.0f);
        d.B(nVarG, 1.0f, 12.0f, 9.0f, -3.0f);
        nVarG.i(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        nVarG.q(2.0f, 0.9f, 2.0f, 2.0f);
        k0.f.x(nVarG, 3.0f, 9.0f, 9.0f, 21.0f);
        d.A(nVarG, 11.0f, 12.0f, 9.0f, 9.0f);
        gb.e.r(nVarG, 2.0f, 12.0f, 15.0f, 12.0f);
        d.D(nVarG, -2.0f, 9.0f, 2.0f, 12.0f);
        e.a(eVar, nVarG.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _castle = fVarB;
        return fVarB;
    }
}
