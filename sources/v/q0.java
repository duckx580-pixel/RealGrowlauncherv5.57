package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18251i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q1 f18253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18254t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(q1 q1Var, long j, ug.c cVar, int i10) {
        super(2, cVar);
        this.f18251i = i10;
        this.f18253s = q1Var;
        this.f18254t = j;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f18251i) {
            case 0:
                q0 q0Var = new q0(this.f18253s, this.f18254t, cVar, 0);
                q0Var.f18252r = obj;
                return q0Var;
            default:
                q0 q0Var2 = new q0(this.f18253s, this.f18254t, cVar, 1);
                q0Var2.f18252r = obj;
                return q0Var2;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        a1 a1Var = (a1) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f18251i) {
            case 0:
                q0 q0Var = (q0) create(a1Var, cVar);
                qg.o oVar = qg.o.f13926a;
                q0Var.invokeSuspend(oVar);
                return oVar;
            default:
                q0 q0Var2 = (q0) create(a1Var, cVar);
                qg.o oVar2 = qg.o.f13926a;
                q0Var2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f18251i;
        qg.o oVar = qg.o.f13926a;
        long j = this.f18254t;
        q1 q1Var = this.f18253s;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                androidx.work.v.B(obj);
                q1Var.a((a1) this.f18252r, j, 4);
                break;
            default:
                vg.a aVar2 = vg.a.f18663i;
                androidx.work.v.B(obj);
                q1Var.a((a1) this.f18252r, j, 4);
                break;
        }
        return oVar;
    }
}
