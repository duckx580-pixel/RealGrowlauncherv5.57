package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10630i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f10631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f10632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10633t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.e f10634u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f10635v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(Object obj, boolean z3, boolean z10, int i10, eh.e eVar, int i11) {
        super(2);
        this.f10630i = i11;
        this.f10635v = obj;
        this.f10631r = z3;
        this.f10632s = z10;
        this.f10633t = i10;
        this.f10634u = eVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10630i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    d2.x xVarA = o7.a((n7) oVar.k(o7.f11096a), n0.t.f12058h);
                    c3 c3Var = (c3) this.f10635v;
                    c3Var.getClass();
                    oVar.U(-1833866293);
                    o0.d2 d2VarA = s.l0.a(!this.f10632s ? c3Var.f10473g : this.f10631r ? c3Var.f10468b : c3Var.f10471e, t.d.n(100, 0, null, 6), null, oVar, 48, 12);
                    oVar.r(false);
                    o0.p.b(new o0.g1[]{gb.e.e(((g1.t) d2VarA.getValue()).f6918a, m1.f10941a)}, w0.f.b(oVar, 2061683080, new q2(xVarA, this.f10634u, this.f10633t, 1)), oVar, 56);
                }
                break;
            default:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    d2.x xVarA2 = o7.a((n7) oVar2.k(o7.f11096a), n0.u.f12063e);
                    l3 l3Var = (l3) this.f10635v;
                    oVar2.U(-758555563);
                    o0.d2 d2VarA2 = s.l0.a(!this.f10632s ? l3Var.f10913g : this.f10631r ? l3Var.f10908b : l3Var.f10911e, t.d.n(150, 0, null, 6), null, oVar2, 48, 12);
                    oVar2.r(false);
                    o0.p.b(new o0.g1[]{gb.e.e(((g1.t) d2VarA2.getValue()).f6918a, m1.f10941a)}, w0.f.b(oVar2, -288191647, new q2(xVarA2, this.f10634u, this.f10633t, 2)), oVar2, 56);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
