package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f10636i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f10639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10640u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10641v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(long j, t.d0 d0Var, t.d0 d0Var2, long j10, t.d0 d0Var3, t.d0 d0Var4) {
        super(1);
        this.f10636i = j;
        this.f10637r = d0Var;
        this.f10638s = d0Var2;
        this.f10639t = j10;
        this.f10640u = d0Var3;
        this.f10641v = d0Var4;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        i1.d dVar = (i1.d) obj;
        kotlin.jvm.internal.l.f("$this$Canvas", dVar);
        float fB = f1.f.b(dVar.e());
        h4.e(dVar, 0.0f, 1.0f, this.f10636i, fB, 0);
        o0.d2 d2Var = this.f10637r;
        float fFloatValue = ((Number) d2Var.getValue()).floatValue();
        o0.d2 d2Var2 = this.f10638s;
        if (fFloatValue - ((Number) d2Var2.getValue()).floatValue() > 0.0f) {
            h4.e(dVar, ((Number) d2Var.getValue()).floatValue(), ((Number) d2Var2.getValue()).floatValue(), this.f10639t, fB, 0);
        }
        o0.d2 d2Var3 = this.f10640u;
        float fFloatValue2 = ((Number) d2Var3.getValue()).floatValue();
        o0.d2 d2Var4 = this.f10641v;
        if (fFloatValue2 - ((Number) d2Var4.getValue()).floatValue() > 0.0f) {
            h4.e(dVar, ((Number) d2Var3.getValue()).floatValue(), ((Number) d2Var4.getValue()).floatValue(), this.f10639t, fB, 0);
        }
        return qg.o.f13926a;
    }
}
