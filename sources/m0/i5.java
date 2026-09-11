package m0;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i5 extends kotlin.jvm.internal.m implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10790i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v.m0 f10791r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x.l f10792s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10793t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f10794u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10795v;
    public final /* synthetic */ o0.d2 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10796x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(boolean z3, w4 w4Var, x.l lVar, int i10, boolean z10, o0.s0 s0Var, o0.s0 s0Var2, o0.s0 s0Var3) {
        super(3);
        this.f10790i = z3;
        this.f10791r = w4Var;
        this.f10792s = lVar;
        this.f10793t = i10;
        this.f10794u = z10;
        this.f10795v = s0Var;
        this.w = s0Var2;
        this.f10796x = s0Var3;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a1.n nVarJ = (a1.n) obj;
        o0.o oVar = (o0.o) obj2;
        ((Number) obj3).intValue();
        kotlin.jvm.internal.l.f("$this$composed", nVarJ);
        oVar.U(2040469710);
        if (this.f10790i) {
            Object objB = t.g.b(oVar, 773894976, -492369756);
            if (objB == o0.k.f12458a) {
                o0.w wVar = new o0.w(o0.p.w(oVar));
                oVar.g0(wVar);
                objB = wVar;
            }
            oVar.r(false);
            th.d dVar = ((o0.w) objB).f12612i;
            oVar.r(false);
            Object[] objArr = {this.f10791r, this.f10792s, Integer.valueOf(this.f10793t), Boolean.valueOf(this.f10794u)};
            h5 h5Var = new h5(this.f10794u, this.f10793t, this.f10795v, this.w, dVar, this.f10791r, this.f10796x, null);
            q1.g gVar = q1.x.f13718a;
            nVarJ = nVarJ.j(new SuspendPointerInputElement(null, null, objArr, h5Var, 3));
        }
        oVar.r(false);
        return nVarJ;
    }
}
