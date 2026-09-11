package androidx.compose.material.icons.filled;

import bj.n;
import g1.m0;
import g1.t;
import j0.a;
import k0.d;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class ShortcutKt {
    private static f _shortcut;

    public static final f getShortcut(a aVar) {
        l.f("<this>", aVar);
        f fVar = _shortcut;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.Shortcut", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarF = d.f(21.0f, 11.0f, -6.0f, -6.0f, 5.0f);
        nVarF.j(8.0f);
        nVarF.i(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        k0.a.x(nVarF, 4.0f, 2.0f, -4.0f);
        nVarF.i(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        k0.e.o(nVarF, 7.0f, 5.0f, 21.0f, 11.0f);
        e.a(eVar, nVarF.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _shortcut = fVarB;
        return fVarB;
    }
}
