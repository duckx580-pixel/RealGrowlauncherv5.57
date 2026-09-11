package androidx.compose.material.icons.rounded;

import bj.n;
import g1.m0;
import g1.t;
import j0.c;
import k0.a;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class RectangleKt {
    private static f _rectangle;

    public static final f getRectangle(c cVar) {
        l.f("<this>", cVar);
        f fVar = _rectangle;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Rounded.Rectangle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarL = a.l(2.0f, 6.0f, 12.0f);
        nVarL.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nVarL.k(16.0f);
        nVarL.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nVarL.s(6.0f);
        nVarL.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nVarL.j(4.0f);
        nVarL.h(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        nVarL.g();
        e.a(eVar, nVarL.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _rectangle = fVarB;
        return fVarB;
    }
}
