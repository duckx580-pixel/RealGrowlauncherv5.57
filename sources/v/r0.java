package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18263i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18264r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q1 f18265s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18266t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(q1 q1Var, long j, ug.c cVar, int i10) {
        super(2, cVar);
        this.f18263i = i10;
        this.f18265s = q1Var;
        this.f18266t = j;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f18263i) {
            case 0:
                return new r0(this.f18265s, this.f18266t, cVar, 0);
            default:
                return new r0(this.f18265s, this.f18266t, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        oh.w wVar = (oh.w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f18263i) {
        }
        return ((r0) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f18263i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f18264r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    q1 q1Var = this.f18265s;
                    k1 k1Var = q1Var.f18255a;
                    q0 q0Var = new q0(q1Var, this.f18266t, null, 0);
                    this.f18264r = 1;
                    if (k1Var.d(u.b1.f17399r, q0Var, this) == aVar) {
                        return aVar;
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
                int i11 = this.f18264r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    q1 q1Var2 = this.f18265s;
                    k1 k1Var2 = q1Var2.f18255a;
                    q0 q0Var2 = new q0(q1Var2, this.f18266t, null, 1);
                    this.f18264r = 1;
                    if (k1Var2.d(u.b1.f17399r, q0Var2, this) == aVar2) {
                        return aVar2;
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
