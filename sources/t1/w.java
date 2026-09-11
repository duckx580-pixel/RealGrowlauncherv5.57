package t1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements a1, j0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f16333i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f16334r;

    public w(d0 d0Var) {
        this.f16334r = d0Var;
        this.f16333i = d0Var.f16277x;
    }

    @Override // q2.b
    public final long G(float f9) {
        return this.f16333i.G(f9);
    }

    @Override // q2.b
    public final float K(int i10) {
        return this.f16333i.K(i10);
    }

    @Override // q2.b
    public final float L(float f9) {
        return f9 / this.f16333i.a();
    }

    @Override // t1.a1
    public final List Q(Object obj, eh.e eVar) {
        d0 d0Var = this.f16334r;
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) d0Var.w.get(obj);
        List listL = aVar != null ? aVar.l() : null;
        if (listL != null) {
            return listL;
        }
        HashMap map = d0Var.f16279z;
        q0.f fVar = d0Var.C;
        int i10 = fVar.f13646s;
        int i11 = d0Var.f16275u;
        if (i10 < i11) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if (i10 == i11) {
            fVar.b(obj);
        } else {
            fVar.q(i11, obj);
        }
        d0Var.f16275u++;
        if (!map.containsKey(obj)) {
            d0Var.B.put(obj, d0Var.f(obj, eVar));
            androidx.compose.ui.node.a aVar2 = d0Var.f16271i;
            if (aVar2.N.f18423c == 3) {
                aVar2.M(true);
            } else {
                androidx.compose.ui.node.a.N(aVar2, true, 2);
            }
        }
        androidx.compose.ui.node.a aVar3 = (androidx.compose.ui.node.a) map.get(obj);
        if (aVar3 == null) {
            return rg.s.f14664i;
        }
        List listM0 = aVar3.N.f18434o.m0();
        q0.c cVar = (q0.c) listM0;
        int i12 = cVar.f13638i.f13646s;
        for (int i13 = 0; i13 < i12; i13++) {
            ((v1.h0) cVar.get(i13)).U.f18422b = true;
        }
        return listM0;
    }

    @Override // q2.b
    public final float S() {
        return this.f16333i.f16344s;
    }

    @Override // t1.m
    public final boolean U() {
        return this.f16333i.U();
    }

    @Override // t1.j0
    public final i0 V(int i10, int i11, Map map, eh.c cVar) {
        return this.f16333i.V(i10, i11, map, cVar);
    }

    @Override // q2.b
    public final float W(float f9) {
        return this.f16333i.a() * f9;
    }

    @Override // q2.b
    public final float a() {
        return this.f16333i.f16343r;
    }

    @Override // q2.b
    public final int e0(float f9) {
        return this.f16333i.e0(f9);
    }

    @Override // t1.m
    public final q2.l getLayoutDirection() {
        return this.f16333i.f16342i;
    }

    @Override // q2.b
    public final long k0(long j) {
        return this.f16333i.k0(j);
    }

    @Override // q2.b
    public final float p0(long j) {
        return this.f16333i.p0(j);
    }

    @Override // q2.b
    public final long s(float f9) {
        return this.f16333i.s(f9);
    }

    @Override // q2.b
    public final long t(long j) {
        return this.f16333i.t(j);
    }

    @Override // q2.b
    public final float z(long j) {
        return this.f16333i.z(j);
    }
}
