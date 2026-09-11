package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16592i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q0 f16593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wh.d f16594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p0 f16595t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16596u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f16597v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, ug.c cVar, int i10) {
        super(2, cVar);
        this.f16592i = i10;
        this.f16597v = p0Var;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f16592i) {
            case 0:
                return new o0(this.f16597v, cVar, 0);
            default:
                return new o0(this.f16597v, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        oh.w wVar = (oh.w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f16592i) {
        }
        return ((o0) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        q0 q0Var;
        wh.d dVar;
        ug.c cVar;
        p0 p0Var2;
        q0 q0Var2;
        wh.d dVar2;
        ug.c cVar2;
        switch (this.f16592i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f16596u;
                try {
                    if (i10 == 0) {
                        androidx.work.v.B(obj);
                        p0Var = this.f16597v;
                        q0Var = p0Var.f16606h;
                        wh.d dVar3 = q0Var.f16613a;
                        this.f16593r = q0Var;
                        this.f16594s = dVar3;
                        this.f16595t = p0Var;
                        this.f16596u = 1;
                        if (dVar3.c(this) == aVar) {
                            return aVar;
                        }
                        dVar = dVar3;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            androidx.work.v.B(obj);
                            return qg.o.f13926a;
                        }
                        p0Var = this.f16595t;
                        dVar = this.f16594s;
                        q0Var = this.f16593r;
                        androidx.work.v.B(obj);
                    }
                    s0 s0Var = q0Var.f16614b;
                    rh.q qVar = new rh.q(new r0(s0Var, cVar, 1), rh.w0.j(s0Var.f16624e));
                    dVar.d(null);
                    this.f16593r = null;
                    this.f16594s = null;
                    this.f16595t = null;
                    this.f16596u = 2;
                    if (p0.a(p0Var, qVar, u.f16638r, this) == aVar) {
                        return aVar;
                    }
                    return qg.o.f13926a;
                } catch (Throwable th2) {
                    dVar.d(null);
                    throw th2;
                }
                cVar = null;
            default:
                vg.a aVar2 = vg.a.f18663i;
                int i11 = this.f16596u;
                try {
                    if (i11 == 0) {
                        androidx.work.v.B(obj);
                        p0Var2 = this.f16597v;
                        q0Var2 = p0Var2.f16606h;
                        wh.d dVar4 = q0Var2.f16613a;
                        this.f16593r = q0Var2;
                        this.f16594s = dVar4;
                        this.f16595t = p0Var2;
                        this.f16596u = 1;
                        if (dVar4.c(this) == aVar2) {
                            return aVar2;
                        }
                        dVar2 = dVar4;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            androidx.work.v.B(obj);
                            return qg.o.f13926a;
                        }
                        p0Var2 = this.f16595t;
                        dVar2 = this.f16594s;
                        q0Var2 = this.f16593r;
                        androidx.work.v.B(obj);
                    }
                    s0 s0Var2 = q0Var2.f16614b;
                    rh.q qVar2 = new rh.q(new r0(s0Var2, cVar2, 0), rh.w0.j(s0Var2.f16625f));
                    dVar2.d(null);
                    this.f16593r = null;
                    this.f16594s = null;
                    this.f16595t = null;
                    this.f16596u = 2;
                    if (p0.a(p0Var2, qVar2, u.f16639s, this) == aVar2) {
                        return aVar2;
                    }
                    return qg.o.f13926a;
                } catch (Throwable th3) {
                    dVar2.d(null);
                    throw th3;
                }
                cVar2 = null;
        }
    }
}
