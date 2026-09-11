package androidx.compose.material.icons.filled;

import g1.m0;
import g1.t;
import j0.a;
import java.util.ArrayList;
import k1.e;
import k1.f;
import k1.h0;
import k1.n;
import k1.r;
import k1.v;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class Brightness1Kt {
    private static f _brightness1;

    public static final f getBrightness1(a aVar) {
        l.f("<this>", aVar);
        f fVar = _brightness1;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Brightness1", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(12.0f, 12.0f));
        arrayList.add(new v(-10.0f, 0.0f));
        arrayList.add(new r(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f));
        arrayList.add(new r(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f));
        e.a(eVar, arrayList, 0, m0Var);
        f fVarB = eVar.b();
        _brightness1 = fVarB;
        return fVarB;
    }
}
