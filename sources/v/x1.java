package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends wg.h implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18324s;

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        x1 x1Var = new x1(cVar);
        x1Var.f18324s = obj;
        return x1Var;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x1) create((q1.a0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f18323r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.work.v.B(obj);
            return obj;
        }
        androidx.work.v.B(obj);
        q1.a0 a0Var = (q1.a0) this.f18324s;
        this.f18323r = 1;
        Object objE = b2.e(a0Var, q1.h.f13677r, this);
        return objE == aVar ? aVar : objE;
    }
}
