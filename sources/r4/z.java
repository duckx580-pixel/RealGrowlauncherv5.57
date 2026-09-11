package r4;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@h0("navigation")
public class z extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f14587c;

    public z(j0 j0Var) {
        kotlin.jvm.internal.l.f("navigatorProvider", j0Var);
        this.f14587c = j0Var;
    }

    @Override // r4.i0
    public final void d(List list, c0 c0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            v vVar = kVar.f14517r;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.NavGraph", vVar);
            x xVar = (x) vVar;
            Bundle bundleA = kVar.a();
            int i10 = xVar.f14578z;
            String str = xVar.B;
            if (i10 == 0 && str == null) {
                StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
                int i11 = xVar.f14573v;
                sb2.append(i11 != 0 ? String.valueOf(i11) : "the root navigation");
                throw new IllegalStateException(sb2.toString().toString());
            }
            v vVarN = str != null ? xVar.n(str, false) : xVar.l(i10, false);
            if (vVarN == null) {
                if (xVar.A == null) {
                    String strValueOf = xVar.B;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(xVar.f14578z);
                    }
                    xVar.A = strValueOf;
                }
                String str2 = xVar.A;
                kotlin.jvm.internal.l.c(str2);
                throw new IllegalArgumentException(s.h0.f("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            i0 i0VarB = this.f14587c.b(vVarN.f14568i);
            m mVarB = b();
            Bundle bundleJ = vVarN.j(bundleA);
            a0 a0Var = mVarB.f14536h;
            i0VarB.d(sb.c.C(hd.d0.l(a0Var.f14455a, vVarN, bundleJ, a0Var.e(), a0Var.f14469p)), c0Var);
        }
    }

    @Override // r4.i0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x a() {
        return new x(this);
    }
}
