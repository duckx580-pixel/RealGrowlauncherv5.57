package t1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends v1.b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f16320b = new t0("Undefined intrinsics block and it is required");

    @Override // t1.h0
    public final i0 a(j0 j0Var, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        rg.t tVar = rg.t.f14665i;
        if (zIsEmpty) {
            return j0Var.V(q2.a.j(j), q2.a.i(j), tVar, r0.f16314s);
        }
        if (list.size() == 1) {
            q0 q0VarN = ((g0) list.get(0)).n(j);
            return j0Var.V(rk.a.N(j, q0VarN.f16308i), rk.a.M(j, q0VarN.f16309r), tVar, new d1.h(q0VarN, 6));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((g0) list.get(i10)).n(j));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            q0 q0Var = (q0) arrayList.get(i11);
            iMax = Math.max(q0Var.f16308i, iMax);
            iMax2 = Math.max(q0Var.f16309r, iMax2);
        }
        return j0Var.V(rk.a.N(j, iMax), rk.a.M(j, iMax2), tVar, new f0.g(3, arrayList));
    }
}
