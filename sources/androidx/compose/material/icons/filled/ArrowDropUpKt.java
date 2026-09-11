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
import k1.u;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class ArrowDropUpKt {
    private static f _arrowDropUp;

    public static final f getArrowDropUp(a aVar) {
        l.f("<this>", aVar);
        f fVar = _arrowDropUp;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.ArrowDropUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(7.0f, 14.0f));
        arrayList.add(new u(5.0f, -5.0f));
        k0.a.e(5.0f, 5.0f, arrayList);
        arrayList.add(j.f9075c);
        e.a(eVar, arrayList, 0, m0Var);
        f fVarB = eVar.b();
        _arrowDropUp = fVarB;
        return fVarB;
    }
}
