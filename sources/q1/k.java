package q1;

import a0.k0;
import f0.u0;
import v1.c1;
import v1.h1;
import w1.b1;
import w1.j0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a1.m implements h1, c1, v1.k {
    public boolean D;

    @Override // a1.m
    public final void A0() {
        this.D = false;
        H0();
    }

    public final void G0() {
        a aVar = u0.f5876b;
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        v1.f.B(this, new j(1));
        n nVar = (n) v1.f.p(this, b1.f18771r);
        if (nVar != null) {
            j0.f18831a.a(((w1.r) nVar).f18917a, aVar);
        }
    }

    public final void H0() {
        qg.o oVar;
        n nVar;
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        v1.f.B(this, new di.u(xVar, 1));
        k kVar = (k) xVar.f9667i;
        if (kVar != null) {
            kVar.G0();
            oVar = qg.o.f13926a;
        } else {
            oVar = null;
        }
        if (oVar != null || (nVar = (n) v1.f.p(this, b1.f18771r)) == null) {
            return;
        }
        m.f13681a.getClass();
        j0.f18831a.a(((w1.r) nVar).f18917a, o.f13682a);
    }

    public final void I0() {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
        sVar.f9662i = true;
        v1.f.D(this, new k0(21, sVar));
        if (sVar.f9662i) {
            G0();
        }
    }

    @Override // v1.c1
    public final void a0(g gVar, h hVar, long j) {
        if (hVar == h.f13677r) {
            int i10 = gVar.f13675d;
            if (i10 == 4) {
                this.D = true;
                I0();
            } else if (i10 == 5) {
                this.D = false;
                H0();
            }
        }
    }

    @Override // v1.h1
    public final /* bridge */ /* synthetic */ Object n() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // v1.c1
    public final void E() {
    }
}
