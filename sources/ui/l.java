package ui;

import java.util.List;
import m0.n1;
import o0.d1;
import t1.h0;
import t1.w0;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18062i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f18063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f18064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.a f18065t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.a f18066u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ eh.c f18067v;

    public /* synthetic */ l(eh.a aVar, boolean z3, eh.a aVar2, boolean z10, eh.c cVar) {
        this.f18065t = aVar;
        this.f18063r = z3;
        this.f18066u = aVar2;
        this.f18064s = z10;
        this.f18067v = cVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18062i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                boolean z3 = false;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    oVar.U(-483455358);
                    h0 h0VarA = y.r.a(y.i.f19954c, a1.a.A, oVar);
                    oVar.U(-1323940314);
                    int i10 = oVar.P;
                    d1 d1VarN = oVar.n();
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    a1.k kVar = a1.k.f196a;
                    w0.a aVarJ = w0.j(kVar);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar);
                    } else {
                        oVar.j0();
                    }
                    v1.h hVar = v1.i.f18417f;
                    o0.p.Q(hVar, h0VarA, oVar);
                    v1.h hVar2 = v1.i.f18416e;
                    o0.p.Q(hVar2, d1VarN, oVar);
                    v1.h hVar3 = v1.i.f18420i;
                    if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i10))) {
                        k0.g.t(i10, oVar, i10, hVar3);
                    }
                    k0.g.z(oVar, aVarJ, oVar, 0, 2058660585);
                    float f9 = 4;
                    a1.n nVarI = androidx.compose.foundation.layout.a.i(gh.a.i(androidx.compose.foundation.layout.c.f(kVar, 1.0f), new h0.g(2, te.a.x(oVar), z3)), f9);
                    a1.c cVar = a1.a.f183y;
                    oVar.U(693286680);
                    h0 h0VarA2 = r0.a(y.i.f19952a, cVar, oVar);
                    oVar.U(-1323940314);
                    int i11 = oVar.P;
                    d1 d1VarN2 = oVar.n();
                    w0.a aVarJ2 = w0.j(nVarI);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar);
                    } else {
                        oVar.j0();
                    }
                    o0.p.Q(hVar, h0VarA2, oVar);
                    o0.p.Q(hVar2, d1VarN2, oVar);
                    if (oVar.O || !kotlin.jvm.internal.l.a(oVar.L(), Integer.valueOf(i11))) {
                        k0.g.t(i11, oVar, i11, hVar3);
                    }
                    k0.g.z(oVar, aVarJ2, oVar, 0, 2058660585);
                    n1.j(this.f18065t, null, this.f18063r, null, null, a.f17997f, oVar, 196608, 26);
                    n1.j(this.f18066u, null, this.f18064s, null, null, a.f17998g, oVar, 196608, 26);
                    List<qg.g> listD = sb.c.D(new qg.g("Tab", "\t"), new qg.g("(", "()"), new qg.g(")", ")"), new qg.g("[", "[]"), new qg.g("]", "]"), new qg.g("{", "{}"), new qg.g("}", "}"), new qg.g("\"", "\"\""), new qg.g("'", "''"), new qg.g("=", " = "), new qg.g(";", ";"));
                    oVar.U(-1193881205);
                    for (qg.g gVar : listD) {
                        String str = (String) gVar.f13911i;
                        String str2 = (String) gVar.f13912r;
                        oVar.U(-1633490746);
                        eh.c cVar2 = this.f18067v;
                        boolean zF = oVar.f(cVar2) | oVar.f(str2);
                        Object objL = oVar.L();
                        if (zF || objL == o0.k.f12458a) {
                            objL = new fi.n(3, cVar2, str2);
                            oVar.g0(objL);
                        }
                        oVar.r(false);
                        w0.a aVarB = w0.f.b(oVar, 679452533, new fi.o(str, 8));
                        a1.n nVarK = androidx.compose.foundation.layout.a.k(kVar, f9, 0.0f, 2);
                        float f10 = f9;
                        o0.o oVar2 = oVar;
                        m0.d1.b((eh.a) objL, aVarB, nVarK, false, null, null, null, null, null, oVar2, 432);
                        oVar = oVar2;
                        f9 = f10;
                    }
                    k0.g.A(oVar, false, false, true, false);
                    k0.g.A(oVar, false, false, true, false);
                    oVar.r(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a.b(this.f18063r, this.f18064s, this.f18065t, this.f18066u, this.f18067v, (o0.o) obj, o0.p.S(3457));
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ l(boolean z3, boolean z10, eh.a aVar, eh.a aVar2, eh.c cVar, int i10) {
        this.f18063r = z3;
        this.f18064s = z10;
        this.f18065t = aVar;
        this.f18066u = aVar2;
        this.f18067v = cVar;
    }
}
