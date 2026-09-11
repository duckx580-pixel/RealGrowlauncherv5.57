package androidx.compose.material.icons.filled;

import g1.m0;
import g1.t;
import j0.a;
import java.util.ArrayList;
import k1.e;
import k1.f;
import k1.h0;
import k1.j;
import k1.k;
import k1.n;
import k1.x;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class LensKt {
    private static f _lens;

    public static final f getLens(a aVar) {
        l.f("<this>", aVar);
        f fVar = _lens;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Lens", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(12.0f, 2.0f));
        arrayList.add(new k(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f));
        arrayList.add(new x(4.48f, 10.0f, 10.0f, 10.0f));
        arrayList.add(new x(10.0f, -4.48f, 10.0f, -10.0f));
        k0.e.c(17.52f, 2.0f, 12.0f, 2.0f, arrayList);
        arrayList.add(j.f9075c);
        e.a(eVar, arrayList, 0, m0Var);
        f fVarB = eVar.b();
        _lens = fVarB;
        return fVarB;
    }
}
