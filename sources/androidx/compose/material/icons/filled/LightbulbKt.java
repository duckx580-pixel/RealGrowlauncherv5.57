package androidx.compose.material.icons.filled;

import bj.n;
import g1.m0;
import g1.t;
import j0.a;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class LightbulbKt {
    private static f _lightbulb;

    public static final f getLightbulb(a aVar) {
        l.f("<this>", aVar);
        f fVar = _lightbulb;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Lightbulb", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarA = k0.a.a(9.0f, 21.0f);
        nVarA.i(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        nVarA.k(4.0f);
        nVarA.i(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        k0.a.q(nVarA, -1.0f, 9.0f, 20.0f, 1.0f);
        nVarA.n(12.0f, 2.0f);
        nVarA.h(8.1f, 2.0f, 5.0f, 5.1f, 5.0f, 9.0f);
        nVarA.i(0.0f, 2.4f, 1.2f, 4.5f, 3.0f, 5.7f);
        nVarA.l(8.0f, 17.0f);
        nVarA.i(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        nVarA.k(6.0f);
        nVarA.i(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        nVarA.t(-2.3f);
        nVarA.i(1.8f, -1.3f, 3.0f, -3.4f, 3.0f, -5.7f);
        nVarA.i(0.0f, -3.9f, -3.1f, -7.0f, -7.0f, -7.0f);
        nVarA.g();
        e.a(eVar, nVarA.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _lightbulb = fVarB;
        return fVarB;
    }
}
