package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11388i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f11389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11390s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(long j, y.m0 m0Var) {
        super(1);
        this.f11389r = j;
        this.f11390s = m0Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f11388i) {
            case 0:
                v1.e0 e0Var = (v1.e0) obj;
                kotlin.jvm.internal.l.f("$this$drawWithContent", e0Var);
                long j = this.f11389r;
                float fD = f1.f.d(j);
                if (fD > 0.0f) {
                    float f9 = x3.f11437a;
                    i1.b bVar = e0Var.f18385i;
                    float fW = e0Var.W(f9);
                    float fW2 = e0Var.W(((y.m0) this.f11390s).b(e0Var.getLayoutDirection())) - fW;
                    float f10 = 2;
                    float fD2 = (fW * f10) + fD + fW2;
                    q2.l layoutDirection = e0Var.getLayoutDirection();
                    int[] iArr = v3.f11360a;
                    float fD3 = iArr[layoutDirection.ordinal()] == 1 ? f1.f.d(bVar.e()) - fD2 : fW2 < 0.0f ? 0.0f : fW2;
                    if (iArr[e0Var.getLayoutDirection().ordinal()] == 1) {
                        fD2 = f1.f.d(bVar.e()) - (fW2 >= 0.0f ? fW2 : 0.0f);
                    }
                    float fB = f1.f.b(j);
                    float f11 = (-fB) / f10;
                    float f12 = fB / f10;
                    com.google.android.gms.internal.measurement.j3 j3Var = bVar.f7986r;
                    long jN = j3Var.n();
                    j3Var.j().save();
                    ((com.google.android.gms.internal.measurement.j3) ((lc.n) j3Var.f3836r).f9915r).j().m(fD3, f11, fD2, f12, 0);
                    e0Var.b();
                    j3Var.j().p();
                    j3Var.t(jN);
                } else {
                    e0Var.b();
                }
                break;
            default:
                t1.p0.f((t1.p0) obj, (t1.q0) this.f11390s, this.f11389r);
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(t1.q0 q0Var, long j) {
        super(1);
        this.f11390s = q0Var;
        this.f11389r = j;
    }
}
