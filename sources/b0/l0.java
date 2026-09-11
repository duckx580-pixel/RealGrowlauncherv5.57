package b0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2460i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g0 f2461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2462s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(g0 g0Var, int i10, ug.c cVar) {
        super(2, cVar);
        this.f2461r = g0Var;
        this.f2462s = i10;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new l0(this.f2461r, this.f2462s, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f2460i;
        if (i10 == 0) {
            androidx.work.v.B(obj);
            this.f2460i = 1;
            if (this.f2461r.b(this.f2462s, this) == aVar) {
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
