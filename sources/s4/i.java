package s4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0.n0;
import o0.z0;
import r4.c0;
import r4.h0;
import r4.i0;
import r4.v;
import rg.a0;
import rh.h1;
import rh.r0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@h0("composable")
public final class i extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f15155c = o0.p.I(Boolean.FALSE, n0.f12510u);

    @Override // r4.i0
    public final v a() {
        return new h(this, c.f15151a);
    }

    @Override // r4.i0
    public final void d(List list, c0 c0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r4.k kVar = (r4.k) it.next();
            r4.m mVarB = b();
            r0 r0Var = mVarB.f14533e;
            kotlin.jvm.internal.l.f("backStackEntry", kVar);
            h1 h1Var = mVarB.f14531c;
            Iterable iterable = (Iterable) h1Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((r4.k) it2.next()) == kVar) {
                        Iterable iterable2 = (Iterable) r0Var.f14808i.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((r4.k) it3.next()) == kVar) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            r4.k kVar2 = (r4.k) rg.l.l0((List) r0Var.f14808i.getValue());
            if (kVar2 != null) {
                h1Var.k(null, a0.E((Set) h1Var.getValue(), kVar2));
            }
            h1Var.k(null, a0.E((Set) h1Var.getValue(), kVar));
            mVarB.f(kVar);
        }
        this.f15155c.setValue(Boolean.FALSE);
    }

    @Override // r4.i0
    public final void e(r4.k kVar, boolean z3) {
        b().e(kVar, z3);
        this.f15155c.setValue(Boolean.TRUE);
    }
}
