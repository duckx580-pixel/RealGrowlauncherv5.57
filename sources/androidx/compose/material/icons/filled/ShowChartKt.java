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
public final class ShowChartKt {
    private static f _showChart;

    public static final f getShowChart(a aVar) {
        l.f("<this>", aVar);
        f fVar = _showChart;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.ShowChart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarB = gb.e.b(3.5f, 18.49f, 6.0f, -6.01f);
        nVarB.m(4.0f, 4.0f);
        nVarB.l(22.0f, 6.92f);
        nVarB.m(-1.41f, -1.41f);
        nVarB.m(-7.09f, 7.97f);
        gb.e.p(nVarB, -4.0f, -4.0f, 2.0f, 16.99f);
        e.a(eVar, nVarB.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _showChart = fVarB;
        return fVarB;
    }
}
