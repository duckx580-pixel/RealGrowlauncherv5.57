package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15230i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g3 f15231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c1 f15232s;

    public /* synthetic */ a1(c1 c1Var, g3 g3Var, int i10) {
        this.f15230i = i10;
        this.f15232s = c1Var;
        this.f15231r = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15230i) {
            case 0:
                a3 a3Var = this.f15232s.f15280d;
                a3Var.a();
                a3Var.q(this.f15231r);
                break;
            case 1:
                a3 a3Var2 = this.f15232s.f15280d;
                a3Var2.a();
                a3Var2.b().t();
                a3Var2.d();
                g3 g3Var = this.f15231r;
                b8.a0.e(g3Var.f15353i);
                a3Var2.J(g3Var);
                break;
            case 2:
                a3 a3Var3 = this.f15232s.f15280d;
                a3Var3.a();
                a3Var3.b().t();
                a3Var3.d();
                g3 g3Var2 = this.f15231r;
                b8.a0.e(g3Var2.f15353i);
                i iVarB = i.b(g3Var2.L);
                String str = g3Var2.f15353i;
                i iVarL = a3Var3.L(str);
                a3Var3.c().E.d(str, iVarB, "Setting consent, package, consent");
                a3Var3.s(str, iVarB);
                if (iVarB.g(iVarL, (h[]) iVarB.f15407a.keySet().toArray(new h[0]))) {
                    a3Var3.q(g3Var2);
                }
                break;
            default:
                a3 a3Var4 = this.f15232s.f15280d;
                a3Var4.a();
                a3Var4.n(this.f15231r);
                break;
        }
    }
}
