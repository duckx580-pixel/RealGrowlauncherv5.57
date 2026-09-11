package s;

import f0.w1;
import o0.z0;
import t.a1;
import t.f1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14932i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.a f14933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f14934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f14936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f14937v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t.k0 k0Var, a1.n nVar, e0 e0Var, f0 f0Var, String str, w0.a aVar, int i10) {
        super(2);
        this.f14934s = k0Var;
        this.f14935t = nVar;
        this.f14936u = e0Var;
        this.f14937v = f0Var;
        this.w = str;
        this.f14933r = aVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14932i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                eh.c cVar = (eh.c) this.f14936u;
                l lVar = (l) this.f14937v;
                f1 f1Var = (f1) this.f14934s;
                if ((iIntValue & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    oVar.U(-492369756);
                    Object objL = oVar.L();
                    o0.n0 n0Var = o0.k.f12458a;
                    if (objL == n0Var) {
                        objL = (u) cVar.invoke(lVar);
                        oVar.g0(objL);
                    }
                    oVar.r(false);
                    u uVar = (u) objL;
                    a1 a1VarC = f1Var.c();
                    z0 z0Var = f1Var.f16078c;
                    Object objC = a1VarC.c();
                    Object obj3 = this.f14935t;
                    Boolean boolValueOf = Boolean.valueOf(kotlin.jvm.internal.l.a(objC, obj3));
                    oVar.U(1157296644);
                    boolean zF = oVar.f(boolValueOf);
                    Object objL2 = oVar.L();
                    if (zF || objL2 == n0Var) {
                        objL2 = kotlin.jvm.internal.l.a(f1Var.c().c(), obj3) ? f0.f14938b : ((u) cVar.invoke(lVar)).f14990b;
                        oVar.g0(objL2);
                    }
                    oVar.r(false);
                    f0 f0Var = (f0) objL2;
                    oVar.U(-492369756);
                    Object objL3 = oVar.L();
                    Object obj4 = objL3;
                    if (objL3 == n0Var) {
                        boolean zA = kotlin.jvm.internal.l.a(obj3, z0Var.getValue());
                        j jVar = new j();
                        jVar.f14949a = zA;
                        oVar.g0(jVar);
                        obj4 = jVar;
                    }
                    oVar.r(false);
                    j jVar2 = (j) obj4;
                    e0 e0Var = uVar.f14989a;
                    a1.n nVarB = androidx.compose.ui.layout.a.b(a1.k.f196a, new w1(4, uVar));
                    jVar2.f14949a = kotlin.jvm.internal.l.a(obj3, z0Var.getValue());
                    a1.n nVarJ = nVarB.j(jVar2);
                    a0.k0 k0Var = new a0.k0(26, obj3);
                    oVar.U(664245165);
                    boolean zF2 = oVar.f(f0Var);
                    Object objL4 = oVar.L();
                    if (zF2 || objL4 == n0Var) {
                        objL4 = new a1.i(7, f0Var);
                        oVar.g0(objL4);
                    }
                    oVar.r(false);
                    androidx.compose.animation.a.a(f1Var, k0Var, nVarJ, e0Var, f0Var, (eh.e) objL4, w0.f.b(oVar, -616195562, new b0.w(lVar, obj3, (y0.q) this.w, this.f14933r, 3)), oVar, 12582912);
                }
                break;
            default:
                ((Number) obj2).intValue();
                androidx.compose.animation.a.b((t.k0) this.f14934s, (a1.n) this.f14935t, (e0) this.f14936u, (f0) this.f14937v, (String) this.w, this.f14933r, (o0.o) obj, o0.p.S(196993));
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f1 f1Var, Object obj, eh.c cVar, l lVar, y0.q qVar, w0.a aVar) {
        super(2);
        this.f14934s = f1Var;
        this.f14935t = obj;
        this.f14936u = cVar;
        this.f14937v = lVar;
        this.w = qVar;
        this.f14933r = aVar;
    }
}
