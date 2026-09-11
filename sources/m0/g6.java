package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g6 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t.c f10700i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f10701r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(t.c cVar, float f9) {
        super(0);
        this.f10700i = cVar;
        this.f10701r = f9;
    }

    @Override // eh.a
    public final Object invoke() {
        t.o oVar;
        Float fValueOf = Float.valueOf(this.f10701r);
        t.c cVar = this.f10700i;
        Object obj = cVar.f16028g;
        t.j1 j1Var = cVar.f16022a;
        t.o oVar2 = (t.o) j1Var.f16120a.invoke(fValueOf);
        if (oVar2 == null) {
            oVar2 = cVar.f16030i;
        }
        if (obj == null || (oVar = (t.o) j1Var.f16120a.invoke(obj)) == null) {
            oVar = cVar.j;
        }
        int iB = oVar2.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (oVar2.a(i10) > oVar.a(i10)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + oVar2 + " is greater than upper bound " + oVar + " on index " + i10).toString());
            }
        }
        cVar.f16031k = oVar2;
        cVar.f16032l = oVar;
        cVar.f16028g = obj;
        cVar.f16027f = fValueOf;
        if (!((Boolean) cVar.f16025d.getValue()).booleanValue()) {
            Object objC = cVar.c(cVar.d());
            if (!kotlin.jvm.internal.l.a(objC, cVar.d())) {
                cVar.f16024c.f16114r.setValue(objC);
            }
        }
        return qg.o.f13926a;
    }
}
