package l0;

import androidx.work.v;
import oh.w;
import oh.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9749i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f9751s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, ug.c cVar, int i10) {
        super(2, cVar);
        this.f9749i = i10;
        this.f9751s = iVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f9749i) {
            case 0:
                h hVar = new h(this.f9751s, cVar, 0);
                hVar.f9750r = obj;
                return hVar;
            default:
                h hVar2 = new h(this.f9751s, cVar, 1);
                hVar2.f9750r = obj;
                return hVar2;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f9749i) {
        }
        return ((h) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f9749i;
        i iVar = this.f9751s;
        ug.c cVar = null;
        int i11 = 0;
        int i12 = 3;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                v.B(obj);
                w wVar = (w) this.f9750r;
                x.s(wVar, null, 0, new g(iVar, cVar, i11), 3);
                x.s(wVar, null, 0, new g(iVar, cVar, 1), 3);
                return x.s(wVar, null, 0, new g(iVar, cVar, 2), 3);
            default:
                vg.a aVar2 = vg.a.f18663i;
                v.B(obj);
                return x.s((w) this.f9750r, null, 0, new g(iVar, cVar, i12), 3);
        }
    }
}
