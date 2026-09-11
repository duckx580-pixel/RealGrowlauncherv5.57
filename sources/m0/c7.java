package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c7 extends kotlin.jvm.internal.m implements eh.e {
    public final /* synthetic */ f0.w0 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ x.l E;
    public final /* synthetic */ g1.k0 F;
    public final /* synthetic */ n6 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10490i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.c f10492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1.n f10493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f10494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d2.x f10495v;
    public final /* synthetic */ eh.e w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ eh.e f10496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k2.d0 f10497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f0.x0 f10498z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(a1.n nVar, n6 n6Var, int i10, int i11, String str, eh.c cVar, boolean z3, d2.x xVar, f0.x0 x0Var, f0.w0 w0Var, boolean z10, int i12, int i13, k2.d0 d0Var, x.l lVar, int i14, eh.e eVar, eh.e eVar2, g1.k0 k0Var) {
        super(2);
        this.f10493t = nVar;
        this.G = n6Var;
        this.C = i10;
        this.D = i11;
        this.f10491r = str;
        this.f10492s = cVar;
        this.f10494u = z3;
        this.f10495v = xVar;
        this.f10498z = x0Var;
        this.A = w0Var;
        this.B = z10;
        this.H = i12;
        this.I = i13;
        this.f10497y = d0Var;
        this.E = lVar;
        this.J = i14;
        this.w = eVar;
        this.f10496x = eVar2;
        this.F = k0Var;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10490i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    a1.n nVarA = androidx.compose.foundation.layout.c.a(this.f10493t, r6.f11214c, r6.f11213b);
                    int i10 = this.C;
                    int i11 = i10 >> 9;
                    oVar.U(-1885422187);
                    n6 n6Var = this.G;
                    g1.m0 m0Var = new g1.m0(((g1.t) k0.g.c(n6Var.f11021i, oVar, false)).f6918a);
                    int i12 = this.C;
                    int i13 = this.D;
                    String str = this.f10491r;
                    boolean z3 = this.f10494u;
                    boolean z10 = this.B;
                    k2.d0 d0Var = this.f10497y;
                    x.l lVar = this.E;
                    w0.a aVarB = w0.f.b(oVar, -288211827, new b7(str, z3, z10, d0Var, lVar, this.w, this.f10496x, this.F, n6Var, this.J, i12, i13));
                    int i14 = i10 << 3;
                    f0.u0.d(str, this.f10492s, nVarA, z3, this.f10495v, this.f10498z, this.A, z10, this.H, this.I, d0Var, null, lVar, m0Var, aVarB, oVar, (this.J & 64638) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i11 & R.styleable.AppCompatTheme_windowActionBarOverlay) | ((i10 >> 27) & 14) | 196608 | ((this.D << 9) & 7168), 4096);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iS = o0.p.S(this.H | 1);
                int iS2 = o0.p.S(this.I);
                int i15 = this.J;
                e7.a(this.f10491r, this.f10492s, this.f10493t, this.f10494u, this.f10495v, this.w, this.f10496x, this.f10497y, this.f10498z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (o0.o) obj, iS, iS2, i15);
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(String str, eh.c cVar, a1.n nVar, boolean z3, d2.x xVar, eh.e eVar, eh.e eVar2, k2.d0 d0Var, f0.x0 x0Var, f0.w0 w0Var, boolean z10, int i10, int i11, x.l lVar, g1.k0 k0Var, n6 n6Var, int i12, int i13, int i14) {
        super(2);
        this.f10491r = str;
        this.f10492s = cVar;
        this.f10493t = nVar;
        this.f10494u = z3;
        this.f10495v = xVar;
        this.w = eVar;
        this.f10496x = eVar2;
        this.f10497y = d0Var;
        this.f10498z = x0Var;
        this.A = w0Var;
        this.B = z10;
        this.C = i10;
        this.D = i11;
        this.E = lVar;
        this.F = k0Var;
        this.G = n6Var;
        this.H = i12;
        this.I = i13;
        this.J = i14;
    }
}
