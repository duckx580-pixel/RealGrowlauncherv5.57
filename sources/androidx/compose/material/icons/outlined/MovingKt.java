package androidx.compose.material.icons.outlined;

import bj.n;
import g1.m0;
import g1.t;
import j0.b;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MovingKt {
    private static f _moving;

    public static final f getMoving(b bVar) {
        l.f("<this>", bVar);
        f fVar = _moving;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Outlined.Moving", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVar = new n(1);
        nVar.n(20.0f, 9.42f);
        nVar.s(12.0f);
        nVar.k(2.0f);
        nVar.s(6.0f);
        k0.b.v(nVar, -6.0f, 2.0f, 2.58f);
        nVar.m(-4.46f, 4.46f);
        nVar.i(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        nVar.m(-1.17f, -1.17f);
        nVar.i(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        nVar.l(2.0f, 16.59f);
        nVar.l(3.41f, 18.0f);
        nVar.m(5.29f, -5.29f);
        nVar.i(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        nVar.m(1.17f, 1.17f);
        nVar.i(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f);
        nVar.l(20.0f, 9.42f);
        nVar.g();
        e.a(eVar, nVar.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _moving = fVarB;
        return fVarB;
    }
}
