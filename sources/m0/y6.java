package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y6 extends kotlin.jvm.internal.m implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n6 f11499i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f11501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x.k f11502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11503u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(n6 n6Var, boolean z3, boolean z10, x.k kVar, int i10) {
        super(3);
        this.f11499i = n6Var;
        this.f11500r = z3;
        this.f11501s = z10;
        this.f11502t = kVar;
        this.f11503u = i10;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o0.o oVar = (o0.o) obj2;
        ((Number) obj3).intValue();
        kotlin.jvm.internal.l.f("it", (g2) obj);
        oVar.U(-502832279);
        int i10 = this.f11503u;
        x.k kVar = this.f11502t;
        kotlin.jvm.internal.l.f("interactionSource", kVar);
        oVar.U(1167161306);
        o0.s0 s0VarL = te.a.l(kVar, oVar, ((((i10 >> 9) & 7168) | ((i10 >> 6) & 1022)) >> 6) & 14);
        n6 n6Var = this.f11499i;
        long j = ((g1.t) k0.g.c(!this.f11500r ? n6Var.f11036z : this.f11501s ? n6Var.A : ((Boolean) s0VarL.getValue()).booleanValue() ? n6Var.f11034x : n6Var.f11035y, oVar, false)).f6918a;
        oVar.r(false);
        return new g1.t(j);
    }
}
