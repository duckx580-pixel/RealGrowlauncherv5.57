package l0;

import androidx.work.v;
import oh.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9780i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ fj.e f9781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f9782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t.i f9783t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(fj.e eVar, float f9, t.i iVar, ug.c cVar) {
        super(2, cVar);
        this.f9781r = eVar;
        this.f9782s = f9;
        this.f9783t = iVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new q(this.f9781r, this.f9782s, this.f9783t, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f9780i;
        if (i10 == 0) {
            v.B(obj);
            t.c cVar = (t.c) this.f9781r.f6702c;
            Float f9 = new Float(this.f9782s);
            this.f9780i = 1;
            if (t.c.b(cVar, f9, this.f9783t, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.B(obj);
        }
        return qg.o.f13926a;
    }
}
