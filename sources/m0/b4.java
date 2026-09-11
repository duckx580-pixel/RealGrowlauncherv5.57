package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f10422i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i1.h f10423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10427v;
    public final /* synthetic */ float w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f10428x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(long j, i1.h hVar, t.d0 d0Var, t.d0 d0Var2, t.d0 d0Var3, t.d0 d0Var4, float f9, long j10) {
        super(1);
        this.f10422i = j;
        this.f10423r = hVar;
        this.f10424s = d0Var;
        this.f10425t = d0Var2;
        this.f10426u = d0Var3;
        this.f10427v = d0Var4;
        this.w = f9;
        this.f10428x = j10;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        float f9;
        i1.d dVar = (i1.d) obj;
        kotlin.jvm.internal.l.f("$this$Canvas", dVar);
        long j = this.f10422i;
        i1.h hVar = this.f10423r;
        h4.d(dVar, 0.0f, 360.0f, j, hVar);
        float fFloatValue = (((Number) this.f10424s.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.f10425t.getValue()).floatValue();
        o0.d2 d2Var = this.f10426u;
        float fAbs = Math.abs(fFloatValue2 - ((Number) d2Var.getValue()).floatValue());
        float fFloatValue3 = ((Number) d2Var.getValue()).floatValue() + ((Number) this.f10427v.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (hVar.f7993c == 0) {
            f9 = 0.0f;
        } else {
            f9 = ((this.w / (h4.f10733c / 2)) * 57.29578f) / 2.0f;
        }
        h4.d(dVar, fFloatValue3 + f9, Math.max(fAbs, 0.1f), this.f10428x, hVar);
        return qg.o.f13926a;
    }
}
