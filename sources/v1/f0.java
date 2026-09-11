package v1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f18388i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y0 f18389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f18390s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, y0 y0Var, long j) {
        super(0);
        this.f18388i = i0Var;
        this.f18389r = y0Var;
        this.f18390s = j;
    }

    @Override // eh.a
    public final Object invoke() {
        l0 l0VarH0;
        i0 i0Var = this.f18388i;
        t1.p0 placementScope = null;
        if (f.v(i0Var.f18421a)) {
            t0 t0Var = i0Var.a().A;
            if (t0Var != null) {
                placementScope = t0Var.f18445x;
            }
        } else {
            t0 t0Var2 = i0Var.a().A;
            if (t0Var2 != null && (l0VarH0 = t0Var2.H0()) != null) {
                placementScope = l0VarH0.f18445x;
            }
        }
        if (placementScope == null) {
            placementScope = ((w1.t) this.f18389r).getPlacementScope();
        }
        l0 l0VarH02 = i0Var.a().H0();
        kotlin.jvm.internal.l.c(l0VarH02);
        t1.p0.f(placementScope, l0VarH02, this.f18390s);
        return qg.o.f13926a;
    }
}
