package androidx.compose.material.icons.outlined;

import bj.n;
import g1.m0;
import g1.t;
import j0.b;
import k0.a;
import k0.c;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PlusOneKt {
    private static f _plusOne;

    public static final f getPlusOne(b bVar) {
        l.f("<this>", bVar);
        f fVar = _plusOne;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Outlined.PlusOne", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarE = c.e(10.0f, 8.0f, 8.0f, 8.0f, 4.0f);
        gb.e.o(nVarE, 4.0f, 12.0f, 2.0f, 4.0f);
        a.A(nVarE, 4.0f, 2.0f, -4.0f, 4.0f);
        k0.b.e(nVarE, -2.0f, -4.0f, 10.0f, 8.0f);
        nVarE.n(14.5f, 6.08f);
        nVarE.l(14.5f, 7.9f);
        nVarE.m(2.5f, -0.5f);
        nVarE.l(17.0f, 18.0f);
        nVarE.k(2.0f);
        c.h(nVarE, 19.0f, 5.0f, -4.5f, 1.08f);
        e.a(eVar, nVarE.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _plusOne = fVarB;
        return fVarB;
    }
}
