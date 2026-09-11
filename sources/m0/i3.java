package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10777i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f10782v;
    public final /* synthetic */ int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f10784y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f10785z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(t1.q0 q0Var, t1.q0 q0Var2, int i10, int i11, t1.q0 q0Var3, int i12, int i13, int i14, int i15, int i16) {
        super(1);
        this.f10777i = i16;
        this.f10778r = q0Var;
        this.f10779s = q0Var2;
        this.f10780t = i10;
        this.f10781u = i11;
        this.f10782v = q0Var3;
        this.w = i12;
        this.f10783x = i13;
        this.f10784y = i14;
        this.f10785z = i15;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f10777i) {
            case 0:
                t1.p0 p0Var = (t1.p0) obj;
                kotlin.jvm.internal.l.f("$this$layout", p0Var);
                t1.q0 q0Var = this.f10778r;
                if (q0Var != null) {
                    t1.p0.g(p0Var, q0Var, (this.f10784y - q0Var.f16308i) / 2, (this.f10785z - q0Var.f16309r) / 2);
                }
                t1.p0.g(p0Var, this.f10779s, this.f10780t, this.f10781u);
                t1.p0.g(p0Var, this.f10782v, this.w, this.f10783x);
                break;
            default:
                t1.p0 p0Var2 = (t1.p0) obj;
                kotlin.jvm.internal.l.f("$this$layout", p0Var2);
                t1.q0 q0Var2 = this.f10778r;
                if (q0Var2 != null) {
                    t1.p0.g(p0Var2, q0Var2, (this.f10784y - q0Var2.f16308i) / 2, (this.f10785z - q0Var2.f16309r) / 2);
                }
                t1.p0.g(p0Var2, this.f10779s, this.f10780t, this.f10781u);
                t1.p0.g(p0Var2, this.f10782v, this.w, this.f10783x);
                break;
        }
        return qg.o.f13926a;
    }
}
