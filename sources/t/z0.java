package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f16226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.z0 f16227b = o0.p.I(null, o0.n0.f12510u);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f16228c;

    public z0(f1 f1Var, j1 j1Var, String str) {
        this.f16228c = f1Var;
        this.f16226a = j1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y0 a(eh.c cVar, eh.c cVar2) {
        o0.z0 z0Var = this.f16227b;
        y0 y0Var = (y0) z0Var.getValue();
        f1 f1Var = this.f16228c;
        if (y0Var == null) {
            Object objInvoke = cVar2.invoke(f1Var.b());
            Object objInvoke2 = cVar2.invoke(f1Var.b());
            j1 j1Var = this.f16226a;
            o oVar = (o) j1Var.f16120a.invoke(objInvoke2);
            oVar.d();
            c1 c1Var = new c1(f1Var, objInvoke, oVar, j1Var);
            y0Var = new y0(this, c1Var, cVar, cVar2);
            z0Var.setValue(y0Var);
            f1Var.f16083h.add(c1Var);
        }
        y0Var.f16224s = (kotlin.jvm.internal.m) cVar2;
        y0Var.f16223r = cVar;
        y0Var.b(f1Var.c());
        return y0Var;
    }
}
