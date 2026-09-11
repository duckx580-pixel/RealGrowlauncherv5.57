package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f5 extends wg.i implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10642i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ v.x0 f10643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ long f10644s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f10645t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10646u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10647v;
    public final /* synthetic */ o0.d2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(boolean z3, int i10, o0.s0 s0Var, o0.d2 d2Var, ug.c cVar) {
        super(3, cVar);
        this.f10645t = z3;
        this.f10646u = i10;
        this.f10647v = s0Var;
        this.w = d2Var;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((f1.c) obj2).f5977a;
        o0.s0 s0Var = this.f10647v;
        o0.d2 d2Var = this.w;
        f5 f5Var = new f5(this.f10645t, this.f10646u, s0Var, d2Var, (ug.c) obj3);
        f5Var.f10643r = (v.x0) obj;
        f5Var.f10644s = j;
        return f5Var.invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f10642i;
        o0.s0 s0Var = this.f10647v;
        try {
            if (i10 == 0) {
                androidx.work.v.B(obj);
                v.x0 x0Var = this.f10643r;
                long j = this.f10644s;
                s0Var.setValue(new Float((this.f10645t ? this.f10646u - f1.c.d(j) : f1.c.d(j)) - ((Number) this.w.getValue()).floatValue()));
                this.f10642i = 1;
                if (x0Var.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.work.v.B(obj);
            }
        } catch (v.o0 unused) {
            s0Var.setValue(new Float(0.0f));
        }
        return qg.o.f13926a;
    }
}
