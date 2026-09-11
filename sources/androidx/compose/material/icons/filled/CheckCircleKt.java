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
public final class CheckCircleKt {
    private static f _checkCircle;

    public static final f getCheckCircle(a aVar) {
        l.f("<this>", aVar);
        f fVar = _checkCircle;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarA = k0.a.a(12.0f, 2.0f);
        nVarA.h(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        nVarA.q(4.48f, 10.0f, 10.0f, 10.0f);
        nVarA.q(10.0f, -4.48f, 10.0f, -10.0f);
        nVarA.p(17.52f, 2.0f, 12.0f, 2.0f);
        c.g(nVarA, 10.0f, 17.0f, -5.0f, -5.0f);
        nVarA.m(1.41f, -1.41f);
        nVarA.l(10.0f, 14.17f);
        nVarA.m(7.59f, -7.59f);
        c.h(nVarA, 19.0f, 8.0f, -9.0f, 9.0f);
        e.a(eVar, nVarA.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _checkCircle = fVarB;
        return fVarB;
    }
}
