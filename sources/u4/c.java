package u4;

import androidx.work.v;
import oh.w;
import qg.o;
import rh.w0;
import t.d1;
import wg.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17636i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f17638s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, ug.c cVar, int i10) {
        super(2, cVar);
        this.f17636i = i10;
        this.f17638s = bVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f17636i) {
            case 0:
                return new c(this.f17638s, cVar, 0);
            default:
                return new c(this.f17638s, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f17636i) {
        }
        return ((c) create(wVar, cVar)).invokeSuspend(o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f17636i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f17637r;
                o oVar = o.f13926a;
                if (i10 == 0) {
                    v.B(obj);
                    this.f17637r = 1;
                    b bVar = this.f17638s;
                    Object objH = w0.h(bVar.f17632a, new d1(11, bVar, (ug.c) null), this);
                    if (objH != aVar) {
                        objH = oVar;
                    }
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.B(obj);
                }
                return oVar;
            default:
                vg.a aVar2 = vg.a.f18663i;
                int i11 = this.f17637r;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.B(obj);
                    return o.f13926a;
                }
                v.B(obj);
                this.f17637r = 1;
                this.f17638s.b(this);
                return aVar2;
        }
    }
}
