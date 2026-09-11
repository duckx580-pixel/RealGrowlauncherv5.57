package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16527i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ rh.h f16530t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ wg.i f16531u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(rh.h hVar, eh.f fVar, ug.c cVar, int i10) {
        super(2, cVar);
        this.f16527i = i10;
        switch (i10) {
            case 1:
                this.f16530t = hVar;
                this.f16531u = (wg.i) fVar;
                super(2, cVar);
                break;
            default:
                this.f16530t = hVar;
                this.f16531u = (wg.i) fVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.f, wg.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eh.f, wg.i] */
    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f16527i) {
            case 0:
                j jVar = new j(this.f16530t, this.f16531u, cVar, 0);
                jVar.f16529s = obj;
                return jVar;
            default:
                j jVar2 = new j(this.f16530t, this.f16531u, cVar, 1);
                jVar2.f16529s = obj;
                return jVar2;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16527i) {
            case 0:
                return ((j) create((rh.i) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            default:
                return ((j) create((h1) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [eh.f, wg.i] */
    /* JADX WARN: Type inference failed for: r4v0, types: [eh.f, wg.i] */
    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f16527i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f16528r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    rh.i iVar = (rh.i) this.f16529s;
                    kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                    xVar.f9667i = l.f16561a;
                    rh.y yVar = new rh.y(xVar, (eh.f) this.f16531u, iVar);
                    this.f16528r = 1;
                    if (this.f16530t.collect(yVar, this) == aVar) {
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
                int i11 = this.f16528r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    androidx.work.e eVar = new androidx.work.e((eh.f) this.f16531u, new rh.d0((h1) this.f16529s), (ug.c) null);
                    this.f16528r = 1;
                    if (rh.w0.h(this.f16530t, eVar, this) == aVar2) {
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
