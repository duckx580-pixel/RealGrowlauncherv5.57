package i1;

import android.graphics.Paint;
import android.graphics.Shader;
import com.google.android.gms.internal.measurement.j3;
import g1.e0;
import g1.f0;
import g1.p;
import g1.r;
import g1.t;
import q2.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f7985i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j3 f7986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public di.h f7987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public di.h f7988t;

    public b() {
        f fVar = new f();
        long j = f1.f.f5991b;
        a aVar = new a();
        aVar.f7981a = c.f7989a;
        aVar.f7982b = l.f13752i;
        aVar.f7983c = fVar;
        aVar.f7984d = j;
        this.f7985i = aVar;
        this.f7986r = new j3(this);
    }

    public static di.h b(b bVar, long j, e eVar, int i10) {
        di.h hVarD = bVar.d(eVar);
        Paint paint = (Paint) hVarD.f5124r;
        if (!t.c(f0.b(paint.getColor()), j)) {
            hVarD.K(j);
        }
        if (((Shader) hVarD.f5126t) != null) {
            hVarD.N(null);
        }
        if (!kotlin.jvm.internal.l.a((g1.l) hVarD.f5127u, null)) {
            hVarD.L(null);
        }
        if (hVarD.f5125s != i10) {
            hVarD.J(i10);
        }
        if (paint.isFilterBitmap()) {
            return hVarD;
        }
        hVarD.M(1);
        return hVarD;
    }

    @Override // i1.d
    public final void A(long j, long j10, long j11, long j12, e eVar) {
        this.f7985i.f7983c.l(f1.c.d(j10), f1.c.e(j10), f1.f.d(j11) + f1.c.d(j10), f1.f.b(j11) + f1.c.e(j10), f1.a.b(j12), f1.a.c(j12), b(this, j, eVar, 3));
    }

    @Override // i1.d
    public final void C(long j, long j10, long j11, float f9, int i10) {
        r rVar = this.f7985i.f7983c;
        di.h hVarF = this.f7988t;
        if (hVarF == null) {
            hVarF = f0.f();
            hVarF.R(1);
            this.f7988t = hVarF;
        }
        Paint paint = (Paint) hVarF.f5124r;
        if (!t.c(f0.b(paint.getColor()), j)) {
            hVarF.K(j);
        }
        if (((Shader) hVarF.f5126t) != null) {
            hVarF.N(null);
        }
        if (!kotlin.jvm.internal.l.a((g1.l) hVarF.f5127u, null)) {
            hVarF.L(null);
        }
        if (hVarF.f5125s != 3) {
            hVarF.J(3);
        }
        if (paint.getStrokeWidth() != f9) {
            hVarF.Q(f9);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (hVarF.A() != i10) {
            hVarF.O(i10);
        }
        if (hVarF.B() != 0) {
            hVarF.P(0);
        }
        if (!paint.isFilterBitmap()) {
            hVarF.M(1);
        }
        rVar.k(j10, j11, hVarF);
    }

    @Override // i1.d
    public final void D(p pVar, long j, long j10, long j11, float f9, e eVar) {
        this.f7985i.f7983c.l(f1.c.d(j), f1.c.e(j), f1.f.d(j10) + f1.c.d(j), f1.f.b(j10) + f1.c.e(j), f1.a.b(j11), f1.a.c(j11), c(pVar, eVar, f9, null, 3, 1));
    }

    @Override // q2.b
    public final float S() {
        return this.f7985i.f7981a.S();
    }

    @Override // i1.d
    public final void X(e0 e0Var, p pVar, float f9, e eVar) {
        this.f7985i.f7983c.r(e0Var, c(pVar, eVar, f9, null, 3, 1));
    }

    @Override // i1.d
    public final j3 Z() {
        return this.f7986r;
    }

    @Override // q2.b
    public final float a() {
        return this.f7985i.f7981a.a();
    }

    public final di.h c(p pVar, e eVar, float f9, g1.l lVar, int i10, int i11) {
        di.h hVarD = d(eVar);
        Paint paint = (Paint) hVarD.f5124r;
        if (pVar != null) {
            pVar.a(f9, e(), hVarD);
        } else {
            if (((Shader) hVarD.f5126t) != null) {
                hVarD.N(null);
            }
            long jB = f0.b(paint.getColor());
            long j = t.f6905b;
            if (!t.c(jB, j)) {
                hVarD.K(j);
            }
            if (paint.getAlpha() / 255.0f != f9) {
                hVarD.I(f9);
            }
        }
        if (!kotlin.jvm.internal.l.a((g1.l) hVarD.f5127u, lVar)) {
            hVarD.L(lVar);
        }
        if (hVarD.f5125s != i10) {
            hVarD.J(i10);
        }
        if (paint.isFilterBitmap() == i11) {
            return hVarD;
        }
        hVarD.M(i11);
        return hVarD;
    }

    @Override // i1.d
    public final void c0(long j, long j10, long j11, e eVar, int i10) {
        this.f7985i.f7983c.h(f1.c.d(j10), f1.c.e(j10), f1.f.d(j11) + f1.c.d(j10), f1.f.b(j11) + f1.c.e(j10), b(this, j, eVar, i10));
    }

    public final di.h d(e eVar) {
        if (kotlin.jvm.internal.l.a(eVar, g.f7990a)) {
            di.h hVar = this.f7987s;
            if (hVar != null) {
                return hVar;
            }
            di.h hVarF = f0.f();
            hVarF.R(0);
            this.f7987s = hVarF;
            return hVarF;
        }
        if (!(eVar instanceof h)) {
            throw new a2.d();
        }
        di.h hVarF2 = this.f7988t;
        if (hVarF2 == null) {
            hVarF2 = f0.f();
            hVarF2.R(1);
            this.f7988t = hVarF2;
        }
        Paint paint = (Paint) hVarF2.f5124r;
        float strokeWidth = paint.getStrokeWidth();
        h hVar2 = (h) eVar;
        float f9 = hVar2.f7991a;
        if (strokeWidth != f9) {
            hVarF2.Q(f9);
        }
        int iA = hVarF2.A();
        int i10 = hVar2.f7993c;
        if (iA != i10) {
            hVarF2.O(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f10 = hVar2.f7992b;
        if (strokeMiter != f10) {
            paint.setStrokeMiter(f10);
        }
        int iB = hVarF2.B();
        int i11 = hVar2.f7994d;
        if (iB == i11) {
            return hVarF2;
        }
        hVarF2.P(i11);
        return hVarF2;
    }

    @Override // i1.d
    public final void f0(g1.f fVar, long j, long j10, long j11, long j12, float f9, g1.l lVar, int i10) {
        this.f7985i.f7983c.j(fVar, j, j10, j11, j12, c(null, g.f7990a, f9, lVar, 3, i10));
    }

    @Override // i1.d
    public final l getLayoutDirection() {
        return this.f7985i.f7982b;
    }

    @Override // i1.d
    public final void j(e0 e0Var, long j, e eVar) {
        this.f7985i.f7983c.r(e0Var, b(this, j, eVar, 3));
    }

    @Override // i1.d
    public final void l(long j, float f9, long j10, e eVar) {
        this.f7985i.f7983c.d(f9, j10, b(this, j, eVar, 3));
    }

    @Override // i1.d
    public final void r(long j, float f9, float f10, long j10, long j11, e eVar) {
        this.f7985i.f7983c.b(f1.c.d(j10), f1.c.e(j10), f1.f.d(j11) + f1.c.d(j10), f1.f.b(j11) + f1.c.e(j10), f9, f10, b(this, j, eVar, 3));
    }
}
