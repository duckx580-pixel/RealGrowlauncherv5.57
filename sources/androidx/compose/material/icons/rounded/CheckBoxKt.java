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
public final class CheckBoxKt {
    private static f _checkBox;

    public static final f getCheckBox(c cVar) {
        l.f("<this>", cVar);
        f fVar = _checkBox;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Rounded.CheckBox", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarC = a.c(19.0f, 3.0f, 5.0f, 3.0f);
        nVarC.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nVarC.t(14.0f);
        nVarC.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nVarC.k(14.0f);
        nVarC.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nVarC.l(21.0f, 5.0f);
        nVarC.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nVarC.g();
        nVarC.n(10.71f, 16.29f);
        nVarC.i(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        nVarC.l(5.71f, 12.7f);
        nVarC.i(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        nVarC.i(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        nVarC.l(10.0f, 14.17f);
        nVarC.m(6.88f, -6.88f);
        nVarC.i(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        nVarC.i(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        nVarC.m(-7.58f, 7.59f);
        nVarC.g();
        e.a(eVar, nVarC.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _checkBox = fVarB;
        return fVarB;
    }
}
