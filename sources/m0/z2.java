package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11522a = 48;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11523b = 12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11524c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11525d = R.styleable.AppCompatTheme_windowActionBarOverlay;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11526e = 280;

    public static final void a(t.k0 k0Var, o0.s0 s0Var, w0.a aVar, o0.o oVar, int i10) {
        int i11;
        t.i1 i1VarN;
        boolean z3;
        kotlin.jvm.internal.l.f("transformOriginState", s0Var);
        oVar.V(-159754260);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(k0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
            i11 |= oVar.f(s0Var) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.f(a1.k.f196a) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= oVar.h(aVar) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 5851) == 1170 && oVar.D()) {
            oVar.P();
        } else {
            t.f1 f1VarQ = t.d.q(k0Var, "DropDownMenu", oVar);
            o0.z0 z0Var = f1VarQ.f16078c;
            oVar.U(-1338768149);
            t.j1 j1Var = t.k1.f16126a;
            oVar.U(-142660079);
            boolean zBooleanValue = ((Boolean) f1VarQ.b()).booleanValue();
            oVar.U(1808111696);
            float f9 = zBooleanValue ? 1.0f : 0.8f;
            oVar.r(false);
            Float fValueOf = Float.valueOf(f9);
            boolean zBooleanValue2 = ((Boolean) z0Var.getValue()).booleanValue();
            oVar.U(1808111696);
            float f10 = zBooleanValue2 ? 1.0f : 0.8f;
            oVar.r(false);
            Float fValueOf2 = Float.valueOf(f10);
            t.a1 a1VarC = f1VarQ.c();
            kotlin.jvm.internal.l.f("$this$animateFloat", a1VarC);
            oVar.U(839979861);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (a1VarC.b(bool, bool2)) {
                z3 = false;
                i1VarN = t.d.n(R.styleable.AppCompatTheme_windowNoTitle, 0, t.x.f16210b, 2);
            } else {
                i1VarN = t.d.n(1, 74, null, 4);
                z3 = false;
            }
            oVar.r(z3);
            t.c1 c1VarH = t.d.h(f1VarQ, fValueOf, fValueOf2, i1VarN, j1Var, oVar);
            oVar.r(z3);
            oVar.r(z3);
            oVar.U(-1338768149);
            oVar.U(-142660079);
            boolean zBooleanValue3 = ((Boolean) f1VarQ.b()).booleanValue();
            oVar.U(1864763068);
            float f11 = zBooleanValue3 ? 1.0f : 0.0f;
            oVar.r(false);
            Float fValueOf3 = Float.valueOf(f11);
            boolean zBooleanValue4 = ((Boolean) z0Var.getValue()).booleanValue();
            oVar.U(1864763068);
            float f12 = zBooleanValue4 ? 1.0f : 0.0f;
            oVar.r(false);
            Float fValueOf4 = Float.valueOf(f12);
            t.a1 a1VarC2 = f1VarQ.c();
            kotlin.jvm.internal.l.f("$this$animateFloat", a1VarC2);
            oVar.U(896631233);
            t.i1 i1VarN2 = a1VarC2.b(bool, bool2) ? t.d.n(30, 0, null, 6) : t.d.n(75, 0, null, 6);
            oVar.r(false);
            t.c1 c1VarH2 = t.d.h(f1VarQ, fValueOf3, fValueOf4, i1VarN2, j1Var, oVar);
            oVar.r(false);
            oVar.r(false);
            oVar.U(1618982084);
            boolean zF = oVar.f(c1VarH) | oVar.f(c1VarH2) | oVar.f(s0Var);
            Object objL = oVar.L();
            if (zF || objL == o0.k.f12458a) {
                objL = new b0.m0(s0Var, c1VarH, c1VarH2, 8);
                oVar.g0(objL);
            }
            oVar.r(false);
            a1.n nVarA = androidx.compose.ui.graphics.a.a((eh.c) objL);
            g1.k0 k0VarA = r4.a(n0.r.f12040b, oVar);
            long jC = g1.c((e1) oVar.k(g1.f10686a), 25);
            float f13 = n0.r.f12039a;
            e6.a(nVarA, k0VarA, jC, 0L, f13, f13, null, w0.f.b(oVar, -1651673913, new c(aVar, i12)), oVar, 12804096, 72);
        }
        o0.h1 h1VarV = oVar.v();
        if (h1VarV == null) {
            return;
        }
        h1VarV.f12435d = new n(k0Var, s0Var, aVar, i10, 1);
    }

    public static final void b(w0.a aVar, eh.a aVar2, a1.n nVar, eh.e eVar, boolean z3, x2 x2Var, y.m0 m0Var, x.l lVar, o0.o oVar, int i10) {
        int i11;
        kotlin.jvm.internal.l.f("onClick", aVar2);
        kotlin.jvm.internal.l.f("modifier", nVar);
        kotlin.jvm.internal.l.f("colors", x2Var);
        kotlin.jvm.internal.l.f("contentPadding", m0Var);
        kotlin.jvm.internal.l.f("interactionSource", lVar);
        oVar.V(-1564716777);
        if ((i10 & 14) == 0) {
            i11 = (oVar.h(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
            i11 |= oVar.h(aVar2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.f(nVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= oVar.h(eVar) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= oVar.h(null) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= oVar.g(z3) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= oVar.f(x2Var) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= oVar.f(m0Var) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= oVar.f(lVar) ? 67108864 : 33554432;
        }
        int i12 = i11;
        if ((191739611 & i12) == 38347922 && oVar.D()) {
            oVar.P();
        } else {
            a1.n nVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.f(androidx.compose.foundation.a.e(nVar, lVar, l0.m.a(true, 0.0f, oVar, 6, 6), z3, null, aVar2, 24), 1.0f), f11525d, n0.r.f12041c, f11526e, 8), m0Var);
            a1.c cVar = a1.a.f183y;
            oVar.U(693286680);
            t1.h0 h0VarA = y.r0.a(y.i.f19952a, cVar, oVar);
            oVar.U(-1323940314);
            q2.b bVar = (q2.b) oVar.k(w1.b1.f18759e);
            q2.l lVar2 = (q2.l) oVar.k(w1.b1.f18764k);
            w1.d2 d2Var = (w1.d2) oVar.k(w1.b1.f18769p);
            v1.j.f18438q.getClass();
            v1.n nVar2 = v1.i.f18413b;
            w0.a aVarI = t1.w0.i(nVarH);
            oVar.X();
            if (oVar.O) {
                oVar.m(nVar2);
            } else {
                oVar.j0();
            }
            oVar.f12534x = false;
            o0.p.Q(v1.i.f18417f, h0VarA, oVar);
            o0.p.Q(v1.i.f18415d, bVar, oVar);
            o0.p.Q(v1.i.f18418g, lVar2, oVar);
            k0.g.u(0, aVarI, gb.e.f(oVar, d2Var, v1.i.f18419h, oVar), oVar, 2058660585);
            l7.a(o7.a((n7) oVar.k(o7.f11096a), n0.r.f12044f), w0.f.b(oVar, 1065051884, new t0(eVar, x2Var, z3, i12, aVar)), oVar, 48);
            k0.g.A(oVar, false, true, false, false);
        }
        o0.h1 h1VarV = oVar.v();
        if (h1VarV == null) {
            return;
        }
        h1VarV.f12435d = new y2(aVar, aVar2, nVar, eVar, z3, x2Var, m0Var, lVar, i10);
    }
}
