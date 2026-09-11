package l0;

import g1.t;
import o0.s0;
import t.i1;
import t.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f9775a = new i1(15, x.f16212d, 2);

    public static final d a(boolean z3, float f9, o0.o oVar, int i10, int i11) {
        oVar.U(1635163520);
        if ((i11 & 1) != 0) {
            z3 = true;
        }
        if ((i11 & 2) != 0) {
            f9 = Float.NaN;
        }
        s0 s0VarM = o0.p.M(new t(t.f6916n), oVar);
        Boolean boolValueOf = Boolean.valueOf(z3);
        q2.e eVar = new q2.e(f9);
        oVar.U(511388516);
        boolean zF = oVar.f(boolValueOf) | oVar.f(eVar);
        Object objL = oVar.L();
        if (zF || objL == o0.k.f12458a) {
            objL = new d(z3, f9, s0VarM);
            oVar.g0(objL);
        }
        oVar.r(false);
        d dVar = (d) objL;
        oVar.r(false);
        return dVar;
    }
}
