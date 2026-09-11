package androidx.compose.material.icons.filled;

import g1.m0;
import g1.t;
import j0.a;
import java.util.ArrayList;
import k1.e;
import k1.f;
import k1.h0;
import k1.j;
import k1.n;
import k1.z;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class DensityLargeKt {
    private static f _densityLarge;

    public static final f getDensityLarge(a aVar) {
        l.f("<this>", aVar);
        f fVar = _densityLarge;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.DensityLarge", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        long j = t.f6905b;
        m0 m0Var = new m0(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(3.0f, 3.0f));
        arrayList.add(new k1.t(18.0f));
        arrayList.add(new z(2.0f));
        k0.a.g(-18.0f, arrayList);
        j jVar = j.f9075c;
        arrayList.add(jVar);
        e.a(eVar, arrayList, 0, m0Var);
        m0 m0Var2 = new m0(j);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new n(3.0f, 19.0f));
        arrayList2.add(new k1.t(18.0f));
        arrayList2.add(new z(2.0f));
        k0.a.h(-18.0f, arrayList2, jVar);
        e.a(eVar, arrayList2, 0, m0Var2);
        f fVarB = eVar.b();
        _densityLarge = fVarB;
        return fVarB;
    }
}
