package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x.n f17491i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.a f17493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x.l f17495u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a f17496v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(eh.a aVar, long j, x.l lVar, a aVar2, ug.c cVar) {
        super(2, cVar);
        this.f17493s = aVar;
        this.f17494t = j;
        this.f17495u = lVar;
        this.f17496v = aVar2;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new q(this.f17493s, this.f17494t, this.f17495u, this.f17496v, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        x.n nVar;
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f17492r;
        if (i10 == 0) {
            androidx.work.v.B(obj);
            if (((Boolean) this.f17493s.invoke()).booleanValue()) {
                long j = x.f17537a;
                this.f17492r = 1;
                if (oh.x.h(j, this) != aVar) {
                }
                return aVar;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = this.f17491i;
                androidx.work.v.B(obj);
                this.f17496v.f17389b = nVar;
                return qg.o.f13926a;
            }
            androidx.work.v.B(obj);
        }
        x.n nVar2 = new x.n(this.f17494t);
        this.f17491i = nVar2;
        this.f17492r = 2;
        if (this.f17495u.b(nVar2, this) != aVar) {
            nVar = nVar2;
            this.f17496v.f17389b = nVar;
            return qg.o.f13926a;
        }
        return aVar;
    }
}
