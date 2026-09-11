package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends wg.i implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ long f18126i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c1 f18127r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, ug.c cVar) {
        super(3, cVar);
        this.f18127r = c1Var;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((q2.p) obj2).f13762a;
        b1 b1Var = new b1(this.f18127r, (ug.c) obj3);
        b1Var.f18126i = j;
        qg.o oVar = qg.o.f13926a;
        b1Var.invokeSuspend(oVar);
        return oVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        androidx.work.v.B(obj);
        long j = this.f18126i;
        c1 c1Var = this.f18127r;
        oh.x.s(c1Var.G.c(), null, 0, new h0.z(c1Var, j, null, 4), 3);
        return qg.o.f13926a;
    }
}
