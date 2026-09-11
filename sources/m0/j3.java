package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.m implements eh.c {
    public final /* synthetic */ int A;
    public final /* synthetic */ t1.q0 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ t1.j0 F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10826i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f10828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f10829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10831v;
    public final /* synthetic */ int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10833y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f10834z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(t1.q0 q0Var, boolean z3, float f9, t1.q0 q0Var2, int i10, int i11, int i12, t1.q0 q0Var3, int i13, int i14, t1.q0 q0Var4, int i15, int i16, int i17, t1.j0 j0Var, int i18) {
        super(1);
        this.f10826i = i18;
        this.f10827r = q0Var;
        this.f10828s = z3;
        this.f10829t = f9;
        this.f10830u = q0Var2;
        this.f10831v = i10;
        this.w = i11;
        this.f10832x = i12;
        this.f10833y = q0Var3;
        this.f10834z = i13;
        this.A = i14;
        this.B = q0Var4;
        this.C = i15;
        this.D = i16;
        this.E = i17;
        this.F = j0Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f10826i) {
            case 0:
                t1.p0 p0Var = (t1.p0) obj;
                kotlin.jvm.internal.l.f("$this$layout", p0Var);
                int i10 = this.A;
                int i11 = this.f10832x;
                t1.q0 q0Var = this.f10827r;
                if (q0Var != null) {
                    t1.p0.g(p0Var, q0Var, (this.E - q0Var.f16308i) / 2, (i10 - this.F.e0(k3.f10868e)) + i11);
                }
                if (this.f10828s || this.f10829t != 0.0f) {
                    t1.p0.g(p0Var, this.f10830u, this.f10831v, this.w + i11);
                }
                t1.p0.g(p0Var, this.f10833y, this.f10834z, i10 + i11);
                t1.p0.g(p0Var, this.B, this.C, this.D + i11);
                break;
            default:
                t1.p0 p0Var2 = (t1.p0) obj;
                kotlin.jvm.internal.l.f("$this$layout", p0Var2);
                int i12 = this.A;
                int i13 = this.f10832x;
                t1.q0 q0Var2 = this.f10827r;
                if (q0Var2 != null) {
                    t1.p0.g(p0Var2, q0Var2, (this.E - q0Var2.f16308i) / 2, (i12 - this.F.e0(n3.f11006e)) + i13);
                }
                if (this.f10828s || this.f10829t != 0.0f) {
                    t1.p0.g(p0Var2, this.f10830u, this.f10831v, this.w + i13);
                }
                t1.p0.g(p0Var2, this.f10833y, this.f10834z, i12 + i13);
                t1.p0.g(p0Var2, this.B, this.C, this.D + i13);
                break;
        }
        return qg.o.f13926a;
    }
}
