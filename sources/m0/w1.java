package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11386d;

    public w1(float f9, float f10, float f11, float f12) {
        this.f11383a = f9;
        this.f11384b = f10;
        this.f11385c = f11;
        this.f11386d = f12;
    }

    public final t.j a(x.l lVar, o0.o oVar, int i10) {
        Object objB = t.g.b(oVar, -1845106002, -492369756);
        Object obj = o0.k.f12458a;
        if (objB == obj) {
            objB = new y0.q();
            oVar.g0(objB);
        }
        oVar.r(false);
        y0.q qVar = (y0.q) objB;
        oVar.U(511388516);
        boolean zF = oVar.f(lVar) | oVar.f(qVar);
        Object objL = oVar.L();
        if (zF || objL == obj) {
            objL = new c0(lVar, qVar, null, 1);
            oVar.g0(objL);
        }
        oVar.r(false);
        o0.p.d((eh.e) objL, lVar, oVar);
        x.j jVar = (x.j) rg.l.l0(qVar);
        float f9 = jVar instanceof x.n ? this.f11384b : jVar instanceof x.h ? this.f11386d : jVar instanceof x.d ? this.f11385c : this.f11383a;
        oVar.U(-492369756);
        Object objL2 = oVar.L();
        if (objL2 == obj) {
            objL2 = new t.c(new q2.e(f9), t.k1.f16128c, null, 12);
            oVar.g0(objL2);
        }
        oVar.r(false);
        t.c cVar = (t.c) objL2;
        o0.p.d(new e0(cVar, this, f9, jVar, null, 2), new q2.e(f9), oVar);
        t.j jVar2 = cVar.f16024c;
        oVar.r(false);
        return jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return q2.e.a(this.f11383a, w1Var.f11383a) && q2.e.a(this.f11384b, w1Var.f11384b) && q2.e.a(this.f11385c, w1Var.f11385c) && q2.e.a(this.f11386d, w1Var.f11386d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f11386d) + s.h0.a(s.h0.a(Float.hashCode(this.f11383a) * 31, this.f11384b, 31), this.f11385c, 31);
    }
}
