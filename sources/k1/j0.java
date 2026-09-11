package k1;

import com.google.android.gms.internal.measurement.j3;
import o0.n0;
import o0.w0;
import o0.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends j1.b {
    public g1.l A;
    public int B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z0 f9076v;
    public final z0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e0 f9077x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w0 f9078y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f9079z;

    public j0(c cVar) {
        f1.f fVar = new f1.f(f1.f.f5991b);
        n0 n0Var = n0.f12510u;
        this.f9076v = o0.p.I(fVar, n0Var);
        this.w = o0.p.I(Boolean.FALSE, n0Var);
        e0 e0Var = new e0(cVar);
        e0Var.f9017f = new a4.v(20, this);
        this.f9077x = e0Var;
        this.f9078y = o0.p.H(0);
        this.f9079z = 1.0f;
        this.B = -1;
    }

    @Override // j1.b
    public final boolean b(float f9) {
        this.f9079z = f9;
        return true;
    }

    @Override // j1.b
    public final boolean c(g1.l lVar) {
        this.A = lVar;
        return true;
    }

    @Override // j1.b
    public final long g() {
        return ((f1.f) this.f9076v.getValue()).f5994a;
    }

    @Override // j1.b
    public final void i(v1.e0 e0Var) {
        i1.b bVar = e0Var.f18385i;
        g1.l lVar = this.A;
        e0 e0Var2 = this.f9077x;
        if (lVar == null) {
            lVar = (g1.l) e0Var2.f9018g.getValue();
        }
        if (((Boolean) this.w.getValue()).booleanValue() && e0Var.getLayoutDirection() == q2.l.f13753r) {
            long jH0 = bVar.h0();
            j3 j3Var = bVar.f7986r;
            long jN = j3Var.n();
            j3Var.j().save();
            ((lc.n) j3Var.f3836r).o(-1.0f, 1.0f, jH0);
            e0Var2.e(e0Var, this.f9079z, lVar);
            j3Var.j().p();
            j3Var.t(jN);
        } else {
            e0Var2.e(e0Var, this.f9079z, lVar);
        }
        this.B = this.f9078y.f();
    }
}
