package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f11347i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f11349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y.e f11350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f11351u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f11352v;
    public final /* synthetic */ t1.j0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y.g f11353x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t1.q0 q0Var, int i10, t1.q0 q0Var2, y.e eVar, long j, t1.q0 q0Var3, t1.j0 j0Var, y.g gVar, int i11) {
        super(1);
        this.f11347i = q0Var;
        this.f11348r = i10;
        this.f11349s = q0Var2;
        this.f11350t = eVar;
        this.f11351u = j;
        this.f11352v = q0Var3;
        this.w = j0Var;
        this.f11353x = gVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        t1.p0 p0Var = (t1.p0) obj;
        kotlin.jvm.internal.l.f("$this$layout", p0Var);
        t1.q0 q0Var = this.f11347i;
        int i10 = q0Var.f16309r;
        int i11 = this.f11348r;
        int i12 = 0;
        t1.p0.g(p0Var, q0Var, 0, (i11 - i10) / 2);
        y.c cVar = y.i.f19956e;
        y.e eVar = this.f11350t;
        boolean zA = kotlin.jvm.internal.l.a(eVar, cVar);
        t1.q0 q0Var2 = this.f11352v;
        long j = this.f11351u;
        t1.q0 q0Var3 = this.f11349s;
        int iH = zA ? (q2.a.h(j) - q0Var3.f16308i) / 2 : kotlin.jvm.internal.l.a(eVar, y.i.f19953b) ? (q2.a.h(j) - q0Var3.f16308i) - q0Var2.f16308i : Math.max(this.w.e0(y.f11461b), q0Var.f16308i);
        y.g gVar = this.f11353x;
        if (kotlin.jvm.internal.l.a(gVar, cVar)) {
            i12 = (i11 - q0Var3.f16309r) / 2;
        } else if (kotlin.jvm.internal.l.a(gVar, y.i.f19955d)) {
            i12 = i11 - q0Var3.f16309r;
        }
        t1.p0.g(p0Var, q0Var3, iH, i12);
        t1.p0.g(p0Var, q0Var2, q2.a.h(j) - q0Var2.f16308i, (i11 - q0Var2.f16309r) / 2);
        return qg.o.f13926a;
    }
}
