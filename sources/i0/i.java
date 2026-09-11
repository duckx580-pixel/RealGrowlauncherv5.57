package i0;

import com.rtsoft.growtopia.R;
import o0.e0;
import o0.e2;
import o0.g1;
import o0.h1;
import s.h0;
import t1.w0;
import w1.b1;
import w1.d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7952a = 24;

    public static final void a(eh.a aVar, a1.n nVar, boolean z3, x.l lVar, w0.a aVar2, o0.o oVar, int i10) {
        int i11;
        x.l lVar2;
        boolean z10;
        kotlin.jvm.internal.l.f("onClick", aVar);
        oVar.V(-111063634);
        if ((i10 & 14) == 0) {
            i11 = i10 | (oVar.h(aVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
            i11 |= oVar.f(nVar) ? 32 : 16;
        }
        int i12 = i11 | 3456;
        if ((i10 & 57344) == 0) {
            i12 |= oVar.h(aVar2) ? 16384 : 8192;
        }
        if ((46811 & i12) == 9362 && oVar.D()) {
            oVar.P();
            z10 = z3;
            lVar2 = lVar;
        } else {
            oVar.U(-492369756);
            Object objL = oVar.L();
            if (objL == o0.k.f12458a) {
                objL = h0.i(oVar);
            }
            oVar.r(false);
            x.l lVar3 = (x.l) objL;
            e2 e2Var = m.f7961a;
            kotlin.jvm.internal.l.f("<this>", nVar);
            a1.n nVarE = androidx.compose.foundation.a.e(gh.a.i(nVar, l.f7960i), lVar3, l0.m.a(false, f7952a, oVar, 54, 4), true, new b2.g(0), aVar, 8);
            a1.d dVar = a1.a.f179t;
            oVar.U(733328855);
            t1.h0 h0VarC = y.n.c(dVar, false, oVar);
            oVar.U(-1323940314);
            q2.b bVar = (q2.b) oVar.k(b1.f18759e);
            q2.l lVar4 = (q2.l) oVar.k(b1.f18764k);
            d2 d2Var = (d2) oVar.k(b1.f18769p);
            v1.j.f18438q.getClass();
            v1.n nVar2 = v1.i.f18413b;
            w0.a aVarI = w0.i(nVarE);
            oVar.X();
            if (oVar.O) {
                oVar.m(nVar2);
            } else {
                oVar.j0();
            }
            oVar.f12534x = false;
            o0.p.Q(v1.i.f18417f, h0VarC, oVar);
            o0.p.Q(v1.i.f18415d, bVar, oVar);
            o0.p.Q(v1.i.f18418g, lVar4, oVar);
            k0.g.u(0, aVarI, gb.e.f(oVar, d2Var, v1.i.f18419h, oVar), oVar, 2058660585);
            oVar.U(753555784);
            e0 e0Var = d.f7941a;
            float fFloatValue = ((Number) oVar.k(e0Var)).floatValue();
            oVar.r(false);
            o0.p.b(new g1[]{e0Var.a(Float.valueOf(fFloatValue))}, aVar2, oVar, ((i12 >> 9) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 8);
            k0.g.A(oVar, false, true, false, false);
            lVar2 = lVar3;
            z10 = true;
        }
        h1 h1VarV = oVar.v();
        if (h1VarV == null) {
            return;
        }
        h1VarV.f12435d = new h(aVar, nVar, z10, lVar2, aVar2, i10);
    }
}
