package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f7 extends kotlin.jvm.internal.m implements eh.c {
    public final /* synthetic */ t1.q0 A;
    public final /* synthetic */ g7 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ t1.j0 D;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10663i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10668v;
    public final /* synthetic */ t1.q0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10670y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10671z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(t1.q0 q0Var, int i10, int i11, t1.q0 q0Var2, t1.q0 q0Var3, t1.q0 q0Var4, t1.q0 q0Var5, t1.q0 q0Var6, t1.q0 q0Var7, t1.q0 q0Var8, t1.q0 q0Var9, g7 g7Var, int i12, t1.j0 j0Var) {
        super(1);
        this.f10663i = q0Var;
        this.f10664r = i10;
        this.f10665s = i11;
        this.f10666t = q0Var2;
        this.f10667u = q0Var3;
        this.f10668v = q0Var4;
        this.w = q0Var5;
        this.f10669x = q0Var6;
        this.f10670y = q0Var7;
        this.f10671z = q0Var8;
        this.A = q0Var9;
        this.B = g7Var;
        this.C = i12;
        this.D = j0Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        boolean z3;
        t1.p0 p0Var = (t1.p0) obj;
        g7 g7Var = this.B;
        boolean z10 = g7Var.f10702a;
        kotlin.jvm.internal.l.f("$this$layout", p0Var);
        t1.q0 q0Var = this.f10671z;
        t1.q0 q0Var2 = this.f10666t;
        t1.j0 j0Var = this.D;
        t1.q0 q0Var3 = this.A;
        t1.q0 q0Var4 = this.f10670y;
        t1.q0 q0Var5 = this.f10669x;
        t1.q0 q0Var6 = this.w;
        t1.q0 q0Var7 = this.f10668v;
        t1.q0 q0Var8 = this.f10667u;
        int i10 = this.f10665s;
        int i11 = this.f10664r;
        t1.q0 q0Var9 = this.f10663i;
        if (q0Var9 != null) {
            int i12 = q0Var9.f16309r;
            int i13 = this.C + i12;
            float f9 = g7Var.f10703b;
            float fA = j0Var.a();
            float f10 = e7.f10614a;
            t1.p0.e(q0Var, q2.i.f13744b, 0.0f);
            float f11 = a7.f10399b;
            int i14 = i10 - (q0Var3 != null ? q0Var3.f16309r : 0);
            if (q0Var7 != null) {
                t1.p0.g(p0Var, q0Var7, 0, gh.a.z((1 + 0.0f) * ((i14 - q0Var7.f16309r) / 2.0f)));
            }
            if (q0Var6 != null) {
                t1.p0.g(p0Var, q0Var6, i11 - q0Var6.f16308i, gh.a.z((1 + 0.0f) * ((i14 - q0Var6.f16309r) / 2.0f)));
            }
            t1.p0.g(p0Var, q0Var9, q0Var7 != null ? q0Var7.f16308i : 0, (z10 ? gh.a.z((1 + 0.0f) * ((i14 - q0Var9.f16309r) / 2.0f)) : gh.a.z(a7.f10399b * fA)) - gh.a.z((r2 - r6) * f9));
            if (q0Var5 != null) {
                t1.p0.g(p0Var, q0Var5, q0Var7 != null ? q0Var7.f16308i : 0, i13);
            }
            if (q0Var4 != null) {
                t1.p0.g(p0Var, q0Var4, (i11 - (q0Var6 != null ? q0Var6.f16308i : 0)) - q0Var4.f16308i, i13);
            }
            int i15 = (q0Var7 != null ? q0Var7.f16308i : 0) + (q0Var5 != null ? q0Var5.f16308i : 0);
            t1.p0.g(p0Var, q0Var2, i15, i13);
            if (q0Var8 != null) {
                t1.p0.g(p0Var, q0Var8, i15, i13);
            }
            if (q0Var3 != null) {
                t1.p0.g(p0Var, q0Var3, 0, i14);
            }
        } else {
            float fA2 = j0Var.a();
            y.m0 m0Var = g7Var.f10704c;
            float f12 = e7.f10614a;
            t1.p0.e(q0Var, q2.i.f13744b, 0.0f);
            float f13 = a7.f10399b;
            int i16 = i10 - (q0Var3 != null ? q0Var3.f16309r : 0);
            int iZ = gh.a.z(m0Var.c() * fA2);
            if (q0Var7 != null) {
                t1.p0.g(p0Var, q0Var7, 0, gh.a.z((1 + 0.0f) * ((i16 - q0Var7.f16309r) / 2.0f)));
            }
            if (q0Var6 != null) {
                t1.p0.g(p0Var, q0Var6, i11 - q0Var6.f16308i, gh.a.z((1 + 0.0f) * ((i16 - q0Var6.f16309r) / 2.0f)));
            }
            if (q0Var5 != null) {
                z3 = z10;
                t1.p0.g(p0Var, q0Var5, q0Var7 != null ? q0Var7.f16308i : 0, e7.d(z3, i16, iZ, q0Var5));
            } else {
                z3 = z10;
            }
            if (q0Var4 != null) {
                t1.p0.g(p0Var, q0Var4, (i11 - (q0Var6 != null ? q0Var6.f16308i : 0)) - q0Var4.f16308i, e7.d(z3, i16, iZ, q0Var4));
            }
            int i17 = (q0Var7 != null ? q0Var7.f16308i : 0) + (q0Var5 != null ? q0Var5.f16308i : 0);
            t1.p0.g(p0Var, q0Var2, i17, e7.d(z3, i16, iZ, q0Var2));
            if (q0Var8 != null) {
                t1.p0.g(p0Var, q0Var8, i17, e7.d(z3, i16, iZ, q0Var8));
            }
            if (q0Var3 != null) {
                t1.p0.g(p0Var, q0Var3, 0, i16);
            }
        }
        return qg.o.f13926a;
    }
}
