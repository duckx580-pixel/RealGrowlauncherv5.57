package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f14735i;

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        h0 h0Var = new h0(2, cVar);
        h0Var.f14735i = ((Number) obj).intValue();
        return h0Var;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create(Integer.valueOf(((Number) obj).intValue()), (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        androidx.work.v.B(obj);
        return Boolean.valueOf(this.f14735i > 0);
    }
}
