package androidx.compose.material.icons.filled;

import bj.n;
import g1.m0;
import g1.t;
import j0.a;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class VolumeDownKt {
    private static f _volumeDown;

    public static final f getVolumeDown(a aVar) {
        l.f("<this>", aVar);
        f fVar = _volumeDown;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.VolumeDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarA = k0.a.a(18.5f, 12.0f);
        nVarA.i(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        nVarA.t(8.05f);
        nVarA.i(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
        gb.e.m(nVarA, 5.0f, 9.0f, 6.0f, 4.0f);
        nVarA.m(5.0f, 5.0f);
        k0.e.f(nVarA, 4.0f, 9.0f, 9.0f, 5.0f);
        e.a(eVar, nVarA.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _volumeDown = fVarB;
        return fVarB;
    }
}
