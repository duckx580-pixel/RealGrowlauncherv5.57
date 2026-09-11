package androidx.compose.material.icons.outlined;

import bj.n;
import g1.m0;
import g1.t;
import j0.b;
import k0.c;
import k1.e;
import k1.f;
import k1.h0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class VolumeMuteKt {
    private static f _volumeMute;

    public static final f getVolumeMute(b bVar) {
        l.f("<this>", bVar);
        f fVar = _volumeMute;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Outlined.VolumeMute", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarN = c.n(14.0f, 8.83f, 6.34f, 11.83f, 13.0f);
        c.l(nVarN, 9.0f, -2.0f, 2.83f);
        nVarN.l(14.0f, 8.83f);
        nVarN.n(16.0f, 4.0f);
        k0.f.A(nVarN, -5.0f, 5.0f, 7.0f, 6.0f);
        nVarN.k(4.0f);
        nVarN.m(5.0f, 5.0f);
        nVarN.s(4.0f);
        nVarN.g();
        e.a(eVar, nVarN.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _volumeMute = fVarB;
        return fVarB;
    }
}
