package androidx.compose.material.icons.rounded;

import g1.m0;
import g1.t;
import j0.c;
import java.util.ArrayList;
import k1.e;
import k1.f;
import k1.h0;
import k1.n;
import k1.r;
import k1.v;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PhotoCameraKt {
    private static f _photoCamera;

    public static final f getPhotoCamera(c cVar) {
        l.f("<this>", cVar);
        f fVar = _photoCamera;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Rounded.PhotoCamera", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i10 = h0.f9067a;
        long j = t.f6905b;
        m0 m0Var = new m0(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(12.0f, 12.0f));
        arrayList.add(new v(-3.0f, 0.0f));
        arrayList.add(new r(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f));
        arrayList.add(new r(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f));
        e.a(eVar, arrayList, 0, m0Var);
        m0 m0Var2 = new m0(j);
        bj.n nVarK = gb.e.k(20.0f, 4.0f, -3.17f, -1.24f, -1.35f);
        nVarK.i(-0.37f, -0.41f, -0.91f, -0.65f, -1.47f, -0.65f);
        nVarK.l(9.88f, 2.0f);
        nVarK.i(-0.56f, 0.0f, -1.1f, 0.24f, -1.48f, 0.65f);
        nVarK.l(7.17f, 4.0f);
        nVarK.l(4.0f, 4.0f);
        nVarK.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        nVarK.t(12.0f);
        nVarK.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        nVarK.k(16.0f);
        nVarK.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        nVarK.l(22.0f, 6.0f);
        nVarK.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        nVarK.g();
        nVarK.n(12.0f, 17.0f);
        nVarK.i(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        nVarK.q(2.24f, -5.0f, 5.0f, -5.0f);
        nVarK.q(5.0f, 2.24f, 5.0f, 5.0f);
        nVarK.q(-2.24f, 5.0f, -5.0f, 5.0f);
        nVarK.g();
        e.a(eVar, nVarK.f3166a, 0, m0Var2);
        f fVarB = eVar.b();
        _photoCamera = fVarB;
        return fVarB;
    }
}
