package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17394i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f17396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x.n f17397t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, x.n nVar, ug.c cVar2, int i10) {
        super(2, cVar2);
        this.f17394i = i10;
        this.f17396s = cVar;
        this.f17397t = nVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f17394i) {
            case 0:
                return new b(this.f17396s, this.f17397t, cVar, 0);
            default:
                return new b(this.f17396s, this.f17397t, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        oh.w wVar = (oh.w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f17394i) {
        }
        return ((b) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17394i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f17395r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    x.l lVar = this.f17396s.F;
                    this.f17395r = 1;
                    if (lVar.b(this.f17397t, this) == aVar) {
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
                int i11 = this.f17395r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    x.l lVar2 = this.f17396s.F;
                    x.o oVar = new x.o(this.f17397t);
                    this.f17395r = 1;
                    if (lVar2.b(oVar, this) == aVar2) {
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
