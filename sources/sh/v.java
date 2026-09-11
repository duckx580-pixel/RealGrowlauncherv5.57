package sh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends wg.c implements rh.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rh.i f15839i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ug.h f15840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ug.h f15842t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ug.c f15843u;

    public v(rh.i iVar, ug.h hVar) {
        super(s.f15836i, ug.i.f17989i);
        this.f15839i = iVar;
        this.f15840r = hVar;
        this.f15841s = ((Number) hVar.n(0, u.f15838i)).intValue();
    }

    @Override // rh.i
    public final Object emit(Object obj, ug.c cVar) {
        try {
            Object objG = g(cVar, obj);
            return objG == vg.a.f18663i ? objG : qg.o.f13926a;
        } catch (Throwable th2) {
            this.f15842t = new p(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object g(ug.c cVar, Object obj) {
        ug.h context = cVar.getContext();
        oh.x.i(context);
        ug.h hVar = this.f15842t;
        if (hVar != context) {
            if (hVar instanceof p) {
                throw new IllegalStateException(nh.i.A("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) hVar).f15834i + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.n(0, new a1.i(9, this))).intValue() != this.f15841s) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f15840r + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f15842t = context;
        }
        this.f15843u = cVar;
        eh.f fVar = x.f15845a;
        rh.i iVar = this.f15839i;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>", iVar);
        Object objInvoke = fVar.invoke(iVar, obj, this);
        if (!kotlin.jvm.internal.l.a(objInvoke, vg.a.f18663i)) {
            this.f15843u = null;
        }
        return objInvoke;
    }

    @Override // wg.a, wg.d
    public final wg.d getCallerFrame() {
        ug.c cVar = this.f15843u;
        if (cVar instanceof wg.d) {
            return (wg.d) cVar;
        }
        return null;
    }

    @Override // wg.c, ug.c
    public final ug.h getContext() {
        ug.h hVar = this.f15842t;
        return hVar == null ? ug.i.f17989i : hVar;
    }

    @Override // wg.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = qg.i.a(obj);
        if (thA != null) {
            this.f15842t = new p(thA, getContext());
        }
        ug.c cVar = this.f15843u;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return vg.a.f18663i;
    }
}
