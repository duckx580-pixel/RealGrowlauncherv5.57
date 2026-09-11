package androidx.compose.animation;

import a1.n;
import com.rtsoft.growtopia.R;
import eh.c;
import eh.e;
import k0.g;
import kotlin.jvm.internal.l;
import m0.s;
import m0.u0;
import o0.d1;
import o0.h1;
import o0.k;
import o0.n0;
import o0.o;
import o0.p;
import o0.p1;
import o0.s0;
import q2.i;
import s.e0;
import s.f;
import s.f0;
import s.m;
import s.p0;
import s.r;
import s.v;
import s.w;
import s.z;
import t.d;
import t.f1;
import t.h0;
import t.j1;
import t.k0;
import t.k1;
import t.q1;
import t.z0;
import t1.w0;
import v1.h;
import v1.j;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(f1 f1Var, c cVar, n nVar, e0 e0Var, f0 f0Var, e eVar, w0.a aVar, o oVar, int i10) {
        int i11;
        int i12;
        boolean z3;
        boolean z10;
        z0 z0VarG;
        e0 e0Var2;
        boolean z11;
        z0 z0VarG2;
        z0 z0Var;
        boolean z12;
        z0 z0VarG3;
        boolean z13;
        z0 z0VarG4;
        n0 n0Var = n0.f12510u;
        o0.z0 z0Var2 = f1Var.f16078c;
        oVar.V(-891967166);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(f1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
            i11 |= oVar.h(cVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= oVar.f(nVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= oVar.f(e0Var) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= oVar.f(f0Var) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= oVar.h(eVar) ? 131072 : 65536;
        }
        int i13 = i11 | 1572864;
        if ((29360128 & i10) == 0) {
            i13 |= oVar.h(aVar) ? 8388608 : 4194304;
        }
        if ((23967451 & i13) == 4793490 && oVar.D()) {
            oVar.P();
        } else if (((Boolean) cVar.invoke(z0Var2.getValue())).booleanValue() || ((Boolean) cVar.invoke(f1Var.b())).booleanValue() || f1Var.d()) {
            oVar.U(1215497572);
            oVar.U(1157296644);
            boolean zF = oVar.f(f1Var);
            Object objL = oVar.L();
            Object obj = k.f12458a;
            if (zF || objL == obj) {
                objL = f1Var.b();
                oVar.g0(objL);
            }
            oVar.r(false);
            if (f1Var.d()) {
                objL = f1Var.b();
            }
            oVar.U(-466616829);
            v vVarF = f(f1Var, cVar, objL, oVar);
            oVar.r(false);
            Object value = z0Var2.getValue();
            oVar.U(-466616829);
            v vVarF2 = f(f1Var, cVar, value, oVar);
            oVar.r(false);
            oVar.U(-198307638);
            oVar.U(1157296644);
            boolean zF2 = oVar.f(f1Var);
            Object objL2 = oVar.L();
            if (zF2 || objL2 == obj) {
                i12 = i13;
                z3 = false;
                objL2 = new f1(new k0(vVarF), g.l(new StringBuilder(), f1Var.f16077b, " > EnterExitTransition"), 0);
                oVar.g0(objL2);
            } else {
                i12 = i13;
                z3 = false;
            }
            oVar.r(z3);
            f1 f1Var2 = (f1) objL2;
            oVar.U(-561014285);
            boolean zF3 = oVar.f(f1Var) | oVar.f(f1Var2);
            Object objL3 = oVar.L();
            if (zF3 || objL3 == obj) {
                objL3 = new h0(1, f1Var, f1Var2);
                oVar.g0(objL3);
            }
            oVar.r(false);
            p.c(f1Var2, (c) objL3, oVar);
            if (f1Var.d()) {
                f1Var2.g(vVarF, vVarF2);
            } else {
                f1Var2.h(vVarF2, oVar, 0);
                f1Var2.j.setValue(Boolean.FALSE);
            }
            oVar.r(false);
            oVar.r(false);
            Object objM = p.M(eVar, oVar);
            Object objB = f1Var2.b();
            o0.z0 z0Var3 = f1Var2.f16078c;
            Object objInvoke = eVar.invoke(objB, z0Var3.getValue());
            oVar.U(1276593483);
            boolean zF4 = oVar.f(f1Var2) | oVar.f(objM);
            Object objL4 = oVar.L();
            ug.c cVar2 = null;
            if (zF4 || objL4 == obj) {
                objL4 = new androidx.work.e(f1Var2, objM, cVar2, 19);
                oVar.g0(objL4);
            }
            e eVar2 = (e) objL4;
            oVar.r(false);
            oVar.U(10454275);
            oVar.U(-492369756);
            Object objL5 = oVar.L();
            if (objL5 == obj) {
                objL5 = p.I(objInvoke, n0Var);
                oVar.g0(objL5);
            }
            oVar.r(false);
            s0 s0Var = (s0) objL5;
            p.d(new androidx.work.e(eVar2, s0Var, cVar2, 13), qg.o.f13926a, oVar);
            oVar.r(false);
            Object objB2 = f1Var2.b();
            v vVar = v.f14995s;
            if (objB2 != vVar || z0Var3.getValue() != vVar || !((Boolean) s0Var.getValue()).booleanValue()) {
                oVar.U(1157296644);
                boolean zF5 = oVar.f(f1Var);
                Object objL6 = oVar.L();
                if (zF5 || objL6 == obj) {
                    objL6 = new r();
                    oVar.g0(objL6);
                }
                oVar.r(false);
                r rVar = (r) objL6;
                j1 j1Var = z.f15008a;
                oVar.U(914000546);
                oVar.U(21614502);
                oVar.U(1157296644);
                boolean zF6 = oVar.f(f1Var2);
                Object objL7 = oVar.L();
                if (zF6 || objL7 == obj) {
                    objL7 = p.I(e0Var, n0Var);
                    oVar.g0(objL7);
                }
                oVar.r(false);
                s0 s0Var2 = (s0) objL7;
                Object objB3 = f1Var2.b();
                Object value2 = z0Var3.getValue();
                v vVar2 = v.f14994r;
                if (objB3 == value2 && f1Var2.b() == vVar2) {
                    if (f1Var2.d()) {
                        s0Var2.setValue(e0Var);
                    } else {
                        s0Var2.setValue(e0.f14930b);
                    }
                } else if (z0Var3.getValue() == vVar2) {
                    s0Var2.setValue(((e0) s0Var2.getValue()).a(e0Var));
                }
                e0 e0Var3 = (e0) s0Var2.getValue();
                oVar.r(false);
                oVar.U(-1363864804);
                oVar.U(1157296644);
                boolean zF7 = oVar.f(f1Var2);
                Object objL8 = oVar.L();
                if (zF7 || objL8 == obj) {
                    objL8 = p.I(f0Var, n0Var);
                    oVar.g0(objL8);
                }
                oVar.r(false);
                s0 s0Var3 = (s0) objL8;
                if (f1Var2.b() == z0Var3.getValue() && f1Var2.b() == vVar2) {
                    if (f1Var2.d()) {
                        s0Var3.setValue(f0Var);
                    } else {
                        s0Var3.setValue(f0.f14938b);
                    }
                } else if (z0Var3.getValue() != vVar2) {
                    s0Var3.setValue(((f0) s0Var3.getValue()).a(f0Var));
                }
                f0 f0Var2 = (f0) s0Var3.getValue();
                oVar.r(false);
                p0 p0Var = e0Var3.f14931a;
                boolean z14 = (p0Var.f14980b == null && f0Var2.f14940a.f14980b == null) ? false : true;
                boolean z15 = (p0Var.f14981c == null && f0Var2.f14940a.f14981c == null) ? false : true;
                oVar.U(1657242209);
                if (z14) {
                    int i14 = i.f13745c;
                    j1 j1Var2 = k1.f16132g;
                    oVar.U(-492369756);
                    Object objL9 = oVar.L();
                    if (objL9 == obj) {
                        objL9 = "Built-in slide";
                        oVar.g0("Built-in slide");
                    }
                    z10 = false;
                    oVar.r(false);
                    z0VarG = d.g(f1Var2, j1Var2, (String) objL9, oVar, 0);
                } else {
                    z10 = false;
                    z0VarG = null;
                }
                oVar.r(z10);
                oVar.U(1657242379);
                if (z15) {
                    j1 j1Var3 = k1.f16133h;
                    oVar.U(-492369756);
                    Object objL10 = oVar.L();
                    if (objL10 == obj) {
                        objL10 = "Built-in shrink/expand";
                        oVar.g0("Built-in shrink/expand");
                    }
                    e0Var2 = e0Var3;
                    z11 = false;
                    oVar.r(false);
                    z0VarG2 = d.g(f1Var2, j1Var3, (String) objL10, oVar, 0);
                } else {
                    e0Var2 = e0Var3;
                    z11 = false;
                    z0VarG2 = null;
                }
                oVar.r(z11);
                oVar.U(1657242547);
                if (z15) {
                    int i15 = i.f13745c;
                    j1 j1Var4 = k1.f16132g;
                    oVar.U(-492369756);
                    Object objL11 = oVar.L();
                    if (objL11 == obj) {
                        objL11 = "Built-in InterruptionHandlingOffset";
                        oVar.g0("Built-in InterruptionHandlingOffset");
                    }
                    z0Var = z0VarG2;
                    z12 = false;
                    oVar.r(false);
                    z0VarG3 = d.g(f1Var2, j1Var4, (String) objL11, oVar, 0);
                } else {
                    z0Var = z0VarG2;
                    z12 = false;
                    z0VarG3 = null;
                }
                oVar.r(z12);
                p0 p0Var2 = f0Var2.f14940a;
                boolean z16 = !z15;
                oVar.U(642253525);
                boolean z17 = (p0Var.f14979a == null && f0Var2.f14940a.f14979a == null) ? false : true;
                oVar.U(-1158245383);
                if (z17) {
                    j1 j1Var5 = k1.f16126a;
                    oVar.U(-492369756);
                    Object objL12 = oVar.L();
                    if (objL12 == obj) {
                        objL12 = "Built-in alpha";
                        oVar.g0("Built-in alpha");
                    }
                    z13 = false;
                    oVar.r(false);
                    z0VarG4 = d.g(f1Var2, j1Var5, (String) objL12, oVar, 0);
                } else {
                    z13 = false;
                    z0VarG4 = null;
                }
                oVar.r(z13);
                oVar.U(-1158245186);
                oVar.r(z13);
                w wVar = new w(z0VarG4, null, f1Var2, e0Var2, f0Var2, null);
                oVar.r(z13);
                a1.k kVar = a1.k.f196a;
                n nVarJ = androidx.compose.ui.graphics.a.b(kVar, 0.0f, 0.0f, 0.0f, 0.0f, null, !z16, 126975).j(new EnterExitTransitionElement(f1Var2, z0Var, z0VarG3, z0VarG, e0Var2, f0Var2, wVar));
                oVar.r(false);
                n nVarJ2 = nVar.j(nVarJ.j(kVar));
                oVar.U(-492369756);
                Object objL13 = oVar.L();
                if (objL13 == obj) {
                    objL13 = new m(rVar);
                    oVar.g0(objL13);
                }
                oVar.r(false);
                t1.h0 h0Var = (t1.h0) objL13;
                oVar.U(-1323940314);
                int i16 = oVar.P;
                d1 d1VarN = oVar.n();
                j.f18438q.getClass();
                eh.a aVar2 = v1.i.f18413b;
                w0.a aVarJ = w0.j(nVarJ2);
                oVar.X();
                if (oVar.O) {
                    oVar.m(aVar2);
                } else {
                    oVar.j0();
                }
                p.Q(v1.i.f18417f, h0Var, oVar);
                p.Q(v1.i.f18416e, d1VarN, oVar);
                h hVar = v1.i.f18420i;
                if (oVar.O || !l.a(oVar.L(), Integer.valueOf(i16))) {
                    g.t(i16, oVar, i16, hVar);
                }
                g.u(0, aVarJ, new p1(oVar), oVar, 2058660585);
                aVar.invoke(rVar, oVar, Integer.valueOf(((i12 >> 18) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 8));
                oVar.r(false);
                oVar.r(true);
                oVar.r(false);
            }
        }
        h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new s(f1Var, cVar, nVar, e0Var, f0Var, eVar, aVar, i10);
        }
    }

    public static final void b(k0 k0Var, n nVar, e0 e0Var, f0 f0Var, String str, w0.a aVar, o oVar, int i10) {
        n nVar2;
        f0 f0Var2;
        String str2;
        oVar.V(-222898426);
        if (((i10 | (oVar.f(k0Var) ? 4 : 2) | 27696) & 374491) == 74898 && oVar.D()) {
            oVar.P();
            nVar2 = nVar;
            f0Var2 = f0Var;
            str2 = str;
        } else {
            f0 f0VarD = z.d(null, 3);
            Object obj = q1.f16167a;
            f0 f0VarA = f0VarD.a(z.e(a1.a.w, s.c.B, d.m(400.0f, new q2.k(te.a.c(1, 1)), 1)));
            e(d.q(k0Var, "AnimatedVisibility", oVar), s.c.f14912u, e0Var, f0VarA, aVar, oVar, 224688);
            nVar2 = a1.k.f196a;
            f0Var2 = f0VarA;
            str2 = "AnimatedVisibility";
        }
        h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new f(k0Var, nVar2, e0Var, f0Var2, str2, aVar, i10);
        }
    }

    public static final void c(boolean z3, n nVar, e0 e0Var, f0 f0Var, String str, w0.a aVar, o oVar, int i10) {
        n nVar2;
        String str2;
        oVar.V(2088733774);
        int i11 = i10 | (oVar.g(z3) ? 4 : 2) | 24624;
        if ((374491 & i11) == 74898 && oVar.D()) {
            oVar.P();
            nVar2 = nVar;
            str2 = str;
        } else {
            e(d.p(Boolean.valueOf(z3), "AnimatedVisibility", oVar, (i11 & 14) | 48, 0), s.c.f14910s, e0Var, f0Var, aVar, oVar, 224688);
            nVar2 = a1.k.f196a;
            str2 = "AnimatedVisibility";
        }
        h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new s.o(z3, nVar2, e0Var, f0Var, str2, aVar, i10);
        }
    }

    public static final void d(boolean z3, n nVar, e0 e0Var, f0 f0Var, String str, w0.a aVar, o oVar, int i10) {
        int i11;
        n nVar2;
        String str2;
        oVar.V(1766503102);
        if ((i10 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
            i11 = i10 | (oVar.g(z3) ? 32 : 16);
        } else {
            i11 = i10;
        }
        int i12 = i11 | 196992;
        if ((2995921 & i12) == 599184 && oVar.D()) {
            oVar.P();
            nVar2 = nVar;
            str2 = str;
        } else {
            e(d.p(Boolean.valueOf(z3), "AnimatedVisibility", oVar, ((i12 >> 3) & 14) | 48, 0), s.c.f14911t, e0Var, f0Var, aVar, oVar, 224688);
            nVar2 = a1.k.f196a;
            str2 = "AnimatedVisibility";
        }
        h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new u0(z3, nVar2, e0Var, f0Var, str2, aVar, i10);
        }
    }

    public static final void e(f1 f1Var, c cVar, e0 e0Var, f0 f0Var, w0.a aVar, o oVar, int i10) {
        int i11;
        oVar.V(429978603);
        if ((i10 & 14) == 0) {
            i11 = (oVar.f(f1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
            i11 |= oVar.h(cVar) ? 32 : 16;
        }
        int i12 = i10 & 896;
        a1.k kVar = a1.k.f196a;
        if (i12 == 0) {
            i11 |= oVar.f(kVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= oVar.f(e0Var) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= oVar.f(f0Var) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= oVar.h(aVar) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && oVar.D()) {
            oVar.P();
        } else {
            oVar.U(1276591712);
            boolean zH = oVar.h(cVar) | oVar.f(f1Var);
            Object objL = oVar.L();
            if (zH || objL == k.f12458a) {
                objL = new f0.p1(cVar, f1Var);
                oVar.g0(objL);
            }
            oVar.r(false);
            a(f1Var, cVar, androidx.compose.ui.layout.a.b(kVar, (eh.f) objL), e0Var, f0Var, s.g.f14942s, aVar, oVar, (57344 & i11) | 196608 | (i11 & 14) | (i11 & R.styleable.AppCompatTheme_windowActionBarOverlay) | (i11 & 7168) | ((i11 << 6) & 29360128));
        }
        h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new s.p(f1Var, cVar, e0Var, f0Var, aVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final s.v f(t.f1 r6, eh.c r7, java.lang.Object r8, o0.o r9) {
        /*
            r0 = 361571134(0x158d233e, float:5.700505E-26)
            r9.U(r0)
            r0 = -721835388(0xffffffffd4f9aa84, float:-8.578461E12)
            r1 = 0
            r2 = 0
            r9.Q(r6, r0, r1, r2)
            boolean r0 = r6.d()
            s.v r1 = s.v.f14993i
            s.v r3 = s.v.f14995s
            s.v r4 = s.v.f14994r
            if (r0 == 0) goto L3a
            java.lang.Object r8 = r7.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L28
        L26:
            r1 = r4
            goto L87
        L28:
            java.lang.Object r6 = r6.b()
            java.lang.Object r6 = r7.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L87
        L38:
            r1 = r3
            goto L87
        L3a:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.U(r0)
            java.lang.Object r0 = r9.L()
            o0.n0 r5 = o0.k.f12458a
            if (r0 != r5) goto L53
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            o0.n0 r5 = o0.n0.f12510u
            o0.z0 r0 = o0.p.I(r0, r5)
            r9.g0(r0)
        L53:
            r9.r(r2)
            o0.s0 r0 = (o0.s0) r0
            java.lang.Object r6 = r6.b()
            java.lang.Object r6 = r7.invoke(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6d
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.setValue(r6)
        L6d:
            java.lang.Object r6 = r7.invoke(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L7a
            goto L26
        L7a:
            java.lang.Object r6 = r0.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L87
            goto L38
        L87:
            r9.r(r2)
            r9.r(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.f(t.f1, eh.c, java.lang.Object, o0.o):s.v");
    }
}
