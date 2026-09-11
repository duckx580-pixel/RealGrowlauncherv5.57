package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f16045a = new k(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f16046b = new l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f16047c = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f16048d = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f16049e = new k(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f16050f = new l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f16051g = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f16052h = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static c a(float f9) {
        return new c(Float.valueOf(f9), k1.f16126a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(t.j r23, t.f r24, long r25, eh.c r27, ug.c r28) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d.b(t.j, t.f, long, eh.c, ug.c):java.lang.Object");
    }

    public static final d0 c(f0 f0Var, float f9, c0 c0Var, o0.o oVar, int i10, int i11) {
        oVar.U(-644770905);
        d0 d0VarE = e(f0Var, Float.valueOf(0.0f), Float.valueOf(f9), k1.f16126a, c0Var, (i11 & 8) != 0 ? "FloatAnimation" : "slider_loading_float", oVar, 0);
        oVar.r(false);
        return d0VarE;
    }

    public static Object d(j jVar, Float f9, p0 p0Var, wg.i iVar) {
        Object objB = b(jVar, new x0(p0Var, jVar.f16113i, jVar.f16114r.getValue(), f9, jVar.f16115s), jVar.f16116t, v0.f16198r, iVar);
        return objB == vg.a.f18663i ? objB : qg.o.f13926a;
    }

    public static final d0 e(f0 f0Var, Number number, Number number2, j1 j1Var, c0 c0Var, String str, o0.o oVar, int i10) {
        f0 f0Var2;
        Number number3;
        Number number4;
        c0 c0Var2;
        Object objB = g.b(oVar, -1062847727, -492369756);
        if (objB == o0.k.f12458a) {
            f0Var2 = f0Var;
            number3 = number;
            number4 = number2;
            c0Var2 = c0Var;
            d0 d0Var = new d0(f0Var2, number3, number4, j1Var, c0Var2);
            oVar.g0(d0Var);
            objB = d0Var;
        } else {
            f0Var2 = f0Var;
            number3 = number;
            number4 = number2;
            c0Var2 = c0Var;
        }
        oVar.r(false);
        d0 d0Var2 = (d0) objB;
        o0.p.f(new g0(number3, d0Var2, number4, c0Var2), oVar);
        o0.p.c(d0Var2, new h0(0, f0Var2, d0Var2), oVar);
        oVar.r(false);
        return d0Var2;
    }

    public static final o f(o oVar) {
        o oVarC = oVar.c();
        int iB = oVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            oVarC.e(oVar.a(i10), i10);
        }
        return oVarC;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eh.c, kotlin.jvm.internal.m] */
    public static final z0 g(f1 f1Var, j1 j1Var, String str, o0.o oVar, int i10) {
        y0 y0Var;
        oVar.U(-1714122528);
        if ((i10 & 2) != 0) {
            str = "DeferredAnimation";
        }
        oVar.U(1157296644);
        boolean zF = oVar.f(f1Var);
        Object objL = oVar.L();
        if (zF || objL == o0.k.f12458a) {
            objL = new z0(f1Var, j1Var, str);
            oVar.g0(objL);
        }
        oVar.r(false);
        z0 z0Var = (z0) objL;
        o0.p.c(z0Var, new h0(2, f1Var, z0Var), oVar);
        if (f1Var.d() && (y0Var = (y0) z0Var.f16227b.getValue()) != null) {
            f1 f1Var2 = z0Var.f16228c;
            y0Var.f16222i.f(y0Var.f16224s.invoke(f1Var2.c().a()), y0Var.f16224s.invoke(f1Var2.c().c()), (y) y0Var.f16223r.invoke(f1Var2.c()));
        }
        oVar.r(false);
        return z0Var;
    }

    public static final c1 h(f1 f1Var, Object obj, Object obj2, y yVar, j1 j1Var, o0.o oVar) {
        oVar.U(-304821198);
        oVar.U(1157296644);
        boolean zF = oVar.f(f1Var);
        Object objL = oVar.L();
        Object obj3 = o0.k.f12458a;
        if (zF || objL == obj3) {
            o oVar2 = (o) j1Var.f16120a.invoke(obj2);
            oVar2.d();
            objL = new c1(f1Var, obj, oVar2, j1Var);
            oVar.g0(objL);
        }
        oVar.r(false);
        c1 c1Var = (c1) objL;
        if (f1Var.d()) {
            c1Var.f(obj, obj2, yVar);
        } else {
            c1Var.g(obj2, yVar);
        }
        oVar.U(-561010487);
        boolean zF2 = oVar.f(f1Var) | oVar.f(c1Var);
        Object objL2 = oVar.L();
        if (zF2 || objL2 == obj3) {
            objL2 = new h0(3, f1Var, c1Var);
            oVar.g0(objL2);
        }
        oVar.r(false);
        o0.p.c(c1Var, (eh.c) objL2, oVar);
        oVar.r(false);
        return c1Var;
    }

    public static final void i(h hVar, long j, float f9, f fVar, j jVar, eh.c cVar) {
        long jB = f9 == 0.0f ? fVar.b() : (long) ((j - hVar.f16096c) / f9);
        hVar.f16100g = j;
        hVar.f16098e.setValue(fVar.f(jB));
        hVar.f16099f = fVar.d(jB);
        if (fVar.e(jB)) {
            hVar.f16101h = hVar.f16100g;
            hVar.f16102i.setValue(Boolean.FALSE);
        }
        o(hVar, jVar);
        cVar.invoke(hVar);
    }

    public static final float j(ug.h hVar) {
        a1.p pVar = (a1.p) hVar.i(a1.a.D);
        float fM = pVar != null ? pVar.m() : 1.0f;
        if (fM >= 0.0f) {
            return fM;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static c0 k(u uVar, int i10) {
        return new c0(uVar, 1, 0);
    }

    public static final f0 l(int i10, o0.o oVar) {
        Object objB = g.b(oVar, 1013651573, -492369756);
        if (objB == o0.k.f12458a) {
            objB = new f0();
            oVar.g0(objB);
        }
        oVar.r(false);
        f0 f0Var = (f0) objB;
        f0Var.a(8, oVar);
        oVar.r(false);
        return f0Var;
    }

    public static p0 m(float f9, Object obj, int i10) {
        float f10 = (i10 & 1) != 0 ? 1.0f : 0.5f;
        if ((i10 & 2) != 0) {
            f9 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new p0(f10, f9, obj);
    }

    public static i1 n(int i10, int i11, v vVar, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            vVar = x.f16209a;
        }
        return new i1(i10, i11, vVar);
    }

    public static final void o(h hVar, j jVar) {
        jVar.f16114r.setValue(hVar.f16098e.getValue());
        o oVar = jVar.f16115s;
        o oVar2 = hVar.f16099f;
        int iB = oVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            oVar.e(oVar2.a(i10), i10);
        }
        jVar.f16117u = hVar.f16101h;
        jVar.f16116t = hVar.f16100g;
        jVar.f16118v = ((Boolean) hVar.f16102i.getValue()).booleanValue();
    }

    public static final f1 p(Object obj, String str, o0.o oVar, int i10, int i11) {
        oVar.U(2029166765);
        if ((i11 & 2) != 0) {
            str = null;
        }
        oVar.U(-492369756);
        Object objL = oVar.L();
        Object obj2 = o0.k.f12458a;
        if (objL == obj2) {
            objL = new f1(new k0(obj), str, 0);
            oVar.g0(objL);
        }
        oVar.r(false);
        f1 f1Var = (f1) objL;
        f1Var.a(obj, oVar, (i10 & 8) | 48 | (i10 & 14));
        oVar.U(-561051652);
        boolean zF = oVar.f(f1Var);
        Object objL2 = oVar.L();
        if (zF || objL2 == obj2) {
            objL2 = new h1(f1Var, 1);
            oVar.g0(objL2);
        }
        oVar.r(false);
        o0.p.c(f1Var, (eh.c) objL2, oVar);
        oVar.r(false);
        return f1Var;
    }

    public static final f1 q(k0 k0Var, String str, o0.o oVar) {
        oVar.U(882913843);
        oVar.U(1643203617);
        oVar.U(1157296644);
        boolean zF = oVar.f(k0Var);
        Object objL = oVar.L();
        Object obj = o0.k.f12458a;
        if (zF || objL == obj) {
            objL = new f1(k0Var, str, 0);
            oVar.g0(objL);
        }
        oVar.r(false);
        f1 f1Var = (f1) objL;
        f1Var.a(k0Var.f16125c.getValue(), oVar, 0);
        oVar.U(-561041970);
        boolean zF2 = oVar.f(f1Var);
        Object objL2 = oVar.L();
        if (zF2 || objL2 == obj) {
            objL2 = new h1(f1Var, 0);
            oVar.g0(objL2);
        }
        oVar.r(false);
        o0.p.c(f1Var, (eh.c) objL2, oVar);
        oVar.r(false);
        oVar.r(false);
        return f1Var;
    }
}
