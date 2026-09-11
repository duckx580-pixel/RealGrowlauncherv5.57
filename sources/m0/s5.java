package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s5 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f11253i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f11255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11256t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11257u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f11258v;
    public final /* synthetic */ int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11259x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(t1.q0 q0Var, int i10, t1.q0 q0Var2, int i11, int i12, t1.q0 q0Var3, int i13, int i14) {
        super(1);
        this.f11253i = q0Var;
        this.f11254r = i10;
        this.f11255s = q0Var2;
        this.f11256t = i11;
        this.f11257u = i12;
        this.f11258v = q0Var3;
        this.w = i13;
        this.f11259x = i14;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        t1.p0 p0Var = (t1.p0) obj;
        kotlin.jvm.internal.l.f("$this$layout", p0Var);
        t1.p0.g(p0Var, this.f11253i, 0, this.f11254r);
        t1.q0 q0Var = this.f11255s;
        if (q0Var != null) {
            t1.p0.g(p0Var, q0Var, this.f11256t, this.f11257u);
        }
        t1.q0 q0Var2 = this.f11258v;
        if (q0Var2 != null) {
            t1.p0.g(p0Var, q0Var2, this.w, this.f11259x);
        }
        return qg.o.f13926a;
    }
}
