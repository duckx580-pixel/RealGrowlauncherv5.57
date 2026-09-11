package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.m implements eh.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i1 f10767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final i1 f10768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i1 f10769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final i1 f10770u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10771i;

    static {
        int i10 = 3;
        f10767r = new i1(i10, 0);
        f10768s = new i1(i10, 1);
        f10769t = new i1(i10, 2);
        f10770u = new i1(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i10, int i11) {
        super(i10);
        this.f10771i = i11;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10771i) {
            case 0:
                o0.o oVar = (o0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$null", (y.s0) obj);
                if ((iIntValue & 81) == 16 && oVar.D()) {
                    oVar.P();
                }
                return qg.o.f13926a;
            case 1:
                o5 o5Var = (o5) obj;
                o0.o oVar2 = (o0.o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("it", o5Var);
                if ((iIntValue2 & 14) == 0) {
                    iIntValue2 |= oVar2.f(o5Var) ? 4 : 2;
                }
                if ((iIntValue2 & 91) == 18 && oVar2.D()) {
                    oVar2.P();
                } else {
                    y5.b(o5Var, null, null, 0L, 0L, 0L, 0L, 0L, oVar2, iIntValue2 & 14);
                }
                return qg.o.f13926a;
            case 2:
                o0.o oVar3 = (o0.o) obj2;
                ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$composed", (a1.n) obj);
                oVar3.U(279503903);
                Object a3Var = ((Boolean) oVar3.k(h2.f10722a)).booleanValue() ? new a3(h2.f10723b) : a1.k.f196a;
                oVar3.r(false);
                return a3Var;
            default:
                t.a1 a1Var = (t.a1) obj;
                o0.o oVar4 = (o0.o) obj2;
                ((Number) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$animateFloat", a1Var);
                oVar4.U(-1635067817);
                g2 g2Var = g2.f10687i;
                g2 g2Var2 = g2.f10688r;
                Object objN = a1Var.b(g2Var, g2Var2) ? t.d.n(67, 0, t.x.f16212d, 2) : (a1Var.b(g2Var2, g2Var) || a1Var.b(g2.f10689s, g2Var2)) ? new t.i1(83, 67, t.x.f16212d) : t.d.m(0.0f, null, 7);
                oVar4.r(false);
                return objN;
        }
    }
}
