package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18288i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0 f18290s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(x0 x0Var, ug.c cVar, int i10) {
        super(2, cVar);
        this.f18288i = i10;
        this.f18290s = x0Var;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f18288i) {
            case 0:
                return new u1(this.f18290s, cVar, 0);
            case 1:
                return new u1(this.f18290s, cVar, 1);
            default:
                return new u1(this.f18290s, cVar, 2);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        oh.w wVar = (oh.w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f18288i) {
        }
        return ((u1) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f18288i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f18289r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    this.f18289r = 1;
                    if (this.f18290s.c(this) == aVar) {
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
                vg.a aVar2 = vg.a.f18663i;
                int i11 = this.f18289r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    this.f18289r = 1;
                    if (this.f18290s.c(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
            default:
                vg.a aVar3 = vg.a.f18663i;
                int i12 = this.f18289r;
                if (i12 == 0) {
                    androidx.work.v.B(obj);
                    this.f18289r = 1;
                    if (this.f18290s.c(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
        }
    }
}
