package androidx.compose.material.icons.rounded;

import g1.m0;
import g1.t;
import j0.c;
import java.util.ArrayList;
import k1.e;
import k1.f;
import k1.h0;
import k1.j;
import k1.n;
import k1.s;
import k1.x;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MinimizeKt {
    private static f _minimize;

    public static final f getMinimize(c cVar) {
        l.f("<this>", cVar);
        f fVar = _minimize;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Rounded.Minimize", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(7.0f, 19.0f));
        arrayList.add(new k1.t(10.0f));
        arrayList.add(new s(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f));
        arrayList.add(new x(-0.45f, 1.0f, -1.0f, 1.0f));
        arrayList.add(new k1.l(7.0f));
        arrayList.add(new s(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f));
        arrayList.add(new x(0.45f, -1.0f, 1.0f, -1.0f));
        arrayList.add(j.f9075c);
        e.a(eVar, arrayList, 0, m0Var);
        f fVarB = eVar.b();
        _minimize = fVarB;
        return fVarB;
    }
}
