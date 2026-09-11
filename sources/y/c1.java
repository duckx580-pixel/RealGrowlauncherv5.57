package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d1 f19927i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f19929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f19930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t1.j0 f19931u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, int i10, t1.q0 q0Var, int i11, t1.j0 j0Var) {
        super(1);
        this.f19927i = d1Var;
        this.f19928r = i10;
        this.f19929s = q0Var;
        this.f19930t = i11;
        this.f19931u = j0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eh.e, kotlin.jvm.internal.m] */
    @Override // eh.c
    public final Object invoke(Object obj) {
        ?? r02 = this.f19927i.E;
        t1.q0 q0Var = this.f19929s;
        t1.p0.f((t1.p0) obj, q0Var, ((q2.i) r02.invoke(new q2.k(te.a.c(this.f19928r - q0Var.f16308i, this.f19930t - q0Var.f16309r)), this.f19931u.getLayoutDirection())).f13746a);
        return qg.o.f13926a;
    }
}
