package androidx.compose.material.icons.filled;

import g1.m0;
import g1.t;
import j0.a;
import java.util.ArrayList;
import k1.a0;
import k1.e;
import k1.f;
import k1.h0;
import k1.j;
import k1.m;
import k1.n;
import k1.s;
import k1.u;
import k1.z;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class ShieldKt {
    private static f _shield;

    public static final f getShield(a aVar) {
        l.f("<this>", aVar);
        f fVar = _shield;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Shield", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(12.0f, 1.0f));
        arrayList.add(new m(3.0f, 5.0f));
        arrayList.add(new z(6.0f));
        arrayList.add(new s(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f));
        arrayList.add(new s(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f));
        arrayList.add(new a0(5.0f));
        arrayList.add(new u(-9.0f, -4.0f));
        arrayList.add(j.f9075c);
        e.a(eVar, arrayList, 0, m0Var);
        f fVarB = eVar.b();
        _shield = fVarB;
        return fVarB;
    }
}
