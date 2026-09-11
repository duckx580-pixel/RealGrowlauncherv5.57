package sh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15805i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f15807s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f15808t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ rh.i f15809u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, rh.i iVar, Object obj, ug.c cVar) {
        super(2, cVar);
        this.f15808t = kVar;
        this.f15809u = iVar;
        this.f15807s = obj;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f15805i) {
            case 0:
                return new h(this.f15808t, this.f15809u, this.f15807s, cVar);
            default:
                h hVar = new h(this.f15808t, this.f15809u, cVar);
                hVar.f15807s = obj;
                return hVar;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        oh.w wVar = (oh.w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f15805i) {
        }
        return ((h) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [eh.f, wg.i] */
    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f15805i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f15806r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    ?? r8 = this.f15808t.f15819u;
                    Object obj2 = this.f15807s;
                    this.f15806r = 1;
                    if (r8.invoke(this.f15809u, obj2, this) == aVar) {
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
                int i11 = this.f15806r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    oh.w wVar = (oh.w) this.f15807s;
                    kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                    k kVar = this.f15808t;
                    rh.h hVar = kVar.f15804t;
                    j jVar = new j(xVar, wVar, kVar, this.f15809u);
                    this.f15806r = 1;
                    if (hVar.collect(jVar, this) == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, rh.i iVar, ug.c cVar) {
        super(2, cVar);
        this.f15808t = kVar;
        this.f15809u = iVar;
    }
}
