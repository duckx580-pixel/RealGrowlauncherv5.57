package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10709i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y.m0 f10710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.f f10711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10712t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(y.m0 m0Var, eh.f fVar, int i10, int i11) {
        super(2);
        this.f10709i = i11;
        this.f10710r = m0Var;
        this.f10711s = fVar;
        this.f10712t = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10709i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    a1.n nVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.a(a1.k.f196a, a0.f10346c, a0.f10347d), this.f10710r);
                    y.c cVar = y.i.f19956e;
                    a1.c cVar2 = a1.a.f183y;
                    int i10 = ((this.f10712t >> 18) & 7168) | 432;
                    oVar.U(693286680);
                    t1.h0 h0VarA = y.r0.a(cVar, cVar2, oVar);
                    oVar.U(-1323940314);
                    q2.b bVar = (q2.b) oVar.k(w1.b1.f18759e);
                    q2.l lVar = (q2.l) oVar.k(w1.b1.f18764k);
                    w1.d2 d2Var = (w1.d2) oVar.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarI = t1.w0.i(nVarH);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar);
                    } else {
                        oVar.j0();
                    }
                    oVar.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarA, oVar);
                    o0.p.Q(v1.i.f18415d, bVar, oVar);
                    o0.p.Q(v1.i.f18418g, lVar, oVar);
                    k0.g.u(0, aVarI, gb.e.f(oVar, d2Var, v1.i.f18419h, oVar), oVar, 2058660585);
                    this.f10711s.invoke(y.s0.f19994a, oVar, Integer.valueOf(((i10 >> 6) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 6));
                    oVar.r(false);
                    android.support.v4.media.session.a.t(oVar, true, false, false);
                }
                break;
            default:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    l7.a(((n7) oVar2.k(o7.f11096a)).f11048m, w0.f.b(oVar2, -2136309793, new h0(this.f10710r, this.f10711s, this.f10712t, 0)), oVar2, 48);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
