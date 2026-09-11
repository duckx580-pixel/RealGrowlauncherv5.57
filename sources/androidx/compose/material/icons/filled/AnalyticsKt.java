package androidx.compose.material.icons.filled;

import bj.n;
import g1.m0;
import g1.t;
import j0.a;
import k0.b;
import k0.d;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsKt {
    private static f _analytics;

    public static final f getAnalytics(a aVar) {
        l.f("<this>", aVar);
        f fVar = _analytics;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Analytics", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarC = k0.a.c(19.0f, 3.0f, 5.0f, 3.0f);
        nVarC.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nVarC.t(14.0f);
        nVarC.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nVarC.k(14.0f);
        nVarC.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nVarC.l(21.0f, 5.0f);
        nVarC.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k0.a.n(nVarC, 9.0f, 17.0f, 7.0f, 17.0f);
        b.h(nVarC, -5.0f, 2.0f, 5.0f);
        k0.a.p(nVarC, 13.0f, 17.0f, -2.0f, -3.0f);
        d.r(nVarC, 2.0f, 3.0f, 13.0f, 12.0f);
        b.w(nVarC, -2.0f, -2.0f, 2.0f, 2.0f);
        nVarC.n(17.0f, 17.0f);
        b.i(nVarC, -2.0f, 15.0f, 7.0f, 2.0f);
        nVarC.t(10.0f);
        nVarC.g();
        e.a(eVar, nVarC.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _analytics = fVarB;
        return fVarB;
    }
}
