package androidx.compose.material.icons.outlined;

import g1.m0;
import g1.t;
import j0.b;
import java.util.ArrayList;
import k0.a;
import k1.e;
import k1.f;
import k1.h0;
import k1.j;
import k1.m;
import k1.n;
import k1.u;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandLessKt {
    private static f _expandLess;

    public static final f getExpandLess(b bVar) {
        l.f("<this>", bVar);
        f fVar = _expandLess;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Outlined.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(12.0f, 8.0f));
        arrayList.add(new u(-6.0f, 6.0f));
        arrayList.add(new u(1.41f, 1.41f));
        arrayList.add(new m(12.0f, 10.83f));
        arrayList.add(new u(4.59f, 4.58f));
        arrayList.add(new m(18.0f, 14.0f));
        a.e(-6.0f, -6.0f, arrayList);
        arrayList.add(j.f9075c);
        e.a(eVar, arrayList, 0, m0Var);
        f fVarB = eVar.b();
        _expandLess = fVarB;
        return fVarB;
    }
}
