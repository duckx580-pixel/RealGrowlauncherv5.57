package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10561i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f10563s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f10564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f10565u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f10566v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(float f9, t.i iVar, kotlin.jvm.internal.u uVar, ug.c cVar) {
        super(2, cVar);
        this.f10561i = 3;
        this.f10564t = f9;
        this.f10566v = iVar;
        this.f10565u = uVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f10561i) {
            case 0:
                return new e0((t.c) this.f10563s, (f0) this.f10566v, this.f10564t, (x.j) this.f10565u, cVar, 0);
            case 1:
                return new e0((t.c) this.f10563s, (y0) this.f10566v, this.f10564t, (x.j) this.f10565u, cVar, 1);
            case 2:
                return new e0((t.c) this.f10563s, (w1) this.f10566v, this.f10564t, (x.j) this.f10565u, cVar, 2);
            default:
                e0 e0Var = new e0(this.f10564t, (t.i) this.f10566v, (kotlin.jvm.internal.u) this.f10565u, cVar);
                e0Var.f10563s = obj;
                return e0Var;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10561i) {
            case 0:
                return ((e0) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 1:
                return ((e0) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 2:
                return ((e0) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            default:
                return ((e0) create((v.a1) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10561i) {
            case 0:
                t.c cVar = (t.c) this.f10563s;
                f0 f0Var = (f0) this.f10566v;
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f10562r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    float f9 = ((q2.e) cVar.f16026e.getValue()).f13735i;
                    x.j nVar = q2.e.a(f9, f0Var.f10617b) ? new x.n(f1.c.f5973b) : q2.e.a(f9, f0Var.f10619d) ? new x.h() : q2.e.a(f9, f0Var.f10618c) ? new x.d() : null;
                    x.j jVar = (x.j) this.f10565u;
                    this.f10562r = 1;
                    if (r1.a(cVar, this.f10564t, nVar, jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
            case 1:
                t.c cVar2 = (t.c) this.f10563s;
                y0 y0Var = (y0) this.f10566v;
                vg.a aVar2 = vg.a.f18663i;
                int i11 = this.f10562r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    float f10 = ((q2.e) cVar2.f16026e.getValue()).f13735i;
                    x.j nVar2 = q2.e.a(f10, y0Var.f11463b) ? new x.n(f1.c.f5973b) : q2.e.a(f10, y0Var.f11465d) ? new x.h() : q2.e.a(f10, y0Var.f11464c) ? new x.d() : q2.e.a(f10, y0Var.f11466e) ? new x.b() : null;
                    x.j jVar2 = (x.j) this.f10565u;
                    this.f10562r = 1;
                    if (r1.a(cVar2, this.f10564t, nVar2, jVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
            case 2:
                t.c cVar3 = (t.c) this.f10563s;
                w1 w1Var = (w1) this.f10566v;
                vg.a aVar3 = vg.a.f18663i;
                int i12 = this.f10562r;
                if (i12 == 0) {
                    androidx.work.v.B(obj);
                    float f11 = ((q2.e) cVar3.f16026e.getValue()).f13735i;
                    x.j nVar3 = q2.e.a(f11, w1Var.f11384b) ? new x.n(f1.c.f5973b) : q2.e.a(f11, w1Var.f11386d) ? new x.h() : q2.e.a(f11, w1Var.f11385c) ? new x.d() : null;
                    x.j jVar3 = (x.j) this.f10565u;
                    this.f10562r = 1;
                    if (r1.a(cVar3, this.f10564t, nVar3, jVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
            default:
                vg.a aVar4 = vg.a.f18663i;
                int i13 = this.f10562r;
                qg.o oVar = qg.o.f13926a;
                if (i13 == 0) {
                    androidx.work.v.B(obj);
                    v.a1 a1Var = (v.a1) this.f10563s;
                    t.i iVar = (t.i) this.f10566v;
                    a0.g gVar = new a0.g(16, (kotlin.jvm.internal.u) this.f10565u, a1Var);
                    this.f10562r = 1;
                    t.j1 j1Var = t.k1.f16126a;
                    Float f12 = new Float(0.0f);
                    Float f13 = new Float(this.f10564t);
                    t.k kVar = new t.k(new Float(0.0f).floatValue());
                    Object objB = t.d.b(new t.j(j1Var, f12, kVar, 56), new t.x0(iVar, j1Var, f12, f13, kVar), Long.MIN_VALUE, new t.q0(gVar), this);
                    if (objB != aVar4) {
                        objB = oVar;
                    }
                    if (objB != aVar4) {
                        objB = oVar;
                    }
                    if (objB == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(t.c cVar, Object obj, float f9, x.j jVar, ug.c cVar2, int i10) {
        super(2, cVar2);
        this.f10561i = i10;
        this.f10563s = cVar;
        this.f10566v = obj;
        this.f10564t = f9;
        this.f10565u = jVar;
    }
}
