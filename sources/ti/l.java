package ti;

import androidx.work.v;
import o0.s0;
import q1.b0;
import q1.q;
import v.c0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17303i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.e f17306t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s0 f17307u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s0 f17308v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(eh.e eVar, s0 s0Var, s0 s0Var2, ug.c cVar, int i10) {
        super(2, cVar);
        this.f17303i = i10;
        this.f17306t = eVar;
        this.f17307u = s0Var;
        this.f17308v = s0Var2;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f17303i) {
            case 0:
                l lVar = new l(this.f17306t, this.f17307u, this.f17308v, cVar, 0);
                lVar.f17305s = obj;
                return lVar;
            default:
                l lVar2 = new l(this.f17306t, this.f17307u, this.f17308v, cVar, 1);
                lVar2.f17305s = obj;
                return lVar2;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f17303i) {
        }
        return ((l) create(b0Var, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17303i) {
            case 0:
                b0 b0Var = (b0) this.f17305s;
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f17304r;
                if (i10 == 0) {
                    v.B(obj);
                    final int i11 = 0;
                    final eh.e eVar = this.f17306t;
                    final s0 s0Var = this.f17307u;
                    final s0 s0Var2 = this.f17308v;
                    eh.e eVar2 = new eh.e() { // from class: ti.k
                        @Override // eh.e
                        public final Object invoke(Object obj2, Object obj3) {
                            q qVar = (q) obj2;
                            f1.c cVar = (f1.c) obj3;
                            switch (i11) {
                                case 0:
                                    qVar.a();
                                    s0 s0Var3 = s0Var;
                                    s0Var3.setValue(Float.valueOf(f1.c.d(cVar.f5977a) + ((Number) s0Var3.getValue()).floatValue()));
                                    s0 s0Var4 = s0Var2;
                                    s0Var4.setValue(Float.valueOf(f1.c.e(cVar.f5977a) + ((Number) s0Var4.getValue()).floatValue()));
                                    eVar.invoke(Integer.valueOf((int) ((Number) s0Var3.getValue()).floatValue()), Integer.valueOf((int) ((Number) s0Var4.getValue()).floatValue()));
                                    break;
                                default:
                                    qVar.a();
                                    s0 s0Var5 = s0Var;
                                    s0Var5.setValue(Float.valueOf(f1.c.d(cVar.f5977a) + ((Number) s0Var5.getValue()).floatValue()));
                                    s0 s0Var6 = s0Var2;
                                    s0Var6.setValue(Float.valueOf(f1.c.e(cVar.f5977a) + ((Number) s0Var6.getValue()).floatValue()));
                                    eVar.invoke(Integer.valueOf((int) ((Number) s0Var5.getValue()).floatValue()), Integer.valueOf((int) ((Number) s0Var6.getValue()).floatValue()));
                                    break;
                            }
                            return qg.o.f13926a;
                        }
                    };
                    this.f17305s = null;
                    this.f17304r = 1;
                    if (c0.c(b0Var, eVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.B(obj);
                }
                return qg.o.f13926a;
            default:
                b0 b0Var2 = (b0) this.f17305s;
                vg.a aVar2 = vg.a.f18663i;
                int i12 = this.f17304r;
                if (i12 == 0) {
                    v.B(obj);
                    final int i13 = 1;
                    final eh.e eVar3 = this.f17306t;
                    final s0 s0Var3 = this.f17307u;
                    final s0 s0Var4 = this.f17308v;
                    eh.e eVar4 = new eh.e() { // from class: ti.k
                        @Override // eh.e
                        public final Object invoke(Object obj2, Object obj3) {
                            q qVar = (q) obj2;
                            f1.c cVar = (f1.c) obj3;
                            switch (i13) {
                                case 0:
                                    qVar.a();
                                    s0 s0Var32 = s0Var3;
                                    s0Var32.setValue(Float.valueOf(f1.c.d(cVar.f5977a) + ((Number) s0Var32.getValue()).floatValue()));
                                    s0 s0Var42 = s0Var4;
                                    s0Var42.setValue(Float.valueOf(f1.c.e(cVar.f5977a) + ((Number) s0Var42.getValue()).floatValue()));
                                    eVar3.invoke(Integer.valueOf((int) ((Number) s0Var32.getValue()).floatValue()), Integer.valueOf((int) ((Number) s0Var42.getValue()).floatValue()));
                                    break;
                                default:
                                    qVar.a();
                                    s0 s0Var5 = s0Var3;
                                    s0Var5.setValue(Float.valueOf(f1.c.d(cVar.f5977a) + ((Number) s0Var5.getValue()).floatValue()));
                                    s0 s0Var6 = s0Var4;
                                    s0Var6.setValue(Float.valueOf(f1.c.e(cVar.f5977a) + ((Number) s0Var6.getValue()).floatValue()));
                                    eVar3.invoke(Integer.valueOf((int) ((Number) s0Var5.getValue()).floatValue()), Integer.valueOf((int) ((Number) s0Var6.getValue()).floatValue()));
                                    break;
                            }
                            return qg.o.f13926a;
                        }
                    };
                    this.f17305s = null;
                    this.f17304r = 1;
                    if (c0.c(b0Var2, eVar4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.B(obj);
                }
                return qg.o.f13926a;
        }
    }
}
