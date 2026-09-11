package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends wg.h implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ oh.w f18333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.c f18334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f18335v;
    public final /* synthetic */ kotlin.jvm.internal.x w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x0 f18336x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y1(oh.w wVar, eh.c cVar, eh.c cVar2, kotlin.jvm.internal.x xVar, x0 x0Var, ug.c cVar3) {
        super(cVar3);
        this.f18333t = wVar;
        this.f18334u = cVar;
        this.f18335v = (kotlin.jvm.internal.m) cVar2;
        this.w = xVar;
        this.f18336x = x0Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        y1 y1Var = new y1(this.f18333t, this.f18334u, this.f18335v, this.w, this.f18336x, cVar);
        y1Var.f18332s = obj;
        return y1Var;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y1) create((q1.a0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f18331r;
        if (i10 == 0) {
            androidx.work.v.B(obj);
            q1.a0 a0Var = (q1.a0) this.f18332s;
            this.f18331r = 1;
            obj = b2.e(a0Var, q1.h.f13677r, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.work.v.B(obj);
        }
        q1.q qVar = (q1.q) obj;
        oh.w wVar = this.f18333t;
        qg.o oVar = qg.o.f13926a;
        x0 x0Var = this.f18336x;
        if (qVar == null) {
            oh.x.s(wVar, null, 0, new v1(x0Var, null, 7), 3);
            this.f18335v.invoke(new f1.c(((q1.q) this.w.f9667i).f13686c));
            return oVar;
        }
        qVar.a();
        oh.x.s(wVar, null, 0, new v1(x0Var, null, 6), 3);
        this.f18334u.invoke(new f1.c(qVar.f13686c));
        return oVar;
    }
}
