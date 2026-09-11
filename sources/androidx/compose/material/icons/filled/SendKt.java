package androidx.compose.material.icons.filled;

import g1.m0;
import g1.t;
import j0.a;
import java.util.ArrayList;
import k0.d;
import k1.e;
import k1.f;
import k1.h0;
import k1.j;
import k1.m;
import k1.n;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SendKt {
    private static f _send;

    public static final f getSend(a aVar) {
        l.f("<this>", aVar);
        f fVar = _send;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Send", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(2.01f, 21.0f));
        arrayList.add(new m(23.0f, 12.0f));
        arrayList.add(new m(2.01f, 3.0f));
        arrayList.add(new m(2.0f, 10.0f));
        d.c(15.0f, 2.0f, -15.0f, 2.0f, arrayList);
        arrayList.add(j.f9075c);
        e.a(eVar, arrayList, 0, m0Var);
        f fVarB = eVar.b();
        _send = fVarB;
        return fVarB;
    }
}
