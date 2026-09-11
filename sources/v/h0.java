package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends wg.i implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18185i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ oh.w f18186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ long f18187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.f f18188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t0 f18189u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(eh.f fVar, t0 t0Var, ug.c cVar) {
        super(3, cVar);
        this.f18188t = fVar;
        this.f18189u = t0Var;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((q2.p) obj2).f13762a;
        h0 h0Var = new h0(this.f18188t, this.f18189u, (ug.c) obj3);
        h0Var.f18186r = (oh.w) obj;
        h0Var.f18187s = j;
        return h0Var.invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f18185i;
        if (i10 == 0) {
            androidx.work.v.B(obj);
            oh.w wVar = this.f18186r;
            long j = this.f18187s;
            Float f9 = new Float(this.f18189u == t0.f18278i ? q2.p.c(j) : q2.p.b(j));
            this.f18185i = 1;
            if (this.f18188t.invoke(wVar, f9, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.work.v.B(obj);
        }
        return qg.o.f13926a;
    }
}
