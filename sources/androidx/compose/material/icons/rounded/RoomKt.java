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
public final class RoomKt {
    private static f _room;

    public static final f getRoom(c cVar) {
        l.f("<this>", cVar);
        f fVar = _room;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Rounded.Room", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        m0 m0Var = new m0(t.f6905b);
        n nVarA = a.a(12.0f, 2.0f);
        nVarA.i(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        nVarA.i(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f);
        nVarA.i(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        nVarA.h(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f);
        nVarA.h(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f);
        nVarA.g();
        nVarA.n(12.0f, 12.0f);
        nVarA.i(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        nVarA.i(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        nVarA.i(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        nVarA.h(14.0f, 11.1f, 13.1f, 12.0f, 12.0f, 12.0f);
        nVarA.g();
        e.a(eVar, nVarA.f3166a, 0, m0Var);
        f fVarB = eVar.b();
        _room = fVarB;
        return fVarB;
    }
}
