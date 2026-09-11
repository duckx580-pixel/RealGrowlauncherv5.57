package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16617i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f16618r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, ug.c cVar, int i10) {
        super(2, cVar);
        this.f16617i = i10;
        this.f16618r = s0Var;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f16617i) {
            case 0:
                return new r0(this.f16618r, cVar, 0);
            default:
                return new r0(this.f16618r, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        rh.i iVar = (rh.i) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f16617i) {
            case 0:
                r0 r0Var = (r0) create(iVar, cVar);
                qg.o oVar = qg.o.f13926a;
                r0Var.invokeSuspend(oVar);
                return oVar;
            default:
                r0 r0Var2 = (r0) create(iVar, cVar);
                qg.o oVar2 = qg.o.f13926a;
                r0Var2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f16617i;
        qg.o oVar = qg.o.f13926a;
        s0 s0Var = this.f16618r;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                androidx.work.v.B(obj);
                s0Var.f16625f.l(new Integer(0));
                break;
            default:
                vg.a aVar2 = vg.a.f18663i;
                androidx.work.v.B(obj);
                s0Var.f16624e.l(new Integer(0));
                break;
        }
        return oVar;
    }
}
