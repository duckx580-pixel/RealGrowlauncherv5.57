package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends wg.i implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f16015i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16016r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Object obj, ug.c cVar2) {
        super(1, cVar2);
        this.f16015i = cVar;
        this.f16016r = obj;
    }

    @Override // wg.a
    public final ug.c create(ug.c cVar) {
        return new b(this.f16015i, this.f16016r, cVar);
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        b bVar = (b) create((ug.c) obj);
        qg.o oVar = qg.o.f13926a;
        bVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        androidx.work.v.B(obj);
        c cVar = this.f16015i;
        c.a(cVar);
        Object objC = cVar.c(this.f16016r);
        cVar.f16024c.f16114r.setValue(objC);
        cVar.f16026e.setValue(objC);
        return qg.o.f13926a;
    }
}
