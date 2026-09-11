package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends wg.i implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16475i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ rh.i f16476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0 f16478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f16479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public wh.d f16480v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ug.c cVar, p0 p0Var, u uVar) {
        super(3, cVar);
        this.f16478t = p0Var;
        this.f16479u = uVar;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e0 e0Var = new e0((ug.c) obj3, this.f16478t, this.f16479u);
        e0Var.f16476r = (rh.i) obj;
        e0Var.f16477s = obj2;
        return e0Var.invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rh.i iVar;
        int iIntValue;
        q0 q0Var;
        wh.d dVar;
        rh.v0 v0Var;
        rh.h uVar;
        u uVar2 = this.f16479u;
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f16475i;
        qg.o oVar = qg.o.f13926a;
        p0 p0Var = this.f16478t;
        try {
            if (i10 == 0) {
                androidx.work.v.B(obj);
                iVar = this.f16476r;
                iIntValue = ((Number) this.f16477s).intValue();
                q0Var = p0Var.f16606h;
                dVar = q0Var.f16613a;
                this.f16476r = iVar;
                this.f16477s = q0Var;
                this.f16480v = dVar;
                this.w = iIntValue;
                this.f16475i = 1;
                if (dVar.c(this) != aVar) {
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    androidx.work.v.B(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iIntValue = this.w;
            dVar = this.f16480v;
            q0Var = (q0) this.f16477s;
            iVar = this.f16476r;
            androidx.work.v.B(obj);
            n7.e eVar = q0Var.f16614b.f16627h;
            if (kotlin.jvm.internal.l.a(eVar.p(uVar2), r.f16615b)) {
                uVar = new a6.i(1, new m[0]);
            } else {
                if (!(eVar.p(uVar2) instanceof p)) {
                    eVar.H(uVar2, r.f16616c);
                }
                dVar.d(null);
                u5.n nVar = (u5.n) p0Var.f16603e.f17063i;
                int iOrdinal = uVar2.ordinal();
                if (iOrdinal == 1) {
                    v0Var = ((n) nVar.f17675a).f16584b;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalArgumentException("invalid load type for hints");
                    }
                    v0Var = ((n) nVar.f17676b).f16584b;
                }
                uVar = new rh.u(new rh.u(v0Var, iIntValue == 0 ? 0 : 1, 0), iIntValue, 1);
            }
            this.f16476r = null;
            this.f16477s = null;
            this.f16480v = null;
            this.f16475i = 2;
            if (iVar instanceof rh.n1) {
                throw ((rh.n1) iVar).f14790i;
            }
            Object objCollect = uVar.collect(iVar, this);
            if (objCollect != aVar) {
                objCollect = oVar;
            }
            return objCollect == aVar ? aVar : oVar;
        } finally {
            dVar.d(null);
        }
    }
}
