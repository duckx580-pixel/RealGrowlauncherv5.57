package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h5 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10739i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f10741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10743u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0.d2 f10744v;
    public final /* synthetic */ th.d w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v.m0 f10745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10746y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(boolean z3, int i10, o0.s0 s0Var, o0.d2 d2Var, th.d dVar, v.m0 m0Var, o0.s0 s0Var2, ug.c cVar) {
        super(2, cVar);
        this.f10741s = z3;
        this.f10742t = i10;
        this.f10743u = s0Var;
        this.f10744v = d2Var;
        this.w = dVar;
        this.f10745x = m0Var;
        this.f10746y = s0Var2;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        h5 h5Var = new h5(this.f10741s, this.f10742t, this.f10743u, this.f10744v, this.w, this.f10745x, this.f10746y, cVar);
        h5Var.f10740r = obj;
        return h5Var;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h5) create((q1.b0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f10739i;
        if (i10 == 0) {
            androidx.work.v.B(obj);
            q1.b0 b0Var = (q1.b0) this.f10740r;
            f5 f5Var = new f5(this.f10741s, this.f10742t, this.f10743u, this.f10744v, null);
            b0.m0 m0Var = new b0.m0(this.w, this.f10745x, this.f10746y);
            this.f10739i = 1;
            if (v.b2.d(b0Var, f5Var, m0Var, this, 3) == aVar) {
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
