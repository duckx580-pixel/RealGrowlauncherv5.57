package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends wg.i implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17519i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ v.x0 f17521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ long f17522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f17523u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(d dVar, ug.c cVar, int i10) {
        super(3, cVar);
        this.f17519i = i10;
        this.f17523u = dVar;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v.x0 x0Var = (v.x0) obj;
        f1.c cVar = (f1.c) obj2;
        switch (this.f17519i) {
            case 0:
                long j = cVar.f5977a;
                t tVar = new t((u) this.f17523u, (ug.c) obj3, 0);
                tVar.f17521s = x0Var;
                tVar.f17522t = j;
                return tVar.invokeSuspend(qg.o.f13926a);
            default:
                long j10 = cVar.f5977a;
                t tVar2 = new t((b0) this.f17523u, (ug.c) obj3, 1);
                tVar2.f17521s = x0Var;
                tVar2.f17522t = j10;
                return tVar2.invokeSuspend(qg.o.f13926a);
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17519i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f17520r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    v.x0 x0Var = this.f17521s;
                    long j = this.f17522t;
                    u uVar = (u) this.f17523u;
                    if (uVar.F) {
                        this.f17520r = 1;
                        if (uVar.H0(x0Var, j, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
            default:
                vg.a aVar2 = vg.a.f18663i;
                int i11 = this.f17520r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    v.x0 x0Var2 = this.f17521s;
                    long j10 = this.f17522t;
                    b0 b0Var = (b0) this.f17523u;
                    if (b0Var.F) {
                        this.f17520r = 1;
                        if (b0Var.H0(x0Var2, j10, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
        }
    }
}
