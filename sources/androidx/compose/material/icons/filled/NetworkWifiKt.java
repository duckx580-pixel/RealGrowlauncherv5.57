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
public final class NetworkWifiKt {
    private static f _networkWifi;

    public static final f getNetworkWifi(a aVar) {
        l.f("<this>", aVar);
        f fVar = _networkWifi;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.NetworkWifi", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarA = k0.a.a(24.0f, 8.98f);
        nVarA.h(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        nVarA.h(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        nVarA.l(12.0f, 21.0f);
        nVarA.t(0.0f);
        gb.e.p(nVarA, 0.0f, 0.0f, 24.0f, 8.98f);
        nVarA.n(2.92f, 9.07f);
        nVarA.h(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        nVarA.q(6.49f, 1.08f, 9.08f, 3.07f);
        nVarA.m(-1.43f, 1.43f);
        nVarA.h(17.5f, 8.94f, 14.86f, 8.0f, 12.0f, 8.0f);
        nVarA.q(-5.5f, 0.94f, -7.65f, 2.51f);
        nVarA.l(2.92f, 9.07f);
        nVarA.g();
        e.a(eVar, nVarA.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _networkWifi = fVarB;
        return fVarB;
    }
}
