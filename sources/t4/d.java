package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends wg.i implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16463i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, ug.c cVar, int i11) {
        super(i10, cVar);
        this.f16463i = i11;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f16463i) {
            case 0:
                d dVar = new d(3, (ug.c) obj3, 0);
                qg.o oVar = qg.o.f13926a;
                dVar.invokeSuspend(oVar);
                return oVar;
            case 1:
                long j = ((f1.c) obj2).f5977a;
                d dVar2 = new d(3, (ug.c) obj3, 1);
                qg.o oVar2 = qg.o.f13926a;
                dVar2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                long j10 = ((f1.c) obj2).f5977a;
                d dVar3 = new d(3, (ug.c) obj3, 2);
                qg.o oVar3 = qg.o.f13926a;
                dVar3.invokeSuspend(oVar3);
                return oVar3;
            default:
                long j11 = ((f1.c) obj2).f5977a;
                d dVar4 = new d(3, (ug.c) obj3, 3);
                qg.o oVar4 = qg.o.f13926a;
                dVar4.invokeSuspend(oVar4);
                return oVar4;
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f16463i;
        qg.o oVar = qg.o.f13926a;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                androidx.work.v.B(obj);
                break;
            case 1:
                vg.a aVar2 = vg.a.f18663i;
                androidx.work.v.B(obj);
                break;
            case 2:
                vg.a aVar3 = vg.a.f18663i;
                androidx.work.v.B(obj);
                break;
            default:
                vg.a aVar4 = vg.a.f18663i;
                androidx.work.v.B(obj);
                break;
        }
        return oVar;
    }
}
