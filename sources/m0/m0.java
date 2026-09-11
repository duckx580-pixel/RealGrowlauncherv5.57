package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10937i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x.k f10939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y0.q f10940t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(x.k kVar, y0.q qVar, ug.c cVar, int i10) {
        super(2, cVar);
        this.f10937i = i10;
        this.f10939s = kVar;
        this.f10940t = qVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f10937i) {
            case 0:
                return new m0(this.f10939s, this.f10940t, cVar, 0);
            default:
                return new m0(this.f10939s, this.f10940t, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        oh.w wVar = (oh.w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f10937i) {
        }
        return ((m0) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10937i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f10938r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    rh.h hVarA = this.f10939s.a();
                    b0 b0Var = new b0(this.f10940t, 1);
                    this.f10938r = 1;
                    if (hVarA.collect(b0Var, this) == aVar) {
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
                int i11 = this.f10938r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    rh.h hVarA2 = this.f10939s.a();
                    b0 b0Var2 = new b0(this.f10940t, 2);
                    this.f10938r = 1;
                    if (hVarA2.collect(b0Var2, this) == aVar2) {
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
