package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10844i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1.n f10845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0.a f10846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10847t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(a1.n nVar, w0.a aVar, int i10, int i11) {
        super(2);
        this.f10844i = i11;
        this.f10845r = nVar;
        this.f10846s = aVar;
        this.f10847t = i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10844i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    String strU = n1.u(a6.f10378i, oVar);
                    a1.n nVarP = androidx.compose.foundation.layout.c.p(this.f10845r, g.f10672a, 0.0f, g.f10673b, 10);
                    oVar.U(1157296644);
                    boolean zF = oVar.f(strU);
                    Object objL = oVar.L();
                    if (zF || objL == o0.k.f12458a) {
                        objL = new b2.m(strU, 2);
                        oVar.g0(objL);
                    }
                    oVar.r(false);
                    a1.n nVarJ = nVarP.j(b2.l.a(a1.k.f196a, false, (eh.c) objL));
                    oVar.U(733328855);
                    t1.h0 h0VarC = y.n.c(a1.a.f176i, true, oVar);
                    oVar.U(-1323940314);
                    q2.b bVar = (q2.b) oVar.k(w1.b1.f18759e);
                    q2.l lVar = (q2.l) oVar.k(w1.b1.f18764k);
                    w1.d2 d2Var = (w1.d2) oVar.k(w1.b1.f18769p);
                    v1.j.f18438q.getClass();
                    v1.n nVar = v1.i.f18413b;
                    w0.a aVarI = t1.w0.i(nVarJ);
                    oVar.X();
                    if (oVar.O) {
                        oVar.m(nVar);
                    } else {
                        oVar.j0();
                    }
                    oVar.f12534x = false;
                    o0.p.Q(v1.i.f18417f, h0VarC, oVar);
                    o0.p.Q(v1.i.f18415d, bVar, oVar);
                    o0.p.Q(v1.i.f18418g, lVar, oVar);
                    k0.g.u(0, aVarI, gb.e.f(oVar, d2Var, v1.i.f18419h, oVar), oVar, 2058660585);
                    this.f10846s.invoke(oVar, Integer.valueOf((this.f10847t >> 9) & 14));
                    oVar.r(false);
                    oVar.r(true);
                    oVar.r(false);
                    oVar.r(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iS = o0.p.S(this.f10847t | 1);
                ud.a.j(this.f10845r, this.f10846s, (o0.o) obj, iS);
                break;
        }
        return qg.o.f13926a;
    }
}
