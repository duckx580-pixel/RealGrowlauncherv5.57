package androidx.compose.material.icons.outlined;

import bj.n;
import g1.m0;
import g1.t;
import j0.b;
import k0.a;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityKt {
    private static f _accessibility;

    public static final f getAccessibility(b bVar) {
        l.f("<this>", bVar);
        f fVar = _accessibility;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Outlined.Accessibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarA = a.a(12.0f, 2.0f);
        nVarA.i(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        nVarA.q(-0.9f, 2.0f, -2.0f, 2.0f);
        nVarA.q(-2.0f, -0.9f, -2.0f, -2.0f);
        nVarA.q(0.9f, -2.0f, 2.0f, -2.0f);
        a.u(nVarA, 21.0f, 9.0f, -6.0f, 13.0f);
        a.w(nVarA, -2.0f, -6.0f, -2.0f, 6.0f);
        nVarA.l(9.0f, 22.0f);
        nVarA.l(9.0f, 9.0f);
        nVarA.l(3.0f, 9.0f);
        a.y(nVarA, 3.0f, 7.0f, 18.0f, 2.0f);
        e.a(eVar, nVarA.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _accessibility = fVarB;
        return fVarB;
    }
}
