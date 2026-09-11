package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w0.a f11508i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d2.x f11509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f11510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0 f11511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f11512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11513v;
    public final /* synthetic */ float w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y.m0 f11514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f11515y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(w0.a aVar, d2.x xVar, long j, x0 x0Var, boolean z3, int i10, float f9, y.m0 m0Var, int i11) {
        super(2);
        this.f11508i = aVar;
        this.f11509r = xVar;
        this.f11510s = j;
        this.f11511t = x0Var;
        this.f11512u = z3;
        this.f11513v = i10;
        this.w = f9;
        this.f11514x = m0Var;
        this.f11515y = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
            oVar.P();
        } else {
            oVar.U(5136811);
            boolean z3 = this.f11512u;
            x0 x0Var = this.f11511t;
            long j = ((g1.t) k0.g.c(z3 ? x0Var.f11423c : x0Var.f11427g, oVar, false)).f6918a;
            oVar.U(96182905);
            long j10 = ((g1.t) k0.g.c(z3 ? x0Var.f11424d : x0Var.f11428h, oVar, false)).f6918a;
            int i10 = this.f11513v;
            int i11 = i10 >> 9;
            int i12 = ((i10 >> 6) & 458752) | (i11 & 7168) | (i11 & 14) | 24576 | (i11 & R.styleable.AppCompatTheme_windowActionBarOverlay) | (i11 & 896);
            int i13 = this.f11515y << 18;
            d1.c(this.f11508i, this.f11509r, this.f11510s, j, j10, this.w, this.f11514x, oVar, i12 | (234881024 & i13) | (i13 & 1879048192));
        }
        return qg.o.f13926a;
    }
}
