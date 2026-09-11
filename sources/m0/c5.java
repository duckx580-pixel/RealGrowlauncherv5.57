package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10480i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f10481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f10482s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5(float f9, Object obj, int i10) {
        super(1);
        this.f10480i = i10;
        this.f10481r = f9;
        this.f10482s = obj;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f10480i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                if (fFloatValue != this.f10481r) {
                    ((eh.c) this.f10482s).invoke(Float.valueOf(fFloatValue));
                }
                break;
            case 1:
                long j = ((f1.f) obj).f5994a;
                float fD = f1.f.d(j);
                float f9 = this.f10481r;
                float f10 = fD * f9;
                float fB = f1.f.b(j) * f9;
                o0.s0 s0Var = (o0.s0) this.f10482s;
                if (f1.f.d(((f1.f) s0Var.getValue()).f5994a) != f10 || f1.f.b(((f1.f) s0Var.getValue()).f5994a) != fB) {
                    s0Var.setValue(new f1.f(a.a.h(f10, fB)));
                }
                break;
            case 2:
                v1.e0 e0Var = (v1.e0) obj;
                kotlin.jvm.internal.l.f("$this$drawWithContent", e0Var);
                i1.b bVar = e0Var.f18385i;
                e0Var.b();
                float f11 = this.f10481r;
                if (!q2.e.a(f11, 0.0f)) {
                    float fA = bVar.a() * f11;
                    float fB2 = f1.f.b(bVar.e()) - (fA / 2);
                    i1.d.t0(e0Var, ((u.p) this.f10482s).f17482b, vd.a.b(0.0f, fB2), vd.a.b(f1.f.d(bVar.e()), fB2), fA, 0.0f, 496);
                }
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                t.f1 f1Var = (t.f1) this.f10482s;
                if (!f1Var.d()) {
                    f1Var.e(jLongValue, this.f10481r);
                }
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(t.f1 f1Var, float f9) {
        super(1);
        this.f10480i = 3;
        this.f10482s = f1Var;
        this.f10481r = f9;
    }
}
