package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10608i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kh.a f10609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f10611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.c f10612u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(boolean z3, kh.a aVar, int i10, float f9, eh.c cVar) {
        super(1);
        this.f10608i = z3;
        this.f10609r = aVar;
        this.f10610s = i10;
        this.f10611t = f9;
        this.f10612u = cVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        b2.j jVar = (b2.j) obj;
        kotlin.jvm.internal.l.f("$this$semantics", jVar);
        boolean z3 = this.f10608i;
        qg.o oVar = qg.o.f13926a;
        if (!z3) {
            lh.j[] jVarArr = b2.t.f2617a;
            jVar.j(b2.r.f2600i, oVar);
        }
        d5 d5Var = new d5(this.f10609r, this.f10610s, this.f10611t, this.f10612u);
        lh.j[] jVarArr2 = b2.t.f2617a;
        jVar.j(b2.i.f2551f, new b2.a(null, d5Var));
        return oVar;
    }
}
