package v1;

import com.google.android.gms.internal.measurement.j3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements i1.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i1.b f18385i = new i1.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o f18386r;

    @Override // i1.d
    public final void A(long j, long j10, long j11, long j12, i1.e eVar) {
        this.f18385i.A(j, j10, j11, j12, eVar);
    }

    @Override // i1.d
    public final void C(long j, long j10, long j11, float f9, int i10) {
        this.f18385i.C(j, j10, j11, f9, i10);
    }

    @Override // i1.d
    public final void D(g1.p pVar, long j, long j10, long j11, float f9, i1.e eVar) {
        this.f18385i.D(pVar, j, j10, j11, f9, eVar);
    }

    @Override // q2.b
    public final long G(float f9) {
        return this.f18385i.G(f9);
    }

    @Override // q2.b
    public final float K(int i10) {
        return this.f18385i.K(i10);
    }

    @Override // q2.b
    public final float L(float f9) {
        return f9 / this.f18385i.a();
    }

    @Override // q2.b
    public final float S() {
        return this.f18385i.S();
    }

    @Override // q2.b
    public final float W(float f9) {
        return this.f18385i.a() * f9;
    }

    @Override // i1.d
    public final void X(g1.e0 e0Var, g1.p pVar, float f9, i1.e eVar) {
        this.f18385i.X(e0Var, pVar, f9, eVar);
    }

    @Override // i1.d
    public final j3 Z() {
        return this.f18385i.f7986r;
    }

    @Override // q2.b
    public final float a() {
        return this.f18385i.a();
    }

    public final void b() {
        g1.r rVarJ = this.f18385i.f7986r.j();
        l lVar = this.f18386r;
        kotlin.jvm.internal.l.c(lVar);
        a1.m mVar = (a1.m) lVar;
        a1.m mVarF = mVar.f197i.f202v;
        if (mVarF == null || (mVarF.f200t & 4) == 0) {
            mVarF = null;
        } else {
            while (mVarF != null) {
                int i10 = mVarF.f199s;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & 4) != 0) {
                    break;
                } else {
                    mVarF = mVarF.f202v;
                }
            }
            mVarF = null;
        }
        if (mVarF == null) {
            t0 t0VarX = f.x(lVar, 4);
            if (t0VarX.J0() == mVar.f197i) {
                t0VarX = t0VarX.f18490z;
                kotlin.jvm.internal.l.c(t0VarX);
            }
            t0VarX.T0(rVarJ);
            return;
        }
        q0.f fVar = null;
        while (mVarF != null) {
            if (mVarF instanceof o) {
                o oVar = (o) mVarF;
                t0 t0VarX2 = f.x(oVar, 4);
                long jC = te.a.C(t0VarX2.f16310s);
                androidx.compose.ui.node.a aVar = t0VarX2.f18489y;
                aVar.getClass();
                ((w1.t) f.z(aVar)).getSharedDrawScope().c(rVarJ, jC, t0VarX2, oVar);
            } else if ((mVarF.f199s & 4) != 0 && (mVarF instanceof m)) {
                int i11 = 0;
                for (a1.m mVar2 = ((m) mVarF).E; mVar2 != null; mVar2 = mVar2.f202v) {
                    if ((mVar2.f199s & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            mVarF = mVar2;
                        } else {
                            if (fVar == null) {
                                fVar = new q0.f(new a1.m[16]);
                            }
                            if (mVarF != null) {
                                fVar.b(mVarF);
                                mVarF = null;
                            }
                            fVar.b(mVar2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            mVarF = f.f(fVar);
        }
    }

    public final void c(g1.r rVar, long j, t0 t0Var, o oVar) {
        o oVar2 = this.f18386r;
        this.f18386r = oVar;
        q2.l lVar = t0Var.f18489y.I;
        i1.b bVar = this.f18385i;
        i1.a aVar = bVar.f7985i;
        q2.b bVar2 = aVar.f7981a;
        q2.l lVar2 = aVar.f7982b;
        g1.r rVar2 = aVar.f7983c;
        long j10 = aVar.f7984d;
        aVar.f7981a = t0Var;
        aVar.f7982b = lVar;
        aVar.f7983c = rVar;
        aVar.f7984d = j;
        rVar.save();
        oVar.i(this);
        rVar.p();
        i1.a aVar2 = bVar.f7985i;
        aVar2.f7981a = bVar2;
        aVar2.f7982b = lVar2;
        aVar2.f7983c = rVar2;
        aVar2.f7984d = j10;
        this.f18386r = oVar2;
    }

    @Override // i1.d
    public final void c0(long j, long j10, long j11, i1.e eVar, int i10) {
        this.f18385i.c0(j, j10, j11, eVar, i10);
    }

    public final void d(g1.p pVar, long j, long j10, float f9, i1.e eVar, int i10) {
        i1.b bVar = this.f18385i;
        bVar.f7985i.f7983c.h(f1.c.d(j), f1.c.e(j), f1.f.d(j10) + f1.c.d(j), f1.f.b(j10) + f1.c.e(j), bVar.c(pVar, eVar, f9, null, i10, 1));
    }

    @Override // i1.d
    public final long e() {
        return this.f18385i.e();
    }

    @Override // q2.b
    public final int e0(float f9) {
        return this.f18385i.e0(f9);
    }

    @Override // i1.d
    public final void f0(g1.f fVar, long j, long j10, long j11, long j12, float f9, g1.l lVar, int i10) {
        this.f18385i.f0(fVar, j, j10, j11, j12, f9, lVar, i10);
    }

    @Override // i1.d
    public final q2.l getLayoutDirection() {
        return this.f18385i.f7985i.f7982b;
    }

    @Override // i1.d
    public final long h0() {
        return this.f18385i.h0();
    }

    @Override // i1.d
    public final void j(g1.e0 e0Var, long j, i1.e eVar) {
        this.f18385i.j(e0Var, j, eVar);
    }

    @Override // q2.b
    public final long k0(long j) {
        return this.f18385i.k0(j);
    }

    @Override // i1.d
    public final void l(long j, float f9, long j10, i1.e eVar) {
        this.f18385i.l(j, f9, j10, eVar);
    }

    @Override // q2.b
    public final float p0(long j) {
        return this.f18385i.p0(j);
    }

    @Override // i1.d
    public final void r(long j, float f9, float f10, long j10, long j11, i1.e eVar) {
        this.f18385i.r(j, f9, f10, j10, j11, eVar);
    }

    @Override // q2.b
    public final long s(float f9) {
        return this.f18385i.s(f9);
    }

    @Override // q2.b
    public final long t(long j) {
        return this.f18385i.t(j);
    }

    @Override // q2.b
    public final float z(long j) {
        return this.f18385i.z(j);
    }
}
