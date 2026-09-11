package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16346i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z0 f16347r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(z0 z0Var, int i10) {
        super(2);
        this.f16346i = i10;
        this.f16347r = z0Var;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16346i) {
            case 0:
                this.f16347r.a().f16272r = (o0.r) obj2;
                break;
            case 1:
                d0 d0VarA = this.f16347r.a();
                ((androidx.compose.ui.node.a) obj).W(new a0(d0VarA, (eh.e) obj2, d0VarA.F));
                break;
            default:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                z0 z0Var = this.f16347r;
                c1 c1Var = z0Var.f16353a;
                d0 d0Var = aVar.O;
                if (d0Var == null) {
                    d0Var = new d0(aVar, c1Var);
                    aVar.O = d0Var;
                }
                z0Var.f16354b = d0Var;
                z0Var.a().d();
                d0 d0VarA2 = z0Var.a();
                if (d0VarA2.f16273s != c1Var) {
                    d0VarA2.f16273s = c1Var;
                    d0VarA2.e(false);
                    androidx.compose.ui.node.a.P(d0VarA2.f16271i, false, 3);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
