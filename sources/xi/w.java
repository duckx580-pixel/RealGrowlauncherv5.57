package xi;

import androidx.lifecycle.p0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ li.s f19872i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f19873r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(li.s sVar, long j, ug.c cVar) {
        super(2, cVar);
        this.f19872i = sVar;
        this.f19873r = j;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new w(this.f19872i, this.f19873r, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) create((oh.w) obj, (ug.c) obj2);
        qg.o oVar = qg.o.f13926a;
        wVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        androidx.work.v.B(obj);
        li.s sVar = this.f19872i;
        oh.x.s(p0.j(sVar), null, 0, new li.n(sVar, this.f19873r, null), 3);
        return qg.o.f13926a;
    }
}
