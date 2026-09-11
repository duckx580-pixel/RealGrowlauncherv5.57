package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends wg.i implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fi.n f16641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(fi.n nVar, ug.c cVar) {
        super(1, cVar);
        this.f16641i = nVar;
    }

    @Override // wg.a
    public final ug.c create(ug.c cVar) {
        return new u0(this.f16641i, cVar);
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        return ((u0) create((ug.c) obj)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        androidx.work.v.B(obj);
        return this.f16641i.invoke();
    }
}
