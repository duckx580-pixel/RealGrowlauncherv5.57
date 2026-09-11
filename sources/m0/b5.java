package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10429i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10432t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float[] f10433u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10434v;
    public final /* synthetic */ kh.a w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(o0.s0 s0Var, o0.s0 s0Var2, o0.s0 s0Var3, o0.s0 s0Var4, float[] fArr, o0.s0 s0Var5, kh.a aVar) {
        super(1);
        this.f10429i = s0Var;
        this.f10430r = s0Var2;
        this.f10431s = s0Var3;
        this.f10432t = s0Var4;
        this.f10433u = fArr;
        this.f10434v = s0Var5;
        this.w = aVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        Float fValueOf;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) this.f10429i.getValue()).floatValue();
        o0.s0 s0Var = this.f10430r;
        float f9 = 2;
        float fMax = Math.max(fFloatValue2 - (((Number) s0Var.getValue()).floatValue() / f9), 0.0f);
        float fMin = Math.min(((Number) s0Var.getValue()).floatValue() / f9, fMax);
        o0.s0 s0Var2 = this.f10431s;
        float fFloatValue3 = ((Number) s0Var2.getValue()).floatValue() + fFloatValue;
        o0.s0 s0Var3 = this.f10432t;
        s0Var2.setValue(Float.valueOf(((Number) s0Var3.getValue()).floatValue() + fFloatValue3));
        s0Var3.setValue(Float.valueOf(0.0f));
        float fFloatValue4 = ((Number) s0Var2.getValue()).floatValue();
        float[] fArr = this.f10433u;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f10 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f10);
            } else {
                float fAbs = Math.abs(xd.c.p(fMin, fMax, f10) - fFloatValue4);
                kh.c it = new kh.d(1, length, 1).iterator();
                while (it.f9626s) {
                    float f11 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(xd.c.p(fMin, fMax, f11) - fFloatValue4);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f10 = f11;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f10);
            }
        }
        if (fValueOf != null) {
            fFloatValue4 = xd.c.p(fMin, fMax, fValueOf.floatValue());
        }
        eh.c cVar = (eh.c) this.f10434v.getValue();
        kh.a aVar = this.w;
        float f12 = fMax - fMin;
        cVar.invoke(Float.valueOf(xd.c.p(aVar.f9619a, aVar.f9620b, gh.a.d(f12 == 0.0f ? 0.0f : (fFloatValue4 - fMin) / f12, 0.0f, 1.0f))));
        return qg.o.f13926a;
    }
}
