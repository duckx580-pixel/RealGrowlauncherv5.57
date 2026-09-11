package a0;

import com.rtsoft.growtopia.R;
import t1.w0;
import w1.b1;
import w1.d2;
import y.r0;
import y.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f117s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i10, int i11) {
        super(2);
        this.f115i = i11;
        this.f117s = obj;
        this.f116r = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f115i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    af.a aVar = ((o) this.f117s).f124b.f84e;
                    int i10 = this.f116r;
                    b0.f fVarJ = aVar.j(i10);
                    int i11 = i10 - fVarJ.f2431a;
                    ((h) fVarJ.f2433c).f71c.e(s.f134a, Integer.valueOf(i11), oVar, 6);
                }
                break;
            case 1:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    y.d dVar = y.i.f19953b;
                    a1.c cVar = a1.a.f183y;
                    eh.f fVar = (eh.f) this.f117s;
                    int i12 = ((this.f116r >> 6) & 7168) | 432;
                    oVar2.U(693286680);
                    t1.h0 h0VarA = r0.a(dVar, cVar, oVar2);
                    oVar2.U(-1323940314);
                    q2.b bVar = (q2.b) oVar2.k(b1.f18759e);
                    q2.l lVar = (q2.l) oVar2.k(b1.f18764k);
                    d2 d2Var = (d2) oVar2.k(b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarI = w0.i(a1.k.f196a);
                    oVar2.X();
                    if (oVar2.O) {
                        oVar2.m(nVar);
                    } else {
                        oVar2.j0();
                    }
                    oVar2.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarA, oVar2);
                    o0.p.Q(v1.i.f18415d, bVar, oVar2);
                    o0.p.Q(v1.i.f18418g, lVar, oVar2);
                    k0.g.u(0, aVarI, gb.e.f(oVar2, d2Var, v1.i.f18419h, oVar2), oVar2, 2058660585);
                    fVar.invoke(s0.f19994a, oVar2, Integer.valueOf(((i12 >> 6) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 6));
                    oVar2.r(false);
                    android.support.v4.media.session.a.t(oVar2, true, false, false);
                }
                break;
            default:
                o0.o oVar3 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar3.D()) {
                    oVar3.P();
                } else {
                    z.h hVar = (z.h) this.f117s;
                    af.a aVar2 = hVar.f20489b.f20485d;
                    int i13 = this.f116r;
                    b0.f fVarJ2 = aVar2.j(i13);
                    ((z.d) fVarJ2.f2433c).f20484c.e(hVar.f20490c, Integer.valueOf(i13 - fVarJ2.f2431a), oVar3, 0);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
