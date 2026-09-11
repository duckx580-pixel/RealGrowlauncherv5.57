package i2;

import t4.v0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends wg.i implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8007i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8010t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, ug.c cVar, int i10) {
        super(1, cVar);
        this.f8007i = i10;
        this.f8009s = obj;
        this.f8010t = obj2;
    }

    @Override // wg.a
    public final ug.c create(ug.c cVar) {
        switch (this.f8007i) {
            case 0:
                return new f((h) this.f8009s, (j2.b) this.f8010t, cVar, 0);
            default:
                return new f((u4.a) this.f8009s, (v0) this.f8010t, cVar, 1);
        }
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        ug.c cVar = (ug.c) obj;
        switch (this.f8007i) {
        }
        return ((f) create(cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8007i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f8008r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                    return obj;
                }
                androidx.work.v.B(obj);
                h hVar = (h) this.f8009s;
                j2.b bVar = (j2.b) this.f8010t;
                this.f8008r = 1;
                Object objD = hVar.d(bVar, this);
                return objD == aVar ? aVar : objD;
            default:
                v0 v0Var = (v0) this.f8010t;
                u4.a aVar2 = (u4.a) this.f8009s;
                vg.a aVar3 = vg.a.f18663i;
                int i11 = this.f8008r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    cb.f fVar = v0Var.f16645b;
                    aVar2.getClass();
                    rh.h hVar2 = v0Var.f16644a;
                    h0.a0 a0Var = new h0.a0(8, aVar2, v0Var);
                    this.f8008r = 1;
                    if (hVar2.collect(a0Var, this) == aVar3) {
                        return aVar3;
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
